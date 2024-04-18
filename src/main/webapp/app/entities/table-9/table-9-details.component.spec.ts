/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';
import { type RouteLocation } from 'vue-router';

import Table9Details from './table-9-details.vue';
import Table9Service from './table-9.service';
import AlertService from '@/shared/alert/alert.service';

type Table9DetailsComponentType = InstanceType<typeof Table9Details>;

let route: Partial<RouteLocation>;
const routerGoMock = vitest.fn();

vitest.mock('vue-router', () => ({
  useRoute: () => route,
  useRouter: () => ({ go: routerGoMock }),
}));

const table9Sample = { id: 123 };

describe('Component Tests', () => {
  let alertService: AlertService;

  afterEach(() => {
    vitest.resetAllMocks();
  });

  describe('Table9 Management Detail Component', () => {
    let table9ServiceStub: SinonStubbedInstance<Table9Service>;
    let mountOptions: MountingOptions<Table9DetailsComponentType>['global'];

    beforeEach(() => {
      route = {};
      table9ServiceStub = sinon.createStubInstance<Table9Service>(Table9Service);

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
          table9Service: () => table9ServiceStub,
        },
      };
    });

    describe('Navigate to details', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table9ServiceStub.find.resolves(table9Sample);
        route = {
          params: {
            table9Id: '' + 123,
          },
        };
        const wrapper = shallowMount(Table9Details, { global: mountOptions });
        const comp = wrapper.vm;
        // WHEN
        await comp.$nextTick();

        // THEN
        expect(comp.table9).toMatchObject(table9Sample);
      });
    });

    describe('Previous state', () => {
      it('Should go previous state', async () => {
        table9ServiceStub.find.resolves(table9Sample);
        const wrapper = shallowMount(Table9Details, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        comp.previousState();
        await comp.$nextTick();

        expect(routerGoMock).toHaveBeenCalledWith(-1);
      });
    });
  });
});
