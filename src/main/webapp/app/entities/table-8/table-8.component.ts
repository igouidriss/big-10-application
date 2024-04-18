import { defineComponent, inject, onMounted, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';

import Table8Service from './table-8.service';
import { type ITable8 } from '@/shared/model/table-8.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table8',
  setup() {
    const { t: t$ } = useI18n();
    const table8Service = inject('table8Service', () => new Table8Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table8s: Ref<ITable8[]> = ref([]);

    const isFetching = ref(false);

    const clear = () => {};

    const retrieveTable8s = async () => {
      isFetching.value = true;
      try {
        const res = await table8Service().retrieve();
        table8s.value = res.data;
      } catch (err) {
        alertService.showHttpError(err.response);
      } finally {
        isFetching.value = false;
      }
    };

    const handleSyncList = () => {
      retrieveTable8s();
    };

    onMounted(async () => {
      await retrieveTable8s();
    });

    const removeId: Ref<number> = ref(null);
    const removeEntity = ref<any>(null);
    const prepareRemove = (instance: ITable8) => {
      removeId.value = instance.id;
      removeEntity.value.show();
    };
    const closeDialog = () => {
      removeEntity.value.hide();
    };
    const removeTable8 = async () => {
      try {
        await table8Service().delete(removeId.value);
        const message = t$('big10SampleApplicationApp.table8.deleted', { param: removeId.value }).toString();
        alertService.showInfo(message, { variant: 'danger' });
        removeId.value = null;
        retrieveTable8s();
        closeDialog();
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    return {
      table8s,
      handleSyncList,
      isFetching,
      retrieveTable8s,
      clear,
      removeId,
      removeEntity,
      prepareRemove,
      closeDialog,
      removeTable8,
      t$,
    };
  },
});
