import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table7Service from './table-7.service';
import { type ITable7 } from '@/shared/model/table-7.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table7',
  setup() {
    const { t: t$ } = useI18n();
    const table7Service = inject('table7Service', () => new Table7Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table7s: Ref<ITable7[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable7s = async () => {
      isFetching.value = true;
      try {
        const res = await table7Service().retrieve();
        table7s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable7s();
    };

    onMounted(async () => {
      await retrieveTable7s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable7) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable7 = async () => {
      try {
        await table7Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table7.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable7s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table7s,
      handleSyncList,
      isFetching,
      retrieveTable7s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable7,
      t$,
    };
  },
});
