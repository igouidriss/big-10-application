<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="table1">
        <h2 class="jh-entity-heading" data-cy="table1DetailsHeading">
          <span v-text="t$('big10SampleApplicationApp.table1.detail.title')"></span> {{ table1.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numLigne1')"></span>
          </dt>
          <dd>
            <span>{{ table1.numLigne1 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resort2')"></span>
          </dt>
          <dd>
            <span>{{ table1.resort2 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resvNameId3')"></span>
          </dt>
          <dd>
            <span>{{ table1.resvNameId3 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientOId4')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientOId4 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChb5')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChb5 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.confirmationNo6')"></span>
          </dt>
          <dd>
            <span>{{ table1.confirmationNo6 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientMdmId7')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientMdmId7 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nameId8')"></span>
          </dt>
          <dd>
            <span>{{ table1.nameId8 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.parentResvNameId9')"></span>
          </dt>
          <dd>
            <span>{{ table1.parentResvNameId9 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.contactId10')"></span>
          </dt>
          <dd>
            <span>{{ table1.contactId10 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceId11')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceId11 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceNom12')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceNom12 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.societeId13')"></span>
          </dt>
          <dd>
            <span>{{ table1.societeId13 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.groupeId14')"></span>
          </dt>
          <dd>
            <span>{{ table1.groupeId14 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numBloc15')"></span>
          </dt>
          <dd>
            <span>{{ table1.numBloc15 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeResv16')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeResv16 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutResv17')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutResv17 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDebutResv18')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDebutResv18 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateFinResv19')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateFinResv19 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateDebutResv20')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateDebutResv20 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateFinResv21')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateFinResv21 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateAnnResv22')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateAnnResv22 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.pseudoRoomYn23')"></span>
          </dt>
          <dd>
            <span>{{ table1.pseudoRoomYn23 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.createurResv24')"></span>
          </dt>
          <dd>
            <span>{{ table1.createurResv24 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nomCreateurResv25')"></span>
          </dt>
          <dd>
            <span>{{ table1.nomCreateurResv25 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGarantie26')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGarantie26 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.flgDed27')"></span>
          </dt>
          <dd>
            <span>{{ table1.flgDed27 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePays28')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePays28 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPays29')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPays29 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeNationalite30')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeNationalite30 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libNationalite31')"></span>
          </dt>
          <dd>
            <span>{{ table1.libNationalite31 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeSource32')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeSource32 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libSource33')"></span>
          </dt>
          <dd>
            <span>{{ table1.libSource33 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandSource34')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandSource34 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeOrigine35')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeOrigine35 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libOrigine36')"></span>
          </dt>
          <dd>
            <span>{{ table1.libOrigine36 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeMarche37')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeMarche37 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libMarche38')"></span>
          </dt>
          <dd>
            <span>{{ table1.libMarche38 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandMarche39')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandMarche39 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libGrandMarche40')"></span>
          </dt>
          <dd>
            <span>{{ table1.libGrandMarche40 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePrix41')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePrix41 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.categPrix42')"></span>
          </dt>
          <dd>
            <span>{{ table1.categPrix42 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPrix43')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPrix43 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numChb44')"></span>
          </dt>
          <dd>
            <span>{{ table1.numChb44 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChb45')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChb45 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChb46')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChb46 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.classChb47')"></span>
          </dt>
          <dd>
            <span>{{ table1.classChb47 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.caractChb48')"></span>
          </dt>
          <dd>
            <span>{{ table1.caractChb48 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChbDeReservation49')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChbDeReservation49 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChbDeResv50')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChbDeResv50 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChbDeResv51')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChbDeResv51 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDeReservation52')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDeReservation52 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribution53')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribution53 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribUserRegroup54')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribUserRegroup54 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numCrs55')"></span>
          </dt>
          <dd>
            <span>{{ table1.numCrs55 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeRefCrs56')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeRefCrs56 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.crsInsertDate57')"></span>
          </dt>
          <dd>
            <span>{{ table1.crsInsertDate57 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateCreaResv58')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateCreaResv58 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.datePremier59')"></span>
          </dt>
          <dd>
            <span>{{ table1.datePremier59 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutPremier60')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutPremier60 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernier61')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernier61 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernier62')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernier62 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernierPseudo63')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernierPseudo63 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernierPseudo64')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernierPseudo64 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtCreaAnn65')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtCreaAnn65 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtArrAnn66')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtArrAnn66 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.leadtime67')"></span>
          </dt>
          <dd>
            <span>{{ table1.leadtime67 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.los68')"></span>
          </dt>
          <dd>
            <span>{{ table1.los68 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.occupantsGroupe69')"></span>
          </dt>
          <dd>
            <span>{{ table1.occupantsGroupe69 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuitee70')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuitee70 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuiteeNnDed71')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuiteeNnDed71 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbResvAnn72')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbResvAnn72 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbAdu73')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbAdu73 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbEnf74')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbEnf74 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDayU75')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDayU75 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersArr76')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersArr76 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDep77')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDep77 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersAnn78')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersAnn78 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersNoshow79')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersNoshow79 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDayU80')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDayU80 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbArr81')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbArr81 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDep82')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDep82 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbAnn83')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbAnn83 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbNoshow84')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbNoshow84 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambre85')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambre85 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambre86')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambre86 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambreGlobal87')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambreGlobal87 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambreGlobal88')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambreGlobal88 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBq89')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBq89 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBq90')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBq90 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBqGlobal91')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBqGlobal91 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBqGlobal92')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBqGlobal92 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtra93')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtra93 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtra94')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtra94 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtraGlobal95')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtraGlobal95 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtraGlobal96')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtraGlobal96 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetTotal97')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetTotal97 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeTotal98')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeTotal98 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetTotalGlobal99')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetTotalGlobal99 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeTotalGlobal100')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeTotalGlobal100 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuChambre101')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuChambre101 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuBq102')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuBq102 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuExtra103')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuExtra103 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuTotal104')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuTotal104 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodChambreNbNuitees105')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodChambreNbNuitees105 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.techCreateDate106')"></span>
          </dt>
          <dd>
            <span>{{ table1.techCreateDate106 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.techUpdateDate107')"></span>
          </dt>
          <dd>
            <span>{{ table1.techUpdateDate107 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numLigne108')"></span>
          </dt>
          <dd>
            <span>{{ table1.numLigne108 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resort109')"></span>
          </dt>
          <dd>
            <span>{{ table1.resort109 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resvNameId110')"></span>
          </dt>
          <dd>
            <span>{{ table1.resvNameId110 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientOId111')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientOId111 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChb112')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChb112 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.confirmationNo113')"></span>
          </dt>
          <dd>
            <span>{{ table1.confirmationNo113 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientMdmId114')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientMdmId114 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nameId115')"></span>
          </dt>
          <dd>
            <span>{{ table1.nameId115 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.parentResvNameId116')"></span>
          </dt>
          <dd>
            <span>{{ table1.parentResvNameId116 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.contactId117')"></span>
          </dt>
          <dd>
            <span>{{ table1.contactId117 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceId118')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceId118 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceNom119')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceNom119 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.societeId120')"></span>
          </dt>
          <dd>
            <span>{{ table1.societeId120 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.groupeId121')"></span>
          </dt>
          <dd>
            <span>{{ table1.groupeId121 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numBloc122')"></span>
          </dt>
          <dd>
            <span>{{ table1.numBloc122 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeResv123')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeResv123 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutResv124')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutResv124 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDebutResv125')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDebutResv125 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateFinResv126')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateFinResv126 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateDebutResv127')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateDebutResv127 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateFinResv128')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateFinResv128 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateAnnResv129')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateAnnResv129 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.pseudoRoomYn130')"></span>
          </dt>
          <dd>
            <span>{{ table1.pseudoRoomYn130 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.createurResv131')"></span>
          </dt>
          <dd>
            <span>{{ table1.createurResv131 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nomCreateurResv132')"></span>
          </dt>
          <dd>
            <span>{{ table1.nomCreateurResv132 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGarantie133')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGarantie133 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.flgDed134')"></span>
          </dt>
          <dd>
            <span>{{ table1.flgDed134 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePays135')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePays135 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPays136')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPays136 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeNationalite137')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeNationalite137 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libNationalite138')"></span>
          </dt>
          <dd>
            <span>{{ table1.libNationalite138 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeSource139')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeSource139 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libSource140')"></span>
          </dt>
          <dd>
            <span>{{ table1.libSource140 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandSource141')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandSource141 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeOrigine142')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeOrigine142 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libOrigine143')"></span>
          </dt>
          <dd>
            <span>{{ table1.libOrigine143 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeMarche144')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeMarche144 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libMarche145')"></span>
          </dt>
          <dd>
            <span>{{ table1.libMarche145 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandMarche146')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandMarche146 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libGrandMarche147')"></span>
          </dt>
          <dd>
            <span>{{ table1.libGrandMarche147 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePrix148')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePrix148 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.categPrix149')"></span>
          </dt>
          <dd>
            <span>{{ table1.categPrix149 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPrix150')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPrix150 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numChb151')"></span>
          </dt>
          <dd>
            <span>{{ table1.numChb151 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChb152')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChb152 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChb153')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChb153 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.classChb154')"></span>
          </dt>
          <dd>
            <span>{{ table1.classChb154 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.caractChb155')"></span>
          </dt>
          <dd>
            <span>{{ table1.caractChb155 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChbDeReservation156')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChbDeReservation156 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChbDeResv157')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChbDeResv157 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChbDeResv158')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChbDeResv158 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDeReservation159')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDeReservation159 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribution160')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribution160 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribUserRegroup161')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribUserRegroup161 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numCrs162')"></span>
          </dt>
          <dd>
            <span>{{ table1.numCrs162 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeRefCrs163')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeRefCrs163 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.crsInsertDate164')"></span>
          </dt>
          <dd>
            <span>{{ table1.crsInsertDate164 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateCreaResv165')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateCreaResv165 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.datePremier166')"></span>
          </dt>
          <dd>
            <span>{{ table1.datePremier166 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutPremier167')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutPremier167 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernier168')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernier168 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernier169')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernier169 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernierPseudo170')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernierPseudo170 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernierPseudo171')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernierPseudo171 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtCreaAnn172')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtCreaAnn172 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtArrAnn173')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtArrAnn173 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.leadtime174')"></span>
          </dt>
          <dd>
            <span>{{ table1.leadtime174 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.los175')"></span>
          </dt>
          <dd>
            <span>{{ table1.los175 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.occupantsGroupe176')"></span>
          </dt>
          <dd>
            <span>{{ table1.occupantsGroupe176 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuitee177')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuitee177 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuiteeNnDed178')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuiteeNnDed178 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbResvAnn179')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbResvAnn179 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbAdu180')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbAdu180 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbEnf181')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbEnf181 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDayU182')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDayU182 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersArr183')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersArr183 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDep184')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDep184 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersAnn185')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersAnn185 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersNoshow186')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersNoshow186 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDayU187')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDayU187 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbArr188')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbArr188 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDep189')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDep189 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbAnn190')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbAnn190 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbNoshow191')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbNoshow191 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambre192')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambre192 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambre193')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambre193 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambreGlobal194')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambreGlobal194 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambreGlobal195')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambreGlobal195 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBq196')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBq196 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBq197')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBq197 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBqGlobal198')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBqGlobal198 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBqGlobal199')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBqGlobal199 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtra200')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtra200 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtra201')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtra201 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtraGlobal202')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtraGlobal202 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtraGlobal203')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtraGlobal203 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetTotal204')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetTotal204 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeTotal205')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeTotal205 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetTotalGlobal206')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetTotalGlobal206 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeTotalGlobal207')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeTotalGlobal207 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuChambre208')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuChambre208 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuBq209')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuBq209 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuExtra210')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuExtra210 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodRevenuTotal211')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodRevenuTotal211 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.prodChambreNbNuitees212')"></span>
          </dt>
          <dd>
            <span>{{ table1.prodChambreNbNuitees212 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.techCreateDate213')"></span>
          </dt>
          <dd>
            <span>{{ table1.techCreateDate213 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.techUpdateDate214')"></span>
          </dt>
          <dd>
            <span>{{ table1.techUpdateDate214 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numLigne215')"></span>
          </dt>
          <dd>
            <span>{{ table1.numLigne215 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resort216')"></span>
          </dt>
          <dd>
            <span>{{ table1.resort216 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.resvNameId217')"></span>
          </dt>
          <dd>
            <span>{{ table1.resvNameId217 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientOId218')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientOId218 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChb219')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChb219 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.confirmationNo220')"></span>
          </dt>
          <dd>
            <span>{{ table1.confirmationNo220 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.clientMdmId221')"></span>
          </dt>
          <dd>
            <span>{{ table1.clientMdmId221 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nameId222')"></span>
          </dt>
          <dd>
            <span>{{ table1.nameId222 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.parentResvNameId223')"></span>
          </dt>
          <dd>
            <span>{{ table1.parentResvNameId223 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.contactId224')"></span>
          </dt>
          <dd>
            <span>{{ table1.contactId224 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceId225')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceId225 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.agenceNom226')"></span>
          </dt>
          <dd>
            <span>{{ table1.agenceNom226 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.societeId227')"></span>
          </dt>
          <dd>
            <span>{{ table1.societeId227 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.groupeId228')"></span>
          </dt>
          <dd>
            <span>{{ table1.groupeId228 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numBloc229')"></span>
          </dt>
          <dd>
            <span>{{ table1.numBloc229 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeResv230')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeResv230 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutResv231')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutResv231 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDebutResv232')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDebutResv232 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateFinResv233')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateFinResv233 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateDebutResv234')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateDebutResv234 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.truncDateFinResv235')"></span>
          </dt>
          <dd>
            <span>{{ table1.truncDateFinResv235 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateAnnResv236')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateAnnResv236 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.pseudoRoomYn237')"></span>
          </dt>
          <dd>
            <span>{{ table1.pseudoRoomYn237 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.createurResv238')"></span>
          </dt>
          <dd>
            <span>{{ table1.createurResv238 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nomCreateurResv239')"></span>
          </dt>
          <dd>
            <span>{{ table1.nomCreateurResv239 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGarantie240')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGarantie240 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.flgDed241')"></span>
          </dt>
          <dd>
            <span>{{ table1.flgDed241 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePays242')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePays242 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPays243')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPays243 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeNationalite244')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeNationalite244 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libNationalite245')"></span>
          </dt>
          <dd>
            <span>{{ table1.libNationalite245 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeSource246')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeSource246 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libSource247')"></span>
          </dt>
          <dd>
            <span>{{ table1.libSource247 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandSource248')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandSource248 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeOrigine249')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeOrigine249 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libOrigine250')"></span>
          </dt>
          <dd>
            <span>{{ table1.libOrigine250 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeMarche251')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeMarche251 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libMarche252')"></span>
          </dt>
          <dd>
            <span>{{ table1.libMarche252 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeGrandMarche253')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeGrandMarche253 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libGrandMarche254')"></span>
          </dt>
          <dd>
            <span>{{ table1.libGrandMarche254 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codePrix255')"></span>
          </dt>
          <dd>
            <span>{{ table1.codePrix255 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.categPrix256')"></span>
          </dt>
          <dd>
            <span>{{ table1.categPrix256 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.libPrix257')"></span>
          </dt>
          <dd>
            <span>{{ table1.libPrix257 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numChb258')"></span>
          </dt>
          <dd>
            <span>{{ table1.numChb258 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChb259')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChb259 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChb260')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChb260 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.classChb261')"></span>
          </dt>
          <dd>
            <span>{{ table1.classChb261 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.caractChb262')"></span>
          </dt>
          <dd>
            <span>{{ table1.caractChb262 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeChbDeReservation263')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeChbDeReservation263 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.descriptionTypeChbDeResv264')"></span>
          </dt>
          <dd>
            <span>{{ table1.descriptionTypeChbDeResv264 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.codeTypeChbDeResv265')"></span>
          </dt>
          <dd>
            <span>{{ table1.codeTypeChbDeResv265 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDeReservation266')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDeReservation266 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribution267')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribution267 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.circuitDistribUserRegroup268')"></span>
          </dt>
          <dd>
            <span>{{ table1.circuitDistribUserRegroup268 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.numCrs269')"></span>
          </dt>
          <dd>
            <span>{{ table1.numCrs269 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.typeRefCrs270')"></span>
          </dt>
          <dd>
            <span>{{ table1.typeRefCrs270 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.crsInsertDate271')"></span>
          </dt>
          <dd>
            <span>{{ table1.crsInsertDate271 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateCreaResv272')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateCreaResv272 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.datePremier273')"></span>
          </dt>
          <dd>
            <span>{{ table1.datePremier273 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutPremier274')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutPremier274 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernier275')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernier275 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernier276')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernier276 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.dateDernierPseudo277')"></span>
          </dt>
          <dd>
            <span>{{ table1.dateDernierPseudo277 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.statutDernierPseudo278')"></span>
          </dt>
          <dd>
            <span>{{ table1.statutDernierPseudo278 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtCreaAnn279')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtCreaAnn279 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.diffDtArrAnn280')"></span>
          </dt>
          <dd>
            <span>{{ table1.diffDtArrAnn280 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.leadtime281')"></span>
          </dt>
          <dd>
            <span>{{ table1.leadtime281 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.los282')"></span>
          </dt>
          <dd>
            <span>{{ table1.los282 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.occupantsGroupe283')"></span>
          </dt>
          <dd>
            <span>{{ table1.occupantsGroupe283 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuitee284')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuitee284 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbNuiteeNnDed285')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbNuiteeNnDed285 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbResvAnn286')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbResvAnn286 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbAdu287')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbAdu287 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbEnf288')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbEnf288 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDayU289')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDayU289 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersArr290')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersArr290 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersDep291')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersDep291 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersAnn292')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersAnn292 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbPersNoshow293')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbPersNoshow293 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDayU294')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDayU294 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbArr295')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbArr295 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbDep296')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbDep296 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbAnn297')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbAnn297 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.nbChbNoshow298')"></span>
          </dt>
          <dd>
            <span>{{ table1.nbChbNoshow298 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambre299')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambre299 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambre300')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambre300 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetChambreGlobal301')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetChambreGlobal301 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeChambreGlobal302')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeChambreGlobal302 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBq303')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBq303 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBq304')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBq304 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetBqGlobal305')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetBqGlobal305 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeBqGlobal306')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeBqGlobal306 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtra307')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtra307 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtra308')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtra308 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuNetExtraGlobal309')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuNetExtraGlobal309 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table1.revenuTaxeExtraGlobal310')"></span>
          </dt>
          <dd>
            <span>{{ table1.revenuTaxeExtraGlobal310 }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.back')"></span>
        </button>
        <router-link v-if="table1.id" :to="{ name: 'Table1Edit', params: { table1Id: table1.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.edit')"></span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./table-1-details.component.ts"></script>
