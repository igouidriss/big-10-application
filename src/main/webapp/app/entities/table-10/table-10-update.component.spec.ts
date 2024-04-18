/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table10Update from './table-10-update.vue';
import Table10Service from './table-10.service';
import AlertService from '@/shared/alert/alert.service';

type Table10UpdateComponentType = InstanceType<typeof Table10Update>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table10Sample = { id: 123 };

describe('Component Tests', () => {
  let mountOptions: MountingOptions<Table10UpdateComponentType>['global'];
  let alertService: AlertService;

  describe('Table10 Management Update Component', () => {
    let comp: Table10UpdateComponentType;
    let table10ServiceStub: SinonStubbedInstance<Table10Service>;

    beforeEach(() => {
      route = {};
      table10ServiceStub = sinon.createStubInstance<Table10Service>(Table10Service);
      table10ServiceStub.retrieve.onFirstCall().resolves(Promise.resolve([]));

      alertService = new AlertService({
        i18n: { t: vitest.fn() } as any,
        bvToast: {
          toast: vitest.fn(),
        } as any,
      });

      mountOptions = {
        stubs: {
          'font-awesome-icon': true,
          'b-input-group': true,
          'b-input-group-prepend': true,
          'b-form-datepicker': true,
          'b-form-input': true,
        },
        provide: {
          alertService,
          table10Service: () => table10ServiceStub,
        },
      };
    });

    afterEach(() => {
      vitest.resetAllMocks();
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', async () => {
        // GIVEN
        const wrapper = shallowMount(Table10Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table10 = table10Sample;
        table10ServiceStub.update.resolves(table10Sample);

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table10ServiceStub.update.calledWith(table10Sample)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });

      it('Should call create service on save for new entity', async () => {
        // GIVEN
        const entity = {};
        table10ServiceStub.create.resolves(entity);
        const wrapper = shallowMount(Table10Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table10 = entity;

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table10ServiceStub.create.calledWith(entity)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });
    });

    describe('Before route enter', () => {
      it('Should retrieve data', async () => {
        // GIVEN
        table10ServiceStub.find.resolves(table10Sample);
        table10ServiceStub.retrieve.resolves([table10Sample]);

        // WHEN
        route = {
          params: {
            table10Id: '' + table10Sample.id,
          },
        };
        const wrapper = shallowMount(Table10Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(comp.table10).toMatchObject(table10Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table10ServiceStub.find.resolves(table10Sample);
        const wrapper = shallowMount(Table10Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
