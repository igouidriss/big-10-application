/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table9Update from './table-9-update.vue';
import Table9Service from './table-9.service';
import AlertService from '@/shared/alert/alert.service';

type Table9UpdateComponentType = InstanceType<typeof Table9Update>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table9Sample = { id: 123 };

describe('Component Tests', () => {
  let mountOptions: MountingOptions<Table9UpdateComponentType>['global'];
  let alertService: AlertService;

  describe('Table9 Management Update Component', () => {
    let comp: Table9UpdateComponentType;
    let table9ServiceStub: SinonStubbedInstance<Table9Service>;

    beforeEach(() => {
      route = {};
      table9ServiceStub = sinon.createStubInstance<Table9Service>(Table9Service);
      table9ServiceStub.retrieve.onFirstCall().resolves(Promise.resolve([]));

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
          table9Service: () => table9ServiceStub,
        },
      };
    });

    afterEach(() => {
      vitest.resetAllMocks();
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', async () => {
        // GIVEN
        const wrapper = shallowMount(Table9Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table9 = table9Sample;
        table9ServiceStub.update.resolves(table9Sample);

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table9ServiceStub.update.calledWith(table9Sample)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });

      it('Should call create service on save for new entity', async () => {
        // GIVEN
        const entity = {};
        table9ServiceStub.create.resolves(entity);
        const wrapper = shallowMount(Table9Update, { global: mountOptions });
        comp = wrapper.vm;
        comp.table9 = entity;

        // WHEN
        comp.save();
        await comp.$nextTick();

        // THEN
        expect(table9ServiceStub.create.calledWith(entity)).toBeTruthy();
        expect(comp.isSaving).toEqual(false);
      });
    });

    describe('Before route enter', () => {
      it('Should retrieve data', async () => {
        // GIVEN
        table9ServiceStub.find.resolves(table9Sample);
        table9ServiceStub.retrieve.resolves([table9Sample]);

        // WHEN
        route = {
          params: {
            table9Id: '' + table9Sample.id,
          },
        };
        const wrapper = shallowMount(Table9Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(comp.table9).toMatchObject(table9Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table9ServiceStub.find.resolves(table9Sample);
        const wrapper = shallowMount(Table9Update, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
