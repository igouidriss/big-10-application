/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table7 from './table-7.vue';
import Table7Service from './table-7.service';
import AlertService from '@/shared/alert/alert.service';

type Table7ComponentType = InstanceType<typeof Table7>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table7 Management Component', () => {
    let table7ServiceStub: SinonStubbedInstance<Table7Service>;
    let mountOptions: MountingOptions<Table7ComponentType>['global'];

    beforeEach(() => {
      table7ServiceStub = sinon.createStubInstance<Table7Service>(Table7Service);
      table7ServiceStub.retrieve.resolves({ headers: {} });

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
          table7Service: () => table7ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table7ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table7, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table7ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table7s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table7ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table7, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table7ServiceStub.retrieve.reset();
        table7ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table7ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable7();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table7ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table7ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
