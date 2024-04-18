import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table9Service from './table-9.service';
import { type ITable9 } from '@/shared/model/table-9.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table9Details',
  setup() {
    const table9Service = inject('table9Service', () => new Table9Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table9: Ref<ITable9> = ref({});

    const retrieveTable9 = async table9Id => {
      try {
        const res = await table9Service().find(table9Id);
        table9.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table9Id) {
      retrieveTable9(route.params.table9Id);
    }

    return {
      alertService,
      table9,

      previousState,
      t$: useI18n().t,
    };
  },
});
