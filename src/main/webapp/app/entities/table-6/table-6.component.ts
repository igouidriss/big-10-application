import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table6Service from './table-6.service';
import { type ITable6 } from '@/shared/model/table-6.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table6',
  setup() {
    const { t: t$ } = useI18n();
    const table6Service = inject('table6Service', () => new Table6Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table6s: Ref<ITable6[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable6s = async () => {
      isFetching.value = true;
      try {
        const res = await table6Service().retrieve();
        table6s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable6s();
    };

    onMounted(async () => {
      await retrieveTable6s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable6) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable6 = async () => {
      try {
        await table6Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table6.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable6s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table6s,
      handleSyncList,
      isFetching,
      retrieveTable6s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable6,
      t$,
    };
  },
});
