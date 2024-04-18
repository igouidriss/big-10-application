/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table7Details from './table-7-details.vue';
import Table7Service from './table-7.service';
import AlertService from '@/shared/alert/alert.service';

type Table7DetailsComponentType = InstanceType<typeof Table7Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table7Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table7 Management Detail Component', () => {
    let table7ServiceStub: SinonStubbedInstance<Table7Service>;
    let mountOptions: MountingOptions<Table7DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table7ServiceStub = sinon.createStubInstance<Table7Service>(Table7Service);

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
          table7Service: () => table7ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table7ServiceStub.find.resolves(table7Sample);
        route = {
          params: {
            table7Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table7Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table7).toMatchObject(table7Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table7ServiceStub.find.resolves(table7Sample);
        const wrapper = shallowMount(Table7Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
