/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table6Update from './table-6-update.vue';
import Table6Service from './table-6.service';
import AlertService from '@/shared/alert/alert.service';

type Table6UpdateComponentType = InstanceType<typeof Table6Update>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table6Sample = { id: 123 };

describe('Component Tests', () => {
  let mountOptions: MountingOptions<Table6UpdateComponentType>['global'];
  let alertService: AlertService;

  describe('Table6 Management Update Component', () => {
    let comp: Table6UpdateComponentType;
    let table6ServiceStub: SinonStubbedInstance<Table6Service>;

    beforeEach(() => {
      route = {};
      table6ServiceStub = sinon.createStubInstance<Table6Service>(Table6Service);
      table6ServiceStub.retrieve.onFirstCall().resolves(Promise.resolve([]));

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
          table6Service: () => table6ServiceStub,
        },
      };
    });

    afterEach(() => {
      vitest.resetAllMocks();
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', async () => {
        // GIVEN
        const wrapper = shallowMount(Table6Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table6 = table6Sample;
        table6ServiceStub.update.resolves(table6Sample);

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table6ServiceStub.update.calledWith(table6Sample)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });

      it('Should call create service on save for new entity', async () => {
        // GIVEN
        const entity = {};
        table6ServiceStub.create.resolves(entity);
        const wrapper = shallowMount(Table6Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table6 = entity;

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table6ServiceStub.create.calledWith(entity)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });
    });

    describe('Before route enter', () => {
      it('Should retrieve data', async () => {
        // GIVEN
        table6ServiceStub.find.resolves(table6Sample);
        table6ServiceStub.retrieve.resolves([table6Sample]);

        // WHEN
        route = {
          params: {
            table6Id: '' + table6Sample.id,
          },
        };
        const wrapper = shallowMount(Table6Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(comp.table6).toMatchObject(table6Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table6ServiceStub.find.resolves(table6Sample);
        const wrapper = shallowMount(Table6Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
