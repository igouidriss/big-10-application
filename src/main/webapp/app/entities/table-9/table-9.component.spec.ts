/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table9 from './table-9.vue';
import Table9Service from './table-9.service';
import AlertService from '@/shared/alert/alert.service';

type Table9ComponentType = InstanceType<typeof Table9>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table9 Management Component', () => {
    let table9ServiceStub: SinonStubbedInstance<Table9Service>;
    let mountOptions: MountingOptions<Table9ComponentType>['global'];

    beforeEach(() => {
      table9ServiceStub = sinon.createStubInstance<Table9Service>(Table9Service);
      table9ServiceStub.retrieve.resolves({ headers: {} });

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
          table9Service: () => table9ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table9ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table9, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table9ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table9s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table9ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table9, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table9ServiceStub.retrieve.reset();
        table9ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table9ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable9();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table9ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table9ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
