package com.mycompany.myapp.web.rest;

import static com.mycompany.myapp.domain.Table2Asserts.*;
import static com.mycompany.myapp.web.rest.TestUtil.createUpdateProxyForBean;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.myapp.IntegrationTest;
import com.mycompany.myapp.domain.Table2;
import com.mycompany.myapp.repository.Table2Repository;
import jakarta.persistence.EntityManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

/**
 * Integration tests for the {@link Table2Resource} REST controller.
 */
@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class Table2ResourceIT {

    private static final Integer DEFAULT_NUM_LIGNE_1 = 1;
    private static final Integer UPDATED_NUM_LIGNE_1 = 2;

    private static final String DEFAULT_RESORT_2 = "AAAAAAAAAA";
    private static final String UPDATED_RESORT_2 = "BBBBBBBBBB";

    private static final Integer DEFAULT_RESV_NAME_ID_3 = 1;
    private static final Integer UPDATED_RESV_NAME_ID_3 = 2;

    private static final String DEFAULT_CLIENT_O_ID_4 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_O_ID_4 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_5 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_5 = "BBBBBBBBBB";

    private static final String DEFAULT_CONFIRMATION_NO_6 = "AAAAAAAAAA";
    private static final String UPDATED_CONFIRMATION_NO_6 = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_MDM_ID_7 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_MDM_ID_7 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NAME_ID_8 = 1;
    private static final Integer UPDATED_NAME_ID_8 = 2;

    private static final Integer DEFAULT_PARENT_RESV_NAME_ID_9 = 1;
    private static final Integer UPDATED_PARENT_RESV_NAME_ID_9 = 2;

    private static final Integer DEFAULT_CONTACT_ID_10 = 1;
    private static final Integer UPDATED_CONTACT_ID_10 = 2;

    private static final Integer DEFAULT_AGENCE_ID_11 = 1;
    private static final Integer UPDATED_AGENCE_ID_11 = 2;

    private static final String DEFAULT_AGENCE_NOM_12 = "AAAAAAAAAA";
    private static final String UPDATED_AGENCE_NOM_12 = "BBBBBBBBBB";

    private static final Integer DEFAULT_SOCIETE_ID_13 = 1;
    private static final Integer UPDATED_SOCIETE_ID_13 = 2;

    private static final Integer DEFAULT_GROUPE_ID_14 = 1;
    private static final Integer UPDATED_GROUPE_ID_14 = 2;

    private static final Integer DEFAULT_NUM_BLOC_15 = 1;
    private static final Integer UPDATED_NUM_BLOC_15 = 2;

    private static final String DEFAULT_TYPE_RESV_16 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_RESV_16 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_RESV_17 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_RESV_17 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DEBUT_RESV_18 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DEBUT_RESV_18 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_FIN_RESV_19 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_FIN_RESV_19 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_DEBUT_RESV_20 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_DEBUT_RESV_20 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_FIN_RESV_21 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_FIN_RESV_21 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_ANN_RESV_22 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_ANN_RESV_22 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_PSEUDO_ROOM_YN_23 = "AAAAAAAAAA";
    private static final String UPDATED_PSEUDO_ROOM_YN_23 = "BBBBBBBBBB";

    private static final Integer DEFAULT_CREATEUR_RESV_24 = 1;
    private static final Integer UPDATED_CREATEUR_RESV_24 = 2;

    private static final String DEFAULT_NOM_CREATEUR_RESV_25 = "AAAAAAAAAA";
    private static final String UPDATED_NOM_CREATEUR_RESV_25 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GARANTIE_26 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GARANTIE_26 = "BBBBBBBBBB";

    private static final String DEFAULT_FLG_DED_27 = "AAAAAAAAAA";
    private static final String UPDATED_FLG_DED_27 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PAYS_28 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PAYS_28 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PAYS_29 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PAYS_29 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_NATIONALITE_30 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_NATIONALITE_30 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_NATIONALITE_31 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_NATIONALITE_31 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_SOURCE_32 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_SOURCE_32 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_SOURCE_33 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_SOURCE_33 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_SOURCE_34 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_SOURCE_34 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_ORIGINE_35 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_ORIGINE_35 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_ORIGINE_36 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_ORIGINE_36 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_MARCHE_37 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_MARCHE_37 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_MARCHE_38 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_MARCHE_38 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_MARCHE_39 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_MARCHE_39 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_GRAND_MARCHE_40 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_GRAND_MARCHE_40 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PRIX_41 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PRIX_41 = "BBBBBBBBBB";

    private static final String DEFAULT_CATEG_PRIX_42 = "AAAAAAAAAA";
    private static final String UPDATED_CATEG_PRIX_42 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PRIX_43 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PRIX_43 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CHB_44 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CHB_44 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_45 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_45 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_46 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_46 = "BBBBBBBBBB";

    private static final String DEFAULT_CLASS_CHB_47 = "AAAAAAAAAA";
    private static final String UPDATED_CLASS_CHB_47 = "BBBBBBBBBB";

    private static final String DEFAULT_CARACT_CHB_48 = "AAAAAAAAAA";
    private static final String UPDATED_CARACT_CHB_48 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_DE_RESERVATION_49 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_DE_RESERVATION_49 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_50 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_50 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_DE_RESV_51 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_DE_RESV_51 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DE_RESERVATION_52 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DE_RESERVATION_52 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIBUTION_53 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIBUTION_53 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_54 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_54 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CRS_55 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CRS_55 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_REF_CRS_56 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_REF_CRS_56 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_CRS_INSERT_DATE_57 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CRS_INSERT_DATE_57 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_CREA_RESV_58 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_CREA_RESV_58 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_PREMIER_59 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_PREMIER_59 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_PREMIER_60 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_PREMIER_60 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_61 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_61 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_62 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_62 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_PSEUDO_63 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_PSEUDO_63 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_PSEUDO_64 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_PSEUDO_64 = "BBBBBBBBBB";

    private static final Integer DEFAULT_DIFF_DT_CREA_ANN_65 = 1;
    private static final Integer UPDATED_DIFF_DT_CREA_ANN_65 = 2;

    private static final Integer DEFAULT_DIFF_DT_ARR_ANN_66 = 1;
    private static final Integer UPDATED_DIFF_DT_ARR_ANN_66 = 2;

    private static final Integer DEFAULT_LEADTIME_67 = 1;
    private static final Integer UPDATED_LEADTIME_67 = 2;

    private static final Integer DEFAULT_LOS_68 = 1;
    private static final Integer UPDATED_LOS_68 = 2;

    private static final String DEFAULT_OCCUPANTS_GROUPE_69 = "AAAAAAAAAA";
    private static final String UPDATED_OCCUPANTS_GROUPE_69 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NB_NUITEE_70 = 1;
    private static final Integer UPDATED_NB_NUITEE_70 = 2;

    private static final Integer DEFAULT_NB_NUITEE_NN_DED_71 = 1;
    private static final Integer UPDATED_NB_NUITEE_NN_DED_71 = 2;

    private static final Integer DEFAULT_NB_RESV_ANN_72 = 1;
    private static final Integer UPDATED_NB_RESV_ANN_72 = 2;

    private static final Integer DEFAULT_NB_ADU_73 = 1;
    private static final Integer UPDATED_NB_ADU_73 = 2;

    private static final Integer DEFAULT_NB_ENF_74 = 1;
    private static final Integer UPDATED_NB_ENF_74 = 2;

    private static final Integer DEFAULT_NB_PERS_DAY_U_75 = 1;
    private static final Integer UPDATED_NB_PERS_DAY_U_75 = 2;

    private static final Integer DEFAULT_NB_PERS_ARR_76 = 1;
    private static final Integer UPDATED_NB_PERS_ARR_76 = 2;

    private static final Integer DEFAULT_NB_PERS_DEP_77 = 1;
    private static final Integer UPDATED_NB_PERS_DEP_77 = 2;

    private static final Integer DEFAULT_NB_PERS_ANN_78 = 1;
    private static final Integer UPDATED_NB_PERS_ANN_78 = 2;

    private static final Integer DEFAULT_NB_PERS_NOSHOW_79 = 1;
    private static final Integer UPDATED_NB_PERS_NOSHOW_79 = 2;

    private static final Integer DEFAULT_NB_CHB_DAY_U_80 = 1;
    private static final Integer UPDATED_NB_CHB_DAY_U_80 = 2;

    private static final Integer DEFAULT_NB_CHB_ARR_81 = 1;
    private static final Integer UPDATED_NB_CHB_ARR_81 = 2;

    private static final Integer DEFAULT_NB_CHB_DEP_82 = 1;
    private static final Integer UPDATED_NB_CHB_DEP_82 = 2;

    private static final Integer DEFAULT_NB_CHB_ANN_83 = 1;
    private static final Integer UPDATED_NB_CHB_ANN_83 = 2;

    private static final Integer DEFAULT_NB_CHB_NOSHOW_84 = 1;
    private static final Integer UPDATED_NB_CHB_NOSHOW_84 = 2;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_85 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_85 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_86 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_86 = 2L;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_87 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_GLOBAL_87 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_88 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_88 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_89 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_89 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_90 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_90 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_GLOBAL_91 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_GLOBAL_91 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_GLOBAL_92 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_GLOBAL_92 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_93 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_93 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_94 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_94 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_GLOBAL_95 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_GLOBAL_95 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_96 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_GLOBAL_96 = 2L;

    private static final Long DEFAULT_REVENU_NET_TOTAL_97 = 1L;
    private static final Long UPDATED_REVENU_NET_TOTAL_97 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_TOTAL_98 = 1L;
    private static final Long UPDATED_REVENU_TAXE_TOTAL_98 = 2L;

    private static final Long DEFAULT_REVENU_NET_TOTAL_GLOBAL_99 = 1L;
    private static final Long UPDATED_REVENU_NET_TOTAL_GLOBAL_99 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_100 = 1L;
    private static final Long UPDATED_REVENU_TAXE_TOTAL_GLOBAL_100 = 2L;

    private static final Long DEFAULT_PROD_REVENU_CHAMBRE_101 = 1L;
    private static final Long UPDATED_PROD_REVENU_CHAMBRE_101 = 2L;

    private static final Long DEFAULT_PROD_REVENU_BQ_102 = 1L;
    private static final Long UPDATED_PROD_REVENU_BQ_102 = 2L;

    private static final Long DEFAULT_PROD_REVENU_EXTRA_103 = 1L;
    private static final Long UPDATED_PROD_REVENU_EXTRA_103 = 2L;

    private static final Long DEFAULT_PROD_REVENU_TOTAL_104 = 1L;
    private static final Long UPDATED_PROD_REVENU_TOTAL_104 = 2L;

    private static final Long DEFAULT_PROD_CHAMBRE_NB_NUITEES_105 = 1L;
    private static final Long UPDATED_PROD_CHAMBRE_NB_NUITEES_105 = 2L;

    private static final LocalDate DEFAULT_TECH_CREATE_DATE_106 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TECH_CREATE_DATE_106 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TECH_UPDATE_DATE_107 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TECH_UPDATE_DATE_107 = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_NUM_LIGNE_108 = 1;
    private static final Integer UPDATED_NUM_LIGNE_108 = 2;

    private static final String DEFAULT_RESORT_109 = "AAAAAAAAAA";
    private static final String UPDATED_RESORT_109 = "BBBBBBBBBB";

    private static final Integer DEFAULT_RESV_NAME_ID_110 = 1;
    private static final Integer UPDATED_RESV_NAME_ID_110 = 2;

    private static final String DEFAULT_CLIENT_O_ID_111 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_O_ID_111 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_112 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_112 = "BBBBBBBBBB";

    private static final String DEFAULT_CONFIRMATION_NO_113 = "AAAAAAAAAA";
    private static final String UPDATED_CONFIRMATION_NO_113 = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_MDM_ID_114 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_MDM_ID_114 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NAME_ID_115 = 1;
    private static final Integer UPDATED_NAME_ID_115 = 2;

    private static final Integer DEFAULT_PARENT_RESV_NAME_ID_116 = 1;
    private static final Integer UPDATED_PARENT_RESV_NAME_ID_116 = 2;

    private static final Integer DEFAULT_CONTACT_ID_117 = 1;
    private static final Integer UPDATED_CONTACT_ID_117 = 2;

    private static final Integer DEFAULT_AGENCE_ID_118 = 1;
    private static final Integer UPDATED_AGENCE_ID_118 = 2;

    private static final String DEFAULT_AGENCE_NOM_119 = "AAAAAAAAAA";
    private static final String UPDATED_AGENCE_NOM_119 = "BBBBBBBBBB";

    private static final Integer DEFAULT_SOCIETE_ID_120 = 1;
    private static final Integer UPDATED_SOCIETE_ID_120 = 2;

    private static final Integer DEFAULT_GROUPE_ID_121 = 1;
    private static final Integer UPDATED_GROUPE_ID_121 = 2;

    private static final Integer DEFAULT_NUM_BLOC_122 = 1;
    private static final Integer UPDATED_NUM_BLOC_122 = 2;

    private static final String DEFAULT_TYPE_RESV_123 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_RESV_123 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_RESV_124 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_RESV_124 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DEBUT_RESV_125 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DEBUT_RESV_125 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_FIN_RESV_126 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_FIN_RESV_126 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_DEBUT_RESV_127 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_DEBUT_RESV_127 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_FIN_RESV_128 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_FIN_RESV_128 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_ANN_RESV_129 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_ANN_RESV_129 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_PSEUDO_ROOM_YN_130 = "AAAAAAAAAA";
    private static final String UPDATED_PSEUDO_ROOM_YN_130 = "BBBBBBBBBB";

    private static final Integer DEFAULT_CREATEUR_RESV_131 = 1;
    private static final Integer UPDATED_CREATEUR_RESV_131 = 2;

    private static final String DEFAULT_NOM_CREATEUR_RESV_132 = "AAAAAAAAAA";
    private static final String UPDATED_NOM_CREATEUR_RESV_132 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GARANTIE_133 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GARANTIE_133 = "BBBBBBBBBB";

    private static final String DEFAULT_FLG_DED_134 = "AAAAAAAAAA";
    private static final String UPDATED_FLG_DED_134 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PAYS_135 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PAYS_135 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PAYS_136 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PAYS_136 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_NATIONALITE_137 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_NATIONALITE_137 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_NATIONALITE_138 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_NATIONALITE_138 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_SOURCE_139 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_SOURCE_139 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_SOURCE_140 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_SOURCE_140 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_SOURCE_141 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_SOURCE_141 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_ORIGINE_142 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_ORIGINE_142 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_ORIGINE_143 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_ORIGINE_143 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_MARCHE_144 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_MARCHE_144 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_MARCHE_145 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_MARCHE_145 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_MARCHE_146 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_MARCHE_146 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_GRAND_MARCHE_147 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_GRAND_MARCHE_147 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PRIX_148 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PRIX_148 = "BBBBBBBBBB";

    private static final String DEFAULT_CATEG_PRIX_149 = "AAAAAAAAAA";
    private static final String UPDATED_CATEG_PRIX_149 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PRIX_150 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PRIX_150 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CHB_151 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CHB_151 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_152 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_152 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_153 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_153 = "BBBBBBBBBB";

    private static final String DEFAULT_CLASS_CHB_154 = "AAAAAAAAAA";
    private static final String UPDATED_CLASS_CHB_154 = "BBBBBBBBBB";

    private static final String DEFAULT_CARACT_CHB_155 = "AAAAAAAAAA";
    private static final String UPDATED_CARACT_CHB_155 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_DE_RESERVATION_156 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_DE_RESERVATION_156 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_157 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_157 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_DE_RESV_158 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_DE_RESV_158 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DE_RESERVATION_159 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DE_RESERVATION_159 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIBUTION_160 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIBUTION_160 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_161 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_161 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CRS_162 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CRS_162 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_REF_CRS_163 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_REF_CRS_163 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_CRS_INSERT_DATE_164 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CRS_INSERT_DATE_164 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_CREA_RESV_165 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_CREA_RESV_165 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_PREMIER_166 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_PREMIER_166 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_PREMIER_167 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_PREMIER_167 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_168 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_168 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_169 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_169 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_PSEUDO_170 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_PSEUDO_170 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_PSEUDO_171 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_PSEUDO_171 = "BBBBBBBBBB";

    private static final Integer DEFAULT_DIFF_DT_CREA_ANN_172 = 1;
    private static final Integer UPDATED_DIFF_DT_CREA_ANN_172 = 2;

    private static final Integer DEFAULT_DIFF_DT_ARR_ANN_173 = 1;
    private static final Integer UPDATED_DIFF_DT_ARR_ANN_173 = 2;

    private static final Integer DEFAULT_LEADTIME_174 = 1;
    private static final Integer UPDATED_LEADTIME_174 = 2;

    private static final Integer DEFAULT_LOS_175 = 1;
    private static final Integer UPDATED_LOS_175 = 2;

    private static final String DEFAULT_OCCUPANTS_GROUPE_176 = "AAAAAAAAAA";
    private static final String UPDATED_OCCUPANTS_GROUPE_176 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NB_NUITEE_177 = 1;
    private static final Integer UPDATED_NB_NUITEE_177 = 2;

    private static final Integer DEFAULT_NB_NUITEE_NN_DED_178 = 1;
    private static final Integer UPDATED_NB_NUITEE_NN_DED_178 = 2;

    private static final Integer DEFAULT_NB_RESV_ANN_179 = 1;
    private static final Integer UPDATED_NB_RESV_ANN_179 = 2;

    private static final Integer DEFAULT_NB_ADU_180 = 1;
    private static final Integer UPDATED_NB_ADU_180 = 2;

    private static final Integer DEFAULT_NB_ENF_181 = 1;
    private static final Integer UPDATED_NB_ENF_181 = 2;

    private static final Integer DEFAULT_NB_PERS_DAY_U_182 = 1;
    private static final Integer UPDATED_NB_PERS_DAY_U_182 = 2;

    private static final Integer DEFAULT_NB_PERS_ARR_183 = 1;
    private static final Integer UPDATED_NB_PERS_ARR_183 = 2;

    private static final Integer DEFAULT_NB_PERS_DEP_184 = 1;
    private static final Integer UPDATED_NB_PERS_DEP_184 = 2;

    private static final Integer DEFAULT_NB_PERS_ANN_185 = 1;
    private static final Integer UPDATED_NB_PERS_ANN_185 = 2;

    private static final Integer DEFAULT_NB_PERS_NOSHOW_186 = 1;
    private static final Integer UPDATED_NB_PERS_NOSHOW_186 = 2;

    private static final Integer DEFAULT_NB_CHB_DAY_U_187 = 1;
    private static final Integer UPDATED_NB_CHB_DAY_U_187 = 2;

    private static final Integer DEFAULT_NB_CHB_ARR_188 = 1;
    private static final Integer UPDATED_NB_CHB_ARR_188 = 2;

    private static final Integer DEFAULT_NB_CHB_DEP_189 = 1;
    private static final Integer UPDATED_NB_CHB_DEP_189 = 2;

    private static final Integer DEFAULT_NB_CHB_ANN_190 = 1;
    private static final Integer UPDATED_NB_CHB_ANN_190 = 2;

    private static final Integer DEFAULT_NB_CHB_NOSHOW_191 = 1;
    private static final Integer UPDATED_NB_CHB_NOSHOW_191 = 2;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_192 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_192 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_193 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_193 = 2L;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_194 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_GLOBAL_194 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_195 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_195 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_196 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_196 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_197 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_197 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_GLOBAL_198 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_GLOBAL_198 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_GLOBAL_199 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_GLOBAL_199 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_200 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_200 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_201 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_201 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_GLOBAL_202 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_GLOBAL_202 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_203 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_GLOBAL_203 = 2L;

    private static final Long DEFAULT_REVENU_NET_TOTAL_204 = 1L;
    private static final Long UPDATED_REVENU_NET_TOTAL_204 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_TOTAL_205 = 1L;
    private static final Long UPDATED_REVENU_TAXE_TOTAL_205 = 2L;

    private static final Long DEFAULT_REVENU_NET_TOTAL_GLOBAL_206 = 1L;
    private static final Long UPDATED_REVENU_NET_TOTAL_GLOBAL_206 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_207 = 1L;
    private static final Long UPDATED_REVENU_TAXE_TOTAL_GLOBAL_207 = 2L;

    private static final Long DEFAULT_PROD_REVENU_CHAMBRE_208 = 1L;
    private static final Long UPDATED_PROD_REVENU_CHAMBRE_208 = 2L;

    private static final Long DEFAULT_PROD_REVENU_BQ_209 = 1L;
    private static final Long UPDATED_PROD_REVENU_BQ_209 = 2L;

    private static final Long DEFAULT_PROD_REVENU_EXTRA_210 = 1L;
    private static final Long UPDATED_PROD_REVENU_EXTRA_210 = 2L;

    private static final Long DEFAULT_PROD_REVENU_TOTAL_211 = 1L;
    private static final Long UPDATED_PROD_REVENU_TOTAL_211 = 2L;

    private static final Long DEFAULT_PROD_CHAMBRE_NB_NUITEES_212 = 1L;
    private static final Long UPDATED_PROD_CHAMBRE_NB_NUITEES_212 = 2L;

    private static final LocalDate DEFAULT_TECH_CREATE_DATE_213 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TECH_CREATE_DATE_213 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TECH_UPDATE_DATE_214 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TECH_UPDATE_DATE_214 = LocalDate.now(ZoneId.systemDefault());

    private static final Integer DEFAULT_NUM_LIGNE_215 = 1;
    private static final Integer UPDATED_NUM_LIGNE_215 = 2;

    private static final String DEFAULT_RESORT_216 = "AAAAAAAAAA";
    private static final String UPDATED_RESORT_216 = "BBBBBBBBBB";

    private static final Integer DEFAULT_RESV_NAME_ID_217 = 1;
    private static final Integer UPDATED_RESV_NAME_ID_217 = 2;

    private static final String DEFAULT_CLIENT_O_ID_218 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_O_ID_218 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_219 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_219 = "BBBBBBBBBB";

    private static final String DEFAULT_CONFIRMATION_NO_220 = "AAAAAAAAAA";
    private static final String UPDATED_CONFIRMATION_NO_220 = "BBBBBBBBBB";

    private static final String DEFAULT_CLIENT_MDM_ID_221 = "AAAAAAAAAA";
    private static final String UPDATED_CLIENT_MDM_ID_221 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NAME_ID_222 = 1;
    private static final Integer UPDATED_NAME_ID_222 = 2;

    private static final Integer DEFAULT_PARENT_RESV_NAME_ID_223 = 1;
    private static final Integer UPDATED_PARENT_RESV_NAME_ID_223 = 2;

    private static final Integer DEFAULT_CONTACT_ID_224 = 1;
    private static final Integer UPDATED_CONTACT_ID_224 = 2;

    private static final Integer DEFAULT_AGENCE_ID_225 = 1;
    private static final Integer UPDATED_AGENCE_ID_225 = 2;

    private static final String DEFAULT_AGENCE_NOM_226 = "AAAAAAAAAA";
    private static final String UPDATED_AGENCE_NOM_226 = "BBBBBBBBBB";

    private static final Integer DEFAULT_SOCIETE_ID_227 = 1;
    private static final Integer UPDATED_SOCIETE_ID_227 = 2;

    private static final Integer DEFAULT_GROUPE_ID_228 = 1;
    private static final Integer UPDATED_GROUPE_ID_228 = 2;

    private static final Integer DEFAULT_NUM_BLOC_229 = 1;
    private static final Integer UPDATED_NUM_BLOC_229 = 2;

    private static final String DEFAULT_TYPE_RESV_230 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_RESV_230 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_RESV_231 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_RESV_231 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DEBUT_RESV_232 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DEBUT_RESV_232 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_FIN_RESV_233 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_FIN_RESV_233 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_DEBUT_RESV_234 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_DEBUT_RESV_234 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_TRUNC_DATE_FIN_RESV_235 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_TRUNC_DATE_FIN_RESV_235 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_ANN_RESV_236 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_ANN_RESV_236 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_PSEUDO_ROOM_YN_237 = "AAAAAAAAAA";
    private static final String UPDATED_PSEUDO_ROOM_YN_237 = "BBBBBBBBBB";

    private static final Integer DEFAULT_CREATEUR_RESV_238 = 1;
    private static final Integer UPDATED_CREATEUR_RESV_238 = 2;

    private static final String DEFAULT_NOM_CREATEUR_RESV_239 = "AAAAAAAAAA";
    private static final String UPDATED_NOM_CREATEUR_RESV_239 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GARANTIE_240 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GARANTIE_240 = "BBBBBBBBBB";

    private static final String DEFAULT_FLG_DED_241 = "AAAAAAAAAA";
    private static final String UPDATED_FLG_DED_241 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PAYS_242 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PAYS_242 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PAYS_243 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PAYS_243 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_NATIONALITE_244 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_NATIONALITE_244 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_NATIONALITE_245 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_NATIONALITE_245 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_SOURCE_246 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_SOURCE_246 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_SOURCE_247 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_SOURCE_247 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_SOURCE_248 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_SOURCE_248 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_ORIGINE_249 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_ORIGINE_249 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_ORIGINE_250 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_ORIGINE_250 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_MARCHE_251 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_MARCHE_251 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_MARCHE_252 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_MARCHE_252 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_GRAND_MARCHE_253 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_GRAND_MARCHE_253 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_GRAND_MARCHE_254 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_GRAND_MARCHE_254 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_PRIX_255 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_PRIX_255 = "BBBBBBBBBB";

    private static final String DEFAULT_CATEG_PRIX_256 = "AAAAAAAAAA";
    private static final String UPDATED_CATEG_PRIX_256 = "BBBBBBBBBB";

    private static final String DEFAULT_LIB_PRIX_257 = "AAAAAAAAAA";
    private static final String UPDATED_LIB_PRIX_257 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CHB_258 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CHB_258 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_259 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_259 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_260 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_260 = "BBBBBBBBBB";

    private static final String DEFAULT_CLASS_CHB_261 = "AAAAAAAAAA";
    private static final String UPDATED_CLASS_CHB_261 = "BBBBBBBBBB";

    private static final String DEFAULT_CARACT_CHB_262 = "AAAAAAAAAA";
    private static final String UPDATED_CARACT_CHB_262 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_CHB_DE_RESERVATION_263 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_CHB_DE_RESERVATION_263 = "BBBBBBBBBB";

    private static final String DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_264 = "AAAAAAAAAA";
    private static final String UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_264 = "BBBBBBBBBB";

    private static final String DEFAULT_CODE_TYPE_CHB_DE_RESV_265 = "AAAAAAAAAA";
    private static final String UPDATED_CODE_TYPE_CHB_DE_RESV_265 = "BBBBBBBBBB";

    private static final String DEFAULT_STATUT_DE_RESERVATION_266 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DE_RESERVATION_266 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIBUTION_267 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIBUTION_267 = "BBBBBBBBBB";

    private static final String DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_268 = "AAAAAAAAAA";
    private static final String UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_268 = "BBBBBBBBBB";

    private static final String DEFAULT_NUM_CRS_269 = "AAAAAAAAAA";
    private static final String UPDATED_NUM_CRS_269 = "BBBBBBBBBB";

    private static final String DEFAULT_TYPE_REF_CRS_270 = "AAAAAAAAAA";
    private static final String UPDATED_TYPE_REF_CRS_270 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_CRS_INSERT_DATE_271 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_CRS_INSERT_DATE_271 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_CREA_RESV_272 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_CREA_RESV_272 = LocalDate.now(ZoneId.systemDefault());

    private static final LocalDate DEFAULT_DATE_PREMIER_273 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_PREMIER_273 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_PREMIER_274 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_PREMIER_274 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_275 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_275 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_276 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_276 = "BBBBBBBBBB";

    private static final LocalDate DEFAULT_DATE_DERNIER_PSEUDO_277 = LocalDate.ofEpochDay(0L);
    private static final LocalDate UPDATED_DATE_DERNIER_PSEUDO_277 = LocalDate.now(ZoneId.systemDefault());

    private static final String DEFAULT_STATUT_DERNIER_PSEUDO_278 = "AAAAAAAAAA";
    private static final String UPDATED_STATUT_DERNIER_PSEUDO_278 = "BBBBBBBBBB";

    private static final Integer DEFAULT_DIFF_DT_CREA_ANN_279 = 1;
    private static final Integer UPDATED_DIFF_DT_CREA_ANN_279 = 2;

    private static final Integer DEFAULT_DIFF_DT_ARR_ANN_280 = 1;
    private static final Integer UPDATED_DIFF_DT_ARR_ANN_280 = 2;

    private static final Integer DEFAULT_LEADTIME_281 = 1;
    private static final Integer UPDATED_LEADTIME_281 = 2;

    private static final Integer DEFAULT_LOS_282 = 1;
    private static final Integer UPDATED_LOS_282 = 2;

    private static final String DEFAULT_OCCUPANTS_GROUPE_283 = "AAAAAAAAAA";
    private static final String UPDATED_OCCUPANTS_GROUPE_283 = "BBBBBBBBBB";

    private static final Integer DEFAULT_NB_NUITEE_284 = 1;
    private static final Integer UPDATED_NB_NUITEE_284 = 2;

    private static final Integer DEFAULT_NB_NUITEE_NN_DED_285 = 1;
    private static final Integer UPDATED_NB_NUITEE_NN_DED_285 = 2;

    private static final Integer DEFAULT_NB_RESV_ANN_286 = 1;
    private static final Integer UPDATED_NB_RESV_ANN_286 = 2;

    private static final Integer DEFAULT_NB_ADU_287 = 1;
    private static final Integer UPDATED_NB_ADU_287 = 2;

    private static final Integer DEFAULT_NB_ENF_288 = 1;
    private static final Integer UPDATED_NB_ENF_288 = 2;

    private static final Integer DEFAULT_NB_PERS_DAY_U_289 = 1;
    private static final Integer UPDATED_NB_PERS_DAY_U_289 = 2;

    private static final Integer DEFAULT_NB_PERS_ARR_290 = 1;
    private static final Integer UPDATED_NB_PERS_ARR_290 = 2;

    private static final Integer DEFAULT_NB_PERS_DEP_291 = 1;
    private static final Integer UPDATED_NB_PERS_DEP_291 = 2;

    private static final Integer DEFAULT_NB_PERS_ANN_292 = 1;
    private static final Integer UPDATED_NB_PERS_ANN_292 = 2;

    private static final Integer DEFAULT_NB_PERS_NOSHOW_293 = 1;
    private static final Integer UPDATED_NB_PERS_NOSHOW_293 = 2;

    private static final Integer DEFAULT_NB_CHB_DAY_U_294 = 1;
    private static final Integer UPDATED_NB_CHB_DAY_U_294 = 2;

    private static final Integer DEFAULT_NB_CHB_ARR_295 = 1;
    private static final Integer UPDATED_NB_CHB_ARR_295 = 2;

    private static final Integer DEFAULT_NB_CHB_DEP_296 = 1;
    private static final Integer UPDATED_NB_CHB_DEP_296 = 2;

    private static final Integer DEFAULT_NB_CHB_ANN_297 = 1;
    private static final Integer UPDATED_NB_CHB_ANN_297 = 2;

    private static final Integer DEFAULT_NB_CHB_NOSHOW_298 = 1;
    private static final Integer UPDATED_NB_CHB_NOSHOW_298 = 2;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_299 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_299 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_300 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_300 = 2L;

    private static final Long DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_301 = 1L;
    private static final Long UPDATED_REVENU_NET_CHAMBRE_GLOBAL_301 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_302 = 1L;
    private static final Long UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_302 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_303 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_303 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_304 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_304 = 2L;

    private static final Long DEFAULT_REVENU_NET_BQ_GLOBAL_305 = 1L;
    private static final Long UPDATED_REVENU_NET_BQ_GLOBAL_305 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_BQ_GLOBAL_306 = 1L;
    private static final Long UPDATED_REVENU_TAXE_BQ_GLOBAL_306 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_307 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_307 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_308 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_308 = 2L;

    private static final Long DEFAULT_REVENU_NET_EXTRA_GLOBAL_309 = 1L;
    private static final Long UPDATED_REVENU_NET_EXTRA_GLOBAL_309 = 2L;

    private static final Long DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_310 = 1L;
    private static final Long UPDATED_REVENU_TAXE_EXTRA_GLOBAL_310 = 2L;

    private static final String ENTITY_API_URL = "/api/table-2-s";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static Random random = new Random();
    private static AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    @Autowired
    private ObjectMapper om;

    @Autowired
    private Table2Repository table2Repository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restTable2MockMvc;

    private Table2 table2;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Table2 createEntity(EntityManager em) {
        Table2 table2 = new Table2()
            .numLigne1(DEFAULT_NUM_LIGNE_1)
            .resort2(DEFAULT_RESORT_2)
            .resvNameId3(DEFAULT_RESV_NAME_ID_3)
            .clientOId4(DEFAULT_CLIENT_O_ID_4)
            .typeChb5(DEFAULT_TYPE_CHB_5)
            .confirmationNo6(DEFAULT_CONFIRMATION_NO_6)
            .clientMdmId7(DEFAULT_CLIENT_MDM_ID_7)
            .nameId8(DEFAULT_NAME_ID_8)
            .parentResvNameId9(DEFAULT_PARENT_RESV_NAME_ID_9)
            .contactId10(DEFAULT_CONTACT_ID_10)
            .agenceId11(DEFAULT_AGENCE_ID_11)
            .agenceNom12(DEFAULT_AGENCE_NOM_12)
            .societeId13(DEFAULT_SOCIETE_ID_13)
            .groupeId14(DEFAULT_GROUPE_ID_14)
            .numBloc15(DEFAULT_NUM_BLOC_15)
            .typeResv16(DEFAULT_TYPE_RESV_16)
            .statutResv17(DEFAULT_STATUT_RESV_17)
            .dateDebutResv18(DEFAULT_DATE_DEBUT_RESV_18)
            .dateFinResv19(DEFAULT_DATE_FIN_RESV_19)
            .truncDateDebutResv20(DEFAULT_TRUNC_DATE_DEBUT_RESV_20)
            .truncDateFinResv21(DEFAULT_TRUNC_DATE_FIN_RESV_21)
            .dateAnnResv22(DEFAULT_DATE_ANN_RESV_22)
            .pseudoRoomYn23(DEFAULT_PSEUDO_ROOM_YN_23)
            .createurResv24(DEFAULT_CREATEUR_RESV_24)
            .nomCreateurResv25(DEFAULT_NOM_CREATEUR_RESV_25)
            .codeGarantie26(DEFAULT_CODE_GARANTIE_26)
            .flgDed27(DEFAULT_FLG_DED_27)
            .codePays28(DEFAULT_CODE_PAYS_28)
            .libPays29(DEFAULT_LIB_PAYS_29)
            .codeNationalite30(DEFAULT_CODE_NATIONALITE_30)
            .libNationalite31(DEFAULT_LIB_NATIONALITE_31)
            .codeSource32(DEFAULT_CODE_SOURCE_32)
            .libSource33(DEFAULT_LIB_SOURCE_33)
            .codeGrandSource34(DEFAULT_CODE_GRAND_SOURCE_34)
            .codeOrigine35(DEFAULT_CODE_ORIGINE_35)
            .libOrigine36(DEFAULT_LIB_ORIGINE_36)
            .codeMarche37(DEFAULT_CODE_MARCHE_37)
            .libMarche38(DEFAULT_LIB_MARCHE_38)
            .codeGrandMarche39(DEFAULT_CODE_GRAND_MARCHE_39)
            .libGrandMarche40(DEFAULT_LIB_GRAND_MARCHE_40)
            .codePrix41(DEFAULT_CODE_PRIX_41)
            .categPrix42(DEFAULT_CATEG_PRIX_42)
            .libPrix43(DEFAULT_LIB_PRIX_43)
            .numChb44(DEFAULT_NUM_CHB_44)
            .descriptionTypeChb45(DEFAULT_DESCRIPTION_TYPE_CHB_45)
            .codeTypeChb46(DEFAULT_CODE_TYPE_CHB_46)
            .classChb47(DEFAULT_CLASS_CHB_47)
            .caractChb48(DEFAULT_CARACT_CHB_48)
            .typeChbDeReservation49(DEFAULT_TYPE_CHB_DE_RESERVATION_49)
            .descriptionTypeChbDeResv50(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_50)
            .codeTypeChbDeResv51(DEFAULT_CODE_TYPE_CHB_DE_RESV_51)
            .statutDeReservation52(DEFAULT_STATUT_DE_RESERVATION_52)
            .circuitDistribution53(DEFAULT_CIRCUIT_DISTRIBUTION_53)
            .circuitDistribUserRegroup54(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_54)
            .numCrs55(DEFAULT_NUM_CRS_55)
            .typeRefCrs56(DEFAULT_TYPE_REF_CRS_56)
            .crsInsertDate57(DEFAULT_CRS_INSERT_DATE_57)
            .dateCreaResv58(DEFAULT_DATE_CREA_RESV_58)
            .datePremier59(DEFAULT_DATE_PREMIER_59)
            .statutPremier60(DEFAULT_STATUT_PREMIER_60)
            .dateDernier61(DEFAULT_DATE_DERNIER_61)
            .statutDernier62(DEFAULT_STATUT_DERNIER_62)
            .dateDernierPseudo63(DEFAULT_DATE_DERNIER_PSEUDO_63)
            .statutDernierPseudo64(DEFAULT_STATUT_DERNIER_PSEUDO_64)
            .diffDtCreaAnn65(DEFAULT_DIFF_DT_CREA_ANN_65)
            .diffDtArrAnn66(DEFAULT_DIFF_DT_ARR_ANN_66)
            .leadtime67(DEFAULT_LEADTIME_67)
            .los68(DEFAULT_LOS_68)
            .occupantsGroupe69(DEFAULT_OCCUPANTS_GROUPE_69)
            .nbNuitee70(DEFAULT_NB_NUITEE_70)
            .nbNuiteeNnDed71(DEFAULT_NB_NUITEE_NN_DED_71)
            .nbResvAnn72(DEFAULT_NB_RESV_ANN_72)
            .nbAdu73(DEFAULT_NB_ADU_73)
            .nbEnf74(DEFAULT_NB_ENF_74)
            .nbPersDayU75(DEFAULT_NB_PERS_DAY_U_75)
            .nbPersArr76(DEFAULT_NB_PERS_ARR_76)
            .nbPersDep77(DEFAULT_NB_PERS_DEP_77)
            .nbPersAnn78(DEFAULT_NB_PERS_ANN_78)
            .nbPersNoshow79(DEFAULT_NB_PERS_NOSHOW_79)
            .nbChbDayU80(DEFAULT_NB_CHB_DAY_U_80)
            .nbChbArr81(DEFAULT_NB_CHB_ARR_81)
            .nbChbDep82(DEFAULT_NB_CHB_DEP_82)
            .nbChbAnn83(DEFAULT_NB_CHB_ANN_83)
            .nbChbNoshow84(DEFAULT_NB_CHB_NOSHOW_84)
            .revenuNetChambre85(DEFAULT_REVENU_NET_CHAMBRE_85)
            .revenuTaxeChambre86(DEFAULT_REVENU_TAXE_CHAMBRE_86)
            .revenuNetChambreGlobal87(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_87)
            .revenuTaxeChambreGlobal88(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_88)
            .revenuNetBq89(DEFAULT_REVENU_NET_BQ_89)
            .revenuTaxeBq90(DEFAULT_REVENU_TAXE_BQ_90)
            .revenuNetBqGlobal91(DEFAULT_REVENU_NET_BQ_GLOBAL_91)
            .revenuTaxeBqGlobal92(DEFAULT_REVENU_TAXE_BQ_GLOBAL_92)
            .revenuNetExtra93(DEFAULT_REVENU_NET_EXTRA_93)
            .revenuTaxeExtra94(DEFAULT_REVENU_TAXE_EXTRA_94)
            .revenuNetExtraGlobal95(DEFAULT_REVENU_NET_EXTRA_GLOBAL_95)
            .revenuTaxeExtraGlobal96(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_96)
            .revenuNetTotal97(DEFAULT_REVENU_NET_TOTAL_97)
            .revenuTaxeTotal98(DEFAULT_REVENU_TAXE_TOTAL_98)
            .revenuNetTotalGlobal99(DEFAULT_REVENU_NET_TOTAL_GLOBAL_99)
            .revenuTaxeTotalGlobal100(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_100)
            .prodRevenuChambre101(DEFAULT_PROD_REVENU_CHAMBRE_101)
            .prodRevenuBq102(DEFAULT_PROD_REVENU_BQ_102)
            .prodRevenuExtra103(DEFAULT_PROD_REVENU_EXTRA_103)
            .prodRevenuTotal104(DEFAULT_PROD_REVENU_TOTAL_104)
            .prodChambreNbNuitees105(DEFAULT_PROD_CHAMBRE_NB_NUITEES_105)
            .techCreateDate106(DEFAULT_TECH_CREATE_DATE_106)
            .techUpdateDate107(DEFAULT_TECH_UPDATE_DATE_107)
            .numLigne108(DEFAULT_NUM_LIGNE_108)
            .resort109(DEFAULT_RESORT_109)
            .resvNameId110(DEFAULT_RESV_NAME_ID_110)
            .clientOId111(DEFAULT_CLIENT_O_ID_111)
            .typeChb112(DEFAULT_TYPE_CHB_112)
            .confirmationNo113(DEFAULT_CONFIRMATION_NO_113)
            .clientMdmId114(DEFAULT_CLIENT_MDM_ID_114)
            .nameId115(DEFAULT_NAME_ID_115)
            .parentResvNameId116(DEFAULT_PARENT_RESV_NAME_ID_116)
            .contactId117(DEFAULT_CONTACT_ID_117)
            .agenceId118(DEFAULT_AGENCE_ID_118)
            .agenceNom119(DEFAULT_AGENCE_NOM_119)
            .societeId120(DEFAULT_SOCIETE_ID_120)
            .groupeId121(DEFAULT_GROUPE_ID_121)
            .numBloc122(DEFAULT_NUM_BLOC_122)
            .typeResv123(DEFAULT_TYPE_RESV_123)
            .statutResv124(DEFAULT_STATUT_RESV_124)
            .dateDebutResv125(DEFAULT_DATE_DEBUT_RESV_125)
            .dateFinResv126(DEFAULT_DATE_FIN_RESV_126)
            .truncDateDebutResv127(DEFAULT_TRUNC_DATE_DEBUT_RESV_127)
            .truncDateFinResv128(DEFAULT_TRUNC_DATE_FIN_RESV_128)
            .dateAnnResv129(DEFAULT_DATE_ANN_RESV_129)
            .pseudoRoomYn130(DEFAULT_PSEUDO_ROOM_YN_130)
            .createurResv131(DEFAULT_CREATEUR_RESV_131)
            .nomCreateurResv132(DEFAULT_NOM_CREATEUR_RESV_132)
            .codeGarantie133(DEFAULT_CODE_GARANTIE_133)
            .flgDed134(DEFAULT_FLG_DED_134)
            .codePays135(DEFAULT_CODE_PAYS_135)
            .libPays136(DEFAULT_LIB_PAYS_136)
            .codeNationalite137(DEFAULT_CODE_NATIONALITE_137)
            .libNationalite138(DEFAULT_LIB_NATIONALITE_138)
            .codeSource139(DEFAULT_CODE_SOURCE_139)
            .libSource140(DEFAULT_LIB_SOURCE_140)
            .codeGrandSource141(DEFAULT_CODE_GRAND_SOURCE_141)
            .codeOrigine142(DEFAULT_CODE_ORIGINE_142)
            .libOrigine143(DEFAULT_LIB_ORIGINE_143)
            .codeMarche144(DEFAULT_CODE_MARCHE_144)
            .libMarche145(DEFAULT_LIB_MARCHE_145)
            .codeGrandMarche146(DEFAULT_CODE_GRAND_MARCHE_146)
            .libGrandMarche147(DEFAULT_LIB_GRAND_MARCHE_147)
            .codePrix148(DEFAULT_CODE_PRIX_148)
            .categPrix149(DEFAULT_CATEG_PRIX_149)
            .libPrix150(DEFAULT_LIB_PRIX_150)
            .numChb151(DEFAULT_NUM_CHB_151)
            .descriptionTypeChb152(DEFAULT_DESCRIPTION_TYPE_CHB_152)
            .codeTypeChb153(DEFAULT_CODE_TYPE_CHB_153)
            .classChb154(DEFAULT_CLASS_CHB_154)
            .caractChb155(DEFAULT_CARACT_CHB_155)
            .typeChbDeReservation156(DEFAULT_TYPE_CHB_DE_RESERVATION_156)
            .descriptionTypeChbDeResv157(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_157)
            .codeTypeChbDeResv158(DEFAULT_CODE_TYPE_CHB_DE_RESV_158)
            .statutDeReservation159(DEFAULT_STATUT_DE_RESERVATION_159)
            .circuitDistribution160(DEFAULT_CIRCUIT_DISTRIBUTION_160)
            .circuitDistribUserRegroup161(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_161)
            .numCrs162(DEFAULT_NUM_CRS_162)
            .typeRefCrs163(DEFAULT_TYPE_REF_CRS_163)
            .crsInsertDate164(DEFAULT_CRS_INSERT_DATE_164)
            .dateCreaResv165(DEFAULT_DATE_CREA_RESV_165)
            .datePremier166(DEFAULT_DATE_PREMIER_166)
            .statutPremier167(DEFAULT_STATUT_PREMIER_167)
            .dateDernier168(DEFAULT_DATE_DERNIER_168)
            .statutDernier169(DEFAULT_STATUT_DERNIER_169)
            .dateDernierPseudo170(DEFAULT_DATE_DERNIER_PSEUDO_170)
            .statutDernierPseudo171(DEFAULT_STATUT_DERNIER_PSEUDO_171)
            .diffDtCreaAnn172(DEFAULT_DIFF_DT_CREA_ANN_172)
            .diffDtArrAnn173(DEFAULT_DIFF_DT_ARR_ANN_173)
            .leadtime174(DEFAULT_LEADTIME_174)
            .los175(DEFAULT_LOS_175)
            .occupantsGroupe176(DEFAULT_OCCUPANTS_GROUPE_176)
            .nbNuitee177(DEFAULT_NB_NUITEE_177)
            .nbNuiteeNnDed178(DEFAULT_NB_NUITEE_NN_DED_178)
            .nbResvAnn179(DEFAULT_NB_RESV_ANN_179)
            .nbAdu180(DEFAULT_NB_ADU_180)
            .nbEnf181(DEFAULT_NB_ENF_181)
            .nbPersDayU182(DEFAULT_NB_PERS_DAY_U_182)
            .nbPersArr183(DEFAULT_NB_PERS_ARR_183)
            .nbPersDep184(DEFAULT_NB_PERS_DEP_184)
            .nbPersAnn185(DEFAULT_NB_PERS_ANN_185)
            .nbPersNoshow186(DEFAULT_NB_PERS_NOSHOW_186)
            .nbChbDayU187(DEFAULT_NB_CHB_DAY_U_187)
            .nbChbArr188(DEFAULT_NB_CHB_ARR_188)
            .nbChbDep189(DEFAULT_NB_CHB_DEP_189)
            .nbChbAnn190(DEFAULT_NB_CHB_ANN_190)
            .nbChbNoshow191(DEFAULT_NB_CHB_NOSHOW_191)
            .revenuNetChambre192(DEFAULT_REVENU_NET_CHAMBRE_192)
            .revenuTaxeChambre193(DEFAULT_REVENU_TAXE_CHAMBRE_193)
            .revenuNetChambreGlobal194(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_194)
            .revenuTaxeChambreGlobal195(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_195)
            .revenuNetBq196(DEFAULT_REVENU_NET_BQ_196)
            .revenuTaxeBq197(DEFAULT_REVENU_TAXE_BQ_197)
            .revenuNetBqGlobal198(DEFAULT_REVENU_NET_BQ_GLOBAL_198)
            .revenuTaxeBqGlobal199(DEFAULT_REVENU_TAXE_BQ_GLOBAL_199)
            .revenuNetExtra200(DEFAULT_REVENU_NET_EXTRA_200)
            .revenuTaxeExtra201(DEFAULT_REVENU_TAXE_EXTRA_201)
            .revenuNetExtraGlobal202(DEFAULT_REVENU_NET_EXTRA_GLOBAL_202)
            .revenuTaxeExtraGlobal203(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_203)
            .revenuNetTotal204(DEFAULT_REVENU_NET_TOTAL_204)
            .revenuTaxeTotal205(DEFAULT_REVENU_TAXE_TOTAL_205)
            .revenuNetTotalGlobal206(DEFAULT_REVENU_NET_TOTAL_GLOBAL_206)
            .revenuTaxeTotalGlobal207(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_207)
            .prodRevenuChambre208(DEFAULT_PROD_REVENU_CHAMBRE_208)
            .prodRevenuBq209(DEFAULT_PROD_REVENU_BQ_209)
            .prodRevenuExtra210(DEFAULT_PROD_REVENU_EXTRA_210)
            .prodRevenuTotal211(DEFAULT_PROD_REVENU_TOTAL_211)
            .prodChambreNbNuitees212(DEFAULT_PROD_CHAMBRE_NB_NUITEES_212)
            .techCreateDate213(DEFAULT_TECH_CREATE_DATE_213)
            .techUpdateDate214(DEFAULT_TECH_UPDATE_DATE_214)
            .numLigne215(DEFAULT_NUM_LIGNE_215)
            .resort216(DEFAULT_RESORT_216)
            .resvNameId217(DEFAULT_RESV_NAME_ID_217)
            .clientOId218(DEFAULT_CLIENT_O_ID_218)
            .typeChb219(DEFAULT_TYPE_CHB_219)
            .confirmationNo220(DEFAULT_CONFIRMATION_NO_220)
            .clientMdmId221(DEFAULT_CLIENT_MDM_ID_221)
            .nameId222(DEFAULT_NAME_ID_222)
            .parentResvNameId223(DEFAULT_PARENT_RESV_NAME_ID_223)
            .contactId224(DEFAULT_CONTACT_ID_224)
            .agenceId225(DEFAULT_AGENCE_ID_225)
            .agenceNom226(DEFAULT_AGENCE_NOM_226)
            .societeId227(DEFAULT_SOCIETE_ID_227)
            .groupeId228(DEFAULT_GROUPE_ID_228)
            .numBloc229(DEFAULT_NUM_BLOC_229)
            .typeResv230(DEFAULT_TYPE_RESV_230)
            .statutResv231(DEFAULT_STATUT_RESV_231)
            .dateDebutResv232(DEFAULT_DATE_DEBUT_RESV_232)
            .dateFinResv233(DEFAULT_DATE_FIN_RESV_233)
            .truncDateDebutResv234(DEFAULT_TRUNC_DATE_DEBUT_RESV_234)
            .truncDateFinResv235(DEFAULT_TRUNC_DATE_FIN_RESV_235)
            .dateAnnResv236(DEFAULT_DATE_ANN_RESV_236)
            .pseudoRoomYn237(DEFAULT_PSEUDO_ROOM_YN_237)
            .createurResv238(DEFAULT_CREATEUR_RESV_238)
            .nomCreateurResv239(DEFAULT_NOM_CREATEUR_RESV_239)
            .codeGarantie240(DEFAULT_CODE_GARANTIE_240)
            .flgDed241(DEFAULT_FLG_DED_241)
            .codePays242(DEFAULT_CODE_PAYS_242)
            .libPays243(DEFAULT_LIB_PAYS_243)
            .codeNationalite244(DEFAULT_CODE_NATIONALITE_244)
            .libNationalite245(DEFAULT_LIB_NATIONALITE_245)
            .codeSource246(DEFAULT_CODE_SOURCE_246)
            .libSource247(DEFAULT_LIB_SOURCE_247)
            .codeGrandSource248(DEFAULT_CODE_GRAND_SOURCE_248)
            .codeOrigine249(DEFAULT_CODE_ORIGINE_249)
            .libOrigine250(DEFAULT_LIB_ORIGINE_250)
            .codeMarche251(DEFAULT_CODE_MARCHE_251)
            .libMarche252(DEFAULT_LIB_MARCHE_252)
            .codeGrandMarche253(DEFAULT_CODE_GRAND_MARCHE_253)
            .libGrandMarche254(DEFAULT_LIB_GRAND_MARCHE_254)
            .codePrix255(DEFAULT_CODE_PRIX_255)
            .categPrix256(DEFAULT_CATEG_PRIX_256)
            .libPrix257(DEFAULT_LIB_PRIX_257)
            .numChb258(DEFAULT_NUM_CHB_258)
            .descriptionTypeChb259(DEFAULT_DESCRIPTION_TYPE_CHB_259)
            .codeTypeChb260(DEFAULT_CODE_TYPE_CHB_260)
            .classChb261(DEFAULT_CLASS_CHB_261)
            .caractChb262(DEFAULT_CARACT_CHB_262)
            .typeChbDeReservation263(DEFAULT_TYPE_CHB_DE_RESERVATION_263)
            .descriptionTypeChbDeResv264(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_264)
            .codeTypeChbDeResv265(DEFAULT_CODE_TYPE_CHB_DE_RESV_265)
            .statutDeReservation266(DEFAULT_STATUT_DE_RESERVATION_266)
            .circuitDistribution267(DEFAULT_CIRCUIT_DISTRIBUTION_267)
            .circuitDistribUserRegroup268(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_268)
            .numCrs269(DEFAULT_NUM_CRS_269)
            .typeRefCrs270(DEFAULT_TYPE_REF_CRS_270)
            .crsInsertDate271(DEFAULT_CRS_INSERT_DATE_271)
            .dateCreaResv272(DEFAULT_DATE_CREA_RESV_272)
            .datePremier273(DEFAULT_DATE_PREMIER_273)
            .statutPremier274(DEFAULT_STATUT_PREMIER_274)
            .dateDernier275(DEFAULT_DATE_DERNIER_275)
            .statutDernier276(DEFAULT_STATUT_DERNIER_276)
            .dateDernierPseudo277(DEFAULT_DATE_DERNIER_PSEUDO_277)
            .statutDernierPseudo278(DEFAULT_STATUT_DERNIER_PSEUDO_278)
            .diffDtCreaAnn279(DEFAULT_DIFF_DT_CREA_ANN_279)
            .diffDtArrAnn280(DEFAULT_DIFF_DT_ARR_ANN_280)
            .leadtime281(DEFAULT_LEADTIME_281)
            .los282(DEFAULT_LOS_282)
            .occupantsGroupe283(DEFAULT_OCCUPANTS_GROUPE_283)
            .nbNuitee284(DEFAULT_NB_NUITEE_284)
            .nbNuiteeNnDed285(DEFAULT_NB_NUITEE_NN_DED_285)
            .nbResvAnn286(DEFAULT_NB_RESV_ANN_286)
            .nbAdu287(DEFAULT_NB_ADU_287)
            .nbEnf288(DEFAULT_NB_ENF_288)
            .nbPersDayU289(DEFAULT_NB_PERS_DAY_U_289)
            .nbPersArr290(DEFAULT_NB_PERS_ARR_290)
            .nbPersDep291(DEFAULT_NB_PERS_DEP_291)
            .nbPersAnn292(DEFAULT_NB_PERS_ANN_292)
            .nbPersNoshow293(DEFAULT_NB_PERS_NOSHOW_293)
            .nbChbDayU294(DEFAULT_NB_CHB_DAY_U_294)
            .nbChbArr295(DEFAULT_NB_CHB_ARR_295)
            .nbChbDep296(DEFAULT_NB_CHB_DEP_296)
            .nbChbAnn297(DEFAULT_NB_CHB_ANN_297)
            .nbChbNoshow298(DEFAULT_NB_CHB_NOSHOW_298)
            .revenuNetChambre299(DEFAULT_REVENU_NET_CHAMBRE_299)
            .revenuTaxeChambre300(DEFAULT_REVENU_TAXE_CHAMBRE_300)
            .revenuNetChambreGlobal301(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_301)
            .revenuTaxeChambreGlobal302(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_302)
            .revenuNetBq303(DEFAULT_REVENU_NET_BQ_303)
            .revenuTaxeBq304(DEFAULT_REVENU_TAXE_BQ_304)
            .revenuNetBqGlobal305(DEFAULT_REVENU_NET_BQ_GLOBAL_305)
            .revenuTaxeBqGlobal306(DEFAULT_REVENU_TAXE_BQ_GLOBAL_306)
            .revenuNetExtra307(DEFAULT_REVENU_NET_EXTRA_307)
            .revenuTaxeExtra308(DEFAULT_REVENU_TAXE_EXTRA_308)
            .revenuNetExtraGlobal309(DEFAULT_REVENU_NET_EXTRA_GLOBAL_309)
            .revenuTaxeExtraGlobal310(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_310);
        return table2;
    }

    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Table2 createUpdatedEntity(EntityManager em) {
        Table2 table2 = new Table2()
            .numLigne1(UPDATED_NUM_LIGNE_1)
            .resort2(UPDATED_RESORT_2)
            .resvNameId3(UPDATED_RESV_NAME_ID_3)
            .clientOId4(UPDATED_CLIENT_O_ID_4)
            .typeChb5(UPDATED_TYPE_CHB_5)
            .confirmationNo6(UPDATED_CONFIRMATION_NO_6)
            .clientMdmId7(UPDATED_CLIENT_MDM_ID_7)
            .nameId8(UPDATED_NAME_ID_8)
            .parentResvNameId9(UPDATED_PARENT_RESV_NAME_ID_9)
            .contactId10(UPDATED_CONTACT_ID_10)
            .agenceId11(UPDATED_AGENCE_ID_11)
            .agenceNom12(UPDATED_AGENCE_NOM_12)
            .societeId13(UPDATED_SOCIETE_ID_13)
            .groupeId14(UPDATED_GROUPE_ID_14)
            .numBloc15(UPDATED_NUM_BLOC_15)
            .typeResv16(UPDATED_TYPE_RESV_16)
            .statutResv17(UPDATED_STATUT_RESV_17)
            .dateDebutResv18(UPDATED_DATE_DEBUT_RESV_18)
            .dateFinResv19(UPDATED_DATE_FIN_RESV_19)
            .truncDateDebutResv20(UPDATED_TRUNC_DATE_DEBUT_RESV_20)
            .truncDateFinResv21(UPDATED_TRUNC_DATE_FIN_RESV_21)
            .dateAnnResv22(UPDATED_DATE_ANN_RESV_22)
            .pseudoRoomYn23(UPDATED_PSEUDO_ROOM_YN_23)
            .createurResv24(UPDATED_CREATEUR_RESV_24)
            .nomCreateurResv25(UPDATED_NOM_CREATEUR_RESV_25)
            .codeGarantie26(UPDATED_CODE_GARANTIE_26)
            .flgDed27(UPDATED_FLG_DED_27)
            .codePays28(UPDATED_CODE_PAYS_28)
            .libPays29(UPDATED_LIB_PAYS_29)
            .codeNationalite30(UPDATED_CODE_NATIONALITE_30)
            .libNationalite31(UPDATED_LIB_NATIONALITE_31)
            .codeSource32(UPDATED_CODE_SOURCE_32)
            .libSource33(UPDATED_LIB_SOURCE_33)
            .codeGrandSource34(UPDATED_CODE_GRAND_SOURCE_34)
            .codeOrigine35(UPDATED_CODE_ORIGINE_35)
            .libOrigine36(UPDATED_LIB_ORIGINE_36)
            .codeMarche37(UPDATED_CODE_MARCHE_37)
            .libMarche38(UPDATED_LIB_MARCHE_38)
            .codeGrandMarche39(UPDATED_CODE_GRAND_MARCHE_39)
            .libGrandMarche40(UPDATED_LIB_GRAND_MARCHE_40)
            .codePrix41(UPDATED_CODE_PRIX_41)
            .categPrix42(UPDATED_CATEG_PRIX_42)
            .libPrix43(UPDATED_LIB_PRIX_43)
            .numChb44(UPDATED_NUM_CHB_44)
            .descriptionTypeChb45(UPDATED_DESCRIPTION_TYPE_CHB_45)
            .codeTypeChb46(UPDATED_CODE_TYPE_CHB_46)
            .classChb47(UPDATED_CLASS_CHB_47)
            .caractChb48(UPDATED_CARACT_CHB_48)
            .typeChbDeReservation49(UPDATED_TYPE_CHB_DE_RESERVATION_49)
            .descriptionTypeChbDeResv50(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_50)
            .codeTypeChbDeResv51(UPDATED_CODE_TYPE_CHB_DE_RESV_51)
            .statutDeReservation52(UPDATED_STATUT_DE_RESERVATION_52)
            .circuitDistribution53(UPDATED_CIRCUIT_DISTRIBUTION_53)
            .circuitDistribUserRegroup54(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_54)
            .numCrs55(UPDATED_NUM_CRS_55)
            .typeRefCrs56(UPDATED_TYPE_REF_CRS_56)
            .crsInsertDate57(UPDATED_CRS_INSERT_DATE_57)
            .dateCreaResv58(UPDATED_DATE_CREA_RESV_58)
            .datePremier59(UPDATED_DATE_PREMIER_59)
            .statutPremier60(UPDATED_STATUT_PREMIER_60)
            .dateDernier61(UPDATED_DATE_DERNIER_61)
            .statutDernier62(UPDATED_STATUT_DERNIER_62)
            .dateDernierPseudo63(UPDATED_DATE_DERNIER_PSEUDO_63)
            .statutDernierPseudo64(UPDATED_STATUT_DERNIER_PSEUDO_64)
            .diffDtCreaAnn65(UPDATED_DIFF_DT_CREA_ANN_65)
            .diffDtArrAnn66(UPDATED_DIFF_DT_ARR_ANN_66)
            .leadtime67(UPDATED_LEADTIME_67)
            .los68(UPDATED_LOS_68)
            .occupantsGroupe69(UPDATED_OCCUPANTS_GROUPE_69)
            .nbNuitee70(UPDATED_NB_NUITEE_70)
            .nbNuiteeNnDed71(UPDATED_NB_NUITEE_NN_DED_71)
            .nbResvAnn72(UPDATED_NB_RESV_ANN_72)
            .nbAdu73(UPDATED_NB_ADU_73)
            .nbEnf74(UPDATED_NB_ENF_74)
            .nbPersDayU75(UPDATED_NB_PERS_DAY_U_75)
            .nbPersArr76(UPDATED_NB_PERS_ARR_76)
            .nbPersDep77(UPDATED_NB_PERS_DEP_77)
            .nbPersAnn78(UPDATED_NB_PERS_ANN_78)
            .nbPersNoshow79(UPDATED_NB_PERS_NOSHOW_79)
            .nbChbDayU80(UPDATED_NB_CHB_DAY_U_80)
            .nbChbArr81(UPDATED_NB_CHB_ARR_81)
            .nbChbDep82(UPDATED_NB_CHB_DEP_82)
            .nbChbAnn83(UPDATED_NB_CHB_ANN_83)
            .nbChbNoshow84(UPDATED_NB_CHB_NOSHOW_84)
            .revenuNetChambre85(UPDATED_REVENU_NET_CHAMBRE_85)
            .revenuTaxeChambre86(UPDATED_REVENU_TAXE_CHAMBRE_86)
            .revenuNetChambreGlobal87(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_87)
            .revenuTaxeChambreGlobal88(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_88)
            .revenuNetBq89(UPDATED_REVENU_NET_BQ_89)
            .revenuTaxeBq90(UPDATED_REVENU_TAXE_BQ_90)
            .revenuNetBqGlobal91(UPDATED_REVENU_NET_BQ_GLOBAL_91)
            .revenuTaxeBqGlobal92(UPDATED_REVENU_TAXE_BQ_GLOBAL_92)
            .revenuNetExtra93(UPDATED_REVENU_NET_EXTRA_93)
            .revenuTaxeExtra94(UPDATED_REVENU_TAXE_EXTRA_94)
            .revenuNetExtraGlobal95(UPDATED_REVENU_NET_EXTRA_GLOBAL_95)
            .revenuTaxeExtraGlobal96(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_96)
            .revenuNetTotal97(UPDATED_REVENU_NET_TOTAL_97)
            .revenuTaxeTotal98(UPDATED_REVENU_TAXE_TOTAL_98)
            .revenuNetTotalGlobal99(UPDATED_REVENU_NET_TOTAL_GLOBAL_99)
            .revenuTaxeTotalGlobal100(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_100)
            .prodRevenuChambre101(UPDATED_PROD_REVENU_CHAMBRE_101)
            .prodRevenuBq102(UPDATED_PROD_REVENU_BQ_102)
            .prodRevenuExtra103(UPDATED_PROD_REVENU_EXTRA_103)
            .prodRevenuTotal104(UPDATED_PROD_REVENU_TOTAL_104)
            .prodChambreNbNuitees105(UPDATED_PROD_CHAMBRE_NB_NUITEES_105)
            .techCreateDate106(UPDATED_TECH_CREATE_DATE_106)
            .techUpdateDate107(UPDATED_TECH_UPDATE_DATE_107)
            .numLigne108(UPDATED_NUM_LIGNE_108)
            .resort109(UPDATED_RESORT_109)
            .resvNameId110(UPDATED_RESV_NAME_ID_110)
            .clientOId111(UPDATED_CLIENT_O_ID_111)
            .typeChb112(UPDATED_TYPE_CHB_112)
            .confirmationNo113(UPDATED_CONFIRMATION_NO_113)
            .clientMdmId114(UPDATED_CLIENT_MDM_ID_114)
            .nameId115(UPDATED_NAME_ID_115)
            .parentResvNameId116(UPDATED_PARENT_RESV_NAME_ID_116)
            .contactId117(UPDATED_CONTACT_ID_117)
            .agenceId118(UPDATED_AGENCE_ID_118)
            .agenceNom119(UPDATED_AGENCE_NOM_119)
            .societeId120(UPDATED_SOCIETE_ID_120)
            .groupeId121(UPDATED_GROUPE_ID_121)
            .numBloc122(UPDATED_NUM_BLOC_122)
            .typeResv123(UPDATED_TYPE_RESV_123)
            .statutResv124(UPDATED_STATUT_RESV_124)
            .dateDebutResv125(UPDATED_DATE_DEBUT_RESV_125)
            .dateFinResv126(UPDATED_DATE_FIN_RESV_126)
            .truncDateDebutResv127(UPDATED_TRUNC_DATE_DEBUT_RESV_127)
            .truncDateFinResv128(UPDATED_TRUNC_DATE_FIN_RESV_128)
            .dateAnnResv129(UPDATED_DATE_ANN_RESV_129)
            .pseudoRoomYn130(UPDATED_PSEUDO_ROOM_YN_130)
            .createurResv131(UPDATED_CREATEUR_RESV_131)
            .nomCreateurResv132(UPDATED_NOM_CREATEUR_RESV_132)
            .codeGarantie133(UPDATED_CODE_GARANTIE_133)
            .flgDed134(UPDATED_FLG_DED_134)
            .codePays135(UPDATED_CODE_PAYS_135)
            .libPays136(UPDATED_LIB_PAYS_136)
            .codeNationalite137(UPDATED_CODE_NATIONALITE_137)
            .libNationalite138(UPDATED_LIB_NATIONALITE_138)
            .codeSource139(UPDATED_CODE_SOURCE_139)
            .libSource140(UPDATED_LIB_SOURCE_140)
            .codeGrandSource141(UPDATED_CODE_GRAND_SOURCE_141)
            .codeOrigine142(UPDATED_CODE_ORIGINE_142)
            .libOrigine143(UPDATED_LIB_ORIGINE_143)
            .codeMarche144(UPDATED_CODE_MARCHE_144)
            .libMarche145(UPDATED_LIB_MARCHE_145)
            .codeGrandMarche146(UPDATED_CODE_GRAND_MARCHE_146)
            .libGrandMarche147(UPDATED_LIB_GRAND_MARCHE_147)
            .codePrix148(UPDATED_CODE_PRIX_148)
            .categPrix149(UPDATED_CATEG_PRIX_149)
            .libPrix150(UPDATED_LIB_PRIX_150)
            .numChb151(UPDATED_NUM_CHB_151)
            .descriptionTypeChb152(UPDATED_DESCRIPTION_TYPE_CHB_152)
            .codeTypeChb153(UPDATED_CODE_TYPE_CHB_153)
            .classChb154(UPDATED_CLASS_CHB_154)
            .caractChb155(UPDATED_CARACT_CHB_155)
            .typeChbDeReservation156(UPDATED_TYPE_CHB_DE_RESERVATION_156)
            .descriptionTypeChbDeResv157(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_157)
            .codeTypeChbDeResv158(UPDATED_CODE_TYPE_CHB_DE_RESV_158)
            .statutDeReservation159(UPDATED_STATUT_DE_RESERVATION_159)
            .circuitDistribution160(UPDATED_CIRCUIT_DISTRIBUTION_160)
            .circuitDistribUserRegroup161(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_161)
            .numCrs162(UPDATED_NUM_CRS_162)
            .typeRefCrs163(UPDATED_TYPE_REF_CRS_163)
            .crsInsertDate164(UPDATED_CRS_INSERT_DATE_164)
            .dateCreaResv165(UPDATED_DATE_CREA_RESV_165)
            .datePremier166(UPDATED_DATE_PREMIER_166)
            .statutPremier167(UPDATED_STATUT_PREMIER_167)
            .dateDernier168(UPDATED_DATE_DERNIER_168)
            .statutDernier169(UPDATED_STATUT_DERNIER_169)
            .dateDernierPseudo170(UPDATED_DATE_DERNIER_PSEUDO_170)
            .statutDernierPseudo171(UPDATED_STATUT_DERNIER_PSEUDO_171)
            .diffDtCreaAnn172(UPDATED_DIFF_DT_CREA_ANN_172)
            .diffDtArrAnn173(UPDATED_DIFF_DT_ARR_ANN_173)
            .leadtime174(UPDATED_LEADTIME_174)
            .los175(UPDATED_LOS_175)
            .occupantsGroupe176(UPDATED_OCCUPANTS_GROUPE_176)
            .nbNuitee177(UPDATED_NB_NUITEE_177)
            .nbNuiteeNnDed178(UPDATED_NB_NUITEE_NN_DED_178)
            .nbResvAnn179(UPDATED_NB_RESV_ANN_179)
            .nbAdu180(UPDATED_NB_ADU_180)
            .nbEnf181(UPDATED_NB_ENF_181)
            .nbPersDayU182(UPDATED_NB_PERS_DAY_U_182)
            .nbPersArr183(UPDATED_NB_PERS_ARR_183)
            .nbPersDep184(UPDATED_NB_PERS_DEP_184)
            .nbPersAnn185(UPDATED_NB_PERS_ANN_185)
            .nbPersNoshow186(UPDATED_NB_PERS_NOSHOW_186)
            .nbChbDayU187(UPDATED_NB_CHB_DAY_U_187)
            .nbChbArr188(UPDATED_NB_CHB_ARR_188)
            .nbChbDep189(UPDATED_NB_CHB_DEP_189)
            .nbChbAnn190(UPDATED_NB_CHB_ANN_190)
            .nbChbNoshow191(UPDATED_NB_CHB_NOSHOW_191)
            .revenuNetChambre192(UPDATED_REVENU_NET_CHAMBRE_192)
            .revenuTaxeChambre193(UPDATED_REVENU_TAXE_CHAMBRE_193)
            .revenuNetChambreGlobal194(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_194)
            .revenuTaxeChambreGlobal195(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_195)
            .revenuNetBq196(UPDATED_REVENU_NET_BQ_196)
            .revenuTaxeBq197(UPDATED_REVENU_TAXE_BQ_197)
            .revenuNetBqGlobal198(UPDATED_REVENU_NET_BQ_GLOBAL_198)
            .revenuTaxeBqGlobal199(UPDATED_REVENU_TAXE_BQ_GLOBAL_199)
            .revenuNetExtra200(UPDATED_REVENU_NET_EXTRA_200)
            .revenuTaxeExtra201(UPDATED_REVENU_TAXE_EXTRA_201)
            .revenuNetExtraGlobal202(UPDATED_REVENU_NET_EXTRA_GLOBAL_202)
            .revenuTaxeExtraGlobal203(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_203)
            .revenuNetTotal204(UPDATED_REVENU_NET_TOTAL_204)
            .revenuTaxeTotal205(UPDATED_REVENU_TAXE_TOTAL_205)
            .revenuNetTotalGlobal206(UPDATED_REVENU_NET_TOTAL_GLOBAL_206)
            .revenuTaxeTotalGlobal207(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_207)
            .prodRevenuChambre208(UPDATED_PROD_REVENU_CHAMBRE_208)
            .prodRevenuBq209(UPDATED_PROD_REVENU_BQ_209)
            .prodRevenuExtra210(UPDATED_PROD_REVENU_EXTRA_210)
            .prodRevenuTotal211(UPDATED_PROD_REVENU_TOTAL_211)
            .prodChambreNbNuitees212(UPDATED_PROD_CHAMBRE_NB_NUITEES_212)
            .techCreateDate213(UPDATED_TECH_CREATE_DATE_213)
            .techUpdateDate214(UPDATED_TECH_UPDATE_DATE_214)
            .numLigne215(UPDATED_NUM_LIGNE_215)
            .resort216(UPDATED_RESORT_216)
            .resvNameId217(UPDATED_RESV_NAME_ID_217)
            .clientOId218(UPDATED_CLIENT_O_ID_218)
            .typeChb219(UPDATED_TYPE_CHB_219)
            .confirmationNo220(UPDATED_CONFIRMATION_NO_220)
            .clientMdmId221(UPDATED_CLIENT_MDM_ID_221)
            .nameId222(UPDATED_NAME_ID_222)
            .parentResvNameId223(UPDATED_PARENT_RESV_NAME_ID_223)
            .contactId224(UPDATED_CONTACT_ID_224)
            .agenceId225(UPDATED_AGENCE_ID_225)
            .agenceNom226(UPDATED_AGENCE_NOM_226)
            .societeId227(UPDATED_SOCIETE_ID_227)
            .groupeId228(UPDATED_GROUPE_ID_228)
            .numBloc229(UPDATED_NUM_BLOC_229)
            .typeResv230(UPDATED_TYPE_RESV_230)
            .statutResv231(UPDATED_STATUT_RESV_231)
            .dateDebutResv232(UPDATED_DATE_DEBUT_RESV_232)
            .dateFinResv233(UPDATED_DATE_FIN_RESV_233)
            .truncDateDebutResv234(UPDATED_TRUNC_DATE_DEBUT_RESV_234)
            .truncDateFinResv235(UPDATED_TRUNC_DATE_FIN_RESV_235)
            .dateAnnResv236(UPDATED_DATE_ANN_RESV_236)
            .pseudoRoomYn237(UPDATED_PSEUDO_ROOM_YN_237)
            .createurResv238(UPDATED_CREATEUR_RESV_238)
            .nomCreateurResv239(UPDATED_NOM_CREATEUR_RESV_239)
            .codeGarantie240(UPDATED_CODE_GARANTIE_240)
            .flgDed241(UPDATED_FLG_DED_241)
            .codePays242(UPDATED_CODE_PAYS_242)
            .libPays243(UPDATED_LIB_PAYS_243)
            .codeNationalite244(UPDATED_CODE_NATIONALITE_244)
            .libNationalite245(UPDATED_LIB_NATIONALITE_245)
            .codeSource246(UPDATED_CODE_SOURCE_246)
            .libSource247(UPDATED_LIB_SOURCE_247)
            .codeGrandSource248(UPDATED_CODE_GRAND_SOURCE_248)
            .codeOrigine249(UPDATED_CODE_ORIGINE_249)
            .libOrigine250(UPDATED_LIB_ORIGINE_250)
            .codeMarche251(UPDATED_CODE_MARCHE_251)
            .libMarche252(UPDATED_LIB_MARCHE_252)
            .codeGrandMarche253(UPDATED_CODE_GRAND_MARCHE_253)
            .libGrandMarche254(UPDATED_LIB_GRAND_MARCHE_254)
            .codePrix255(UPDATED_CODE_PRIX_255)
            .categPrix256(UPDATED_CATEG_PRIX_256)
            .libPrix257(UPDATED_LIB_PRIX_257)
            .numChb258(UPDATED_NUM_CHB_258)
            .descriptionTypeChb259(UPDATED_DESCRIPTION_TYPE_CHB_259)
            .codeTypeChb260(UPDATED_CODE_TYPE_CHB_260)
            .classChb261(UPDATED_CLASS_CHB_261)
            .caractChb262(UPDATED_CARACT_CHB_262)
            .typeChbDeReservation263(UPDATED_TYPE_CHB_DE_RESERVATION_263)
            .descriptionTypeChbDeResv264(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_264)
            .codeTypeChbDeResv265(UPDATED_CODE_TYPE_CHB_DE_RESV_265)
            .statutDeReservation266(UPDATED_STATUT_DE_RESERVATION_266)
            .circuitDistribution267(UPDATED_CIRCUIT_DISTRIBUTION_267)
            .circuitDistribUserRegroup268(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_268)
            .numCrs269(UPDATED_NUM_CRS_269)
            .typeRefCrs270(UPDATED_TYPE_REF_CRS_270)
            .crsInsertDate271(UPDATED_CRS_INSERT_DATE_271)
            .dateCreaResv272(UPDATED_DATE_CREA_RESV_272)
            .datePremier273(UPDATED_DATE_PREMIER_273)
            .statutPremier274(UPDATED_STATUT_PREMIER_274)
            .dateDernier275(UPDATED_DATE_DERNIER_275)
            .statutDernier276(UPDATED_STATUT_DERNIER_276)
            .dateDernierPseudo277(UPDATED_DATE_DERNIER_PSEUDO_277)
            .statutDernierPseudo278(UPDATED_STATUT_DERNIER_PSEUDO_278)
            .diffDtCreaAnn279(UPDATED_DIFF_DT_CREA_ANN_279)
            .diffDtArrAnn280(UPDATED_DIFF_DT_ARR_ANN_280)
            .leadtime281(UPDATED_LEADTIME_281)
            .los282(UPDATED_LOS_282)
            .occupantsGroupe283(UPDATED_OCCUPANTS_GROUPE_283)
            .nbNuitee284(UPDATED_NB_NUITEE_284)
            .nbNuiteeNnDed285(UPDATED_NB_NUITEE_NN_DED_285)
            .nbResvAnn286(UPDATED_NB_RESV_ANN_286)
            .nbAdu287(UPDATED_NB_ADU_287)
            .nbEnf288(UPDATED_NB_ENF_288)
            .nbPersDayU289(UPDATED_NB_PERS_DAY_U_289)
            .nbPersArr290(UPDATED_NB_PERS_ARR_290)
            .nbPersDep291(UPDATED_NB_PERS_DEP_291)
            .nbPersAnn292(UPDATED_NB_PERS_ANN_292)
            .nbPersNoshow293(UPDATED_NB_PERS_NOSHOW_293)
            .nbChbDayU294(UPDATED_NB_CHB_DAY_U_294)
            .nbChbArr295(UPDATED_NB_CHB_ARR_295)
            .nbChbDep296(UPDATED_NB_CHB_DEP_296)
            .nbChbAnn297(UPDATED_NB_CHB_ANN_297)
            .nbChbNoshow298(UPDATED_NB_CHB_NOSHOW_298)
            .revenuNetChambre299(UPDATED_REVENU_NET_CHAMBRE_299)
            .revenuTaxeChambre300(UPDATED_REVENU_TAXE_CHAMBRE_300)
            .revenuNetChambreGlobal301(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_301)
            .revenuTaxeChambreGlobal302(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_302)
            .revenuNetBq303(UPDATED_REVENU_NET_BQ_303)
            .revenuTaxeBq304(UPDATED_REVENU_TAXE_BQ_304)
            .revenuNetBqGlobal305(UPDATED_REVENU_NET_BQ_GLOBAL_305)
            .revenuTaxeBqGlobal306(UPDATED_REVENU_TAXE_BQ_GLOBAL_306)
            .revenuNetExtra307(UPDATED_REVENU_NET_EXTRA_307)
            .revenuTaxeExtra308(UPDATED_REVENU_TAXE_EXTRA_308)
            .revenuNetExtraGlobal309(UPDATED_REVENU_NET_EXTRA_GLOBAL_309)
            .revenuTaxeExtraGlobal310(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_310);
        return table2;
    }

    @BeforeEach
    public void initTest() {
        table2 = createEntity(em);
    }

    @Test
    @Transactional
    void createTable2() throws Exception {
        long databaseSizeBeforeCreate = getRepositoryCount();
        // Create the Table2
        var returnedTable2 = om.readValue(
            restTable2MockMvc
                .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(om.writeValueAsBytes(table2)))
                .andExpect(status().isCreated())
                .andReturn()
                .getResponse()
                .getContentAsString(),
            Table2.class
        );

        // Validate the Table2 in the database
        assertIncrementedRepositoryCount(databaseSizeBeforeCreate);
        assertTable2UpdatableFieldsEquals(returnedTable2, getPersistedTable2(returnedTable2));
    }

    @Test
    @Transactional
    void createTable2WithExistingId() throws Exception {
        // Create the Table2 with an existing ID
        table2.setId(1L);

        long databaseSizeBeforeCreate = getRepositoryCount();

        // An entity with an existing ID cannot be created, so this API call must fail
        restTable2MockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(om.writeValueAsBytes(table2)))
            .andExpect(status().isBadRequest());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllTable2s() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        // Get all the table2List
        restTable2MockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(table2.getId().intValue())))
            .andExpect(jsonPath("$.[*].numLigne1").value(hasItem(DEFAULT_NUM_LIGNE_1)))
            .andExpect(jsonPath("$.[*].resort2").value(hasItem(DEFAULT_RESORT_2)))
            .andExpect(jsonPath("$.[*].resvNameId3").value(hasItem(DEFAULT_RESV_NAME_ID_3)))
            .andExpect(jsonPath("$.[*].clientOId4").value(hasItem(DEFAULT_CLIENT_O_ID_4)))
            .andExpect(jsonPath("$.[*].typeChb5").value(hasItem(DEFAULT_TYPE_CHB_5)))
            .andExpect(jsonPath("$.[*].confirmationNo6").value(hasItem(DEFAULT_CONFIRMATION_NO_6)))
            .andExpect(jsonPath("$.[*].clientMdmId7").value(hasItem(DEFAULT_CLIENT_MDM_ID_7)))
            .andExpect(jsonPath("$.[*].nameId8").value(hasItem(DEFAULT_NAME_ID_8)))
            .andExpect(jsonPath("$.[*].parentResvNameId9").value(hasItem(DEFAULT_PARENT_RESV_NAME_ID_9)))
            .andExpect(jsonPath("$.[*].contactId10").value(hasItem(DEFAULT_CONTACT_ID_10)))
            .andExpect(jsonPath("$.[*].agenceId11").value(hasItem(DEFAULT_AGENCE_ID_11)))
            .andExpect(jsonPath("$.[*].agenceNom12").value(hasItem(DEFAULT_AGENCE_NOM_12)))
            .andExpect(jsonPath("$.[*].societeId13").value(hasItem(DEFAULT_SOCIETE_ID_13)))
            .andExpect(jsonPath("$.[*].groupeId14").value(hasItem(DEFAULT_GROUPE_ID_14)))
            .andExpect(jsonPath("$.[*].numBloc15").value(hasItem(DEFAULT_NUM_BLOC_15)))
            .andExpect(jsonPath("$.[*].typeResv16").value(hasItem(DEFAULT_TYPE_RESV_16)))
            .andExpect(jsonPath("$.[*].statutResv17").value(hasItem(DEFAULT_STATUT_RESV_17)))
            .andExpect(jsonPath("$.[*].dateDebutResv18").value(hasItem(DEFAULT_DATE_DEBUT_RESV_18.toString())))
            .andExpect(jsonPath("$.[*].dateFinResv19").value(hasItem(DEFAULT_DATE_FIN_RESV_19.toString())))
            .andExpect(jsonPath("$.[*].truncDateDebutResv20").value(hasItem(DEFAULT_TRUNC_DATE_DEBUT_RESV_20.toString())))
            .andExpect(jsonPath("$.[*].truncDateFinResv21").value(hasItem(DEFAULT_TRUNC_DATE_FIN_RESV_21.toString())))
            .andExpect(jsonPath("$.[*].dateAnnResv22").value(hasItem(DEFAULT_DATE_ANN_RESV_22.toString())))
            .andExpect(jsonPath("$.[*].pseudoRoomYn23").value(hasItem(DEFAULT_PSEUDO_ROOM_YN_23)))
            .andExpect(jsonPath("$.[*].createurResv24").value(hasItem(DEFAULT_CREATEUR_RESV_24)))
            .andExpect(jsonPath("$.[*].nomCreateurResv25").value(hasItem(DEFAULT_NOM_CREATEUR_RESV_25)))
            .andExpect(jsonPath("$.[*].codeGarantie26").value(hasItem(DEFAULT_CODE_GARANTIE_26)))
            .andExpect(jsonPath("$.[*].flgDed27").value(hasItem(DEFAULT_FLG_DED_27)))
            .andExpect(jsonPath("$.[*].codePays28").value(hasItem(DEFAULT_CODE_PAYS_28)))
            .andExpect(jsonPath("$.[*].libPays29").value(hasItem(DEFAULT_LIB_PAYS_29)))
            .andExpect(jsonPath("$.[*].codeNationalite30").value(hasItem(DEFAULT_CODE_NATIONALITE_30)))
            .andExpect(jsonPath("$.[*].libNationalite31").value(hasItem(DEFAULT_LIB_NATIONALITE_31)))
            .andExpect(jsonPath("$.[*].codeSource32").value(hasItem(DEFAULT_CODE_SOURCE_32)))
            .andExpect(jsonPath("$.[*].libSource33").value(hasItem(DEFAULT_LIB_SOURCE_33)))
            .andExpect(jsonPath("$.[*].codeGrandSource34").value(hasItem(DEFAULT_CODE_GRAND_SOURCE_34)))
            .andExpect(jsonPath("$.[*].codeOrigine35").value(hasItem(DEFAULT_CODE_ORIGINE_35)))
            .andExpect(jsonPath("$.[*].libOrigine36").value(hasItem(DEFAULT_LIB_ORIGINE_36)))
            .andExpect(jsonPath("$.[*].codeMarche37").value(hasItem(DEFAULT_CODE_MARCHE_37)))
            .andExpect(jsonPath("$.[*].libMarche38").value(hasItem(DEFAULT_LIB_MARCHE_38)))
            .andExpect(jsonPath("$.[*].codeGrandMarche39").value(hasItem(DEFAULT_CODE_GRAND_MARCHE_39)))
            .andExpect(jsonPath("$.[*].libGrandMarche40").value(hasItem(DEFAULT_LIB_GRAND_MARCHE_40)))
            .andExpect(jsonPath("$.[*].codePrix41").value(hasItem(DEFAULT_CODE_PRIX_41)))
            .andExpect(jsonPath("$.[*].categPrix42").value(hasItem(DEFAULT_CATEG_PRIX_42)))
            .andExpect(jsonPath("$.[*].libPrix43").value(hasItem(DEFAULT_LIB_PRIX_43)))
            .andExpect(jsonPath("$.[*].numChb44").value(hasItem(DEFAULT_NUM_CHB_44)))
            .andExpect(jsonPath("$.[*].descriptionTypeChb45").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_45)))
            .andExpect(jsonPath("$.[*].codeTypeChb46").value(hasItem(DEFAULT_CODE_TYPE_CHB_46)))
            .andExpect(jsonPath("$.[*].classChb47").value(hasItem(DEFAULT_CLASS_CHB_47)))
            .andExpect(jsonPath("$.[*].caractChb48").value(hasItem(DEFAULT_CARACT_CHB_48)))
            .andExpect(jsonPath("$.[*].typeChbDeReservation49").value(hasItem(DEFAULT_TYPE_CHB_DE_RESERVATION_49)))
            .andExpect(jsonPath("$.[*].descriptionTypeChbDeResv50").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_50)))
            .andExpect(jsonPath("$.[*].codeTypeChbDeResv51").value(hasItem(DEFAULT_CODE_TYPE_CHB_DE_RESV_51)))
            .andExpect(jsonPath("$.[*].statutDeReservation52").value(hasItem(DEFAULT_STATUT_DE_RESERVATION_52)))
            .andExpect(jsonPath("$.[*].circuitDistribution53").value(hasItem(DEFAULT_CIRCUIT_DISTRIBUTION_53)))
            .andExpect(jsonPath("$.[*].circuitDistribUserRegroup54").value(hasItem(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_54)))
            .andExpect(jsonPath("$.[*].numCrs55").value(hasItem(DEFAULT_NUM_CRS_55)))
            .andExpect(jsonPath("$.[*].typeRefCrs56").value(hasItem(DEFAULT_TYPE_REF_CRS_56)))
            .andExpect(jsonPath("$.[*].crsInsertDate57").value(hasItem(DEFAULT_CRS_INSERT_DATE_57.toString())))
            .andExpect(jsonPath("$.[*].dateCreaResv58").value(hasItem(DEFAULT_DATE_CREA_RESV_58.toString())))
            .andExpect(jsonPath("$.[*].datePremier59").value(hasItem(DEFAULT_DATE_PREMIER_59.toString())))
            .andExpect(jsonPath("$.[*].statutPremier60").value(hasItem(DEFAULT_STATUT_PREMIER_60)))
            .andExpect(jsonPath("$.[*].dateDernier61").value(hasItem(DEFAULT_DATE_DERNIER_61.toString())))
            .andExpect(jsonPath("$.[*].statutDernier62").value(hasItem(DEFAULT_STATUT_DERNIER_62)))
            .andExpect(jsonPath("$.[*].dateDernierPseudo63").value(hasItem(DEFAULT_DATE_DERNIER_PSEUDO_63.toString())))
            .andExpect(jsonPath("$.[*].statutDernierPseudo64").value(hasItem(DEFAULT_STATUT_DERNIER_PSEUDO_64)))
            .andExpect(jsonPath("$.[*].diffDtCreaAnn65").value(hasItem(DEFAULT_DIFF_DT_CREA_ANN_65)))
            .andExpect(jsonPath("$.[*].diffDtArrAnn66").value(hasItem(DEFAULT_DIFF_DT_ARR_ANN_66)))
            .andExpect(jsonPath("$.[*].leadtime67").value(hasItem(DEFAULT_LEADTIME_67)))
            .andExpect(jsonPath("$.[*].los68").value(hasItem(DEFAULT_LOS_68)))
            .andExpect(jsonPath("$.[*].occupantsGroupe69").value(hasItem(DEFAULT_OCCUPANTS_GROUPE_69)))
            .andExpect(jsonPath("$.[*].nbNuitee70").value(hasItem(DEFAULT_NB_NUITEE_70)))
            .andExpect(jsonPath("$.[*].nbNuiteeNnDed71").value(hasItem(DEFAULT_NB_NUITEE_NN_DED_71)))
            .andExpect(jsonPath("$.[*].nbResvAnn72").value(hasItem(DEFAULT_NB_RESV_ANN_72)))
            .andExpect(jsonPath("$.[*].nbAdu73").value(hasItem(DEFAULT_NB_ADU_73)))
            .andExpect(jsonPath("$.[*].nbEnf74").value(hasItem(DEFAULT_NB_ENF_74)))
            .andExpect(jsonPath("$.[*].nbPersDayU75").value(hasItem(DEFAULT_NB_PERS_DAY_U_75)))
            .andExpect(jsonPath("$.[*].nbPersArr76").value(hasItem(DEFAULT_NB_PERS_ARR_76)))
            .andExpect(jsonPath("$.[*].nbPersDep77").value(hasItem(DEFAULT_NB_PERS_DEP_77)))
            .andExpect(jsonPath("$.[*].nbPersAnn78").value(hasItem(DEFAULT_NB_PERS_ANN_78)))
            .andExpect(jsonPath("$.[*].nbPersNoshow79").value(hasItem(DEFAULT_NB_PERS_NOSHOW_79)))
            .andExpect(jsonPath("$.[*].nbChbDayU80").value(hasItem(DEFAULT_NB_CHB_DAY_U_80)))
            .andExpect(jsonPath("$.[*].nbChbArr81").value(hasItem(DEFAULT_NB_CHB_ARR_81)))
            .andExpect(jsonPath("$.[*].nbChbDep82").value(hasItem(DEFAULT_NB_CHB_DEP_82)))
            .andExpect(jsonPath("$.[*].nbChbAnn83").value(hasItem(DEFAULT_NB_CHB_ANN_83)))
            .andExpect(jsonPath("$.[*].nbChbNoshow84").value(hasItem(DEFAULT_NB_CHB_NOSHOW_84)))
            .andExpect(jsonPath("$.[*].revenuNetChambre85").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_85.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambre86").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_86.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetChambreGlobal87").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_87.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambreGlobal88").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_88.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBq89").value(hasItem(DEFAULT_REVENU_NET_BQ_89.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBq90").value(hasItem(DEFAULT_REVENU_TAXE_BQ_90.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBqGlobal91").value(hasItem(DEFAULT_REVENU_NET_BQ_GLOBAL_91.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBqGlobal92").value(hasItem(DEFAULT_REVENU_TAXE_BQ_GLOBAL_92.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtra93").value(hasItem(DEFAULT_REVENU_NET_EXTRA_93.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtra94").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_94.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtraGlobal95").value(hasItem(DEFAULT_REVENU_NET_EXTRA_GLOBAL_95.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtraGlobal96").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_96.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetTotal97").value(hasItem(DEFAULT_REVENU_NET_TOTAL_97.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeTotal98").value(hasItem(DEFAULT_REVENU_TAXE_TOTAL_98.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetTotalGlobal99").value(hasItem(DEFAULT_REVENU_NET_TOTAL_GLOBAL_99.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeTotalGlobal100").value(hasItem(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_100.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuChambre101").value(hasItem(DEFAULT_PROD_REVENU_CHAMBRE_101.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuBq102").value(hasItem(DEFAULT_PROD_REVENU_BQ_102.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuExtra103").value(hasItem(DEFAULT_PROD_REVENU_EXTRA_103.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuTotal104").value(hasItem(DEFAULT_PROD_REVENU_TOTAL_104.intValue())))
            .andExpect(jsonPath("$.[*].prodChambreNbNuitees105").value(hasItem(DEFAULT_PROD_CHAMBRE_NB_NUITEES_105.intValue())))
            .andExpect(jsonPath("$.[*].techCreateDate106").value(hasItem(DEFAULT_TECH_CREATE_DATE_106.toString())))
            .andExpect(jsonPath("$.[*].techUpdateDate107").value(hasItem(DEFAULT_TECH_UPDATE_DATE_107.toString())))
            .andExpect(jsonPath("$.[*].numLigne108").value(hasItem(DEFAULT_NUM_LIGNE_108)))
            .andExpect(jsonPath("$.[*].resort109").value(hasItem(DEFAULT_RESORT_109)))
            .andExpect(jsonPath("$.[*].resvNameId110").value(hasItem(DEFAULT_RESV_NAME_ID_110)))
            .andExpect(jsonPath("$.[*].clientOId111").value(hasItem(DEFAULT_CLIENT_O_ID_111)))
            .andExpect(jsonPath("$.[*].typeChb112").value(hasItem(DEFAULT_TYPE_CHB_112)))
            .andExpect(jsonPath("$.[*].confirmationNo113").value(hasItem(DEFAULT_CONFIRMATION_NO_113)))
            .andExpect(jsonPath("$.[*].clientMdmId114").value(hasItem(DEFAULT_CLIENT_MDM_ID_114)))
            .andExpect(jsonPath("$.[*].nameId115").value(hasItem(DEFAULT_NAME_ID_115)))
            .andExpect(jsonPath("$.[*].parentResvNameId116").value(hasItem(DEFAULT_PARENT_RESV_NAME_ID_116)))
            .andExpect(jsonPath("$.[*].contactId117").value(hasItem(DEFAULT_CONTACT_ID_117)))
            .andExpect(jsonPath("$.[*].agenceId118").value(hasItem(DEFAULT_AGENCE_ID_118)))
            .andExpect(jsonPath("$.[*].agenceNom119").value(hasItem(DEFAULT_AGENCE_NOM_119)))
            .andExpect(jsonPath("$.[*].societeId120").value(hasItem(DEFAULT_SOCIETE_ID_120)))
            .andExpect(jsonPath("$.[*].groupeId121").value(hasItem(DEFAULT_GROUPE_ID_121)))
            .andExpect(jsonPath("$.[*].numBloc122").value(hasItem(DEFAULT_NUM_BLOC_122)))
            .andExpect(jsonPath("$.[*].typeResv123").value(hasItem(DEFAULT_TYPE_RESV_123)))
            .andExpect(jsonPath("$.[*].statutResv124").value(hasItem(DEFAULT_STATUT_RESV_124)))
            .andExpect(jsonPath("$.[*].dateDebutResv125").value(hasItem(DEFAULT_DATE_DEBUT_RESV_125.toString())))
            .andExpect(jsonPath("$.[*].dateFinResv126").value(hasItem(DEFAULT_DATE_FIN_RESV_126.toString())))
            .andExpect(jsonPath("$.[*].truncDateDebutResv127").value(hasItem(DEFAULT_TRUNC_DATE_DEBUT_RESV_127.toString())))
            .andExpect(jsonPath("$.[*].truncDateFinResv128").value(hasItem(DEFAULT_TRUNC_DATE_FIN_RESV_128.toString())))
            .andExpect(jsonPath("$.[*].dateAnnResv129").value(hasItem(DEFAULT_DATE_ANN_RESV_129.toString())))
            .andExpect(jsonPath("$.[*].pseudoRoomYn130").value(hasItem(DEFAULT_PSEUDO_ROOM_YN_130)))
            .andExpect(jsonPath("$.[*].createurResv131").value(hasItem(DEFAULT_CREATEUR_RESV_131)))
            .andExpect(jsonPath("$.[*].nomCreateurResv132").value(hasItem(DEFAULT_NOM_CREATEUR_RESV_132)))
            .andExpect(jsonPath("$.[*].codeGarantie133").value(hasItem(DEFAULT_CODE_GARANTIE_133)))
            .andExpect(jsonPath("$.[*].flgDed134").value(hasItem(DEFAULT_FLG_DED_134)))
            .andExpect(jsonPath("$.[*].codePays135").value(hasItem(DEFAULT_CODE_PAYS_135)))
            .andExpect(jsonPath("$.[*].libPays136").value(hasItem(DEFAULT_LIB_PAYS_136)))
            .andExpect(jsonPath("$.[*].codeNationalite137").value(hasItem(DEFAULT_CODE_NATIONALITE_137)))
            .andExpect(jsonPath("$.[*].libNationalite138").value(hasItem(DEFAULT_LIB_NATIONALITE_138)))
            .andExpect(jsonPath("$.[*].codeSource139").value(hasItem(DEFAULT_CODE_SOURCE_139)))
            .andExpect(jsonPath("$.[*].libSource140").value(hasItem(DEFAULT_LIB_SOURCE_140)))
            .andExpect(jsonPath("$.[*].codeGrandSource141").value(hasItem(DEFAULT_CODE_GRAND_SOURCE_141)))
            .andExpect(jsonPath("$.[*].codeOrigine142").value(hasItem(DEFAULT_CODE_ORIGINE_142)))
            .andExpect(jsonPath("$.[*].libOrigine143").value(hasItem(DEFAULT_LIB_ORIGINE_143)))
            .andExpect(jsonPath("$.[*].codeMarche144").value(hasItem(DEFAULT_CODE_MARCHE_144)))
            .andExpect(jsonPath("$.[*].libMarche145").value(hasItem(DEFAULT_LIB_MARCHE_145)))
            .andExpect(jsonPath("$.[*].codeGrandMarche146").value(hasItem(DEFAULT_CODE_GRAND_MARCHE_146)))
            .andExpect(jsonPath("$.[*].libGrandMarche147").value(hasItem(DEFAULT_LIB_GRAND_MARCHE_147)))
            .andExpect(jsonPath("$.[*].codePrix148").value(hasItem(DEFAULT_CODE_PRIX_148)))
            .andExpect(jsonPath("$.[*].categPrix149").value(hasItem(DEFAULT_CATEG_PRIX_149)))
            .andExpect(jsonPath("$.[*].libPrix150").value(hasItem(DEFAULT_LIB_PRIX_150)))
            .andExpect(jsonPath("$.[*].numChb151").value(hasItem(DEFAULT_NUM_CHB_151)))
            .andExpect(jsonPath("$.[*].descriptionTypeChb152").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_152)))
            .andExpect(jsonPath("$.[*].codeTypeChb153").value(hasItem(DEFAULT_CODE_TYPE_CHB_153)))
            .andExpect(jsonPath("$.[*].classChb154").value(hasItem(DEFAULT_CLASS_CHB_154)))
            .andExpect(jsonPath("$.[*].caractChb155").value(hasItem(DEFAULT_CARACT_CHB_155)))
            .andExpect(jsonPath("$.[*].typeChbDeReservation156").value(hasItem(DEFAULT_TYPE_CHB_DE_RESERVATION_156)))
            .andExpect(jsonPath("$.[*].descriptionTypeChbDeResv157").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_157)))
            .andExpect(jsonPath("$.[*].codeTypeChbDeResv158").value(hasItem(DEFAULT_CODE_TYPE_CHB_DE_RESV_158)))
            .andExpect(jsonPath("$.[*].statutDeReservation159").value(hasItem(DEFAULT_STATUT_DE_RESERVATION_159)))
            .andExpect(jsonPath("$.[*].circuitDistribution160").value(hasItem(DEFAULT_CIRCUIT_DISTRIBUTION_160)))
            .andExpect(jsonPath("$.[*].circuitDistribUserRegroup161").value(hasItem(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_161)))
            .andExpect(jsonPath("$.[*].numCrs162").value(hasItem(DEFAULT_NUM_CRS_162)))
            .andExpect(jsonPath("$.[*].typeRefCrs163").value(hasItem(DEFAULT_TYPE_REF_CRS_163)))
            .andExpect(jsonPath("$.[*].crsInsertDate164").value(hasItem(DEFAULT_CRS_INSERT_DATE_164.toString())))
            .andExpect(jsonPath("$.[*].dateCreaResv165").value(hasItem(DEFAULT_DATE_CREA_RESV_165.toString())))
            .andExpect(jsonPath("$.[*].datePremier166").value(hasItem(DEFAULT_DATE_PREMIER_166.toString())))
            .andExpect(jsonPath("$.[*].statutPremier167").value(hasItem(DEFAULT_STATUT_PREMIER_167)))
            .andExpect(jsonPath("$.[*].dateDernier168").value(hasItem(DEFAULT_DATE_DERNIER_168.toString())))
            .andExpect(jsonPath("$.[*].statutDernier169").value(hasItem(DEFAULT_STATUT_DERNIER_169)))
            .andExpect(jsonPath("$.[*].dateDernierPseudo170").value(hasItem(DEFAULT_DATE_DERNIER_PSEUDO_170.toString())))
            .andExpect(jsonPath("$.[*].statutDernierPseudo171").value(hasItem(DEFAULT_STATUT_DERNIER_PSEUDO_171)))
            .andExpect(jsonPath("$.[*].diffDtCreaAnn172").value(hasItem(DEFAULT_DIFF_DT_CREA_ANN_172)))
            .andExpect(jsonPath("$.[*].diffDtArrAnn173").value(hasItem(DEFAULT_DIFF_DT_ARR_ANN_173)))
            .andExpect(jsonPath("$.[*].leadtime174").value(hasItem(DEFAULT_LEADTIME_174)))
            .andExpect(jsonPath("$.[*].los175").value(hasItem(DEFAULT_LOS_175)))
            .andExpect(jsonPath("$.[*].occupantsGroupe176").value(hasItem(DEFAULT_OCCUPANTS_GROUPE_176)))
            .andExpect(jsonPath("$.[*].nbNuitee177").value(hasItem(DEFAULT_NB_NUITEE_177)))
            .andExpect(jsonPath("$.[*].nbNuiteeNnDed178").value(hasItem(DEFAULT_NB_NUITEE_NN_DED_178)))
            .andExpect(jsonPath("$.[*].nbResvAnn179").value(hasItem(DEFAULT_NB_RESV_ANN_179)))
            .andExpect(jsonPath("$.[*].nbAdu180").value(hasItem(DEFAULT_NB_ADU_180)))
            .andExpect(jsonPath("$.[*].nbEnf181").value(hasItem(DEFAULT_NB_ENF_181)))
            .andExpect(jsonPath("$.[*].nbPersDayU182").value(hasItem(DEFAULT_NB_PERS_DAY_U_182)))
            .andExpect(jsonPath("$.[*].nbPersArr183").value(hasItem(DEFAULT_NB_PERS_ARR_183)))
            .andExpect(jsonPath("$.[*].nbPersDep184").value(hasItem(DEFAULT_NB_PERS_DEP_184)))
            .andExpect(jsonPath("$.[*].nbPersAnn185").value(hasItem(DEFAULT_NB_PERS_ANN_185)))
            .andExpect(jsonPath("$.[*].nbPersNoshow186").value(hasItem(DEFAULT_NB_PERS_NOSHOW_186)))
            .andExpect(jsonPath("$.[*].nbChbDayU187").value(hasItem(DEFAULT_NB_CHB_DAY_U_187)))
            .andExpect(jsonPath("$.[*].nbChbArr188").value(hasItem(DEFAULT_NB_CHB_ARR_188)))
            .andExpect(jsonPath("$.[*].nbChbDep189").value(hasItem(DEFAULT_NB_CHB_DEP_189)))
            .andExpect(jsonPath("$.[*].nbChbAnn190").value(hasItem(DEFAULT_NB_CHB_ANN_190)))
            .andExpect(jsonPath("$.[*].nbChbNoshow191").value(hasItem(DEFAULT_NB_CHB_NOSHOW_191)))
            .andExpect(jsonPath("$.[*].revenuNetChambre192").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_192.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambre193").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_193.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetChambreGlobal194").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_194.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambreGlobal195").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_195.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBq196").value(hasItem(DEFAULT_REVENU_NET_BQ_196.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBq197").value(hasItem(DEFAULT_REVENU_TAXE_BQ_197.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBqGlobal198").value(hasItem(DEFAULT_REVENU_NET_BQ_GLOBAL_198.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBqGlobal199").value(hasItem(DEFAULT_REVENU_TAXE_BQ_GLOBAL_199.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtra200").value(hasItem(DEFAULT_REVENU_NET_EXTRA_200.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtra201").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_201.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtraGlobal202").value(hasItem(DEFAULT_REVENU_NET_EXTRA_GLOBAL_202.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtraGlobal203").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_203.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetTotal204").value(hasItem(DEFAULT_REVENU_NET_TOTAL_204.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeTotal205").value(hasItem(DEFAULT_REVENU_TAXE_TOTAL_205.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetTotalGlobal206").value(hasItem(DEFAULT_REVENU_NET_TOTAL_GLOBAL_206.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeTotalGlobal207").value(hasItem(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_207.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuChambre208").value(hasItem(DEFAULT_PROD_REVENU_CHAMBRE_208.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuBq209").value(hasItem(DEFAULT_PROD_REVENU_BQ_209.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuExtra210").value(hasItem(DEFAULT_PROD_REVENU_EXTRA_210.intValue())))
            .andExpect(jsonPath("$.[*].prodRevenuTotal211").value(hasItem(DEFAULT_PROD_REVENU_TOTAL_211.intValue())))
            .andExpect(jsonPath("$.[*].prodChambreNbNuitees212").value(hasItem(DEFAULT_PROD_CHAMBRE_NB_NUITEES_212.intValue())))
            .andExpect(jsonPath("$.[*].techCreateDate213").value(hasItem(DEFAULT_TECH_CREATE_DATE_213.toString())))
            .andExpect(jsonPath("$.[*].techUpdateDate214").value(hasItem(DEFAULT_TECH_UPDATE_DATE_214.toString())))
            .andExpect(jsonPath("$.[*].numLigne215").value(hasItem(DEFAULT_NUM_LIGNE_215)))
            .andExpect(jsonPath("$.[*].resort216").value(hasItem(DEFAULT_RESORT_216)))
            .andExpect(jsonPath("$.[*].resvNameId217").value(hasItem(DEFAULT_RESV_NAME_ID_217)))
            .andExpect(jsonPath("$.[*].clientOId218").value(hasItem(DEFAULT_CLIENT_O_ID_218)))
            .andExpect(jsonPath("$.[*].typeChb219").value(hasItem(DEFAULT_TYPE_CHB_219)))
            .andExpect(jsonPath("$.[*].confirmationNo220").value(hasItem(DEFAULT_CONFIRMATION_NO_220)))
            .andExpect(jsonPath("$.[*].clientMdmId221").value(hasItem(DEFAULT_CLIENT_MDM_ID_221)))
            .andExpect(jsonPath("$.[*].nameId222").value(hasItem(DEFAULT_NAME_ID_222)))
            .andExpect(jsonPath("$.[*].parentResvNameId223").value(hasItem(DEFAULT_PARENT_RESV_NAME_ID_223)))
            .andExpect(jsonPath("$.[*].contactId224").value(hasItem(DEFAULT_CONTACT_ID_224)))
            .andExpect(jsonPath("$.[*].agenceId225").value(hasItem(DEFAULT_AGENCE_ID_225)))
            .andExpect(jsonPath("$.[*].agenceNom226").value(hasItem(DEFAULT_AGENCE_NOM_226)))
            .andExpect(jsonPath("$.[*].societeId227").value(hasItem(DEFAULT_SOCIETE_ID_227)))
            .andExpect(jsonPath("$.[*].groupeId228").value(hasItem(DEFAULT_GROUPE_ID_228)))
            .andExpect(jsonPath("$.[*].numBloc229").value(hasItem(DEFAULT_NUM_BLOC_229)))
            .andExpect(jsonPath("$.[*].typeResv230").value(hasItem(DEFAULT_TYPE_RESV_230)))
            .andExpect(jsonPath("$.[*].statutResv231").value(hasItem(DEFAULT_STATUT_RESV_231)))
            .andExpect(jsonPath("$.[*].dateDebutResv232").value(hasItem(DEFAULT_DATE_DEBUT_RESV_232.toString())))
            .andExpect(jsonPath("$.[*].dateFinResv233").value(hasItem(DEFAULT_DATE_FIN_RESV_233.toString())))
            .andExpect(jsonPath("$.[*].truncDateDebutResv234").value(hasItem(DEFAULT_TRUNC_DATE_DEBUT_RESV_234.toString())))
            .andExpect(jsonPath("$.[*].truncDateFinResv235").value(hasItem(DEFAULT_TRUNC_DATE_FIN_RESV_235.toString())))
            .andExpect(jsonPath("$.[*].dateAnnResv236").value(hasItem(DEFAULT_DATE_ANN_RESV_236.toString())))
            .andExpect(jsonPath("$.[*].pseudoRoomYn237").value(hasItem(DEFAULT_PSEUDO_ROOM_YN_237)))
            .andExpect(jsonPath("$.[*].createurResv238").value(hasItem(DEFAULT_CREATEUR_RESV_238)))
            .andExpect(jsonPath("$.[*].nomCreateurResv239").value(hasItem(DEFAULT_NOM_CREATEUR_RESV_239)))
            .andExpect(jsonPath("$.[*].codeGarantie240").value(hasItem(DEFAULT_CODE_GARANTIE_240)))
            .andExpect(jsonPath("$.[*].flgDed241").value(hasItem(DEFAULT_FLG_DED_241)))
            .andExpect(jsonPath("$.[*].codePays242").value(hasItem(DEFAULT_CODE_PAYS_242)))
            .andExpect(jsonPath("$.[*].libPays243").value(hasItem(DEFAULT_LIB_PAYS_243)))
            .andExpect(jsonPath("$.[*].codeNationalite244").value(hasItem(DEFAULT_CODE_NATIONALITE_244)))
            .andExpect(jsonPath("$.[*].libNationalite245").value(hasItem(DEFAULT_LIB_NATIONALITE_245)))
            .andExpect(jsonPath("$.[*].codeSource246").value(hasItem(DEFAULT_CODE_SOURCE_246)))
            .andExpect(jsonPath("$.[*].libSource247").value(hasItem(DEFAULT_LIB_SOURCE_247)))
            .andExpect(jsonPath("$.[*].codeGrandSource248").value(hasItem(DEFAULT_CODE_GRAND_SOURCE_248)))
            .andExpect(jsonPath("$.[*].codeOrigine249").value(hasItem(DEFAULT_CODE_ORIGINE_249)))
            .andExpect(jsonPath("$.[*].libOrigine250").value(hasItem(DEFAULT_LIB_ORIGINE_250)))
            .andExpect(jsonPath("$.[*].codeMarche251").value(hasItem(DEFAULT_CODE_MARCHE_251)))
            .andExpect(jsonPath("$.[*].libMarche252").value(hasItem(DEFAULT_LIB_MARCHE_252)))
            .andExpect(jsonPath("$.[*].codeGrandMarche253").value(hasItem(DEFAULT_CODE_GRAND_MARCHE_253)))
            .andExpect(jsonPath("$.[*].libGrandMarche254").value(hasItem(DEFAULT_LIB_GRAND_MARCHE_254)))
            .andExpect(jsonPath("$.[*].codePrix255").value(hasItem(DEFAULT_CODE_PRIX_255)))
            .andExpect(jsonPath("$.[*].categPrix256").value(hasItem(DEFAULT_CATEG_PRIX_256)))
            .andExpect(jsonPath("$.[*].libPrix257").value(hasItem(DEFAULT_LIB_PRIX_257)))
            .andExpect(jsonPath("$.[*].numChb258").value(hasItem(DEFAULT_NUM_CHB_258)))
            .andExpect(jsonPath("$.[*].descriptionTypeChb259").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_259)))
            .andExpect(jsonPath("$.[*].codeTypeChb260").value(hasItem(DEFAULT_CODE_TYPE_CHB_260)))
            .andExpect(jsonPath("$.[*].classChb261").value(hasItem(DEFAULT_CLASS_CHB_261)))
            .andExpect(jsonPath("$.[*].caractChb262").value(hasItem(DEFAULT_CARACT_CHB_262)))
            .andExpect(jsonPath("$.[*].typeChbDeReservation263").value(hasItem(DEFAULT_TYPE_CHB_DE_RESERVATION_263)))
            .andExpect(jsonPath("$.[*].descriptionTypeChbDeResv264").value(hasItem(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_264)))
            .andExpect(jsonPath("$.[*].codeTypeChbDeResv265").value(hasItem(DEFAULT_CODE_TYPE_CHB_DE_RESV_265)))
            .andExpect(jsonPath("$.[*].statutDeReservation266").value(hasItem(DEFAULT_STATUT_DE_RESERVATION_266)))
            .andExpect(jsonPath("$.[*].circuitDistribution267").value(hasItem(DEFAULT_CIRCUIT_DISTRIBUTION_267)))
            .andExpect(jsonPath("$.[*].circuitDistribUserRegroup268").value(hasItem(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_268)))
            .andExpect(jsonPath("$.[*].numCrs269").value(hasItem(DEFAULT_NUM_CRS_269)))
            .andExpect(jsonPath("$.[*].typeRefCrs270").value(hasItem(DEFAULT_TYPE_REF_CRS_270)))
            .andExpect(jsonPath("$.[*].crsInsertDate271").value(hasItem(DEFAULT_CRS_INSERT_DATE_271.toString())))
            .andExpect(jsonPath("$.[*].dateCreaResv272").value(hasItem(DEFAULT_DATE_CREA_RESV_272.toString())))
            .andExpect(jsonPath("$.[*].datePremier273").value(hasItem(DEFAULT_DATE_PREMIER_273.toString())))
            .andExpect(jsonPath("$.[*].statutPremier274").value(hasItem(DEFAULT_STATUT_PREMIER_274)))
            .andExpect(jsonPath("$.[*].dateDernier275").value(hasItem(DEFAULT_DATE_DERNIER_275.toString())))
            .andExpect(jsonPath("$.[*].statutDernier276").value(hasItem(DEFAULT_STATUT_DERNIER_276)))
            .andExpect(jsonPath("$.[*].dateDernierPseudo277").value(hasItem(DEFAULT_DATE_DERNIER_PSEUDO_277.toString())))
            .andExpect(jsonPath("$.[*].statutDernierPseudo278").value(hasItem(DEFAULT_STATUT_DERNIER_PSEUDO_278)))
            .andExpect(jsonPath("$.[*].diffDtCreaAnn279").value(hasItem(DEFAULT_DIFF_DT_CREA_ANN_279)))
            .andExpect(jsonPath("$.[*].diffDtArrAnn280").value(hasItem(DEFAULT_DIFF_DT_ARR_ANN_280)))
            .andExpect(jsonPath("$.[*].leadtime281").value(hasItem(DEFAULT_LEADTIME_281)))
            .andExpect(jsonPath("$.[*].los282").value(hasItem(DEFAULT_LOS_282)))
            .andExpect(jsonPath("$.[*].occupantsGroupe283").value(hasItem(DEFAULT_OCCUPANTS_GROUPE_283)))
            .andExpect(jsonPath("$.[*].nbNuitee284").value(hasItem(DEFAULT_NB_NUITEE_284)))
            .andExpect(jsonPath("$.[*].nbNuiteeNnDed285").value(hasItem(DEFAULT_NB_NUITEE_NN_DED_285)))
            .andExpect(jsonPath("$.[*].nbResvAnn286").value(hasItem(DEFAULT_NB_RESV_ANN_286)))
            .andExpect(jsonPath("$.[*].nbAdu287").value(hasItem(DEFAULT_NB_ADU_287)))
            .andExpect(jsonPath("$.[*].nbEnf288").value(hasItem(DEFAULT_NB_ENF_288)))
            .andExpect(jsonPath("$.[*].nbPersDayU289").value(hasItem(DEFAULT_NB_PERS_DAY_U_289)))
            .andExpect(jsonPath("$.[*].nbPersArr290").value(hasItem(DEFAULT_NB_PERS_ARR_290)))
            .andExpect(jsonPath("$.[*].nbPersDep291").value(hasItem(DEFAULT_NB_PERS_DEP_291)))
            .andExpect(jsonPath("$.[*].nbPersAnn292").value(hasItem(DEFAULT_NB_PERS_ANN_292)))
            .andExpect(jsonPath("$.[*].nbPersNoshow293").value(hasItem(DEFAULT_NB_PERS_NOSHOW_293)))
            .andExpect(jsonPath("$.[*].nbChbDayU294").value(hasItem(DEFAULT_NB_CHB_DAY_U_294)))
            .andExpect(jsonPath("$.[*].nbChbArr295").value(hasItem(DEFAULT_NB_CHB_ARR_295)))
            .andExpect(jsonPath("$.[*].nbChbDep296").value(hasItem(DEFAULT_NB_CHB_DEP_296)))
            .andExpect(jsonPath("$.[*].nbChbAnn297").value(hasItem(DEFAULT_NB_CHB_ANN_297)))
            .andExpect(jsonPath("$.[*].nbChbNoshow298").value(hasItem(DEFAULT_NB_CHB_NOSHOW_298)))
            .andExpect(jsonPath("$.[*].revenuNetChambre299").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_299.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambre300").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_300.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetChambreGlobal301").value(hasItem(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_301.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeChambreGlobal302").value(hasItem(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_302.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBq303").value(hasItem(DEFAULT_REVENU_NET_BQ_303.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBq304").value(hasItem(DEFAULT_REVENU_TAXE_BQ_304.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetBqGlobal305").value(hasItem(DEFAULT_REVENU_NET_BQ_GLOBAL_305.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeBqGlobal306").value(hasItem(DEFAULT_REVENU_TAXE_BQ_GLOBAL_306.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtra307").value(hasItem(DEFAULT_REVENU_NET_EXTRA_307.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtra308").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_308.intValue())))
            .andExpect(jsonPath("$.[*].revenuNetExtraGlobal309").value(hasItem(DEFAULT_REVENU_NET_EXTRA_GLOBAL_309.intValue())))
            .andExpect(jsonPath("$.[*].revenuTaxeExtraGlobal310").value(hasItem(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_310.intValue())));
    }

    @Test
    @Transactional
    void getTable2() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        // Get the table2
        restTable2MockMvc
            .perform(get(ENTITY_API_URL_ID, table2.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(table2.getId().intValue()))
            .andExpect(jsonPath("$.numLigne1").value(DEFAULT_NUM_LIGNE_1))
            .andExpect(jsonPath("$.resort2").value(DEFAULT_RESORT_2))
            .andExpect(jsonPath("$.resvNameId3").value(DEFAULT_RESV_NAME_ID_3))
            .andExpect(jsonPath("$.clientOId4").value(DEFAULT_CLIENT_O_ID_4))
            .andExpect(jsonPath("$.typeChb5").value(DEFAULT_TYPE_CHB_5))
            .andExpect(jsonPath("$.confirmationNo6").value(DEFAULT_CONFIRMATION_NO_6))
            .andExpect(jsonPath("$.clientMdmId7").value(DEFAULT_CLIENT_MDM_ID_7))
            .andExpect(jsonPath("$.nameId8").value(DEFAULT_NAME_ID_8))
            .andExpect(jsonPath("$.parentResvNameId9").value(DEFAULT_PARENT_RESV_NAME_ID_9))
            .andExpect(jsonPath("$.contactId10").value(DEFAULT_CONTACT_ID_10))
            .andExpect(jsonPath("$.agenceId11").value(DEFAULT_AGENCE_ID_11))
            .andExpect(jsonPath("$.agenceNom12").value(DEFAULT_AGENCE_NOM_12))
            .andExpect(jsonPath("$.societeId13").value(DEFAULT_SOCIETE_ID_13))
            .andExpect(jsonPath("$.groupeId14").value(DEFAULT_GROUPE_ID_14))
            .andExpect(jsonPath("$.numBloc15").value(DEFAULT_NUM_BLOC_15))
            .andExpect(jsonPath("$.typeResv16").value(DEFAULT_TYPE_RESV_16))
            .andExpect(jsonPath("$.statutResv17").value(DEFAULT_STATUT_RESV_17))
            .andExpect(jsonPath("$.dateDebutResv18").value(DEFAULT_DATE_DEBUT_RESV_18.toString()))
            .andExpect(jsonPath("$.dateFinResv19").value(DEFAULT_DATE_FIN_RESV_19.toString()))
            .andExpect(jsonPath("$.truncDateDebutResv20").value(DEFAULT_TRUNC_DATE_DEBUT_RESV_20.toString()))
            .andExpect(jsonPath("$.truncDateFinResv21").value(DEFAULT_TRUNC_DATE_FIN_RESV_21.toString()))
            .andExpect(jsonPath("$.dateAnnResv22").value(DEFAULT_DATE_ANN_RESV_22.toString()))
            .andExpect(jsonPath("$.pseudoRoomYn23").value(DEFAULT_PSEUDO_ROOM_YN_23))
            .andExpect(jsonPath("$.createurResv24").value(DEFAULT_CREATEUR_RESV_24))
            .andExpect(jsonPath("$.nomCreateurResv25").value(DEFAULT_NOM_CREATEUR_RESV_25))
            .andExpect(jsonPath("$.codeGarantie26").value(DEFAULT_CODE_GARANTIE_26))
            .andExpect(jsonPath("$.flgDed27").value(DEFAULT_FLG_DED_27))
            .andExpect(jsonPath("$.codePays28").value(DEFAULT_CODE_PAYS_28))
            .andExpect(jsonPath("$.libPays29").value(DEFAULT_LIB_PAYS_29))
            .andExpect(jsonPath("$.codeNationalite30").value(DEFAULT_CODE_NATIONALITE_30))
            .andExpect(jsonPath("$.libNationalite31").value(DEFAULT_LIB_NATIONALITE_31))
            .andExpect(jsonPath("$.codeSource32").value(DEFAULT_CODE_SOURCE_32))
            .andExpect(jsonPath("$.libSource33").value(DEFAULT_LIB_SOURCE_33))
            .andExpect(jsonPath("$.codeGrandSource34").value(DEFAULT_CODE_GRAND_SOURCE_34))
            .andExpect(jsonPath("$.codeOrigine35").value(DEFAULT_CODE_ORIGINE_35))
            .andExpect(jsonPath("$.libOrigine36").value(DEFAULT_LIB_ORIGINE_36))
            .andExpect(jsonPath("$.codeMarche37").value(DEFAULT_CODE_MARCHE_37))
            .andExpect(jsonPath("$.libMarche38").value(DEFAULT_LIB_MARCHE_38))
            .andExpect(jsonPath("$.codeGrandMarche39").value(DEFAULT_CODE_GRAND_MARCHE_39))
            .andExpect(jsonPath("$.libGrandMarche40").value(DEFAULT_LIB_GRAND_MARCHE_40))
            .andExpect(jsonPath("$.codePrix41").value(DEFAULT_CODE_PRIX_41))
            .andExpect(jsonPath("$.categPrix42").value(DEFAULT_CATEG_PRIX_42))
            .andExpect(jsonPath("$.libPrix43").value(DEFAULT_LIB_PRIX_43))
            .andExpect(jsonPath("$.numChb44").value(DEFAULT_NUM_CHB_44))
            .andExpect(jsonPath("$.descriptionTypeChb45").value(DEFAULT_DESCRIPTION_TYPE_CHB_45))
            .andExpect(jsonPath("$.codeTypeChb46").value(DEFAULT_CODE_TYPE_CHB_46))
            .andExpect(jsonPath("$.classChb47").value(DEFAULT_CLASS_CHB_47))
            .andExpect(jsonPath("$.caractChb48").value(DEFAULT_CARACT_CHB_48))
            .andExpect(jsonPath("$.typeChbDeReservation49").value(DEFAULT_TYPE_CHB_DE_RESERVATION_49))
            .andExpect(jsonPath("$.descriptionTypeChbDeResv50").value(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_50))
            .andExpect(jsonPath("$.codeTypeChbDeResv51").value(DEFAULT_CODE_TYPE_CHB_DE_RESV_51))
            .andExpect(jsonPath("$.statutDeReservation52").value(DEFAULT_STATUT_DE_RESERVATION_52))
            .andExpect(jsonPath("$.circuitDistribution53").value(DEFAULT_CIRCUIT_DISTRIBUTION_53))
            .andExpect(jsonPath("$.circuitDistribUserRegroup54").value(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_54))
            .andExpect(jsonPath("$.numCrs55").value(DEFAULT_NUM_CRS_55))
            .andExpect(jsonPath("$.typeRefCrs56").value(DEFAULT_TYPE_REF_CRS_56))
            .andExpect(jsonPath("$.crsInsertDate57").value(DEFAULT_CRS_INSERT_DATE_57.toString()))
            .andExpect(jsonPath("$.dateCreaResv58").value(DEFAULT_DATE_CREA_RESV_58.toString()))
            .andExpect(jsonPath("$.datePremier59").value(DEFAULT_DATE_PREMIER_59.toString()))
            .andExpect(jsonPath("$.statutPremier60").value(DEFAULT_STATUT_PREMIER_60))
            .andExpect(jsonPath("$.dateDernier61").value(DEFAULT_DATE_DERNIER_61.toString()))
            .andExpect(jsonPath("$.statutDernier62").value(DEFAULT_STATUT_DERNIER_62))
            .andExpect(jsonPath("$.dateDernierPseudo63").value(DEFAULT_DATE_DERNIER_PSEUDO_63.toString()))
            .andExpect(jsonPath("$.statutDernierPseudo64").value(DEFAULT_STATUT_DERNIER_PSEUDO_64))
            .andExpect(jsonPath("$.diffDtCreaAnn65").value(DEFAULT_DIFF_DT_CREA_ANN_65))
            .andExpect(jsonPath("$.diffDtArrAnn66").value(DEFAULT_DIFF_DT_ARR_ANN_66))
            .andExpect(jsonPath("$.leadtime67").value(DEFAULT_LEADTIME_67))
            .andExpect(jsonPath("$.los68").value(DEFAULT_LOS_68))
            .andExpect(jsonPath("$.occupantsGroupe69").value(DEFAULT_OCCUPANTS_GROUPE_69))
            .andExpect(jsonPath("$.nbNuitee70").value(DEFAULT_NB_NUITEE_70))
            .andExpect(jsonPath("$.nbNuiteeNnDed71").value(DEFAULT_NB_NUITEE_NN_DED_71))
            .andExpect(jsonPath("$.nbResvAnn72").value(DEFAULT_NB_RESV_ANN_72))
            .andExpect(jsonPath("$.nbAdu73").value(DEFAULT_NB_ADU_73))
            .andExpect(jsonPath("$.nbEnf74").value(DEFAULT_NB_ENF_74))
            .andExpect(jsonPath("$.nbPersDayU75").value(DEFAULT_NB_PERS_DAY_U_75))
            .andExpect(jsonPath("$.nbPersArr76").value(DEFAULT_NB_PERS_ARR_76))
            .andExpect(jsonPath("$.nbPersDep77").value(DEFAULT_NB_PERS_DEP_77))
            .andExpect(jsonPath("$.nbPersAnn78").value(DEFAULT_NB_PERS_ANN_78))
            .andExpect(jsonPath("$.nbPersNoshow79").value(DEFAULT_NB_PERS_NOSHOW_79))
            .andExpect(jsonPath("$.nbChbDayU80").value(DEFAULT_NB_CHB_DAY_U_80))
            .andExpect(jsonPath("$.nbChbArr81").value(DEFAULT_NB_CHB_ARR_81))
            .andExpect(jsonPath("$.nbChbDep82").value(DEFAULT_NB_CHB_DEP_82))
            .andExpect(jsonPath("$.nbChbAnn83").value(DEFAULT_NB_CHB_ANN_83))
            .andExpect(jsonPath("$.nbChbNoshow84").value(DEFAULT_NB_CHB_NOSHOW_84))
            .andExpect(jsonPath("$.revenuNetChambre85").value(DEFAULT_REVENU_NET_CHAMBRE_85.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambre86").value(DEFAULT_REVENU_TAXE_CHAMBRE_86.intValue()))
            .andExpect(jsonPath("$.revenuNetChambreGlobal87").value(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_87.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambreGlobal88").value(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_88.intValue()))
            .andExpect(jsonPath("$.revenuNetBq89").value(DEFAULT_REVENU_NET_BQ_89.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBq90").value(DEFAULT_REVENU_TAXE_BQ_90.intValue()))
            .andExpect(jsonPath("$.revenuNetBqGlobal91").value(DEFAULT_REVENU_NET_BQ_GLOBAL_91.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBqGlobal92").value(DEFAULT_REVENU_TAXE_BQ_GLOBAL_92.intValue()))
            .andExpect(jsonPath("$.revenuNetExtra93").value(DEFAULT_REVENU_NET_EXTRA_93.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtra94").value(DEFAULT_REVENU_TAXE_EXTRA_94.intValue()))
            .andExpect(jsonPath("$.revenuNetExtraGlobal95").value(DEFAULT_REVENU_NET_EXTRA_GLOBAL_95.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtraGlobal96").value(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_96.intValue()))
            .andExpect(jsonPath("$.revenuNetTotal97").value(DEFAULT_REVENU_NET_TOTAL_97.intValue()))
            .andExpect(jsonPath("$.revenuTaxeTotal98").value(DEFAULT_REVENU_TAXE_TOTAL_98.intValue()))
            .andExpect(jsonPath("$.revenuNetTotalGlobal99").value(DEFAULT_REVENU_NET_TOTAL_GLOBAL_99.intValue()))
            .andExpect(jsonPath("$.revenuTaxeTotalGlobal100").value(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_100.intValue()))
            .andExpect(jsonPath("$.prodRevenuChambre101").value(DEFAULT_PROD_REVENU_CHAMBRE_101.intValue()))
            .andExpect(jsonPath("$.prodRevenuBq102").value(DEFAULT_PROD_REVENU_BQ_102.intValue()))
            .andExpect(jsonPath("$.prodRevenuExtra103").value(DEFAULT_PROD_REVENU_EXTRA_103.intValue()))
            .andExpect(jsonPath("$.prodRevenuTotal104").value(DEFAULT_PROD_REVENU_TOTAL_104.intValue()))
            .andExpect(jsonPath("$.prodChambreNbNuitees105").value(DEFAULT_PROD_CHAMBRE_NB_NUITEES_105.intValue()))
            .andExpect(jsonPath("$.techCreateDate106").value(DEFAULT_TECH_CREATE_DATE_106.toString()))
            .andExpect(jsonPath("$.techUpdateDate107").value(DEFAULT_TECH_UPDATE_DATE_107.toString()))
            .andExpect(jsonPath("$.numLigne108").value(DEFAULT_NUM_LIGNE_108))
            .andExpect(jsonPath("$.resort109").value(DEFAULT_RESORT_109))
            .andExpect(jsonPath("$.resvNameId110").value(DEFAULT_RESV_NAME_ID_110))
            .andExpect(jsonPath("$.clientOId111").value(DEFAULT_CLIENT_O_ID_111))
            .andExpect(jsonPath("$.typeChb112").value(DEFAULT_TYPE_CHB_112))
            .andExpect(jsonPath("$.confirmationNo113").value(DEFAULT_CONFIRMATION_NO_113))
            .andExpect(jsonPath("$.clientMdmId114").value(DEFAULT_CLIENT_MDM_ID_114))
            .andExpect(jsonPath("$.nameId115").value(DEFAULT_NAME_ID_115))
            .andExpect(jsonPath("$.parentResvNameId116").value(DEFAULT_PARENT_RESV_NAME_ID_116))
            .andExpect(jsonPath("$.contactId117").value(DEFAULT_CONTACT_ID_117))
            .andExpect(jsonPath("$.agenceId118").value(DEFAULT_AGENCE_ID_118))
            .andExpect(jsonPath("$.agenceNom119").value(DEFAULT_AGENCE_NOM_119))
            .andExpect(jsonPath("$.societeId120").value(DEFAULT_SOCIETE_ID_120))
            .andExpect(jsonPath("$.groupeId121").value(DEFAULT_GROUPE_ID_121))
            .andExpect(jsonPath("$.numBloc122").value(DEFAULT_NUM_BLOC_122))
            .andExpect(jsonPath("$.typeResv123").value(DEFAULT_TYPE_RESV_123))
            .andExpect(jsonPath("$.statutResv124").value(DEFAULT_STATUT_RESV_124))
            .andExpect(jsonPath("$.dateDebutResv125").value(DEFAULT_DATE_DEBUT_RESV_125.toString()))
            .andExpect(jsonPath("$.dateFinResv126").value(DEFAULT_DATE_FIN_RESV_126.toString()))
            .andExpect(jsonPath("$.truncDateDebutResv127").value(DEFAULT_TRUNC_DATE_DEBUT_RESV_127.toString()))
            .andExpect(jsonPath("$.truncDateFinResv128").value(DEFAULT_TRUNC_DATE_FIN_RESV_128.toString()))
            .andExpect(jsonPath("$.dateAnnResv129").value(DEFAULT_DATE_ANN_RESV_129.toString()))
            .andExpect(jsonPath("$.pseudoRoomYn130").value(DEFAULT_PSEUDO_ROOM_YN_130))
            .andExpect(jsonPath("$.createurResv131").value(DEFAULT_CREATEUR_RESV_131))
            .andExpect(jsonPath("$.nomCreateurResv132").value(DEFAULT_NOM_CREATEUR_RESV_132))
            .andExpect(jsonPath("$.codeGarantie133").value(DEFAULT_CODE_GARANTIE_133))
            .andExpect(jsonPath("$.flgDed134").value(DEFAULT_FLG_DED_134))
            .andExpect(jsonPath("$.codePays135").value(DEFAULT_CODE_PAYS_135))
            .andExpect(jsonPath("$.libPays136").value(DEFAULT_LIB_PAYS_136))
            .andExpect(jsonPath("$.codeNationalite137").value(DEFAULT_CODE_NATIONALITE_137))
            .andExpect(jsonPath("$.libNationalite138").value(DEFAULT_LIB_NATIONALITE_138))
            .andExpect(jsonPath("$.codeSource139").value(DEFAULT_CODE_SOURCE_139))
            .andExpect(jsonPath("$.libSource140").value(DEFAULT_LIB_SOURCE_140))
            .andExpect(jsonPath("$.codeGrandSource141").value(DEFAULT_CODE_GRAND_SOURCE_141))
            .andExpect(jsonPath("$.codeOrigine142").value(DEFAULT_CODE_ORIGINE_142))
            .andExpect(jsonPath("$.libOrigine143").value(DEFAULT_LIB_ORIGINE_143))
            .andExpect(jsonPath("$.codeMarche144").value(DEFAULT_CODE_MARCHE_144))
            .andExpect(jsonPath("$.libMarche145").value(DEFAULT_LIB_MARCHE_145))
            .andExpect(jsonPath("$.codeGrandMarche146").value(DEFAULT_CODE_GRAND_MARCHE_146))
            .andExpect(jsonPath("$.libGrandMarche147").value(DEFAULT_LIB_GRAND_MARCHE_147))
            .andExpect(jsonPath("$.codePrix148").value(DEFAULT_CODE_PRIX_148))
            .andExpect(jsonPath("$.categPrix149").value(DEFAULT_CATEG_PRIX_149))
            .andExpect(jsonPath("$.libPrix150").value(DEFAULT_LIB_PRIX_150))
            .andExpect(jsonPath("$.numChb151").value(DEFAULT_NUM_CHB_151))
            .andExpect(jsonPath("$.descriptionTypeChb152").value(DEFAULT_DESCRIPTION_TYPE_CHB_152))
            .andExpect(jsonPath("$.codeTypeChb153").value(DEFAULT_CODE_TYPE_CHB_153))
            .andExpect(jsonPath("$.classChb154").value(DEFAULT_CLASS_CHB_154))
            .andExpect(jsonPath("$.caractChb155").value(DEFAULT_CARACT_CHB_155))
            .andExpect(jsonPath("$.typeChbDeReservation156").value(DEFAULT_TYPE_CHB_DE_RESERVATION_156))
            .andExpect(jsonPath("$.descriptionTypeChbDeResv157").value(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_157))
            .andExpect(jsonPath("$.codeTypeChbDeResv158").value(DEFAULT_CODE_TYPE_CHB_DE_RESV_158))
            .andExpect(jsonPath("$.statutDeReservation159").value(DEFAULT_STATUT_DE_RESERVATION_159))
            .andExpect(jsonPath("$.circuitDistribution160").value(DEFAULT_CIRCUIT_DISTRIBUTION_160))
            .andExpect(jsonPath("$.circuitDistribUserRegroup161").value(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_161))
            .andExpect(jsonPath("$.numCrs162").value(DEFAULT_NUM_CRS_162))
            .andExpect(jsonPath("$.typeRefCrs163").value(DEFAULT_TYPE_REF_CRS_163))
            .andExpect(jsonPath("$.crsInsertDate164").value(DEFAULT_CRS_INSERT_DATE_164.toString()))
            .andExpect(jsonPath("$.dateCreaResv165").value(DEFAULT_DATE_CREA_RESV_165.toString()))
            .andExpect(jsonPath("$.datePremier166").value(DEFAULT_DATE_PREMIER_166.toString()))
            .andExpect(jsonPath("$.statutPremier167").value(DEFAULT_STATUT_PREMIER_167))
            .andExpect(jsonPath("$.dateDernier168").value(DEFAULT_DATE_DERNIER_168.toString()))
            .andExpect(jsonPath("$.statutDernier169").value(DEFAULT_STATUT_DERNIER_169))
            .andExpect(jsonPath("$.dateDernierPseudo170").value(DEFAULT_DATE_DERNIER_PSEUDO_170.toString()))
            .andExpect(jsonPath("$.statutDernierPseudo171").value(DEFAULT_STATUT_DERNIER_PSEUDO_171))
            .andExpect(jsonPath("$.diffDtCreaAnn172").value(DEFAULT_DIFF_DT_CREA_ANN_172))
            .andExpect(jsonPath("$.diffDtArrAnn173").value(DEFAULT_DIFF_DT_ARR_ANN_173))
            .andExpect(jsonPath("$.leadtime174").value(DEFAULT_LEADTIME_174))
            .andExpect(jsonPath("$.los175").value(DEFAULT_LOS_175))
            .andExpect(jsonPath("$.occupantsGroupe176").value(DEFAULT_OCCUPANTS_GROUPE_176))
            .andExpect(jsonPath("$.nbNuitee177").value(DEFAULT_NB_NUITEE_177))
            .andExpect(jsonPath("$.nbNuiteeNnDed178").value(DEFAULT_NB_NUITEE_NN_DED_178))
            .andExpect(jsonPath("$.nbResvAnn179").value(DEFAULT_NB_RESV_ANN_179))
            .andExpect(jsonPath("$.nbAdu180").value(DEFAULT_NB_ADU_180))
            .andExpect(jsonPath("$.nbEnf181").value(DEFAULT_NB_ENF_181))
            .andExpect(jsonPath("$.nbPersDayU182").value(DEFAULT_NB_PERS_DAY_U_182))
            .andExpect(jsonPath("$.nbPersArr183").value(DEFAULT_NB_PERS_ARR_183))
            .andExpect(jsonPath("$.nbPersDep184").value(DEFAULT_NB_PERS_DEP_184))
            .andExpect(jsonPath("$.nbPersAnn185").value(DEFAULT_NB_PERS_ANN_185))
            .andExpect(jsonPath("$.nbPersNoshow186").value(DEFAULT_NB_PERS_NOSHOW_186))
            .andExpect(jsonPath("$.nbChbDayU187").value(DEFAULT_NB_CHB_DAY_U_187))
            .andExpect(jsonPath("$.nbChbArr188").value(DEFAULT_NB_CHB_ARR_188))
            .andExpect(jsonPath("$.nbChbDep189").value(DEFAULT_NB_CHB_DEP_189))
            .andExpect(jsonPath("$.nbChbAnn190").value(DEFAULT_NB_CHB_ANN_190))
            .andExpect(jsonPath("$.nbChbNoshow191").value(DEFAULT_NB_CHB_NOSHOW_191))
            .andExpect(jsonPath("$.revenuNetChambre192").value(DEFAULT_REVENU_NET_CHAMBRE_192.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambre193").value(DEFAULT_REVENU_TAXE_CHAMBRE_193.intValue()))
            .andExpect(jsonPath("$.revenuNetChambreGlobal194").value(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_194.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambreGlobal195").value(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_195.intValue()))
            .andExpect(jsonPath("$.revenuNetBq196").value(DEFAULT_REVENU_NET_BQ_196.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBq197").value(DEFAULT_REVENU_TAXE_BQ_197.intValue()))
            .andExpect(jsonPath("$.revenuNetBqGlobal198").value(DEFAULT_REVENU_NET_BQ_GLOBAL_198.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBqGlobal199").value(DEFAULT_REVENU_TAXE_BQ_GLOBAL_199.intValue()))
            .andExpect(jsonPath("$.revenuNetExtra200").value(DEFAULT_REVENU_NET_EXTRA_200.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtra201").value(DEFAULT_REVENU_TAXE_EXTRA_201.intValue()))
            .andExpect(jsonPath("$.revenuNetExtraGlobal202").value(DEFAULT_REVENU_NET_EXTRA_GLOBAL_202.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtraGlobal203").value(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_203.intValue()))
            .andExpect(jsonPath("$.revenuNetTotal204").value(DEFAULT_REVENU_NET_TOTAL_204.intValue()))
            .andExpect(jsonPath("$.revenuTaxeTotal205").value(DEFAULT_REVENU_TAXE_TOTAL_205.intValue()))
            .andExpect(jsonPath("$.revenuNetTotalGlobal206").value(DEFAULT_REVENU_NET_TOTAL_GLOBAL_206.intValue()))
            .andExpect(jsonPath("$.revenuTaxeTotalGlobal207").value(DEFAULT_REVENU_TAXE_TOTAL_GLOBAL_207.intValue()))
            .andExpect(jsonPath("$.prodRevenuChambre208").value(DEFAULT_PROD_REVENU_CHAMBRE_208.intValue()))
            .andExpect(jsonPath("$.prodRevenuBq209").value(DEFAULT_PROD_REVENU_BQ_209.intValue()))
            .andExpect(jsonPath("$.prodRevenuExtra210").value(DEFAULT_PROD_REVENU_EXTRA_210.intValue()))
            .andExpect(jsonPath("$.prodRevenuTotal211").value(DEFAULT_PROD_REVENU_TOTAL_211.intValue()))
            .andExpect(jsonPath("$.prodChambreNbNuitees212").value(DEFAULT_PROD_CHAMBRE_NB_NUITEES_212.intValue()))
            .andExpect(jsonPath("$.techCreateDate213").value(DEFAULT_TECH_CREATE_DATE_213.toString()))
            .andExpect(jsonPath("$.techUpdateDate214").value(DEFAULT_TECH_UPDATE_DATE_214.toString()))
            .andExpect(jsonPath("$.numLigne215").value(DEFAULT_NUM_LIGNE_215))
            .andExpect(jsonPath("$.resort216").value(DEFAULT_RESORT_216))
            .andExpect(jsonPath("$.resvNameId217").value(DEFAULT_RESV_NAME_ID_217))
            .andExpect(jsonPath("$.clientOId218").value(DEFAULT_CLIENT_O_ID_218))
            .andExpect(jsonPath("$.typeChb219").value(DEFAULT_TYPE_CHB_219))
            .andExpect(jsonPath("$.confirmationNo220").value(DEFAULT_CONFIRMATION_NO_220))
            .andExpect(jsonPath("$.clientMdmId221").value(DEFAULT_CLIENT_MDM_ID_221))
            .andExpect(jsonPath("$.nameId222").value(DEFAULT_NAME_ID_222))
            .andExpect(jsonPath("$.parentResvNameId223").value(DEFAULT_PARENT_RESV_NAME_ID_223))
            .andExpect(jsonPath("$.contactId224").value(DEFAULT_CONTACT_ID_224))
            .andExpect(jsonPath("$.agenceId225").value(DEFAULT_AGENCE_ID_225))
            .andExpect(jsonPath("$.agenceNom226").value(DEFAULT_AGENCE_NOM_226))
            .andExpect(jsonPath("$.societeId227").value(DEFAULT_SOCIETE_ID_227))
            .andExpect(jsonPath("$.groupeId228").value(DEFAULT_GROUPE_ID_228))
            .andExpect(jsonPath("$.numBloc229").value(DEFAULT_NUM_BLOC_229))
            .andExpect(jsonPath("$.typeResv230").value(DEFAULT_TYPE_RESV_230))
            .andExpect(jsonPath("$.statutResv231").value(DEFAULT_STATUT_RESV_231))
            .andExpect(jsonPath("$.dateDebutResv232").value(DEFAULT_DATE_DEBUT_RESV_232.toString()))
            .andExpect(jsonPath("$.dateFinResv233").value(DEFAULT_DATE_FIN_RESV_233.toString()))
            .andExpect(jsonPath("$.truncDateDebutResv234").value(DEFAULT_TRUNC_DATE_DEBUT_RESV_234.toString()))
            .andExpect(jsonPath("$.truncDateFinResv235").value(DEFAULT_TRUNC_DATE_FIN_RESV_235.toString()))
            .andExpect(jsonPath("$.dateAnnResv236").value(DEFAULT_DATE_ANN_RESV_236.toString()))
            .andExpect(jsonPath("$.pseudoRoomYn237").value(DEFAULT_PSEUDO_ROOM_YN_237))
            .andExpect(jsonPath("$.createurResv238").value(DEFAULT_CREATEUR_RESV_238))
            .andExpect(jsonPath("$.nomCreateurResv239").value(DEFAULT_NOM_CREATEUR_RESV_239))
            .andExpect(jsonPath("$.codeGarantie240").value(DEFAULT_CODE_GARANTIE_240))
            .andExpect(jsonPath("$.flgDed241").value(DEFAULT_FLG_DED_241))
            .andExpect(jsonPath("$.codePays242").value(DEFAULT_CODE_PAYS_242))
            .andExpect(jsonPath("$.libPays243").value(DEFAULT_LIB_PAYS_243))
            .andExpect(jsonPath("$.codeNationalite244").value(DEFAULT_CODE_NATIONALITE_244))
            .andExpect(jsonPath("$.libNationalite245").value(DEFAULT_LIB_NATIONALITE_245))
            .andExpect(jsonPath("$.codeSource246").value(DEFAULT_CODE_SOURCE_246))
            .andExpect(jsonPath("$.libSource247").value(DEFAULT_LIB_SOURCE_247))
            .andExpect(jsonPath("$.codeGrandSource248").value(DEFAULT_CODE_GRAND_SOURCE_248))
            .andExpect(jsonPath("$.codeOrigine249").value(DEFAULT_CODE_ORIGINE_249))
            .andExpect(jsonPath("$.libOrigine250").value(DEFAULT_LIB_ORIGINE_250))
            .andExpect(jsonPath("$.codeMarche251").value(DEFAULT_CODE_MARCHE_251))
            .andExpect(jsonPath("$.libMarche252").value(DEFAULT_LIB_MARCHE_252))
            .andExpect(jsonPath("$.codeGrandMarche253").value(DEFAULT_CODE_GRAND_MARCHE_253))
            .andExpect(jsonPath("$.libGrandMarche254").value(DEFAULT_LIB_GRAND_MARCHE_254))
            .andExpect(jsonPath("$.codePrix255").value(DEFAULT_CODE_PRIX_255))
            .andExpect(jsonPath("$.categPrix256").value(DEFAULT_CATEG_PRIX_256))
            .andExpect(jsonPath("$.libPrix257").value(DEFAULT_LIB_PRIX_257))
            .andExpect(jsonPath("$.numChb258").value(DEFAULT_NUM_CHB_258))
            .andExpect(jsonPath("$.descriptionTypeChb259").value(DEFAULT_DESCRIPTION_TYPE_CHB_259))
            .andExpect(jsonPath("$.codeTypeChb260").value(DEFAULT_CODE_TYPE_CHB_260))
            .andExpect(jsonPath("$.classChb261").value(DEFAULT_CLASS_CHB_261))
            .andExpect(jsonPath("$.caractChb262").value(DEFAULT_CARACT_CHB_262))
            .andExpect(jsonPath("$.typeChbDeReservation263").value(DEFAULT_TYPE_CHB_DE_RESERVATION_263))
            .andExpect(jsonPath("$.descriptionTypeChbDeResv264").value(DEFAULT_DESCRIPTION_TYPE_CHB_DE_RESV_264))
            .andExpect(jsonPath("$.codeTypeChbDeResv265").value(DEFAULT_CODE_TYPE_CHB_DE_RESV_265))
            .andExpect(jsonPath("$.statutDeReservation266").value(DEFAULT_STATUT_DE_RESERVATION_266))
            .andExpect(jsonPath("$.circuitDistribution267").value(DEFAULT_CIRCUIT_DISTRIBUTION_267))
            .andExpect(jsonPath("$.circuitDistribUserRegroup268").value(DEFAULT_CIRCUIT_DISTRIB_USER_REGROUP_268))
            .andExpect(jsonPath("$.numCrs269").value(DEFAULT_NUM_CRS_269))
            .andExpect(jsonPath("$.typeRefCrs270").value(DEFAULT_TYPE_REF_CRS_270))
            .andExpect(jsonPath("$.crsInsertDate271").value(DEFAULT_CRS_INSERT_DATE_271.toString()))
            .andExpect(jsonPath("$.dateCreaResv272").value(DEFAULT_DATE_CREA_RESV_272.toString()))
            .andExpect(jsonPath("$.datePremier273").value(DEFAULT_DATE_PREMIER_273.toString()))
            .andExpect(jsonPath("$.statutPremier274").value(DEFAULT_STATUT_PREMIER_274))
            .andExpect(jsonPath("$.dateDernier275").value(DEFAULT_DATE_DERNIER_275.toString()))
            .andExpect(jsonPath("$.statutDernier276").value(DEFAULT_STATUT_DERNIER_276))
            .andExpect(jsonPath("$.dateDernierPseudo277").value(DEFAULT_DATE_DERNIER_PSEUDO_277.toString()))
            .andExpect(jsonPath("$.statutDernierPseudo278").value(DEFAULT_STATUT_DERNIER_PSEUDO_278))
            .andExpect(jsonPath("$.diffDtCreaAnn279").value(DEFAULT_DIFF_DT_CREA_ANN_279))
            .andExpect(jsonPath("$.diffDtArrAnn280").value(DEFAULT_DIFF_DT_ARR_ANN_280))
            .andExpect(jsonPath("$.leadtime281").value(DEFAULT_LEADTIME_281))
            .andExpect(jsonPath("$.los282").value(DEFAULT_LOS_282))
            .andExpect(jsonPath("$.occupantsGroupe283").value(DEFAULT_OCCUPANTS_GROUPE_283))
            .andExpect(jsonPath("$.nbNuitee284").value(DEFAULT_NB_NUITEE_284))
            .andExpect(jsonPath("$.nbNuiteeNnDed285").value(DEFAULT_NB_NUITEE_NN_DED_285))
            .andExpect(jsonPath("$.nbResvAnn286").value(DEFAULT_NB_RESV_ANN_286))
            .andExpect(jsonPath("$.nbAdu287").value(DEFAULT_NB_ADU_287))
            .andExpect(jsonPath("$.nbEnf288").value(DEFAULT_NB_ENF_288))
            .andExpect(jsonPath("$.nbPersDayU289").value(DEFAULT_NB_PERS_DAY_U_289))
            .andExpect(jsonPath("$.nbPersArr290").value(DEFAULT_NB_PERS_ARR_290))
            .andExpect(jsonPath("$.nbPersDep291").value(DEFAULT_NB_PERS_DEP_291))
            .andExpect(jsonPath("$.nbPersAnn292").value(DEFAULT_NB_PERS_ANN_292))
            .andExpect(jsonPath("$.nbPersNoshow293").value(DEFAULT_NB_PERS_NOSHOW_293))
            .andExpect(jsonPath("$.nbChbDayU294").value(DEFAULT_NB_CHB_DAY_U_294))
            .andExpect(jsonPath("$.nbChbArr295").value(DEFAULT_NB_CHB_ARR_295))
            .andExpect(jsonPath("$.nbChbDep296").value(DEFAULT_NB_CHB_DEP_296))
            .andExpect(jsonPath("$.nbChbAnn297").value(DEFAULT_NB_CHB_ANN_297))
            .andExpect(jsonPath("$.nbChbNoshow298").value(DEFAULT_NB_CHB_NOSHOW_298))
            .andExpect(jsonPath("$.revenuNetChambre299").value(DEFAULT_REVENU_NET_CHAMBRE_299.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambre300").value(DEFAULT_REVENU_TAXE_CHAMBRE_300.intValue()))
            .andExpect(jsonPath("$.revenuNetChambreGlobal301").value(DEFAULT_REVENU_NET_CHAMBRE_GLOBAL_301.intValue()))
            .andExpect(jsonPath("$.revenuTaxeChambreGlobal302").value(DEFAULT_REVENU_TAXE_CHAMBRE_GLOBAL_302.intValue()))
            .andExpect(jsonPath("$.revenuNetBq303").value(DEFAULT_REVENU_NET_BQ_303.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBq304").value(DEFAULT_REVENU_TAXE_BQ_304.intValue()))
            .andExpect(jsonPath("$.revenuNetBqGlobal305").value(DEFAULT_REVENU_NET_BQ_GLOBAL_305.intValue()))
            .andExpect(jsonPath("$.revenuTaxeBqGlobal306").value(DEFAULT_REVENU_TAXE_BQ_GLOBAL_306.intValue()))
            .andExpect(jsonPath("$.revenuNetExtra307").value(DEFAULT_REVENU_NET_EXTRA_307.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtra308").value(DEFAULT_REVENU_TAXE_EXTRA_308.intValue()))
            .andExpect(jsonPath("$.revenuNetExtraGlobal309").value(DEFAULT_REVENU_NET_EXTRA_GLOBAL_309.intValue()))
            .andExpect(jsonPath("$.revenuTaxeExtraGlobal310").value(DEFAULT_REVENU_TAXE_EXTRA_GLOBAL_310.intValue()));
    }

    @Test
    @Transactional
    void getNonExistingTable2() throws Exception {
        // Get the table2
        restTable2MockMvc.perform(get(ENTITY_API_URL_ID, Long.MAX_VALUE)).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putExistingTable2() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        long databaseSizeBeforeUpdate = getRepositoryCount();

        // Update the table2
        Table2 updatedTable2 = table2Repository.findById(table2.getId()).orElseThrow();
        // Disconnect from session so that the updates on updatedTable2 are not directly saved in db
        em.detach(updatedTable2);
        updatedTable2
            .numLigne1(UPDATED_NUM_LIGNE_1)
            .resort2(UPDATED_RESORT_2)
            .resvNameId3(UPDATED_RESV_NAME_ID_3)
            .clientOId4(UPDATED_CLIENT_O_ID_4)
            .typeChb5(UPDATED_TYPE_CHB_5)
            .confirmationNo6(UPDATED_CONFIRMATION_NO_6)
            .clientMdmId7(UPDATED_CLIENT_MDM_ID_7)
            .nameId8(UPDATED_NAME_ID_8)
            .parentResvNameId9(UPDATED_PARENT_RESV_NAME_ID_9)
            .contactId10(UPDATED_CONTACT_ID_10)
            .agenceId11(UPDATED_AGENCE_ID_11)
            .agenceNom12(UPDATED_AGENCE_NOM_12)
            .societeId13(UPDATED_SOCIETE_ID_13)
            .groupeId14(UPDATED_GROUPE_ID_14)
            .numBloc15(UPDATED_NUM_BLOC_15)
            .typeResv16(UPDATED_TYPE_RESV_16)
            .statutResv17(UPDATED_STATUT_RESV_17)
            .dateDebutResv18(UPDATED_DATE_DEBUT_RESV_18)
            .dateFinResv19(UPDATED_DATE_FIN_RESV_19)
            .truncDateDebutResv20(UPDATED_TRUNC_DATE_DEBUT_RESV_20)
            .truncDateFinResv21(UPDATED_TRUNC_DATE_FIN_RESV_21)
            .dateAnnResv22(UPDATED_DATE_ANN_RESV_22)
            .pseudoRoomYn23(UPDATED_PSEUDO_ROOM_YN_23)
            .createurResv24(UPDATED_CREATEUR_RESV_24)
            .nomCreateurResv25(UPDATED_NOM_CREATEUR_RESV_25)
            .codeGarantie26(UPDATED_CODE_GARANTIE_26)
            .flgDed27(UPDATED_FLG_DED_27)
            .codePays28(UPDATED_CODE_PAYS_28)
            .libPays29(UPDATED_LIB_PAYS_29)
            .codeNationalite30(UPDATED_CODE_NATIONALITE_30)
            .libNationalite31(UPDATED_LIB_NATIONALITE_31)
            .codeSource32(UPDATED_CODE_SOURCE_32)
            .libSource33(UPDATED_LIB_SOURCE_33)
            .codeGrandSource34(UPDATED_CODE_GRAND_SOURCE_34)
            .codeOrigine35(UPDATED_CODE_ORIGINE_35)
            .libOrigine36(UPDATED_LIB_ORIGINE_36)
            .codeMarche37(UPDATED_CODE_MARCHE_37)
            .libMarche38(UPDATED_LIB_MARCHE_38)
            .codeGrandMarche39(UPDATED_CODE_GRAND_MARCHE_39)
            .libGrandMarche40(UPDATED_LIB_GRAND_MARCHE_40)
            .codePrix41(UPDATED_CODE_PRIX_41)
            .categPrix42(UPDATED_CATEG_PRIX_42)
            .libPrix43(UPDATED_LIB_PRIX_43)
            .numChb44(UPDATED_NUM_CHB_44)
            .descriptionTypeChb45(UPDATED_DESCRIPTION_TYPE_CHB_45)
            .codeTypeChb46(UPDATED_CODE_TYPE_CHB_46)
            .classChb47(UPDATED_CLASS_CHB_47)
            .caractChb48(UPDATED_CARACT_CHB_48)
            .typeChbDeReservation49(UPDATED_TYPE_CHB_DE_RESERVATION_49)
            .descriptionTypeChbDeResv50(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_50)
            .codeTypeChbDeResv51(UPDATED_CODE_TYPE_CHB_DE_RESV_51)
            .statutDeReservation52(UPDATED_STATUT_DE_RESERVATION_52)
            .circuitDistribution53(UPDATED_CIRCUIT_DISTRIBUTION_53)
            .circuitDistribUserRegroup54(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_54)
            .numCrs55(UPDATED_NUM_CRS_55)
            .typeRefCrs56(UPDATED_TYPE_REF_CRS_56)
            .crsInsertDate57(UPDATED_CRS_INSERT_DATE_57)
            .dateCreaResv58(UPDATED_DATE_CREA_RESV_58)
            .datePremier59(UPDATED_DATE_PREMIER_59)
            .statutPremier60(UPDATED_STATUT_PREMIER_60)
            .dateDernier61(UPDATED_DATE_DERNIER_61)
            .statutDernier62(UPDATED_STATUT_DERNIER_62)
            .dateDernierPseudo63(UPDATED_DATE_DERNIER_PSEUDO_63)
            .statutDernierPseudo64(UPDATED_STATUT_DERNIER_PSEUDO_64)
            .diffDtCreaAnn65(UPDATED_DIFF_DT_CREA_ANN_65)
            .diffDtArrAnn66(UPDATED_DIFF_DT_ARR_ANN_66)
            .leadtime67(UPDATED_LEADTIME_67)
            .los68(UPDATED_LOS_68)
            .occupantsGroupe69(UPDATED_OCCUPANTS_GROUPE_69)
            .nbNuitee70(UPDATED_NB_NUITEE_70)
            .nbNuiteeNnDed71(UPDATED_NB_NUITEE_NN_DED_71)
            .nbResvAnn72(UPDATED_NB_RESV_ANN_72)
            .nbAdu73(UPDATED_NB_ADU_73)
            .nbEnf74(UPDATED_NB_ENF_74)
            .nbPersDayU75(UPDATED_NB_PERS_DAY_U_75)
            .nbPersArr76(UPDATED_NB_PERS_ARR_76)
            .nbPersDep77(UPDATED_NB_PERS_DEP_77)
            .nbPersAnn78(UPDATED_NB_PERS_ANN_78)
            .nbPersNoshow79(UPDATED_NB_PERS_NOSHOW_79)
            .nbChbDayU80(UPDATED_NB_CHB_DAY_U_80)
            .nbChbArr81(UPDATED_NB_CHB_ARR_81)
            .nbChbDep82(UPDATED_NB_CHB_DEP_82)
            .nbChbAnn83(UPDATED_NB_CHB_ANN_83)
            .nbChbNoshow84(UPDATED_NB_CHB_NOSHOW_84)
            .revenuNetChambre85(UPDATED_REVENU_NET_CHAMBRE_85)
            .revenuTaxeChambre86(UPDATED_REVENU_TAXE_CHAMBRE_86)
            .revenuNetChambreGlobal87(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_87)
            .revenuTaxeChambreGlobal88(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_88)
            .revenuNetBq89(UPDATED_REVENU_NET_BQ_89)
            .revenuTaxeBq90(UPDATED_REVENU_TAXE_BQ_90)
            .revenuNetBqGlobal91(UPDATED_REVENU_NET_BQ_GLOBAL_91)
            .revenuTaxeBqGlobal92(UPDATED_REVENU_TAXE_BQ_GLOBAL_92)
            .revenuNetExtra93(UPDATED_REVENU_NET_EXTRA_93)
            .revenuTaxeExtra94(UPDATED_REVENU_TAXE_EXTRA_94)
            .revenuNetExtraGlobal95(UPDATED_REVENU_NET_EXTRA_GLOBAL_95)
            .revenuTaxeExtraGlobal96(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_96)
            .revenuNetTotal97(UPDATED_REVENU_NET_TOTAL_97)
            .revenuTaxeTotal98(UPDATED_REVENU_TAXE_TOTAL_98)
            .revenuNetTotalGlobal99(UPDATED_REVENU_NET_TOTAL_GLOBAL_99)
            .revenuTaxeTotalGlobal100(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_100)
            .prodRevenuChambre101(UPDATED_PROD_REVENU_CHAMBRE_101)
            .prodRevenuBq102(UPDATED_PROD_REVENU_BQ_102)
            .prodRevenuExtra103(UPDATED_PROD_REVENU_EXTRA_103)
            .prodRevenuTotal104(UPDATED_PROD_REVENU_TOTAL_104)
            .prodChambreNbNuitees105(UPDATED_PROD_CHAMBRE_NB_NUITEES_105)
            .techCreateDate106(UPDATED_TECH_CREATE_DATE_106)
            .techUpdateDate107(UPDATED_TECH_UPDATE_DATE_107)
            .numLigne108(UPDATED_NUM_LIGNE_108)
            .resort109(UPDATED_RESORT_109)
            .resvNameId110(UPDATED_RESV_NAME_ID_110)
            .clientOId111(UPDATED_CLIENT_O_ID_111)
            .typeChb112(UPDATED_TYPE_CHB_112)
            .confirmationNo113(UPDATED_CONFIRMATION_NO_113)
            .clientMdmId114(UPDATED_CLIENT_MDM_ID_114)
            .nameId115(UPDATED_NAME_ID_115)
            .parentResvNameId116(UPDATED_PARENT_RESV_NAME_ID_116)
            .contactId117(UPDATED_CONTACT_ID_117)
            .agenceId118(UPDATED_AGENCE_ID_118)
            .agenceNom119(UPDATED_AGENCE_NOM_119)
            .societeId120(UPDATED_SOCIETE_ID_120)
            .groupeId121(UPDATED_GROUPE_ID_121)
            .numBloc122(UPDATED_NUM_BLOC_122)
            .typeResv123(UPDATED_TYPE_RESV_123)
            .statutResv124(UPDATED_STATUT_RESV_124)
            .dateDebutResv125(UPDATED_DATE_DEBUT_RESV_125)
            .dateFinResv126(UPDATED_DATE_FIN_RESV_126)
            .truncDateDebutResv127(UPDATED_TRUNC_DATE_DEBUT_RESV_127)
            .truncDateFinResv128(UPDATED_TRUNC_DATE_FIN_RESV_128)
            .dateAnnResv129(UPDATED_DATE_ANN_RESV_129)
            .pseudoRoomYn130(UPDATED_PSEUDO_ROOM_YN_130)
            .createurResv131(UPDATED_CREATEUR_RESV_131)
            .nomCreateurResv132(UPDATED_NOM_CREATEUR_RESV_132)
            .codeGarantie133(UPDATED_CODE_GARANTIE_133)
            .flgDed134(UPDATED_FLG_DED_134)
            .codePays135(UPDATED_CODE_PAYS_135)
            .libPays136(UPDATED_LIB_PAYS_136)
            .codeNationalite137(UPDATED_CODE_NATIONALITE_137)
            .libNationalite138(UPDATED_LIB_NATIONALITE_138)
            .codeSource139(UPDATED_CODE_SOURCE_139)
            .libSource140(UPDATED_LIB_SOURCE_140)
            .codeGrandSource141(UPDATED_CODE_GRAND_SOURCE_141)
            .codeOrigine142(UPDATED_CODE_ORIGINE_142)
            .libOrigine143(UPDATED_LIB_ORIGINE_143)
            .codeMarche144(UPDATED_CODE_MARCHE_144)
            .libMarche145(UPDATED_LIB_MARCHE_145)
            .codeGrandMarche146(UPDATED_CODE_GRAND_MARCHE_146)
            .libGrandMarche147(UPDATED_LIB_GRAND_MARCHE_147)
            .codePrix148(UPDATED_CODE_PRIX_148)
            .categPrix149(UPDATED_CATEG_PRIX_149)
            .libPrix150(UPDATED_LIB_PRIX_150)
            .numChb151(UPDATED_NUM_CHB_151)
            .descriptionTypeChb152(UPDATED_DESCRIPTION_TYPE_CHB_152)
            .codeTypeChb153(UPDATED_CODE_TYPE_CHB_153)
            .classChb154(UPDATED_CLASS_CHB_154)
            .caractChb155(UPDATED_CARACT_CHB_155)
            .typeChbDeReservation156(UPDATED_TYPE_CHB_DE_RESERVATION_156)
            .descriptionTypeChbDeResv157(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_157)
            .codeTypeChbDeResv158(UPDATED_CODE_TYPE_CHB_DE_RESV_158)
            .statutDeReservation159(UPDATED_STATUT_DE_RESERVATION_159)
            .circuitDistribution160(UPDATED_CIRCUIT_DISTRIBUTION_160)
            .circuitDistribUserRegroup161(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_161)
            .numCrs162(UPDATED_NUM_CRS_162)
            .typeRefCrs163(UPDATED_TYPE_REF_CRS_163)
            .crsInsertDate164(UPDATED_CRS_INSERT_DATE_164)
            .dateCreaResv165(UPDATED_DATE_CREA_RESV_165)
            .datePremier166(UPDATED_DATE_PREMIER_166)
            .statutPremier167(UPDATED_STATUT_PREMIER_167)
            .dateDernier168(UPDATED_DATE_DERNIER_168)
            .statutDernier169(UPDATED_STATUT_DERNIER_169)
            .dateDernierPseudo170(UPDATED_DATE_DERNIER_PSEUDO_170)
            .statutDernierPseudo171(UPDATED_STATUT_DERNIER_PSEUDO_171)
            .diffDtCreaAnn172(UPDATED_DIFF_DT_CREA_ANN_172)
            .diffDtArrAnn173(UPDATED_DIFF_DT_ARR_ANN_173)
            .leadtime174(UPDATED_LEADTIME_174)
            .los175(UPDATED_LOS_175)
            .occupantsGroupe176(UPDATED_OCCUPANTS_GROUPE_176)
            .nbNuitee177(UPDATED_NB_NUITEE_177)
            .nbNuiteeNnDed178(UPDATED_NB_NUITEE_NN_DED_178)
            .nbResvAnn179(UPDATED_NB_RESV_ANN_179)
            .nbAdu180(UPDATED_NB_ADU_180)
            .nbEnf181(UPDATED_NB_ENF_181)
            .nbPersDayU182(UPDATED_NB_PERS_DAY_U_182)
            .nbPersArr183(UPDATED_NB_PERS_ARR_183)
            .nbPersDep184(UPDATED_NB_PERS_DEP_184)
            .nbPersAnn185(UPDATED_NB_PERS_ANN_185)
            .nbPersNoshow186(UPDATED_NB_PERS_NOSHOW_186)
            .nbChbDayU187(UPDATED_NB_CHB_DAY_U_187)
            .nbChbArr188(UPDATED_NB_CHB_ARR_188)
            .nbChbDep189(UPDATED_NB_CHB_DEP_189)
            .nbChbAnn190(UPDATED_NB_CHB_ANN_190)
            .nbChbNoshow191(UPDATED_NB_CHB_NOSHOW_191)
            .revenuNetChambre192(UPDATED_REVENU_NET_CHAMBRE_192)
            .revenuTaxeChambre193(UPDATED_REVENU_TAXE_CHAMBRE_193)
            .revenuNetChambreGlobal194(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_194)
            .revenuTaxeChambreGlobal195(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_195)
            .revenuNetBq196(UPDATED_REVENU_NET_BQ_196)
            .revenuTaxeBq197(UPDATED_REVENU_TAXE_BQ_197)
            .revenuNetBqGlobal198(UPDATED_REVENU_NET_BQ_GLOBAL_198)
            .revenuTaxeBqGlobal199(UPDATED_REVENU_TAXE_BQ_GLOBAL_199)
            .revenuNetExtra200(UPDATED_REVENU_NET_EXTRA_200)
            .revenuTaxeExtra201(UPDATED_REVENU_TAXE_EXTRA_201)
            .revenuNetExtraGlobal202(UPDATED_REVENU_NET_EXTRA_GLOBAL_202)
            .revenuTaxeExtraGlobal203(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_203)
            .revenuNetTotal204(UPDATED_REVENU_NET_TOTAL_204)
            .revenuTaxeTotal205(UPDATED_REVENU_TAXE_TOTAL_205)
            .revenuNetTotalGlobal206(UPDATED_REVENU_NET_TOTAL_GLOBAL_206)
            .revenuTaxeTotalGlobal207(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_207)
            .prodRevenuChambre208(UPDATED_PROD_REVENU_CHAMBRE_208)
            .prodRevenuBq209(UPDATED_PROD_REVENU_BQ_209)
            .prodRevenuExtra210(UPDATED_PROD_REVENU_EXTRA_210)
            .prodRevenuTotal211(UPDATED_PROD_REVENU_TOTAL_211)
            .prodChambreNbNuitees212(UPDATED_PROD_CHAMBRE_NB_NUITEES_212)
            .techCreateDate213(UPDATED_TECH_CREATE_DATE_213)
            .techUpdateDate214(UPDATED_TECH_UPDATE_DATE_214)
            .numLigne215(UPDATED_NUM_LIGNE_215)
            .resort216(UPDATED_RESORT_216)
            .resvNameId217(UPDATED_RESV_NAME_ID_217)
            .clientOId218(UPDATED_CLIENT_O_ID_218)
            .typeChb219(UPDATED_TYPE_CHB_219)
            .confirmationNo220(UPDATED_CONFIRMATION_NO_220)
            .clientMdmId221(UPDATED_CLIENT_MDM_ID_221)
            .nameId222(UPDATED_NAME_ID_222)
            .parentResvNameId223(UPDATED_PARENT_RESV_NAME_ID_223)
            .contactId224(UPDATED_CONTACT_ID_224)
            .agenceId225(UPDATED_AGENCE_ID_225)
            .agenceNom226(UPDATED_AGENCE_NOM_226)
            .societeId227(UPDATED_SOCIETE_ID_227)
            .groupeId228(UPDATED_GROUPE_ID_228)
            .numBloc229(UPDATED_NUM_BLOC_229)
            .typeResv230(UPDATED_TYPE_RESV_230)
            .statutResv231(UPDATED_STATUT_RESV_231)
            .dateDebutResv232(UPDATED_DATE_DEBUT_RESV_232)
            .dateFinResv233(UPDATED_DATE_FIN_RESV_233)
            .truncDateDebutResv234(UPDATED_TRUNC_DATE_DEBUT_RESV_234)
            .truncDateFinResv235(UPDATED_TRUNC_DATE_FIN_RESV_235)
            .dateAnnResv236(UPDATED_DATE_ANN_RESV_236)
            .pseudoRoomYn237(UPDATED_PSEUDO_ROOM_YN_237)
            .createurResv238(UPDATED_CREATEUR_RESV_238)
            .nomCreateurResv239(UPDATED_NOM_CREATEUR_RESV_239)
            .codeGarantie240(UPDATED_CODE_GARANTIE_240)
            .flgDed241(UPDATED_FLG_DED_241)
            .codePays242(UPDATED_CODE_PAYS_242)
            .libPays243(UPDATED_LIB_PAYS_243)
            .codeNationalite244(UPDATED_CODE_NATIONALITE_244)
            .libNationalite245(UPDATED_LIB_NATIONALITE_245)
            .codeSource246(UPDATED_CODE_SOURCE_246)
            .libSource247(UPDATED_LIB_SOURCE_247)
            .codeGrandSource248(UPDATED_CODE_GRAND_SOURCE_248)
            .codeOrigine249(UPDATED_CODE_ORIGINE_249)
            .libOrigine250(UPDATED_LIB_ORIGINE_250)
            .codeMarche251(UPDATED_CODE_MARCHE_251)
            .libMarche252(UPDATED_LIB_MARCHE_252)
            .codeGrandMarche253(UPDATED_CODE_GRAND_MARCHE_253)
            .libGrandMarche254(UPDATED_LIB_GRAND_MARCHE_254)
            .codePrix255(UPDATED_CODE_PRIX_255)
            .categPrix256(UPDATED_CATEG_PRIX_256)
            .libPrix257(UPDATED_LIB_PRIX_257)
            .numChb258(UPDATED_NUM_CHB_258)
            .descriptionTypeChb259(UPDATED_DESCRIPTION_TYPE_CHB_259)
            .codeTypeChb260(UPDATED_CODE_TYPE_CHB_260)
            .classChb261(UPDATED_CLASS_CHB_261)
            .caractChb262(UPDATED_CARACT_CHB_262)
            .typeChbDeReservation263(UPDATED_TYPE_CHB_DE_RESERVATION_263)
            .descriptionTypeChbDeResv264(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_264)
            .codeTypeChbDeResv265(UPDATED_CODE_TYPE_CHB_DE_RESV_265)
            .statutDeReservation266(UPDATED_STATUT_DE_RESERVATION_266)
            .circuitDistribution267(UPDATED_CIRCUIT_DISTRIBUTION_267)
            .circuitDistribUserRegroup268(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_268)
            .numCrs269(UPDATED_NUM_CRS_269)
            .typeRefCrs270(UPDATED_TYPE_REF_CRS_270)
            .crsInsertDate271(UPDATED_CRS_INSERT_DATE_271)
            .dateCreaResv272(UPDATED_DATE_CREA_RESV_272)
            .datePremier273(UPDATED_DATE_PREMIER_273)
            .statutPremier274(UPDATED_STATUT_PREMIER_274)
            .dateDernier275(UPDATED_DATE_DERNIER_275)
            .statutDernier276(UPDATED_STATUT_DERNIER_276)
            .dateDernierPseudo277(UPDATED_DATE_DERNIER_PSEUDO_277)
            .statutDernierPseudo278(UPDATED_STATUT_DERNIER_PSEUDO_278)
            .diffDtCreaAnn279(UPDATED_DIFF_DT_CREA_ANN_279)
            .diffDtArrAnn280(UPDATED_DIFF_DT_ARR_ANN_280)
            .leadtime281(UPDATED_LEADTIME_281)
            .los282(UPDATED_LOS_282)
            .occupantsGroupe283(UPDATED_OCCUPANTS_GROUPE_283)
            .nbNuitee284(UPDATED_NB_NUITEE_284)
            .nbNuiteeNnDed285(UPDATED_NB_NUITEE_NN_DED_285)
            .nbResvAnn286(UPDATED_NB_RESV_ANN_286)
            .nbAdu287(UPDATED_NB_ADU_287)
            .nbEnf288(UPDATED_NB_ENF_288)
            .nbPersDayU289(UPDATED_NB_PERS_DAY_U_289)
            .nbPersArr290(UPDATED_NB_PERS_ARR_290)
            .nbPersDep291(UPDATED_NB_PERS_DEP_291)
            .nbPersAnn292(UPDATED_NB_PERS_ANN_292)
            .nbPersNoshow293(UPDATED_NB_PERS_NOSHOW_293)
            .nbChbDayU294(UPDATED_NB_CHB_DAY_U_294)
            .nbChbArr295(UPDATED_NB_CHB_ARR_295)
            .nbChbDep296(UPDATED_NB_CHB_DEP_296)
            .nbChbAnn297(UPDATED_NB_CHB_ANN_297)
            .nbChbNoshow298(UPDATED_NB_CHB_NOSHOW_298)
            .revenuNetChambre299(UPDATED_REVENU_NET_CHAMBRE_299)
            .revenuTaxeChambre300(UPDATED_REVENU_TAXE_CHAMBRE_300)
            .revenuNetChambreGlobal301(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_301)
            .revenuTaxeChambreGlobal302(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_302)
            .revenuNetBq303(UPDATED_REVENU_NET_BQ_303)
            .revenuTaxeBq304(UPDATED_REVENU_TAXE_BQ_304)
            .revenuNetBqGlobal305(UPDATED_REVENU_NET_BQ_GLOBAL_305)
            .revenuTaxeBqGlobal306(UPDATED_REVENU_TAXE_BQ_GLOBAL_306)
            .revenuNetExtra307(UPDATED_REVENU_NET_EXTRA_307)
            .revenuTaxeExtra308(UPDATED_REVENU_TAXE_EXTRA_308)
            .revenuNetExtraGlobal309(UPDATED_REVENU_NET_EXTRA_GLOBAL_309)
            .revenuTaxeExtraGlobal310(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_310);

        restTable2MockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedTable2.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(om.writeValueAsBytes(updatedTable2))
            )
            .andExpect(status().isOk());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
        assertPersistedTable2ToMatchAllProperties(updatedTable2);
    }

    @Test
    @Transactional
    void putNonExistingTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(put(ENTITY_API_URL_ID, table2.getId()).contentType(MediaType.APPLICATION_JSON).content(om.writeValueAsBytes(table2)))
            .andExpect(status().isBadRequest());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(
                put(ENTITY_API_URL_ID, longCount.incrementAndGet())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(om.writeValueAsBytes(table2))
            )
            .andExpect(status().isBadRequest());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(om.writeValueAsBytes(table2)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateTable2WithPatch() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        long databaseSizeBeforeUpdate = getRepositoryCount();

        // Update the table2 using partial update
        Table2 partialUpdatedTable2 = new Table2();
        partialUpdatedTable2.setId(table2.getId());

        partialUpdatedTable2
            .numLigne1(UPDATED_NUM_LIGNE_1)
            .resort2(UPDATED_RESORT_2)
            .resvNameId3(UPDATED_RESV_NAME_ID_3)
            .clientOId4(UPDATED_CLIENT_O_ID_4)
            .typeChb5(UPDATED_TYPE_CHB_5)
            .clientMdmId7(UPDATED_CLIENT_MDM_ID_7)
            .nameId8(UPDATED_NAME_ID_8)
            .parentResvNameId9(UPDATED_PARENT_RESV_NAME_ID_9)
            .contactId10(UPDATED_CONTACT_ID_10)
            .agenceId11(UPDATED_AGENCE_ID_11)
            .societeId13(UPDATED_SOCIETE_ID_13)
            .numBloc15(UPDATED_NUM_BLOC_15)
            .typeResv16(UPDATED_TYPE_RESV_16)
            .statutResv17(UPDATED_STATUT_RESV_17)
            .dateFinResv19(UPDATED_DATE_FIN_RESV_19)
            .truncDateFinResv21(UPDATED_TRUNC_DATE_FIN_RESV_21)
            .dateAnnResv22(UPDATED_DATE_ANN_RESV_22)
            .pseudoRoomYn23(UPDATED_PSEUDO_ROOM_YN_23)
            .codeGarantie26(UPDATED_CODE_GARANTIE_26)
            .flgDed27(UPDATED_FLG_DED_27)
            .libNationalite31(UPDATED_LIB_NATIONALITE_31)
            .codeGrandSource34(UPDATED_CODE_GRAND_SOURCE_34)
            .libMarche38(UPDATED_LIB_MARCHE_38)
            .libGrandMarche40(UPDATED_LIB_GRAND_MARCHE_40)
            .codePrix41(UPDATED_CODE_PRIX_41)
            .libPrix43(UPDATED_LIB_PRIX_43)
            .numChb44(UPDATED_NUM_CHB_44)
            .descriptionTypeChb45(UPDATED_DESCRIPTION_TYPE_CHB_45)
            .codeTypeChb46(UPDATED_CODE_TYPE_CHB_46)
            .caractChb48(UPDATED_CARACT_CHB_48)
            .descriptionTypeChbDeResv50(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_50)
            .statutDeReservation52(UPDATED_STATUT_DE_RESERVATION_52)
            .circuitDistribution53(UPDATED_CIRCUIT_DISTRIBUTION_53)
            .typeRefCrs56(UPDATED_TYPE_REF_CRS_56)
            .crsInsertDate57(UPDATED_CRS_INSERT_DATE_57)
            .dateCreaResv58(UPDATED_DATE_CREA_RESV_58)
            .datePremier59(UPDATED_DATE_PREMIER_59)
            .statutPremier60(UPDATED_STATUT_PREMIER_60)
            .dateDernier61(UPDATED_DATE_DERNIER_61)
            .statutDernier62(UPDATED_STATUT_DERNIER_62)
            .diffDtCreaAnn65(UPDATED_DIFF_DT_CREA_ANN_65)
            .diffDtArrAnn66(UPDATED_DIFF_DT_ARR_ANN_66)
            .leadtime67(UPDATED_LEADTIME_67)
            .los68(UPDATED_LOS_68)
            .nbNuitee70(UPDATED_NB_NUITEE_70)
            .nbNuiteeNnDed71(UPDATED_NB_NUITEE_NN_DED_71)
            .nbAdu73(UPDATED_NB_ADU_73)
            .nbEnf74(UPDATED_NB_ENF_74)
            .nbPersDep77(UPDATED_NB_PERS_DEP_77)
            .nbPersAnn78(UPDATED_NB_PERS_ANN_78)
            .nbPersNoshow79(UPDATED_NB_PERS_NOSHOW_79)
            .nbChbDep82(UPDATED_NB_CHB_DEP_82)
            .nbChbAnn83(UPDATED_NB_CHB_ANN_83)
            .nbChbNoshow84(UPDATED_NB_CHB_NOSHOW_84)
            .revenuTaxeBq90(UPDATED_REVENU_TAXE_BQ_90)
            .revenuNetBqGlobal91(UPDATED_REVENU_NET_BQ_GLOBAL_91)
            .revenuTaxeBqGlobal92(UPDATED_REVENU_TAXE_BQ_GLOBAL_92)
            .revenuTaxeExtraGlobal96(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_96)
            .revenuNetTotalGlobal99(UPDATED_REVENU_NET_TOTAL_GLOBAL_99)
            .revenuTaxeTotalGlobal100(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_100)
            .prodRevenuBq102(UPDATED_PROD_REVENU_BQ_102)
            .prodRevenuExtra103(UPDATED_PROD_REVENU_EXTRA_103)
            .prodRevenuTotal104(UPDATED_PROD_REVENU_TOTAL_104)
            .techCreateDate106(UPDATED_TECH_CREATE_DATE_106)
            .resort109(UPDATED_RESORT_109)
            .resvNameId110(UPDATED_RESV_NAME_ID_110)
            .confirmationNo113(UPDATED_CONFIRMATION_NO_113)
            .clientMdmId114(UPDATED_CLIENT_MDM_ID_114)
            .nameId115(UPDATED_NAME_ID_115)
            .parentResvNameId116(UPDATED_PARENT_RESV_NAME_ID_116)
            .contactId117(UPDATED_CONTACT_ID_117)
            .groupeId121(UPDATED_GROUPE_ID_121)
            .numBloc122(UPDATED_NUM_BLOC_122)
            .typeResv123(UPDATED_TYPE_RESV_123)
            .dateDebutResv125(UPDATED_DATE_DEBUT_RESV_125)
            .pseudoRoomYn130(UPDATED_PSEUDO_ROOM_YN_130)
            .createurResv131(UPDATED_CREATEUR_RESV_131)
            .libNationalite138(UPDATED_LIB_NATIONALITE_138)
            .codeSource139(UPDATED_CODE_SOURCE_139)
            .libSource140(UPDATED_LIB_SOURCE_140)
            .codeGrandSource141(UPDATED_CODE_GRAND_SOURCE_141)
            .codeOrigine142(UPDATED_CODE_ORIGINE_142)
            .libOrigine143(UPDATED_LIB_ORIGINE_143)
            .categPrix149(UPDATED_CATEG_PRIX_149)
            .numChb151(UPDATED_NUM_CHB_151)
            .descriptionTypeChb152(UPDATED_DESCRIPTION_TYPE_CHB_152)
            .codeTypeChb153(UPDATED_CODE_TYPE_CHB_153)
            .classChb154(UPDATED_CLASS_CHB_154)
            .typeChbDeReservation156(UPDATED_TYPE_CHB_DE_RESERVATION_156)
            .descriptionTypeChbDeResv157(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_157)
            .statutDeReservation159(UPDATED_STATUT_DE_RESERVATION_159)
            .typeRefCrs163(UPDATED_TYPE_REF_CRS_163)
            .statutPremier167(UPDATED_STATUT_PREMIER_167)
            .dateDernier168(UPDATED_DATE_DERNIER_168)
            .dateDernierPseudo170(UPDATED_DATE_DERNIER_PSEUDO_170)
            .diffDtArrAnn173(UPDATED_DIFF_DT_ARR_ANN_173)
            .leadtime174(UPDATED_LEADTIME_174)
            .occupantsGroupe176(UPDATED_OCCUPANTS_GROUPE_176)
            .nbNuiteeNnDed178(UPDATED_NB_NUITEE_NN_DED_178)
            .nbResvAnn179(UPDATED_NB_RESV_ANN_179)
            .nbAdu180(UPDATED_NB_ADU_180)
            .nbPersArr183(UPDATED_NB_PERS_ARR_183)
            .nbPersDep184(UPDATED_NB_PERS_DEP_184)
            .nbChbDayU187(UPDATED_NB_CHB_DAY_U_187)
            .nbChbArr188(UPDATED_NB_CHB_ARR_188)
            .revenuNetChambre192(UPDATED_REVENU_NET_CHAMBRE_192)
            .revenuTaxeChambre193(UPDATED_REVENU_TAXE_CHAMBRE_193)
            .revenuNetChambreGlobal194(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_194)
            .revenuTaxeChambreGlobal195(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_195)
            .revenuTaxeBqGlobal199(UPDATED_REVENU_TAXE_BQ_GLOBAL_199)
            .revenuNetExtra200(UPDATED_REVENU_NET_EXTRA_200)
            .revenuTaxeExtra201(UPDATED_REVENU_TAXE_EXTRA_201)
            .revenuNetTotal204(UPDATED_REVENU_NET_TOTAL_204)
            .prodRevenuExtra210(UPDATED_PROD_REVENU_EXTRA_210)
            .prodChambreNbNuitees212(UPDATED_PROD_CHAMBRE_NB_NUITEES_212)
            .techCreateDate213(UPDATED_TECH_CREATE_DATE_213)
            .typeChb219(UPDATED_TYPE_CHB_219)
            .confirmationNo220(UPDATED_CONFIRMATION_NO_220)
            .clientMdmId221(UPDATED_CLIENT_MDM_ID_221)
            .parentResvNameId223(UPDATED_PARENT_RESV_NAME_ID_223)
            .agenceId225(UPDATED_AGENCE_ID_225)
            .societeId227(UPDATED_SOCIETE_ID_227)
            .pseudoRoomYn237(UPDATED_PSEUDO_ROOM_YN_237)
            .nomCreateurResv239(UPDATED_NOM_CREATEUR_RESV_239)
            .flgDed241(UPDATED_FLG_DED_241)
            .libNationalite245(UPDATED_LIB_NATIONALITE_245)
            .codeGrandSource248(UPDATED_CODE_GRAND_SOURCE_248)
            .libOrigine250(UPDATED_LIB_ORIGINE_250)
            .libGrandMarche254(UPDATED_LIB_GRAND_MARCHE_254)
            .codePrix255(UPDATED_CODE_PRIX_255)
            .libPrix257(UPDATED_LIB_PRIX_257)
            .codeTypeChb260(UPDATED_CODE_TYPE_CHB_260)
            .caractChb262(UPDATED_CARACT_CHB_262)
            .codeTypeChbDeResv265(UPDATED_CODE_TYPE_CHB_DE_RESV_265)
            .circuitDistribution267(UPDATED_CIRCUIT_DISTRIBUTION_267)
            .circuitDistribUserRegroup268(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_268)
            .statutDernier276(UPDATED_STATUT_DERNIER_276)
            .statutDernierPseudo278(UPDATED_STATUT_DERNIER_PSEUDO_278)
            .diffDtArrAnn280(UPDATED_DIFF_DT_ARR_ANN_280)
            .nbNuitee284(UPDATED_NB_NUITEE_284)
            .nbResvAnn286(UPDATED_NB_RESV_ANN_286)
            .nbEnf288(UPDATED_NB_ENF_288)
            .nbPersDayU289(UPDATED_NB_PERS_DAY_U_289)
            .nbPersAnn292(UPDATED_NB_PERS_ANN_292)
            .nbChbDayU294(UPDATED_NB_CHB_DAY_U_294)
            .nbChbArr295(UPDATED_NB_CHB_ARR_295)
            .nbChbDep296(UPDATED_NB_CHB_DEP_296)
            .revenuTaxeChambre300(UPDATED_REVENU_TAXE_CHAMBRE_300)
            .revenuTaxeChambreGlobal302(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_302)
            .revenuNetBq303(UPDATED_REVENU_NET_BQ_303)
            .revenuTaxeBqGlobal306(UPDATED_REVENU_TAXE_BQ_GLOBAL_306)
            .revenuTaxeExtra308(UPDATED_REVENU_TAXE_EXTRA_308)
            .revenuNetExtraGlobal309(UPDATED_REVENU_NET_EXTRA_GLOBAL_309);

        restTable2MockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedTable2.getId())
                    .contentType("application/merge-patch+json")
                    .content(om.writeValueAsBytes(partialUpdatedTable2))
            )
            .andExpect(status().isOk());

        // Validate the Table2 in the database

        assertSameRepositoryCount(databaseSizeBeforeUpdate);
        assertTable2UpdatableFieldsEquals(createUpdateProxyForBean(partialUpdatedTable2, table2), getPersistedTable2(table2));
    }

    @Test
    @Transactional
    void fullUpdateTable2WithPatch() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        long databaseSizeBeforeUpdate = getRepositoryCount();

        // Update the table2 using partial update
        Table2 partialUpdatedTable2 = new Table2();
        partialUpdatedTable2.setId(table2.getId());

        partialUpdatedTable2
            .numLigne1(UPDATED_NUM_LIGNE_1)
            .resort2(UPDATED_RESORT_2)
            .resvNameId3(UPDATED_RESV_NAME_ID_3)
            .clientOId4(UPDATED_CLIENT_O_ID_4)
            .typeChb5(UPDATED_TYPE_CHB_5)
            .confirmationNo6(UPDATED_CONFIRMATION_NO_6)
            .clientMdmId7(UPDATED_CLIENT_MDM_ID_7)
            .nameId8(UPDATED_NAME_ID_8)
            .parentResvNameId9(UPDATED_PARENT_RESV_NAME_ID_9)
            .contactId10(UPDATED_CONTACT_ID_10)
            .agenceId11(UPDATED_AGENCE_ID_11)
            .agenceNom12(UPDATED_AGENCE_NOM_12)
            .societeId13(UPDATED_SOCIETE_ID_13)
            .groupeId14(UPDATED_GROUPE_ID_14)
            .numBloc15(UPDATED_NUM_BLOC_15)
            .typeResv16(UPDATED_TYPE_RESV_16)
            .statutResv17(UPDATED_STATUT_RESV_17)
            .dateDebutResv18(UPDATED_DATE_DEBUT_RESV_18)
            .dateFinResv19(UPDATED_DATE_FIN_RESV_19)
            .truncDateDebutResv20(UPDATED_TRUNC_DATE_DEBUT_RESV_20)
            .truncDateFinResv21(UPDATED_TRUNC_DATE_FIN_RESV_21)
            .dateAnnResv22(UPDATED_DATE_ANN_RESV_22)
            .pseudoRoomYn23(UPDATED_PSEUDO_ROOM_YN_23)
            .createurResv24(UPDATED_CREATEUR_RESV_24)
            .nomCreateurResv25(UPDATED_NOM_CREATEUR_RESV_25)
            .codeGarantie26(UPDATED_CODE_GARANTIE_26)
            .flgDed27(UPDATED_FLG_DED_27)
            .codePays28(UPDATED_CODE_PAYS_28)
            .libPays29(UPDATED_LIB_PAYS_29)
            .codeNationalite30(UPDATED_CODE_NATIONALITE_30)
            .libNationalite31(UPDATED_LIB_NATIONALITE_31)
            .codeSource32(UPDATED_CODE_SOURCE_32)
            .libSource33(UPDATED_LIB_SOURCE_33)
            .codeGrandSource34(UPDATED_CODE_GRAND_SOURCE_34)
            .codeOrigine35(UPDATED_CODE_ORIGINE_35)
            .libOrigine36(UPDATED_LIB_ORIGINE_36)
            .codeMarche37(UPDATED_CODE_MARCHE_37)
            .libMarche38(UPDATED_LIB_MARCHE_38)
            .codeGrandMarche39(UPDATED_CODE_GRAND_MARCHE_39)
            .libGrandMarche40(UPDATED_LIB_GRAND_MARCHE_40)
            .codePrix41(UPDATED_CODE_PRIX_41)
            .categPrix42(UPDATED_CATEG_PRIX_42)
            .libPrix43(UPDATED_LIB_PRIX_43)
            .numChb44(UPDATED_NUM_CHB_44)
            .descriptionTypeChb45(UPDATED_DESCRIPTION_TYPE_CHB_45)
            .codeTypeChb46(UPDATED_CODE_TYPE_CHB_46)
            .classChb47(UPDATED_CLASS_CHB_47)
            .caractChb48(UPDATED_CARACT_CHB_48)
            .typeChbDeReservation49(UPDATED_TYPE_CHB_DE_RESERVATION_49)
            .descriptionTypeChbDeResv50(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_50)
            .codeTypeChbDeResv51(UPDATED_CODE_TYPE_CHB_DE_RESV_51)
            .statutDeReservation52(UPDATED_STATUT_DE_RESERVATION_52)
            .circuitDistribution53(UPDATED_CIRCUIT_DISTRIBUTION_53)
            .circuitDistribUserRegroup54(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_54)
            .numCrs55(UPDATED_NUM_CRS_55)
            .typeRefCrs56(UPDATED_TYPE_REF_CRS_56)
            .crsInsertDate57(UPDATED_CRS_INSERT_DATE_57)
            .dateCreaResv58(UPDATED_DATE_CREA_RESV_58)
            .datePremier59(UPDATED_DATE_PREMIER_59)
            .statutPremier60(UPDATED_STATUT_PREMIER_60)
            .dateDernier61(UPDATED_DATE_DERNIER_61)
            .statutDernier62(UPDATED_STATUT_DERNIER_62)
            .dateDernierPseudo63(UPDATED_DATE_DERNIER_PSEUDO_63)
            .statutDernierPseudo64(UPDATED_STATUT_DERNIER_PSEUDO_64)
            .diffDtCreaAnn65(UPDATED_DIFF_DT_CREA_ANN_65)
            .diffDtArrAnn66(UPDATED_DIFF_DT_ARR_ANN_66)
            .leadtime67(UPDATED_LEADTIME_67)
            .los68(UPDATED_LOS_68)
            .occupantsGroupe69(UPDATED_OCCUPANTS_GROUPE_69)
            .nbNuitee70(UPDATED_NB_NUITEE_70)
            .nbNuiteeNnDed71(UPDATED_NB_NUITEE_NN_DED_71)
            .nbResvAnn72(UPDATED_NB_RESV_ANN_72)
            .nbAdu73(UPDATED_NB_ADU_73)
            .nbEnf74(UPDATED_NB_ENF_74)
            .nbPersDayU75(UPDATED_NB_PERS_DAY_U_75)
            .nbPersArr76(UPDATED_NB_PERS_ARR_76)
            .nbPersDep77(UPDATED_NB_PERS_DEP_77)
            .nbPersAnn78(UPDATED_NB_PERS_ANN_78)
            .nbPersNoshow79(UPDATED_NB_PERS_NOSHOW_79)
            .nbChbDayU80(UPDATED_NB_CHB_DAY_U_80)
            .nbChbArr81(UPDATED_NB_CHB_ARR_81)
            .nbChbDep82(UPDATED_NB_CHB_DEP_82)
            .nbChbAnn83(UPDATED_NB_CHB_ANN_83)
            .nbChbNoshow84(UPDATED_NB_CHB_NOSHOW_84)
            .revenuNetChambre85(UPDATED_REVENU_NET_CHAMBRE_85)
            .revenuTaxeChambre86(UPDATED_REVENU_TAXE_CHAMBRE_86)
            .revenuNetChambreGlobal87(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_87)
            .revenuTaxeChambreGlobal88(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_88)
            .revenuNetBq89(UPDATED_REVENU_NET_BQ_89)
            .revenuTaxeBq90(UPDATED_REVENU_TAXE_BQ_90)
            .revenuNetBqGlobal91(UPDATED_REVENU_NET_BQ_GLOBAL_91)
            .revenuTaxeBqGlobal92(UPDATED_REVENU_TAXE_BQ_GLOBAL_92)
            .revenuNetExtra93(UPDATED_REVENU_NET_EXTRA_93)
            .revenuTaxeExtra94(UPDATED_REVENU_TAXE_EXTRA_94)
            .revenuNetExtraGlobal95(UPDATED_REVENU_NET_EXTRA_GLOBAL_95)
            .revenuTaxeExtraGlobal96(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_96)
            .revenuNetTotal97(UPDATED_REVENU_NET_TOTAL_97)
            .revenuTaxeTotal98(UPDATED_REVENU_TAXE_TOTAL_98)
            .revenuNetTotalGlobal99(UPDATED_REVENU_NET_TOTAL_GLOBAL_99)
            .revenuTaxeTotalGlobal100(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_100)
            .prodRevenuChambre101(UPDATED_PROD_REVENU_CHAMBRE_101)
            .prodRevenuBq102(UPDATED_PROD_REVENU_BQ_102)
            .prodRevenuExtra103(UPDATED_PROD_REVENU_EXTRA_103)
            .prodRevenuTotal104(UPDATED_PROD_REVENU_TOTAL_104)
            .prodChambreNbNuitees105(UPDATED_PROD_CHAMBRE_NB_NUITEES_105)
            .techCreateDate106(UPDATED_TECH_CREATE_DATE_106)
            .techUpdateDate107(UPDATED_TECH_UPDATE_DATE_107)
            .numLigne108(UPDATED_NUM_LIGNE_108)
            .resort109(UPDATED_RESORT_109)
            .resvNameId110(UPDATED_RESV_NAME_ID_110)
            .clientOId111(UPDATED_CLIENT_O_ID_111)
            .typeChb112(UPDATED_TYPE_CHB_112)
            .confirmationNo113(UPDATED_CONFIRMATION_NO_113)
            .clientMdmId114(UPDATED_CLIENT_MDM_ID_114)
            .nameId115(UPDATED_NAME_ID_115)
            .parentResvNameId116(UPDATED_PARENT_RESV_NAME_ID_116)
            .contactId117(UPDATED_CONTACT_ID_117)
            .agenceId118(UPDATED_AGENCE_ID_118)
            .agenceNom119(UPDATED_AGENCE_NOM_119)
            .societeId120(UPDATED_SOCIETE_ID_120)
            .groupeId121(UPDATED_GROUPE_ID_121)
            .numBloc122(UPDATED_NUM_BLOC_122)
            .typeResv123(UPDATED_TYPE_RESV_123)
            .statutResv124(UPDATED_STATUT_RESV_124)
            .dateDebutResv125(UPDATED_DATE_DEBUT_RESV_125)
            .dateFinResv126(UPDATED_DATE_FIN_RESV_126)
            .truncDateDebutResv127(UPDATED_TRUNC_DATE_DEBUT_RESV_127)
            .truncDateFinResv128(UPDATED_TRUNC_DATE_FIN_RESV_128)
            .dateAnnResv129(UPDATED_DATE_ANN_RESV_129)
            .pseudoRoomYn130(UPDATED_PSEUDO_ROOM_YN_130)
            .createurResv131(UPDATED_CREATEUR_RESV_131)
            .nomCreateurResv132(UPDATED_NOM_CREATEUR_RESV_132)
            .codeGarantie133(UPDATED_CODE_GARANTIE_133)
            .flgDed134(UPDATED_FLG_DED_134)
            .codePays135(UPDATED_CODE_PAYS_135)
            .libPays136(UPDATED_LIB_PAYS_136)
            .codeNationalite137(UPDATED_CODE_NATIONALITE_137)
            .libNationalite138(UPDATED_LIB_NATIONALITE_138)
            .codeSource139(UPDATED_CODE_SOURCE_139)
            .libSource140(UPDATED_LIB_SOURCE_140)
            .codeGrandSource141(UPDATED_CODE_GRAND_SOURCE_141)
            .codeOrigine142(UPDATED_CODE_ORIGINE_142)
            .libOrigine143(UPDATED_LIB_ORIGINE_143)
            .codeMarche144(UPDATED_CODE_MARCHE_144)
            .libMarche145(UPDATED_LIB_MARCHE_145)
            .codeGrandMarche146(UPDATED_CODE_GRAND_MARCHE_146)
            .libGrandMarche147(UPDATED_LIB_GRAND_MARCHE_147)
            .codePrix148(UPDATED_CODE_PRIX_148)
            .categPrix149(UPDATED_CATEG_PRIX_149)
            .libPrix150(UPDATED_LIB_PRIX_150)
            .numChb151(UPDATED_NUM_CHB_151)
            .descriptionTypeChb152(UPDATED_DESCRIPTION_TYPE_CHB_152)
            .codeTypeChb153(UPDATED_CODE_TYPE_CHB_153)
            .classChb154(UPDATED_CLASS_CHB_154)
            .caractChb155(UPDATED_CARACT_CHB_155)
            .typeChbDeReservation156(UPDATED_TYPE_CHB_DE_RESERVATION_156)
            .descriptionTypeChbDeResv157(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_157)
            .codeTypeChbDeResv158(UPDATED_CODE_TYPE_CHB_DE_RESV_158)
            .statutDeReservation159(UPDATED_STATUT_DE_RESERVATION_159)
            .circuitDistribution160(UPDATED_CIRCUIT_DISTRIBUTION_160)
            .circuitDistribUserRegroup161(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_161)
            .numCrs162(UPDATED_NUM_CRS_162)
            .typeRefCrs163(UPDATED_TYPE_REF_CRS_163)
            .crsInsertDate164(UPDATED_CRS_INSERT_DATE_164)
            .dateCreaResv165(UPDATED_DATE_CREA_RESV_165)
            .datePremier166(UPDATED_DATE_PREMIER_166)
            .statutPremier167(UPDATED_STATUT_PREMIER_167)
            .dateDernier168(UPDATED_DATE_DERNIER_168)
            .statutDernier169(UPDATED_STATUT_DERNIER_169)
            .dateDernierPseudo170(UPDATED_DATE_DERNIER_PSEUDO_170)
            .statutDernierPseudo171(UPDATED_STATUT_DERNIER_PSEUDO_171)
            .diffDtCreaAnn172(UPDATED_DIFF_DT_CREA_ANN_172)
            .diffDtArrAnn173(UPDATED_DIFF_DT_ARR_ANN_173)
            .leadtime174(UPDATED_LEADTIME_174)
            .los175(UPDATED_LOS_175)
            .occupantsGroupe176(UPDATED_OCCUPANTS_GROUPE_176)
            .nbNuitee177(UPDATED_NB_NUITEE_177)
            .nbNuiteeNnDed178(UPDATED_NB_NUITEE_NN_DED_178)
            .nbResvAnn179(UPDATED_NB_RESV_ANN_179)
            .nbAdu180(UPDATED_NB_ADU_180)
            .nbEnf181(UPDATED_NB_ENF_181)
            .nbPersDayU182(UPDATED_NB_PERS_DAY_U_182)
            .nbPersArr183(UPDATED_NB_PERS_ARR_183)
            .nbPersDep184(UPDATED_NB_PERS_DEP_184)
            .nbPersAnn185(UPDATED_NB_PERS_ANN_185)
            .nbPersNoshow186(UPDATED_NB_PERS_NOSHOW_186)
            .nbChbDayU187(UPDATED_NB_CHB_DAY_U_187)
            .nbChbArr188(UPDATED_NB_CHB_ARR_188)
            .nbChbDep189(UPDATED_NB_CHB_DEP_189)
            .nbChbAnn190(UPDATED_NB_CHB_ANN_190)
            .nbChbNoshow191(UPDATED_NB_CHB_NOSHOW_191)
            .revenuNetChambre192(UPDATED_REVENU_NET_CHAMBRE_192)
            .revenuTaxeChambre193(UPDATED_REVENU_TAXE_CHAMBRE_193)
            .revenuNetChambreGlobal194(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_194)
            .revenuTaxeChambreGlobal195(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_195)
            .revenuNetBq196(UPDATED_REVENU_NET_BQ_196)
            .revenuTaxeBq197(UPDATED_REVENU_TAXE_BQ_197)
            .revenuNetBqGlobal198(UPDATED_REVENU_NET_BQ_GLOBAL_198)
            .revenuTaxeBqGlobal199(UPDATED_REVENU_TAXE_BQ_GLOBAL_199)
            .revenuNetExtra200(UPDATED_REVENU_NET_EXTRA_200)
            .revenuTaxeExtra201(UPDATED_REVENU_TAXE_EXTRA_201)
            .revenuNetExtraGlobal202(UPDATED_REVENU_NET_EXTRA_GLOBAL_202)
            .revenuTaxeExtraGlobal203(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_203)
            .revenuNetTotal204(UPDATED_REVENU_NET_TOTAL_204)
            .revenuTaxeTotal205(UPDATED_REVENU_TAXE_TOTAL_205)
            .revenuNetTotalGlobal206(UPDATED_REVENU_NET_TOTAL_GLOBAL_206)
            .revenuTaxeTotalGlobal207(UPDATED_REVENU_TAXE_TOTAL_GLOBAL_207)
            .prodRevenuChambre208(UPDATED_PROD_REVENU_CHAMBRE_208)
            .prodRevenuBq209(UPDATED_PROD_REVENU_BQ_209)
            .prodRevenuExtra210(UPDATED_PROD_REVENU_EXTRA_210)
            .prodRevenuTotal211(UPDATED_PROD_REVENU_TOTAL_211)
            .prodChambreNbNuitees212(UPDATED_PROD_CHAMBRE_NB_NUITEES_212)
            .techCreateDate213(UPDATED_TECH_CREATE_DATE_213)
            .techUpdateDate214(UPDATED_TECH_UPDATE_DATE_214)
            .numLigne215(UPDATED_NUM_LIGNE_215)
            .resort216(UPDATED_RESORT_216)
            .resvNameId217(UPDATED_RESV_NAME_ID_217)
            .clientOId218(UPDATED_CLIENT_O_ID_218)
            .typeChb219(UPDATED_TYPE_CHB_219)
            .confirmationNo220(UPDATED_CONFIRMATION_NO_220)
            .clientMdmId221(UPDATED_CLIENT_MDM_ID_221)
            .nameId222(UPDATED_NAME_ID_222)
            .parentResvNameId223(UPDATED_PARENT_RESV_NAME_ID_223)
            .contactId224(UPDATED_CONTACT_ID_224)
            .agenceId225(UPDATED_AGENCE_ID_225)
            .agenceNom226(UPDATED_AGENCE_NOM_226)
            .societeId227(UPDATED_SOCIETE_ID_227)
            .groupeId228(UPDATED_GROUPE_ID_228)
            .numBloc229(UPDATED_NUM_BLOC_229)
            .typeResv230(UPDATED_TYPE_RESV_230)
            .statutResv231(UPDATED_STATUT_RESV_231)
            .dateDebutResv232(UPDATED_DATE_DEBUT_RESV_232)
            .dateFinResv233(UPDATED_DATE_FIN_RESV_233)
            .truncDateDebutResv234(UPDATED_TRUNC_DATE_DEBUT_RESV_234)
            .truncDateFinResv235(UPDATED_TRUNC_DATE_FIN_RESV_235)
            .dateAnnResv236(UPDATED_DATE_ANN_RESV_236)
            .pseudoRoomYn237(UPDATED_PSEUDO_ROOM_YN_237)
            .createurResv238(UPDATED_CREATEUR_RESV_238)
            .nomCreateurResv239(UPDATED_NOM_CREATEUR_RESV_239)
            .codeGarantie240(UPDATED_CODE_GARANTIE_240)
            .flgDed241(UPDATED_FLG_DED_241)
            .codePays242(UPDATED_CODE_PAYS_242)
            .libPays243(UPDATED_LIB_PAYS_243)
            .codeNationalite244(UPDATED_CODE_NATIONALITE_244)
            .libNationalite245(UPDATED_LIB_NATIONALITE_245)
            .codeSource246(UPDATED_CODE_SOURCE_246)
            .libSource247(UPDATED_LIB_SOURCE_247)
            .codeGrandSource248(UPDATED_CODE_GRAND_SOURCE_248)
            .codeOrigine249(UPDATED_CODE_ORIGINE_249)
            .libOrigine250(UPDATED_LIB_ORIGINE_250)
            .codeMarche251(UPDATED_CODE_MARCHE_251)
            .libMarche252(UPDATED_LIB_MARCHE_252)
            .codeGrandMarche253(UPDATED_CODE_GRAND_MARCHE_253)
            .libGrandMarche254(UPDATED_LIB_GRAND_MARCHE_254)
            .codePrix255(UPDATED_CODE_PRIX_255)
            .categPrix256(UPDATED_CATEG_PRIX_256)
            .libPrix257(UPDATED_LIB_PRIX_257)
            .numChb258(UPDATED_NUM_CHB_258)
            .descriptionTypeChb259(UPDATED_DESCRIPTION_TYPE_CHB_259)
            .codeTypeChb260(UPDATED_CODE_TYPE_CHB_260)
            .classChb261(UPDATED_CLASS_CHB_261)
            .caractChb262(UPDATED_CARACT_CHB_262)
            .typeChbDeReservation263(UPDATED_TYPE_CHB_DE_RESERVATION_263)
            .descriptionTypeChbDeResv264(UPDATED_DESCRIPTION_TYPE_CHB_DE_RESV_264)
            .codeTypeChbDeResv265(UPDATED_CODE_TYPE_CHB_DE_RESV_265)
            .statutDeReservation266(UPDATED_STATUT_DE_RESERVATION_266)
            .circuitDistribution267(UPDATED_CIRCUIT_DISTRIBUTION_267)
            .circuitDistribUserRegroup268(UPDATED_CIRCUIT_DISTRIB_USER_REGROUP_268)
            .numCrs269(UPDATED_NUM_CRS_269)
            .typeRefCrs270(UPDATED_TYPE_REF_CRS_270)
            .crsInsertDate271(UPDATED_CRS_INSERT_DATE_271)
            .dateCreaResv272(UPDATED_DATE_CREA_RESV_272)
            .datePremier273(UPDATED_DATE_PREMIER_273)
            .statutPremier274(UPDATED_STATUT_PREMIER_274)
            .dateDernier275(UPDATED_DATE_DERNIER_275)
            .statutDernier276(UPDATED_STATUT_DERNIER_276)
            .dateDernierPseudo277(UPDATED_DATE_DERNIER_PSEUDO_277)
            .statutDernierPseudo278(UPDATED_STATUT_DERNIER_PSEUDO_278)
            .diffDtCreaAnn279(UPDATED_DIFF_DT_CREA_ANN_279)
            .diffDtArrAnn280(UPDATED_DIFF_DT_ARR_ANN_280)
            .leadtime281(UPDATED_LEADTIME_281)
            .los282(UPDATED_LOS_282)
            .occupantsGroupe283(UPDATED_OCCUPANTS_GROUPE_283)
            .nbNuitee284(UPDATED_NB_NUITEE_284)
            .nbNuiteeNnDed285(UPDATED_NB_NUITEE_NN_DED_285)
            .nbResvAnn286(UPDATED_NB_RESV_ANN_286)
            .nbAdu287(UPDATED_NB_ADU_287)
            .nbEnf288(UPDATED_NB_ENF_288)
            .nbPersDayU289(UPDATED_NB_PERS_DAY_U_289)
            .nbPersArr290(UPDATED_NB_PERS_ARR_290)
            .nbPersDep291(UPDATED_NB_PERS_DEP_291)
            .nbPersAnn292(UPDATED_NB_PERS_ANN_292)
            .nbPersNoshow293(UPDATED_NB_PERS_NOSHOW_293)
            .nbChbDayU294(UPDATED_NB_CHB_DAY_U_294)
            .nbChbArr295(UPDATED_NB_CHB_ARR_295)
            .nbChbDep296(UPDATED_NB_CHB_DEP_296)
            .nbChbAnn297(UPDATED_NB_CHB_ANN_297)
            .nbChbNoshow298(UPDATED_NB_CHB_NOSHOW_298)
            .revenuNetChambre299(UPDATED_REVENU_NET_CHAMBRE_299)
            .revenuTaxeChambre300(UPDATED_REVENU_TAXE_CHAMBRE_300)
            .revenuNetChambreGlobal301(UPDATED_REVENU_NET_CHAMBRE_GLOBAL_301)
            .revenuTaxeChambreGlobal302(UPDATED_REVENU_TAXE_CHAMBRE_GLOBAL_302)
            .revenuNetBq303(UPDATED_REVENU_NET_BQ_303)
            .revenuTaxeBq304(UPDATED_REVENU_TAXE_BQ_304)
            .revenuNetBqGlobal305(UPDATED_REVENU_NET_BQ_GLOBAL_305)
            .revenuTaxeBqGlobal306(UPDATED_REVENU_TAXE_BQ_GLOBAL_306)
            .revenuNetExtra307(UPDATED_REVENU_NET_EXTRA_307)
            .revenuTaxeExtra308(UPDATED_REVENU_TAXE_EXTRA_308)
            .revenuNetExtraGlobal309(UPDATED_REVENU_NET_EXTRA_GLOBAL_309)
            .revenuTaxeExtraGlobal310(UPDATED_REVENU_TAXE_EXTRA_GLOBAL_310);

        restTable2MockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedTable2.getId())
                    .contentType("application/merge-patch+json")
                    .content(om.writeValueAsBytes(partialUpdatedTable2))
            )
            .andExpect(status().isOk());

        // Validate the Table2 in the database

        assertSameRepositoryCount(databaseSizeBeforeUpdate);
        assertTable2UpdatableFieldsEquals(partialUpdatedTable2, getPersistedTable2(partialUpdatedTable2));
    }

    @Test
    @Transactional
    void patchNonExistingTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(
                patch(ENTITY_API_URL_ID, table2.getId()).contentType("application/merge-patch+json").content(om.writeValueAsBytes(table2))
            )
            .andExpect(status().isBadRequest());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(
                patch(ENTITY_API_URL_ID, longCount.incrementAndGet())
                    .contentType("application/merge-patch+json")
                    .content(om.writeValueAsBytes(table2))
            )
            .andExpect(status().isBadRequest());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamTable2() throws Exception {
        long databaseSizeBeforeUpdate = getRepositoryCount();
        table2.setId(longCount.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restTable2MockMvc
            .perform(patch(ENTITY_API_URL).contentType("application/merge-patch+json").content(om.writeValueAsBytes(table2)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the Table2 in the database
        assertSameRepositoryCount(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteTable2() throws Exception {
        // Initialize the database
        table2Repository.saveAndFlush(table2);

        long databaseSizeBeforeDelete = getRepositoryCount();

        // Delete the table2
        restTable2MockMvc
            .perform(delete(ENTITY_API_URL_ID, table2.getId()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        assertDecrementedRepositoryCount(databaseSizeBeforeDelete);
    }

    protected long getRepositoryCount() {
        return table2Repository.count();
    }

    protected void assertIncrementedRepositoryCount(long countBefore) {
        assertThat(countBefore + 1).isEqualTo(getRepositoryCount());
    }

    protected void assertDecrementedRepositoryCount(long countBefore) {
        assertThat(countBefore - 1).isEqualTo(getRepositoryCount());
    }

    protected void assertSameRepositoryCount(long countBefore) {
        assertThat(countBefore).isEqualTo(getRepositoryCount());
    }

    protected Table2 getPersistedTable2(Table2 table2) {
        return table2Repository.findById(table2.getId()).orElseThrow();
    }

    protected void assertPersistedTable2ToMatchAllProperties(Table2 expectedTable2) {
        assertTable2AllPropertiesEquals(expectedTable2, getPersistedTable2(expectedTable2));
    }

    protected void assertPersistedTable2ToMatchUpdatableProperties(Table2 expectedTable2) {
        assertTable2AllUpdatablePropertiesEquals(expectedTable2, getPersistedTable2(expectedTable2));
    }
}
