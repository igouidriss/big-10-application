import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table10Service from './table-10.service';
import { type ITable10 } from '@/shared/model/table-10.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table10Details',
  setup() {
    const table10Service = inject('table10Service', () => new Table10Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table10: Ref<ITable10> = ref({});

    const retrieveTable10 = async table10Id => {
      try {
        const res = await table10Service().find(table10Id);
        table10.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table10Id) {
      retrieveTable10(route.params.table10Id);
    }

    return {
      alertService,
      table10,

      previousState,
      t$: useI18n().t,
    };
  },
});
