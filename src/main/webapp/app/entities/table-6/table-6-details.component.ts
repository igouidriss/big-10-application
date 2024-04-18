import { defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';

import Table6Service from './table-6.service';
import { type ITable6 } from '@/shared/model/table-6.model';
import { useAlertService } from '@/shared/alert/alert.service';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table6Details',
  setup() {
    const table6Service = inject('table6Service', () => new Table6Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);
    const table6: Ref<ITable6> = ref({});

    const retrieveTable6 = async table6Id => {
      try {
        const res = await table6Service().find(table6Id);
        table6.value = res;
      } catch (error) {
        alertService.showHttpError(error.response);
      }
    };

    if (route.params?.table6Id) {
      retrieveTable6(route.params.table6Id);
    }

    return {
      alertService,
      table6,

      previousState,
      t$: useI18n().t,
    };
  },
});
