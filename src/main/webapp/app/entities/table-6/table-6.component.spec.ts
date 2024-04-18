/* tslint:disable max-line-length */
import { vitest } from 'vitest';
import { shallowMount, type MountingOptions } from '@vue/test-utils';
import sinon, { type SinonStubbedInstance } from 'sinon';

import Table6 from './table-6.vue';
import Table6Service from './table-6.service';
import AlertService from '@/shared/alert/alert.service';

type Table6ComponentType = InstanceType<typeof Table6>;

const bModalStub = {
  render: () => {},
  methods: {
    hide: () => {},
    show: () => {},
  },
};

describe('Component Tests', () => {
  let alertService: AlertService;

  describe('Table6 Management Component', () => {
    let table6ServiceStub: SinonStubbedInstance<Table6Service>;
    let mountOptions: MountingOptions<Table6ComponentType>['global'];

    beforeEach(() => {
      table6ServiceStub = sinon.createStubInstance<Table6Service>(Table6Service);
      table6ServiceStub.retrieve.resolves({ headers: {} });

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
          table6Service: () => table6ServiceStub,
        },
      };
    });

    describe('Mount', () => {
      it('Should call load all on init', async () => {
        // GIVEN
        table6ServiceStub.retrieve.resolves({ headers: {}, data: [{ id: 123 }] });

        // WHEN
        const wrapper = shallowMount(Table6, { global: mountOptions });
        const comp = wrapper.vm;
        await comp.$nextTick();

        // THEN
        expect(table6ServiceStub.retrieve.calledOnce).toBeTruthy();
        expect(comp.table6s[0]).toEqual(expect.objectContaining({ id: 123 }));
      });
    });
    describe('Handles', () => {
      let comp: Table6ComponentType;

      beforeEach(async () => {
        const wrapper = shallowMount(Table6, { global: mountOptions });
        comp = wrapper.vm;
        await comp.$nextTick();
        table6ServiceStub.retrieve.reset();
        table6ServiceStub.retrieve.resolves({ headers: {}, data: [] });
      });

      it('Should call delete service on confirmDelete', async () => {
        // GIVEN
        table6ServiceStub.delete.resolves({});

        // WHEN
        comp.prepareRemove({ id: 123 });

        comp.removeTable6();
        await comp.$nextTick(); // clear components

        // THEN
        expect(table6ServiceStub.delete.called).toBeTruthy();

        // THEN
        await comp.$nextTick(); // handle component clear watch
        expect(table6ServiceStub.retrieve.callCount).toEqual(1);
      });
    });
  });
});
