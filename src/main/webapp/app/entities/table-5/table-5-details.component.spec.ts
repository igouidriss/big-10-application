/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table5Details from './table-5-details.vue';
import Table5Service from './table-5.service';
import AlertService from '@/shared/alert/alert.service';

type Table5DetailsComponentType = InstanceType<typeof Table5Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table5Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table5 Management Detail Component', () => {
    let table5ServiceStub: SinonStubbedInstance<Table5Service>;
    let mountOptions: MountingOptions<Table5DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table5ServiceStub = sinon.createStubInstance<Table5Service>(Table5Service);

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
          table5Service: () => table5ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table5ServiceStub.find.resolves(table5Sample);
        route = {
          params: {
            table5Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table5Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table5).toMatchObject(table5Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table5ServiceStub.find.resolves(table5Sample);
        const wrapper = shallowMount(Table5Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
