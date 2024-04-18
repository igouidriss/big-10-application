/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table10Details from './table-10-details.vue';
import Table10Service from './table-10.service';
import AlertService from '@/shared/alert/alert.service';

type Table10DetailsComponentType = InstanceType<typeof Table10Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table10Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table10 Management Detail Component', () => {
    let table10ServiceStub: SinonStubbedInstance<Table10Service>;
    let mountOptions: MountingOptions<Table10DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table10ServiceStub = sinon.createStubInstance<Table10Service>(Table10Service);

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
          table10Service: () => table10ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table10ServiceStub.find.resolves(table10Sample);
        route = {
          params: {
            table10Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table10Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table10).toMatchObject(table10Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table10ServiceStub.find.resolves(table10Sample);
        const wrapper = shallowMount(Table10Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
