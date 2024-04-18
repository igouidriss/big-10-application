/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table8Update from './table-8-update.vue';
import Table8Service from './table-8.service';
import AlertService from '@/shared/alert/alert.service';

type Table8UpdateComponentType = InstanceType<typeof Table8Update>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table8Sample = { id: 123 };

describe('Component Tests', () => {
  let mountOptions: MountingOptions<Table8UpdateComponentType>['global'];
  let alertService: AlertService;

  describe('Table8 Management Update Component', () => {
    let comp: Table8UpdateComponentType;
    let table8ServiceStub: SinonStubbedInstance<Table8Service>;

    beforeEach(() => {
      route = {};
      table8ServiceStub = sinon.createStubInstance<Table8Service>(Table8Service);
      table8ServiceStub.retrieve.onFirstCall().resolves(Promise.resolve([]));

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
          table8Service: () => table8ServiceStub,
        },
      };
    });

    afterEach(() => {
      vitest.resetAllMocks();
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', async () => {
        // GIVEN
        const wrapper = shallowMount(Table8Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table8 = table8Sample;
        table8ServiceStub.update.resolves(table8Sample);

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table8ServiceStub.update.calledWith(table8Sample)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });

      it('Should call create service on save for new entity', async () => {
        // GIVEN
        const entity = {};
        table8ServiceStub.create.resolves(entity);
        const wrapper = shallowMount(Table8Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table8 = entity;

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table8ServiceStub.create.calledWith(entity)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });
    });

    describe('Before route enter', () => {
      it('Should retrieve data', async () => {
        // GIVEN
        table8ServiceStub.find.resolves(table8Sample);
        table8ServiceStub.retrieve.resolves([table8Sample]);

        // WHEN
        route = {
          params: {
            table8Id: '' + table8Sample.id,
          },
        };
        const wrapper = shallowMount(Table8Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(comp.table8).toMatchObject(table8Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table8ServiceStub.find.resolves(table8Sample);
        const wrapper = shallowMount(Table8Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
