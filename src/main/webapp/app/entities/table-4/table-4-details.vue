<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="table4">
        <h2 class="jh-entity-heading" data-cy="table4DetailsHeading">
          <span v-text="t$('big10SampleApplicationApp.table4.detail.title')"></span> {{ table4.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numLigne1')"></span>
          </dt>
          <dd>
            <span>{{ table4.numLigne1 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resort2')"></span>
          </dt>
          <dd>
            <span>{{ table4.resort2 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resvNameId3')"></span>
          </dt>
          <dd>
            <span>{{ table4.resvNameId3 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientOId4')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientOId4 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChb5')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChb5 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.confirmationNo6')"></span>
          </dt>
          <dd>
            <span>{{ table4.confirmationNo6 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientMdmId7')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientMdmId7 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nameId8')"></span>
          </dt>
          <dd>
            <span>{{ table4.nameId8 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId9')"></span>
          </dt>
          <dd>
            <span>{{ table4.parentResvNameId9 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.contactId10')"></span>
          </dt>
          <dd>
            <span>{{ table4.contactId10 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceId11')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceId11 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceNom12')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceNom12 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.societeId13')"></span>
          </dt>
          <dd>
            <span>{{ table4.societeId13 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.groupeId14')"></span>
          </dt>
          <dd>
            <span>{{ table4.groupeId14 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numBloc15')"></span>
          </dt>
          <dd>
            <span>{{ table4.numBloc15 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeResv16')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeResv16 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutResv17')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutResv17 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv18')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDebutResv18 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateFinResv19')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateFinResv19 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv20')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateDebutResv20 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv21')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateFinResv21 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv22')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateAnnResv22 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn23')"></span>
          </dt>
          <dd>
            <span>{{ table4.pseudoRoomYn23 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.createurResv24')"></span>
          </dt>
          <dd>
            <span>{{ table4.createurResv24 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv25')"></span>
          </dt>
          <dd>
            <span>{{ table4.nomCreateurResv25 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGarantie26')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGarantie26 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.flgDed27')"></span>
          </dt>
          <dd>
            <span>{{ table4.flgDed27 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePays28')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePays28 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPays29')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPays29 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeNationalite30')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeNationalite30 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libNationalite31')"></span>
          </dt>
          <dd>
            <span>{{ table4.libNationalite31 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeSource32')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeSource32 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libSource33')"></span>
          </dt>
          <dd>
            <span>{{ table4.libSource33 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource34')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandSource34 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeOrigine35')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeOrigine35 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libOrigine36')"></span>
          </dt>
          <dd>
            <span>{{ table4.libOrigine36 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeMarche37')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeMarche37 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libMarche38')"></span>
          </dt>
          <dd>
            <span>{{ table4.libMarche38 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche39')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandMarche39 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche40')"></span>
          </dt>
          <dd>
            <span>{{ table4.libGrandMarche40 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePrix41')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePrix41 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.categPrix42')"></span>
          </dt>
          <dd>
            <span>{{ table4.categPrix42 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPrix43')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPrix43 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numChb44')"></span>
          </dt>
          <dd>
            <span>{{ table4.numChb44 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb45')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChb45 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb46')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChb46 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.classChb47')"></span>
          </dt>
          <dd>
            <span>{{ table4.classChb47 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.caractChb48')"></span>
          </dt>
          <dd>
            <span>{{ table4.caractChb48 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation49')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChbDeReservation49 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv50')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChbDeResv50 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv51')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChbDeResv51 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation52')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDeReservation52 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution53')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribution53 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup54')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribUserRegroup54 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numCrs55')"></span>
          </dt>
          <dd>
            <span>{{ table4.numCrs55 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs56')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeRefCrs56 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate57')"></span>
          </dt>
          <dd>
            <span>{{ table4.crsInsertDate57 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv58')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateCreaResv58 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.datePremier59')"></span>
          </dt>
          <dd>
            <span>{{ table4.datePremier59 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutPremier60')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutPremier60 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernier61')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernier61 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernier62')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernier62 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo63')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernierPseudo63 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo64')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernierPseudo64 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn65')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtCreaAnn65 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn66')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtArrAnn66 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.leadtime67')"></span>
          </dt>
          <dd>
            <span>{{ table4.leadtime67 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.los68')"></span>
          </dt>
          <dd>
            <span>{{ table4.los68 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe69')"></span>
          </dt>
          <dd>
            <span>{{ table4.occupantsGroupe69 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuitee70')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuitee70 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed71')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuiteeNnDed71 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn72')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbResvAnn72 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbAdu73')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbAdu73 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbEnf74')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbEnf74 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU75')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDayU75 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersArr76')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersArr76 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDep77')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDep77 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn78')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersAnn78 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow79')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersNoshow79 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU80')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDayU80 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbArr81')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbArr81 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDep82')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDep82 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn83')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbAnn83 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow84')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbNoshow84 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre85')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambre85 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre86')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambre86 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal87')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambreGlobal87 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal88')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambreGlobal88 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq89')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBq89 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq90')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBq90 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal91')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBqGlobal91 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal92')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBqGlobal92 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra93')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtra93 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra94')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtra94 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal95')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtraGlobal95 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal96')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtraGlobal96 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotal97')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetTotal97 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotal98')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeTotal98 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotalGlobal99')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetTotalGlobal99 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotalGlobal100')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeTotalGlobal100 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuChambre101')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuChambre101 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuBq102')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuBq102 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuExtra103')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuExtra103 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuTotal104')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuTotal104 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodChambreNbNuitees105')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodChambreNbNuitees105 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.techCreateDate106')"></span>
          </dt>
          <dd>
            <span>{{ table4.techCreateDate106 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.techUpdateDate107')"></span>
          </dt>
          <dd>
            <span>{{ table4.techUpdateDate107 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numLigne108')"></span>
          </dt>
          <dd>
            <span>{{ table4.numLigne108 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resort109')"></span>
          </dt>
          <dd>
            <span>{{ table4.resort109 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resvNameId110')"></span>
          </dt>
          <dd>
            <span>{{ table4.resvNameId110 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientOId111')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientOId111 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChb112')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChb112 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.confirmationNo113')"></span>
          </dt>
          <dd>
            <span>{{ table4.confirmationNo113 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientMdmId114')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientMdmId114 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nameId115')"></span>
          </dt>
          <dd>
            <span>{{ table4.nameId115 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId116')"></span>
          </dt>
          <dd>
            <span>{{ table4.parentResvNameId116 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.contactId117')"></span>
          </dt>
          <dd>
            <span>{{ table4.contactId117 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceId118')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceId118 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceNom119')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceNom119 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.societeId120')"></span>
          </dt>
          <dd>
            <span>{{ table4.societeId120 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.groupeId121')"></span>
          </dt>
          <dd>
            <span>{{ table4.groupeId121 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numBloc122')"></span>
          </dt>
          <dd>
            <span>{{ table4.numBloc122 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeResv123')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeResv123 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutResv124')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutResv124 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv125')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDebutResv125 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateFinResv126')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateFinResv126 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv127')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateDebutResv127 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv128')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateFinResv128 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv129')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateAnnResv129 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn130')"></span>
          </dt>
          <dd>
            <span>{{ table4.pseudoRoomYn130 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.createurResv131')"></span>
          </dt>
          <dd>
            <span>{{ table4.createurResv131 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv132')"></span>
          </dt>
          <dd>
            <span>{{ table4.nomCreateurResv132 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGarantie133')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGarantie133 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.flgDed134')"></span>
          </dt>
          <dd>
            <span>{{ table4.flgDed134 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePays135')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePays135 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPays136')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPays136 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeNationalite137')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeNationalite137 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libNationalite138')"></span>
          </dt>
          <dd>
            <span>{{ table4.libNationalite138 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeSource139')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeSource139 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libSource140')"></span>
          </dt>
          <dd>
            <span>{{ table4.libSource140 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource141')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandSource141 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeOrigine142')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeOrigine142 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libOrigine143')"></span>
          </dt>
          <dd>
            <span>{{ table4.libOrigine143 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeMarche144')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeMarche144 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libMarche145')"></span>
          </dt>
          <dd>
            <span>{{ table4.libMarche145 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche146')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandMarche146 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche147')"></span>
          </dt>
          <dd>
            <span>{{ table4.libGrandMarche147 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePrix148')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePrix148 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.categPrix149')"></span>
          </dt>
          <dd>
            <span>{{ table4.categPrix149 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPrix150')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPrix150 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numChb151')"></span>
          </dt>
          <dd>
            <span>{{ table4.numChb151 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb152')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChb152 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb153')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChb153 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.classChb154')"></span>
          </dt>
          <dd>
            <span>{{ table4.classChb154 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.caractChb155')"></span>
          </dt>
          <dd>
            <span>{{ table4.caractChb155 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation156')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChbDeReservation156 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv157')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChbDeResv157 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv158')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChbDeResv158 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation159')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDeReservation159 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution160')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribution160 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup161')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribUserRegroup161 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numCrs162')"></span>
          </dt>
          <dd>
            <span>{{ table4.numCrs162 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs163')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeRefCrs163 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate164')"></span>
          </dt>
          <dd>
            <span>{{ table4.crsInsertDate164 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv165')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateCreaResv165 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.datePremier166')"></span>
          </dt>
          <dd>
            <span>{{ table4.datePremier166 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutPremier167')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutPremier167 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernier168')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernier168 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernier169')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernier169 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo170')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernierPseudo170 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo171')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernierPseudo171 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn172')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtCreaAnn172 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn173')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtArrAnn173 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.leadtime174')"></span>
          </dt>
          <dd>
            <span>{{ table4.leadtime174 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.los175')"></span>
          </dt>
          <dd>
            <span>{{ table4.los175 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe176')"></span>
          </dt>
          <dd>
            <span>{{ table4.occupantsGroupe176 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuitee177')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuitee177 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed178')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuiteeNnDed178 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn179')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbResvAnn179 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbAdu180')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbAdu180 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbEnf181')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbEnf181 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU182')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDayU182 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersArr183')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersArr183 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDep184')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDep184 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn185')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersAnn185 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow186')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersNoshow186 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU187')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDayU187 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbArr188')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbArr188 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDep189')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDep189 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn190')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbAnn190 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow191')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbNoshow191 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre192')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambre192 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre193')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambre193 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal194')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambreGlobal194 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal195')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambreGlobal195 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq196')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBq196 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq197')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBq197 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal198')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBqGlobal198 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal199')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBqGlobal199 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra200')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtra200 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra201')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtra201 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal202')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtraGlobal202 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal203')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtraGlobal203 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotal204')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetTotal204 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotal205')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeTotal205 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotalGlobal206')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetTotalGlobal206 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotalGlobal207')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeTotalGlobal207 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuChambre208')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuChambre208 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuBq209')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuBq209 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuExtra210')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuExtra210 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodRevenuTotal211')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodRevenuTotal211 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.prodChambreNbNuitees212')"></span>
          </dt>
          <dd>
            <span>{{ table4.prodChambreNbNuitees212 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.techCreateDate213')"></span>
          </dt>
          <dd>
            <span>{{ table4.techCreateDate213 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.techUpdateDate214')"></span>
          </dt>
          <dd>
            <span>{{ table4.techUpdateDate214 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numLigne215')"></span>
          </dt>
          <dd>
            <span>{{ table4.numLigne215 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resort216')"></span>
          </dt>
          <dd>
            <span>{{ table4.resort216 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.resvNameId217')"></span>
          </dt>
          <dd>
            <span>{{ table4.resvNameId217 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientOId218')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientOId218 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChb219')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChb219 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.confirmationNo220')"></span>
          </dt>
          <dd>
            <span>{{ table4.confirmationNo220 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.clientMdmId221')"></span>
          </dt>
          <dd>
            <span>{{ table4.clientMdmId221 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nameId222')"></span>
          </dt>
          <dd>
            <span>{{ table4.nameId222 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId223')"></span>
          </dt>
          <dd>
            <span>{{ table4.parentResvNameId223 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.contactId224')"></span>
          </dt>
          <dd>
            <span>{{ table4.contactId224 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceId225')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceId225 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.agenceNom226')"></span>
          </dt>
          <dd>
            <span>{{ table4.agenceNom226 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.societeId227')"></span>
          </dt>
          <dd>
            <span>{{ table4.societeId227 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.groupeId228')"></span>
          </dt>
          <dd>
            <span>{{ table4.groupeId228 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numBloc229')"></span>
          </dt>
          <dd>
            <span>{{ table4.numBloc229 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeResv230')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeResv230 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutResv231')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutResv231 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv232')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDebutResv232 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateFinResv233')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateFinResv233 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv234')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateDebutResv234 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv235')"></span>
          </dt>
          <dd>
            <span>{{ table4.truncDateFinResv235 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv236')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateAnnResv236 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn237')"></span>
          </dt>
          <dd>
            <span>{{ table4.pseudoRoomYn237 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.createurResv238')"></span>
          </dt>
          <dd>
            <span>{{ table4.createurResv238 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv239')"></span>
          </dt>
          <dd>
            <span>{{ table4.nomCreateurResv239 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGarantie240')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGarantie240 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.flgDed241')"></span>
          </dt>
          <dd>
            <span>{{ table4.flgDed241 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePays242')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePays242 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPays243')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPays243 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeNationalite244')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeNationalite244 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libNationalite245')"></span>
          </dt>
          <dd>
            <span>{{ table4.libNationalite245 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeSource246')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeSource246 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libSource247')"></span>
          </dt>
          <dd>
            <span>{{ table4.libSource247 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource248')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandSource248 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeOrigine249')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeOrigine249 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libOrigine250')"></span>
          </dt>
          <dd>
            <span>{{ table4.libOrigine250 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeMarche251')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeMarche251 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libMarche252')"></span>
          </dt>
          <dd>
            <span>{{ table4.libMarche252 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche253')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeGrandMarche253 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche254')"></span>
          </dt>
          <dd>
            <span>{{ table4.libGrandMarche254 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codePrix255')"></span>
          </dt>
          <dd>
            <span>{{ table4.codePrix255 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.categPrix256')"></span>
          </dt>
          <dd>
            <span>{{ table4.categPrix256 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.libPrix257')"></span>
          </dt>
          <dd>
            <span>{{ table4.libPrix257 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numChb258')"></span>
          </dt>
          <dd>
            <span>{{ table4.numChb258 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb259')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChb259 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb260')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChb260 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.classChb261')"></span>
          </dt>
          <dd>
            <span>{{ table4.classChb261 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.caractChb262')"></span>
          </dt>
          <dd>
            <span>{{ table4.caractChb262 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation263')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeChbDeReservation263 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv264')"></span>
          </dt>
          <dd>
            <span>{{ table4.descriptionTypeChbDeResv264 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv265')"></span>
          </dt>
          <dd>
            <span>{{ table4.codeTypeChbDeResv265 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation266')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDeReservation266 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution267')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribution267 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup268')"></span>
          </dt>
          <dd>
            <span>{{ table4.circuitDistribUserRegroup268 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.numCrs269')"></span>
          </dt>
          <dd>
            <span>{{ table4.numCrs269 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs270')"></span>
          </dt>
          <dd>
            <span>{{ table4.typeRefCrs270 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate271')"></span>
          </dt>
          <dd>
            <span>{{ table4.crsInsertDate271 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv272')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateCreaResv272 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.datePremier273')"></span>
          </dt>
          <dd>
            <span>{{ table4.datePremier273 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutPremier274')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutPremier274 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernier275')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernier275 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernier276')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernier276 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo277')"></span>
          </dt>
          <dd>
            <span>{{ table4.dateDernierPseudo277 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo278')"></span>
          </dt>
          <dd>
            <span>{{ table4.statutDernierPseudo278 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn279')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtCreaAnn279 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn280')"></span>
          </dt>
          <dd>
            <span>{{ table4.diffDtArrAnn280 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.leadtime281')"></span>
          </dt>
          <dd>
            <span>{{ table4.leadtime281 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.los282')"></span>
          </dt>
          <dd>
            <span>{{ table4.los282 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe283')"></span>
          </dt>
          <dd>
            <span>{{ table4.occupantsGroupe283 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuitee284')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuitee284 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed285')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbNuiteeNnDed285 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn286')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbResvAnn286 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbAdu287')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbAdu287 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbEnf288')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbEnf288 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU289')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDayU289 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersArr290')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersArr290 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersDep291')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersDep291 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn292')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersAnn292 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow293')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbPersNoshow293 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU294')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDayU294 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbArr295')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbArr295 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbDep296')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbDep296 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn297')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbAnn297 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow298')"></span>
          </dt>
          <dd>
            <span>{{ table4.nbChbNoshow298 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre299')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambre299 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre300')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambre300 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal301')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetChambreGlobal301 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal302')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeChambreGlobal302 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq303')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBq303 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq304')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBq304 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal305')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetBqGlobal305 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal306')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeBqGlobal306 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra307')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtra307 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra308')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtra308 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal309')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuNetExtraGlobal309 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal310')"></span>
          </dt>
          <dd>
            <span>{{ table4.revenuTaxeExtraGlobal310 }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.back')"></span>
        </button>
        <router-link v-if="table4.id" :to="{ name: 'Table4Edit', params: { table4Id: table4.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.edit')"></span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./table-4-details.component.ts"></script>
