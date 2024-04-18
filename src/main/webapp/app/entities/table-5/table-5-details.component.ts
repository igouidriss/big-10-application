import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table5Service from './table-5.service';
import { type ITable5 } from '@/shared/model/table-5.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table5Details',
  setup() {
    const table5Service = inject('table5Service', () => new Table5Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table5: Ref<ITable5> = ref({});

    const retrieveTable5 = async table5Id => {
      try {
        const res = await table5Service().find(table5Id);
        table5.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table5Id) {
      retrieveTable5(route.params.table5Id);
    }

    return {
      alertService,
      table5,

      previousState,
      t$: useI18n().t,
    };
  },
});
