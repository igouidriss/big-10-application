import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table5Service from './table-5.service';
import { type ITable5 } from '@/shared/model/table-5.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table5',
  setup() {
    const { t: t$ } = useI18n();
    const table5Service = inject('table5Service', () => new Table5Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table5s: Ref<ITable5[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable5s = async () => {
      isFetching.value = true;
      try {
        const res = await table5Service().retrieve();
        table5s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable5s();
    };

    onMounted(async () => {
      await retrieveTable5s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable5) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable5 = async () => {
      try {
        await table5Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table5.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable5s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table5s,
      handleSyncList,
      isFetching,
      retrieveTable5s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable5,
      t$,
    };
  },
});
