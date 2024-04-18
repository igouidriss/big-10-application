import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table8Service from './table-8.service';
import { type ITable8 } from '@/shared/model/table-8.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table8Details',
  setup() {
    const table8Service = inject('table8Service', () => new Table8Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table8: Ref<ITable8> = ref({});

    const retrieveTable8 = async table8Id => {
      try {
        const res = await table8Service().find(table8Id);
        table8.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table8Id) {
      retrieveTable8(route.params.table8Id);
    }

    return {
      alertService,
      table8,

      previousState,
      t$: useI18n().t,
    };
  },
});
