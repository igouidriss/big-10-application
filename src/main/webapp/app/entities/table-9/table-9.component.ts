import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table9Service from './table-9.service';
import { type ITable9 } from '@/shared/model/table-9.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table9',
  setup() {
    const { t: t$ } = useI18n();
    const table9Service = inject('table9Service', () => new Table9Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table9s: Ref<ITable9[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable9s = async () => {
      isFetching.value = true;
      try {
        const res = await table9Service().retrieve();
        table9s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable9s();
    };

    onMounted(async () => {
      await retrieveTable9s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable9) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable9 = async () => {
      try {
        await table9Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table9.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable9s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table9s,
      handleSyncList,
      isFetching,
      retrieveTable9s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable9,
      t$,
    };
  },
});
