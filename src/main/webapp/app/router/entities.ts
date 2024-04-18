import { Authority } from '@/shared/security/authority';
/* tslint:disable */
// prettier-ignore
const Entities = () => import('@/entities/entities.vue');

const Table10 = () => import('@/entities/table-10/table-10.vue');
const Table10Update = () => import('@/entities/table-10/table-10-update.vue');
const Table10Details = () => import('@/entities/table-10/table-10-details.vue');

const Table9 = () => import('@/entities/table-9/table-9.vue');
const Table9Update = () => import('@/entities/table-9/table-9-update.vue');
const Table9Details = () => import('@/entities/table-9/table-9-details.vue');

const Table8 = () => import('@/entities/table-8/table-8.vue');
const Table8Update = () => import('@/entities/table-8/table-8-update.vue');
const Table8Details = () => import('@/entities/table-8/table-8-details.vue');

const Table7 = () => import('@/entities/table-7/table-7.vue');
const Table7Update = () => import('@/entities/table-7/table-7-update.vue');
const Table7Details = () => import('@/entities/table-7/table-7-details.vue');

const Table6 = () => import('@/entities/table-6/table-6.vue');
const Table6Update = () => import('@/entities/table-6/table-6-update.vue');
const Table6Details = () => import('@/entities/table-6/table-6-details.vue');

const Table5 = () => import('@/entities/table-5/table-5.vue');
const Table5Update = () => import('@/entities/table-5/table-5-update.vue');
const Table5Details = () => import('@/entities/table-5/table-5-details.vue');

const Table4 = () => import('@/entities/table-4/table-4.vue');
const Table4Update = () => import('@/entities/table-4/table-4-update.vue');
const Table4Details = () => import('@/entities/table-4/table-4-details.vue');

const Table3 = () => import('@/entities/table-3/table-3.vue');
const Table3Update = () => import('@/entities/table-3/table-3-update.vue');
const Table3Details = () => import('@/entities/table-3/table-3-details.vue');

const Table2 = () => import('@/entities/table-2/table-2.vue');
const Table2Update = () => import('@/entities/table-2/table-2-update.vue');
const Table2Details = () => import('@/entities/table-2/table-2-details.vue');

const Table1 = () => import('@/entities/table-1/table-1.vue');
const Table1Update = () => import('@/entities/table-1/table-1-update.vue');
const Table1Details = () => import('@/entities/table-1/table-1-details.vue');

// jhipster-needle-add-entity-to-router-import - JHipster will import entities to the router here

export default {
  path: '/',
  component: Entities,
  children: [
    {
      path: 'table-10',
      name: 'Table10',
      component: Table10,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-10/new',
      name: 'Table10Create',
      component: Table10Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-10/:table10Id/edit',
      name: 'Table10Edit',
      component: Table10Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-10/:table10Id/view',
      name: 'Table10View',
      component: Table10Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-9',
      name: 'Table9',
      component: Table9,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-9/new',
      name: 'Table9Create',
      component: Table9Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-9/:table9Id/edit',
      name: 'Table9Edit',
      component: Table9Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-9/:table9Id/view',
      name: 'Table9View',
      component: Table9Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-8',
      name: 'Table8',
      component: Table8,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-8/new',
      name: 'Table8Create',
      component: Table8Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-8/:table8Id/edit',
      name: 'Table8Edit',
      component: Table8Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-8/:table8Id/view',
      name: 'Table8View',
      component: Table8Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-7',
      name: 'Table7',
      component: Table7,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-7/new',
      name: 'Table7Create',
      component: Table7Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-7/:table7Id/edit',
      name: 'Table7Edit',
      component: Table7Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-7/:table7Id/view',
      name: 'Table7View',
      component: Table7Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-6',
      name: 'Table6',
      component: Table6,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-6/new',
      name: 'Table6Create',
      component: Table6Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-6/:table6Id/edit',
      name: 'Table6Edit',
      component: Table6Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-6/:table6Id/view',
      name: 'Table6View',
      component: Table6Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-5',
      name: 'Table5',
      component: Table5,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-5/new',
      name: 'Table5Create',
      component: Table5Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-5/:table5Id/edit',
      name: 'Table5Edit',
      component: Table5Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-5/:table5Id/view',
      name: 'Table5View',
      component: Table5Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-4',
      name: 'Table4',
      component: Table4,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-4/new',
      name: 'Table4Create',
      component: Table4Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-4/:table4Id/edit',
      name: 'Table4Edit',
      component: Table4Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-4/:table4Id/view',
      name: 'Table4View',
      component: Table4Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-3',
      name: 'Table3',
      component: Table3,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-3/new',
      name: 'Table3Create',
      component: Table3Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-3/:table3Id/edit',
      name: 'Table3Edit',
      component: Table3Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-3/:table3Id/view',
      name: 'Table3View',
      component: Table3Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-2',
      name: 'Table2',
      component: Table2,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-2/new',
      name: 'Table2Create',
      component: Table2Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-2/:table2Id/edit',
      name: 'Table2Edit',
      component: Table2Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-2/:table2Id/view',
      name: 'Table2View',
      component: Table2Details,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-1',
      name: 'Table1',
      component: Table1,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-1/new',
      name: 'Table1Create',
      component: Table1Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-1/:table1Id/edit',
      name: 'Table1Edit',
      component: Table1Update,
      meta: { authorities: [Authority.USER] },
    },
    {
      path: 'table-1/:table1Id/view',
      name: 'Table1View',
      component: Table1Details,
      meta: { authorities: [Authority.USER] },
    },
    // jhipster-needle-add-entity-to-router - JHipster will add entities to the router here
  ],
};
