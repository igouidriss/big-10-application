import { computed, defineComponent, inject, ref, type Ref } from 'vue';
import { useI18n } from 'vue-i18n';
import { useRoute, useRouter } from 'vue-router';
import { useVuelidate } from '@vuelidate/core';

import Table9Service from './table-9.service';
import { useValidation } from '@/shared/composables';
import { useAlertService } from '@/shared/alert/alert.service';

import { type ITable9, Table9 } from '@/shared/model/table-9.model';

export default defineComponent({
  compatConfig: { MODE: 3 },
  name: 'Table9Update',
  setup() {
    const table9Service = inject('table9Service', () => new Table9Service());
    const alertService = inject('alertService', () => useAlertService(), true);

    const table9: Ref<ITable9> = ref(new Table9());
    const isSaving = ref(false);
    const currentLanguage = inject('currentLanguage', () => computed(() => navigator.language ?? 'en'), true);

    const route = useRoute();
    const router = useRouter();

    const previousState = () => router.go(-1);

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

    const { t: t$ } = useI18n();
    const validations = useValidation();
    const validationRules = {
      numLigne1: {},
      resort2: {},
      resvNameId3: {},
      clientOId4: {},
      typeChb5: {},
      confirmationNo6: {},
      clientMdmId7: {},
      nameId8: {},
      parentResvNameId9: {},
      contactId10: {},
      agenceId11: {},
      agenceNom12: {},
      societeId13: {},
      groupeId14: {},
      numBloc15: {},
      typeResv16: {},
      statutResv17: {},
      dateDebutResv18: {},
      dateFinResv19: {},
      truncDateDebutResv20: {},
      truncDateFinResv21: {},
      dateAnnResv22: {},
      pseudoRoomYn23: {},
      createurResv24: {},
      nomCreateurResv25: {},
      codeGarantie26: {},
      flgDed27: {},
      codePays28: {},
      libPays29: {},
      codeNationalite30: {},
      libNationalite31: {},
      codeSource32: {},
      libSource33: {},
      codeGrandSource34: {},
      codeOrigine35: {},
      libOrigine36: {},
      codeMarche37: {},
      libMarche38: {},
      codeGrandMarche39: {},
      libGrandMarche40: {},
      codePrix41: {},
      categPrix42: {},
      libPrix43: {},
      numChb44: {},
      descriptionTypeChb45: {},
      codeTypeChb46: {},
      classChb47: {},
      caractChb48: {},
      typeChbDeReservation49: {},
      descriptionTypeChbDeResv50: {},
      codeTypeChbDeResv51: {},
      statutDeReservation52: {},
      circuitDistribution53: {},
      circuitDistribUserRegroup54: {},
      numCrs55: {},
      typeRefCrs56: {},
      crsInsertDate57: {},
      dateCreaResv58: {},
      datePremier59: {},
      statutPremier60: {},
      dateDernier61: {},
      statutDernier62: {},
      dateDernierPseudo63: {},
      statutDernierPseudo64: {},
      diffDtCreaAnn65: {},
      diffDtArrAnn66: {},
      leadtime67: {},
      los68: {},
      occupantsGroupe69: {},
      nbNuitee70: {},
      nbNuiteeNnDed71: {},
      nbResvAnn72: {},
      nbAdu73: {},
      nbEnf74: {},
      nbPersDayU75: {},
      nbPersArr76: {},
      nbPersDep77: {},
      nbPersAnn78: {},
      nbPersNoshow79: {},
      nbChbDayU80: {},
      nbChbArr81: {},
      nbChbDep82: {},
      nbChbAnn83: {},
      nbChbNoshow84: {},
      revenuNetChambre85: {},
      revenuTaxeChambre86: {},
      revenuNetChambreGlobal87: {},
      revenuTaxeChambreGlobal88: {},
      revenuNetBq89: {},
      revenuTaxeBq90: {},
      revenuNetBqGlobal91: {},
      revenuTaxeBqGlobal92: {},
      revenuNetExtra93: {},
      revenuTaxeExtra94: {},
      revenuNetExtraGlobal95: {},
      revenuTaxeExtraGlobal96: {},
      revenuNetTotal97: {},
      revenuTaxeTotal98: {},
      revenuNetTotalGlobal99: {},
      revenuTaxeTotalGlobal100: {},
      prodRevenuChambre101: {},
      prodRevenuBq102: {},
      prodRevenuExtra103: {},
      prodRevenuTotal104: {},
      prodChambreNbNuitees105: {},
      techCreateDate106: {},
      techUpdateDate107: {},
      numLigne108: {},
      resort109: {},
      resvNameId110: {},
      clientOId111: {},
      typeChb112: {},
      confirmationNo113: {},
      clientMdmId114: {},
      nameId115: {},
      parentResvNameId116: {},
      contactId117: {},
      agenceId118: {},
      agenceNom119: {},
      societeId120: {},
      groupeId121: {},
      numBloc122: {},
      typeResv123: {},
      statutResv124: {},
      dateDebutResv125: {},
      dateFinResv126: {},
      truncDateDebutResv127: {},
      truncDateFinResv128: {},
      dateAnnResv129: {},
      pseudoRoomYn130: {},
      createurResv131: {},
      nomCreateurResv132: {},
      codeGarantie133: {},
      flgDed134: {},
      codePays135: {},
      libPays136: {},
      codeNationalite137: {},
      libNationalite138: {},
      codeSource139: {},
      libSource140: {},
      codeGrandSource141: {},
      codeOrigine142: {},
      libOrigine143: {},
      codeMarche144: {},
      libMarche145: {},
      codeGrandMarche146: {},
      libGrandMarche147: {},
      codePrix148: {},
      categPrix149: {},
      libPrix150: {},
      numChb151: {},
      descriptionTypeChb152: {},
      codeTypeChb153: {},
      classChb154: {},
      caractChb155: {},
      typeChbDeReservation156: {},
      descriptionTypeChbDeResv157: {},
      codeTypeChbDeResv158: {},
      statutDeReservation159: {},
      circuitDistribution160: {},
      circuitDistribUserRegroup161: {},
      numCrs162: {},
      typeRefCrs163: {},
      crsInsertDate164: {},
      dateCreaResv165: {},
      datePremier166: {},
      statutPremier167: {},
      dateDernier168: {},
      statutDernier169: {},
      dateDernierPseudo170: {},
      statutDernierPseudo171: {},
      diffDtCreaAnn172: {},
      diffDtArrAnn173: {},
      leadtime174: {},
      los175: {},
      occupantsGroupe176: {},
      nbNuitee177: {},
      nbNuiteeNnDed178: {},
      nbResvAnn179: {},
      nbAdu180: {},
      nbEnf181: {},
      nbPersDayU182: {},
      nbPersArr183: {},
      nbPersDep184: {},
      nbPersAnn185: {},
      nbPersNoshow186: {},
      nbChbDayU187: {},
      nbChbArr188: {},
      nbChbDep189: {},
      nbChbAnn190: {},
      nbChbNoshow191: {},
      revenuNetChambre192: {},
      revenuTaxeChambre193: {},
      revenuNetChambreGlobal194: {},
      revenuTaxeChambreGlobal195: {},
      revenuNetBq196: {},
      revenuTaxeBq197: {},
      revenuNetBqGlobal198: {},
      revenuTaxeBqGlobal199: {},
      revenuNetExtra200: {},
      revenuTaxeExtra201: {},
      revenuNetExtraGlobal202: {},
      revenuTaxeExtraGlobal203: {},
      revenuNetTotal204: {},
      revenuTaxeTotal205: {},
      revenuNetTotalGlobal206: {},
      revenuTaxeTotalGlobal207: {},
      prodRevenuChambre208: {},
      prodRevenuBq209: {},
      prodRevenuExtra210: {},
      prodRevenuTotal211: {},
      prodChambreNbNuitees212: {},
      techCreateDate213: {},
      techUpdateDate214: {},
      numLigne215: {},
      resort216: {},
      resvNameId217: {},
      clientOId218: {},
      typeChb219: {},
      confirmationNo220: {},
      clientMdmId221: {},
      nameId222: {},
      parentResvNameId223: {},
      contactId224: {},
      agenceId225: {},
      agenceNom226: {},
      societeId227: {},
      groupeId228: {},
      numBloc229: {},
      typeResv230: {},
      statutResv231: {},
      dateDebutResv232: {},
      dateFinResv233: {},
      truncDateDebutResv234: {},
      truncDateFinResv235: {},
      dateAnnResv236: {},
      pseudoRoomYn237: {},
      createurResv238: {},
      nomCreateurResv239: {},
      codeGarantie240: {},
      flgDed241: {},
      codePays242: {},
      libPays243: {},
      codeNationalite244: {},
      libNationalite245: {},
      codeSource246: {},
      libSource247: {},
      codeGrandSource248: {},
      codeOrigine249: {},
      libOrigine250: {},
      codeMarche251: {},
      libMarche252: {},
      codeGrandMarche253: {},
      libGrandMarche254: {},
      codePrix255: {},
      categPrix256: {},
      libPrix257: {},
      numChb258: {},
      descriptionTypeChb259: {},
      codeTypeChb260: {},
      classChb261: {},
      caractChb262: {},
      typeChbDeReservation263: {},
      descriptionTypeChbDeResv264: {},
      codeTypeChbDeResv265: {},
      statutDeReservation266: {},
      circuitDistribution267: {},
      circuitDistribUserRegroup268: {},
      numCrs269: {},
      typeRefCrs270: {},
      crsInsertDate271: {},
      dateCreaResv272: {},
      datePremier273: {},
      statutPremier274: {},
      dateDernier275: {},
      statutDernier276: {},
      dateDernierPseudo277: {},
      statutDernierPseudo278: {},
      diffDtCreaAnn279: {},
      diffDtArrAnn280: {},
      leadtime281: {},
      los282: {},
      occupantsGroupe283: {},
      nbNuitee284: {},
      nbNuiteeNnDed285: {},
      nbResvAnn286: {},
      nbAdu287: {},
      nbEnf288: {},
      nbPersDayU289: {},
      nbPersArr290: {},
      nbPersDep291: {},
      nbPersAnn292: {},
      nbPersNoshow293: {},
      nbChbDayU294: {},
      nbChbArr295: {},
      nbChbDep296: {},
      nbChbAnn297: {},
      nbChbNoshow298: {},
      revenuNetChambre299: {},
      revenuTaxeChambre300: {},
      revenuNetChambreGlobal301: {},
      revenuTaxeChambreGlobal302: {},
      revenuNetBq303: {},
      revenuTaxeBq304: {},
      revenuNetBqGlobal305: {},
      revenuTaxeBqGlobal306: {},
      revenuNetExtra307: {},
      revenuTaxeExtra308: {},
      revenuNetExtraGlobal309: {},
      revenuTaxeExtraGlobal310: {},
    };
    const v$ = useVuelidate(validationRules, table9 as any);
    v$.value.$validate();

    return {
      table9Service,
      alertService,
      table9,
      previousState,
      isSaving,
      currentLanguage,
      v$,
      t$,
    };
  },
  created(): void {},
  methods: {
    save(): void {
      this.isSaving = true;
      if (this.table9.id) {
        this.table9Service()
          .update(this.table9)
          .then(param => {
            this.isSaving = false;
            this.previousState();
            this.alertService.showInfo(this.t$('big10SampleApplicationApp.table9.updated', { param: param.id }));
          })
          .catch(error => {
            this.isSaving = false;
            this.alertService.showHttpError(error.response);
          });
      } else {
        this.table9Service()
          .create(this.table9)
          .then(param => {
            this.isSaving = false;
            this.previousState();
            this.alertService.showSuccess(this.t$('big10SampleApplicationApp.table9.created', { param: param.id }).toString());
          })
          .catch(error => {
            this.isSaving = false;
            this.alertService.showHttpError(error.response);
          });
      }
    },
  },
});
