/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table7Update from './table-7-update.vue';
import Table7Service from './table-7.service';
import AlertService from '@/shared/alert/alert.service';

type Table7UpdateComponentType = InstanceType<typeof Table7Update>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table7Sample = { id: 123 };

describe('Component Tests', () => {
  let mountOptions: MountingOptions<Table7UpdateComponentType>['global'];
  let alertService: AlertService;

  describe('Table7 Management Update Component', () => {
    let comp: Table7UpdateComponentType;
    let table7ServiceStub: SinonStubbedInstance<Table7Service>;

    beforeEach(() => {
      route = {};
      table7ServiceStub = sinon.createStubInstance<Table7Service>(Table7Service);
      table7ServiceStub.retrieve.onFirstCall().resolves(Promise.resolve([]));

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
          table7Service: () => table7ServiceStub,
        },
      };
    });

    afterEach(() => {
      vitest.resetAllMocks();
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', async () => {
        // GIVEN
        const wrapper = shallowMount(Table7Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table7 = table7Sample;
        table7ServiceStub.update.resolves(table7Sample);

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table7ServiceStub.update.calledWith(table7Sample)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });

      it('Should call create service on save for new entity', async () => {
        // GIVEN
        const entity = {};
        table7ServiceStub.create.resolves(entity);
        const wrapper = shallowMount(Table7Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table7 = entity;

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table7ServiceStub.create.calledWith(entity)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });
    });

    describe('Before route enter', () => {
      it('Should retrieve data', async () => {
        // GIVEN
        table7ServiceStub.find.resolves(table7Sample);
        table7ServiceStub.retrieve.resolves([table7Sample]);

        // WHEN
        route = {
          params: {
            table7Id: '' + table7Sample.id,
          },
        };
        const wrapper = shallowMount(Table7Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(comp.table7).toMatchObject(table7Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table7ServiceStub.find.resolves(table7Sample);
        const wrapper = shallowMount(Table7Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
