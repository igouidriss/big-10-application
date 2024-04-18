/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table5 from './table-5.vue';
import Table5Service from './table-5.service';
import AlertService from '@/shared/alert/alert.service';

type Table5ComponentType = InstanceType<typeof Table5>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table5 Management Component', () => {
    let table5ServiceStub: SinonStubbedInstance<Table5Service>;
    let mountOptions: MountingOptions<Table5ComponentType>['global'];

    beforeEach(() => {
      table5ServiceStub = sinon.createStubInstance<Table5Service>(Table5Service);
      table5ServiceStub.retrieve.resolves({ headers: {} });

      alertService = new AlertService({
        i18n: { t: vitest.fn() } as any,
        bvToast: {
          toast: vitest.fn(),
        } as any,
      });

      mountOptions = {
        stubs: {
          bModal: bModalStub as any,
          'font-awesome-icon': true,
          'b-badge': true,
          'b-button': true,
          'router-link': true,
        },
        directives: {
          'b-modal': {},
        },
        provide: {
          alertService,
          table5Service: () => table5ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table5ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table5, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table5ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table5s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table5ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table5, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table5ServiceStub.retrieve.reset();
        table5ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table5ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable5();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table5ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table5ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
