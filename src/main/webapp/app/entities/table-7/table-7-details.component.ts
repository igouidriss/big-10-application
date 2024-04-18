import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table7Service from './table-7.service';
import { type ITable7 } from '@/shared/model/table-7.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table7Details',
  setup() {
    const table7Service = inject('table7Service', () => new Table7Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table7: Ref<ITable7> = ref({});

    const retrieveTable7 = async table7Id => {
      try {
        const res = await table7Service().find(table7Id);
        table7.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table7Id) {
      retrieveTable7(route.params.table7Id);
    }

    return {
      alertService,
      table7,

      previousState,
      t$: useI18n().t,
    };
  },
});
