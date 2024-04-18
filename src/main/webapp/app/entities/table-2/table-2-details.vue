<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="table2">
        <h2 class="jh-entity-heading" data-cy="table2DetailsHeading">
          <span v-text="t$('big10SampleApplicationApp.table2.detail.title')"></span> {{ table2.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numLigne1')"></span>
          </dt>
          <dd>
            <span>{{ table2.numLigne1 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resort2')"></span>
          </dt>
          <dd>
            <span>{{ table2.resort2 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resvNameId3')"></span>
          </dt>
          <dd>
            <span>{{ table2.resvNameId3 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientOId4')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientOId4 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChb5')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChb5 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.confirmationNo6')"></span>
          </dt>
          <dd>
            <span>{{ table2.confirmationNo6 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientMdmId7')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientMdmId7 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nameId8')"></span>
          </dt>
          <dd>
            <span>{{ table2.nameId8 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId9')"></span>
          </dt>
          <dd>
            <span>{{ table2.parentResvNameId9 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.contactId10')"></span>
          </dt>
          <dd>
            <span>{{ table2.contactId10 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceId11')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceId11 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceNom12')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceNom12 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.societeId13')"></span>
          </dt>
          <dd>
            <span>{{ table2.societeId13 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.groupeId14')"></span>
          </dt>
          <dd>
            <span>{{ table2.groupeId14 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numBloc15')"></span>
          </dt>
          <dd>
            <span>{{ table2.numBloc15 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeResv16')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeResv16 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutResv17')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutResv17 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv18')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDebutResv18 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateFinResv19')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateFinResv19 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv20')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateDebutResv20 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv21')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateFinResv21 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv22')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateAnnResv22 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn23')"></span>
          </dt>
          <dd>
            <span>{{ table2.pseudoRoomYn23 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.createurResv24')"></span>
          </dt>
          <dd>
            <span>{{ table2.createurResv24 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv25')"></span>
          </dt>
          <dd>
            <span>{{ table2.nomCreateurResv25 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGarantie26')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGarantie26 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.flgDed27')"></span>
          </dt>
          <dd>
            <span>{{ table2.flgDed27 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePays28')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePays28 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPays29')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPays29 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeNationalite30')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeNationalite30 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libNationalite31')"></span>
          </dt>
          <dd>
            <span>{{ table2.libNationalite31 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeSource32')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeSource32 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libSource33')"></span>
          </dt>
          <dd>
            <span>{{ table2.libSource33 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource34')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandSource34 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeOrigine35')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeOrigine35 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libOrigine36')"></span>
          </dt>
          <dd>
            <span>{{ table2.libOrigine36 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeMarche37')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeMarche37 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libMarche38')"></span>
          </dt>
          <dd>
            <span>{{ table2.libMarche38 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche39')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandMarche39 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche40')"></span>
          </dt>
          <dd>
            <span>{{ table2.libGrandMarche40 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePrix41')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePrix41 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.categPrix42')"></span>
          </dt>
          <dd>
            <span>{{ table2.categPrix42 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPrix43')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPrix43 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numChb44')"></span>
          </dt>
          <dd>
            <span>{{ table2.numChb44 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb45')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChb45 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb46')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChb46 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.classChb47')"></span>
          </dt>
          <dd>
            <span>{{ table2.classChb47 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.caractChb48')"></span>
          </dt>
          <dd>
            <span>{{ table2.caractChb48 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation49')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChbDeReservation49 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv50')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChbDeResv50 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv51')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChbDeResv51 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation52')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDeReservation52 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution53')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribution53 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup54')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribUserRegroup54 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numCrs55')"></span>
          </dt>
          <dd>
            <span>{{ table2.numCrs55 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs56')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeRefCrs56 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate57')"></span>
          </dt>
          <dd>
            <span>{{ table2.crsInsertDate57 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv58')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateCreaResv58 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.datePremier59')"></span>
          </dt>
          <dd>
            <span>{{ table2.datePremier59 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutPremier60')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutPremier60 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernier61')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernier61 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernier62')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernier62 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo63')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernierPseudo63 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo64')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernierPseudo64 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn65')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtCreaAnn65 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn66')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtArrAnn66 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.leadtime67')"></span>
          </dt>
          <dd>
            <span>{{ table2.leadtime67 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.los68')"></span>
          </dt>
          <dd>
            <span>{{ table2.los68 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe69')"></span>
          </dt>
          <dd>
            <span>{{ table2.occupantsGroupe69 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuitee70')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuitee70 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed71')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuiteeNnDed71 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn72')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbResvAnn72 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbAdu73')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbAdu73 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbEnf74')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbEnf74 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU75')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDayU75 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersArr76')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersArr76 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDep77')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDep77 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn78')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersAnn78 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow79')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersNoshow79 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU80')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDayU80 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbArr81')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbArr81 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDep82')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDep82 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn83')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbAnn83 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow84')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbNoshow84 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre85')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambre85 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre86')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambre86 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal87')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambreGlobal87 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal88')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambreGlobal88 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq89')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBq89 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq90')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBq90 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal91')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBqGlobal91 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal92')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBqGlobal92 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra93')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtra93 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra94')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtra94 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal95')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtraGlobal95 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal96')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtraGlobal96 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotal97')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetTotal97 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotal98')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeTotal98 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotalGlobal99')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetTotalGlobal99 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotalGlobal100')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeTotalGlobal100 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuChambre101')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuChambre101 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuBq102')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuBq102 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuExtra103')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuExtra103 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuTotal104')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuTotal104 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodChambreNbNuitees105')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodChambreNbNuitees105 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.techCreateDate106')"></span>
          </dt>
          <dd>
            <span>{{ table2.techCreateDate106 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.techUpdateDate107')"></span>
          </dt>
          <dd>
            <span>{{ table2.techUpdateDate107 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numLigne108')"></span>
          </dt>
          <dd>
            <span>{{ table2.numLigne108 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resort109')"></span>
          </dt>
          <dd>
            <span>{{ table2.resort109 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resvNameId110')"></span>
          </dt>
          <dd>
            <span>{{ table2.resvNameId110 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientOId111')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientOId111 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChb112')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChb112 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.confirmationNo113')"></span>
          </dt>
          <dd>
            <span>{{ table2.confirmationNo113 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientMdmId114')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientMdmId114 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nameId115')"></span>
          </dt>
          <dd>
            <span>{{ table2.nameId115 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId116')"></span>
          </dt>
          <dd>
            <span>{{ table2.parentResvNameId116 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.contactId117')"></span>
          </dt>
          <dd>
            <span>{{ table2.contactId117 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceId118')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceId118 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceNom119')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceNom119 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.societeId120')"></span>
          </dt>
          <dd>
            <span>{{ table2.societeId120 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.groupeId121')"></span>
          </dt>
          <dd>
            <span>{{ table2.groupeId121 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numBloc122')"></span>
          </dt>
          <dd>
            <span>{{ table2.numBloc122 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeResv123')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeResv123 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutResv124')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutResv124 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv125')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDebutResv125 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateFinResv126')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateFinResv126 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv127')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateDebutResv127 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv128')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateFinResv128 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv129')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateAnnResv129 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn130')"></span>
          </dt>
          <dd>
            <span>{{ table2.pseudoRoomYn130 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.createurResv131')"></span>
          </dt>
          <dd>
            <span>{{ table2.createurResv131 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv132')"></span>
          </dt>
          <dd>
            <span>{{ table2.nomCreateurResv132 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGarantie133')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGarantie133 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.flgDed134')"></span>
          </dt>
          <dd>
            <span>{{ table2.flgDed134 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePays135')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePays135 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPays136')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPays136 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeNationalite137')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeNationalite137 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libNationalite138')"></span>
          </dt>
          <dd>
            <span>{{ table2.libNationalite138 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeSource139')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeSource139 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libSource140')"></span>
          </dt>
          <dd>
            <span>{{ table2.libSource140 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource141')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandSource141 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeOrigine142')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeOrigine142 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libOrigine143')"></span>
          </dt>
          <dd>
            <span>{{ table2.libOrigine143 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeMarche144')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeMarche144 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libMarche145')"></span>
          </dt>
          <dd>
            <span>{{ table2.libMarche145 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche146')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandMarche146 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche147')"></span>
          </dt>
          <dd>
            <span>{{ table2.libGrandMarche147 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePrix148')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePrix148 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.categPrix149')"></span>
          </dt>
          <dd>
            <span>{{ table2.categPrix149 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPrix150')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPrix150 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numChb151')"></span>
          </dt>
          <dd>
            <span>{{ table2.numChb151 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb152')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChb152 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb153')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChb153 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.classChb154')"></span>
          </dt>
          <dd>
            <span>{{ table2.classChb154 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.caractChb155')"></span>
          </dt>
          <dd>
            <span>{{ table2.caractChb155 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation156')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChbDeReservation156 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv157')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChbDeResv157 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv158')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChbDeResv158 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation159')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDeReservation159 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution160')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribution160 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup161')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribUserRegroup161 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numCrs162')"></span>
          </dt>
          <dd>
            <span>{{ table2.numCrs162 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs163')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeRefCrs163 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate164')"></span>
          </dt>
          <dd>
            <span>{{ table2.crsInsertDate164 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv165')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateCreaResv165 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.datePremier166')"></span>
          </dt>
          <dd>
            <span>{{ table2.datePremier166 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutPremier167')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutPremier167 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernier168')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernier168 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernier169')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernier169 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo170')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernierPseudo170 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo171')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernierPseudo171 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn172')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtCreaAnn172 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn173')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtArrAnn173 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.leadtime174')"></span>
          </dt>
          <dd>
            <span>{{ table2.leadtime174 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.los175')"></span>
          </dt>
          <dd>
            <span>{{ table2.los175 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe176')"></span>
          </dt>
          <dd>
            <span>{{ table2.occupantsGroupe176 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuitee177')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuitee177 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed178')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuiteeNnDed178 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn179')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbResvAnn179 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbAdu180')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbAdu180 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbEnf181')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbEnf181 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU182')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDayU182 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersArr183')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersArr183 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDep184')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDep184 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn185')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersAnn185 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow186')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersNoshow186 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU187')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDayU187 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbArr188')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbArr188 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDep189')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDep189 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn190')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbAnn190 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow191')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbNoshow191 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre192')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambre192 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre193')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambre193 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal194')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambreGlobal194 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal195')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambreGlobal195 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq196')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBq196 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq197')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBq197 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal198')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBqGlobal198 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal199')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBqGlobal199 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra200')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtra200 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra201')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtra201 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal202')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtraGlobal202 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal203')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtraGlobal203 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotal204')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetTotal204 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotal205')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeTotal205 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotalGlobal206')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetTotalGlobal206 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotalGlobal207')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeTotalGlobal207 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuChambre208')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuChambre208 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuBq209')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuBq209 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuExtra210')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuExtra210 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodRevenuTotal211')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodRevenuTotal211 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.prodChambreNbNuitees212')"></span>
          </dt>
          <dd>
            <span>{{ table2.prodChambreNbNuitees212 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.techCreateDate213')"></span>
          </dt>
          <dd>
            <span>{{ table2.techCreateDate213 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.techUpdateDate214')"></span>
          </dt>
          <dd>
            <span>{{ table2.techUpdateDate214 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numLigne215')"></span>
          </dt>
          <dd>
            <span>{{ table2.numLigne215 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resort216')"></span>
          </dt>
          <dd>
            <span>{{ table2.resort216 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.resvNameId217')"></span>
          </dt>
          <dd>
            <span>{{ table2.resvNameId217 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientOId218')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientOId218 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChb219')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChb219 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.confirmationNo220')"></span>
          </dt>
          <dd>
            <span>{{ table2.confirmationNo220 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.clientMdmId221')"></span>
          </dt>
          <dd>
            <span>{{ table2.clientMdmId221 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nameId222')"></span>
          </dt>
          <dd>
            <span>{{ table2.nameId222 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId223')"></span>
          </dt>
          <dd>
            <span>{{ table2.parentResvNameId223 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.contactId224')"></span>
          </dt>
          <dd>
            <span>{{ table2.contactId224 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceId225')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceId225 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.agenceNom226')"></span>
          </dt>
          <dd>
            <span>{{ table2.agenceNom226 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.societeId227')"></span>
          </dt>
          <dd>
            <span>{{ table2.societeId227 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.groupeId228')"></span>
          </dt>
          <dd>
            <span>{{ table2.groupeId228 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numBloc229')"></span>
          </dt>
          <dd>
            <span>{{ table2.numBloc229 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeResv230')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeResv230 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutResv231')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutResv231 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv232')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDebutResv232 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateFinResv233')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateFinResv233 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv234')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateDebutResv234 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv235')"></span>
          </dt>
          <dd>
            <span>{{ table2.truncDateFinResv235 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv236')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateAnnResv236 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn237')"></span>
          </dt>
          <dd>
            <span>{{ table2.pseudoRoomYn237 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.createurResv238')"></span>
          </dt>
          <dd>
            <span>{{ table2.createurResv238 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv239')"></span>
          </dt>
          <dd>
            <span>{{ table2.nomCreateurResv239 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGarantie240')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGarantie240 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.flgDed241')"></span>
          </dt>
          <dd>
            <span>{{ table2.flgDed241 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePays242')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePays242 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPays243')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPays243 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeNationalite244')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeNationalite244 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libNationalite245')"></span>
          </dt>
          <dd>
            <span>{{ table2.libNationalite245 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeSource246')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeSource246 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libSource247')"></span>
          </dt>
          <dd>
            <span>{{ table2.libSource247 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource248')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandSource248 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeOrigine249')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeOrigine249 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libOrigine250')"></span>
          </dt>
          <dd>
            <span>{{ table2.libOrigine250 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeMarche251')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeMarche251 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libMarche252')"></span>
          </dt>
          <dd>
            <span>{{ table2.libMarche252 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche253')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeGrandMarche253 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche254')"></span>
          </dt>
          <dd>
            <span>{{ table2.libGrandMarche254 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codePrix255')"></span>
          </dt>
          <dd>
            <span>{{ table2.codePrix255 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.categPrix256')"></span>
          </dt>
          <dd>
            <span>{{ table2.categPrix256 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.libPrix257')"></span>
          </dt>
          <dd>
            <span>{{ table2.libPrix257 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numChb258')"></span>
          </dt>
          <dd>
            <span>{{ table2.numChb258 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb259')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChb259 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb260')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChb260 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.classChb261')"></span>
          </dt>
          <dd>
            <span>{{ table2.classChb261 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.caractChb262')"></span>
          </dt>
          <dd>
            <span>{{ table2.caractChb262 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation263')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeChbDeReservation263 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv264')"></span>
          </dt>
          <dd>
            <span>{{ table2.descriptionTypeChbDeResv264 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv265')"></span>
          </dt>
          <dd>
            <span>{{ table2.codeTypeChbDeResv265 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation266')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDeReservation266 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution267')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribution267 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup268')"></span>
          </dt>
          <dd>
            <span>{{ table2.circuitDistribUserRegroup268 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.numCrs269')"></span>
          </dt>
          <dd>
            <span>{{ table2.numCrs269 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs270')"></span>
          </dt>
          <dd>
            <span>{{ table2.typeRefCrs270 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate271')"></span>
          </dt>
          <dd>
            <span>{{ table2.crsInsertDate271 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv272')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateCreaResv272 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.datePremier273')"></span>
          </dt>
          <dd>
            <span>{{ table2.datePremier273 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutPremier274')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutPremier274 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernier275')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernier275 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernier276')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernier276 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo277')"></span>
          </dt>
          <dd>
            <span>{{ table2.dateDernierPseudo277 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo278')"></span>
          </dt>
          <dd>
            <span>{{ table2.statutDernierPseudo278 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn279')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtCreaAnn279 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn280')"></span>
          </dt>
          <dd>
            <span>{{ table2.diffDtArrAnn280 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.leadtime281')"></span>
          </dt>
          <dd>
            <span>{{ table2.leadtime281 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.los282')"></span>
          </dt>
          <dd>
            <span>{{ table2.los282 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe283')"></span>
          </dt>
          <dd>
            <span>{{ table2.occupantsGroupe283 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuitee284')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuitee284 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed285')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbNuiteeNnDed285 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn286')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbResvAnn286 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbAdu287')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbAdu287 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbEnf288')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbEnf288 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU289')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDayU289 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersArr290')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersArr290 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersDep291')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersDep291 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn292')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersAnn292 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow293')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbPersNoshow293 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU294')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDayU294 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbArr295')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbArr295 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbDep296')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbDep296 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn297')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbAnn297 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow298')"></span>
          </dt>
          <dd>
            <span>{{ table2.nbChbNoshow298 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre299')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambre299 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre300')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambre300 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal301')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetChambreGlobal301 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal302')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeChambreGlobal302 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq303')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBq303 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq304')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBq304 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal305')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetBqGlobal305 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal306')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeBqGlobal306 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra307')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtra307 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra308')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtra308 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal309')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuNetExtraGlobal309 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal310')"></span>
          </dt>
          <dd>
            <span>{{ table2.revenuTaxeExtraGlobal310 }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.back')"></span>
        </button>
        <router-link v-if="table2.id" :to="{ name: 'Table2Edit', params: { table2Id: table2.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.edit')"></span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./table-2-details.component.ts"></script>
