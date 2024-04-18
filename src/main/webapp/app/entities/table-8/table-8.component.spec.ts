/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table8 from './table-8.vue';
import Table8Service from './table-8.service';
import AlertService from '@/shared/alert/alert.service';

type Table8ComponentType = InstanceType<typeof Table8>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table8 Management Component', () => {
    let table8ServiceStub: SinonStubbedInstance<Table8Service>;
    let mountOptions: MountingOptions<Table8ComponentType>['global'];

    beforeEach(() => {
      table8ServiceStub = sinon.createStubInstance<Table8Service>(Table8Service);
      table8ServiceStub.retrieve.resolves({ headers: {} });

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
          table8Service: () => table8ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table8ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table8, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table8ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table8s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table8ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table8, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table8ServiceStub.retrieve.reset();
        table8ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table8ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable8();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table8ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table8ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
