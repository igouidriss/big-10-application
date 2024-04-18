/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table6Details from './table-6-details.vue';
import Table6Service from './table-6.service';
import AlertService from '@/shared/alert/alert.service';

type Table6DetailsComponentType = InstanceType<typeof Table6Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table6Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table6 Management Detail Component', () => {
    let table6ServiceStub: SinonStubbedInstance<Table6Service>;
    let mountOptions: MountingOptions<Table6DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table6ServiceStub = sinon.createStubInstance<Table6Service>(Table6Service);

      alertService = new AlertService({
        i18n: { t: vitest.fn() } as any,
        bvToast: {
          toast: vitest.fn(),
        } as any,
      });

      mountOptions = {
        stubs: {
          'font-awesome-icon': true,
          'router-link': true,
        },
        provide: {
          alertService,
          table6Service: () => table6ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table6ServiceStub.find.resolves(table6Sample);
        route = {
          params: {
            table6Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table6Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table6).toMatchObject(table6Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table6ServiceStub.find.resolves(table6Sample);
        const wrapper = shallowMount(Table6Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
