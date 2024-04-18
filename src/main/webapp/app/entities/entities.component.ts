import { defineComponent, provide } from 'vue';

import Table10Service from './table-10/table-10.service';
import Table9Service from './table-9/table-9.service';
import Table8Service from './table-8/table-8.service';
import Table7Service from './table-7/table-7.service';
import Table6Service from './table-6/table-6.service';
import Table5Service from './table-5/table-5.service';
import Table4Service from './table-4/table-4.service';
import Table3Service from './table-3/table-3.service';
import Table2Service from './table-2/table-2.service';
import Table1Service from './table-1/table-1.service';
import UserService from '@/entities/user/user.service';
// jhipster-needle-add-entity-service-to-entities-component-import - JHipster will import entities services here

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Entities',
  setup() {
    provide('userService', () => new UserService());
    provide('table10Service', () => new Table10Service());
    provide('table9Service', () => new Table9Service());
    provide('table8Service', () => new Table8Service());
    provide('table7Service', () => new Table7Service());
    provide('table6Service', () => new Table6Service());
    provide('table5Service', () => new Table5Service());
    provide('table4Service', () => new Table4Service());
    provide('table3Service', () => new Table3Service());
    provide('table2Service', () => new Table2Service());
    provide('table1Service', () => new Table1Service());
    // jhipster-needle-add-entity-service-to-entities-component - JHipster will import entities services here
  },
});
