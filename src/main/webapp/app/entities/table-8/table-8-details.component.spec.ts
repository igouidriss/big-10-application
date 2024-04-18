/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table8Details from './table-8-details.vue';
import Table8Service from './table-8.service';
import AlertService from '@/shared/alert/alert.service';

type Table8DetailsComponentType = InstanceType<typeof Table8Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table8Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table8 Management Detail Component', () => {
    let table8ServiceStub: SinonStubbedInstance<Table8Service>;
    let mountOptions: MountingOptions<Table8DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table8ServiceStub = sinon.createStubInstance<Table8Service>(Table8Service);

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
          table8Service: () => table8ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table8ServiceStub.find.resolves(table8Sample);
        route = {
          params: {
            table8Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table8Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table8).toMatchObject(table8Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table8ServiceStub.find.resolves(table8Sample);
        const wrapper = shallowMount(Table8Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
