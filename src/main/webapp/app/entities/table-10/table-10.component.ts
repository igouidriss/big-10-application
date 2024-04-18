import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table10Service from './table-10.service';
import { type ITable10 } from '@/shared/model/table-10.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table10',
  setup() {
    const { t: t$ } = useI18n();
    const table10Service = inject('table10Service', () => new Table10Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table10s: Ref<ITable10[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable10s = async () => {
      isFetching.value = true;
      try {
        const res = await table10Service().retrieve();
        table10s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable10s();
    };

    onMounted(async () => {
      await retrieveTable10s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable10) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable10 = async () => {
      try {
        await table10Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table10.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable10s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table10s,
      handleSyncList,
      isFetching,
      retrieveTable10s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable10,
      t$,
    };
  },
});
