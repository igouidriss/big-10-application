/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table10 from './table-10.vue';
import Table10Service from './table-10.service';
import AlertService from '@/shared/alert/alert.service';

type Table10ComponentType = InstanceType<typeof Table10>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table10 Management Component', () => {
    let table10ServiceStub: SinonStubbedInstance<Table10Service>;
    let mountOptions: MountingOptions<Table10ComponentType>['global'];

    beforeEach(() => {
      table10ServiceStub = sinon.createStubInstance<Table10Service>(Table10Service);
      table10ServiceStub.retrieve.resolves({ headers: {} });

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
          table10Service: () => table10ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table10ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table10, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table10ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table10s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table10ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table10, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table10ServiceStub.retrieve.reset();
        table10ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table10ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable10();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table10ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table10ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
