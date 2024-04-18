<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <div v-if="table6">
        <h2 class="jh-entity-heading" data-cy="table6DetailsHeading">
          <span v-text="t$('big10SampleApplicationApp.table6.detail.title')"></span> {{ table6.id }}
        </h2>
        <dl class="row jh-entity-details">
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numLigne1')"></span>
          </dt>
          <dd>
            <span>{{ table6.numLigne1 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resort2')"></span>
          </dt>
          <dd>
            <span>{{ table6.resort2 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resvNameId3')"></span>
          </dt>
          <dd>
            <span>{{ table6.resvNameId3 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientOId4')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientOId4 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChb5')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChb5 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.confirmationNo6')"></span>
          </dt>
          <dd>
            <span>{{ table6.confirmationNo6 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientMdmId7')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientMdmId7 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nameId8')"></span>
          </dt>
          <dd>
            <span>{{ table6.nameId8 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.parentResvNameId9')"></span>
          </dt>
          <dd>
            <span>{{ table6.parentResvNameId9 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.contactId10')"></span>
          </dt>
          <dd>
            <span>{{ table6.contactId10 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceId11')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceId11 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceNom12')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceNom12 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.societeId13')"></span>
          </dt>
          <dd>
            <span>{{ table6.societeId13 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.groupeId14')"></span>
          </dt>
          <dd>
            <span>{{ table6.groupeId14 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numBloc15')"></span>
          </dt>
          <dd>
            <span>{{ table6.numBloc15 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeResv16')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeResv16 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutResv17')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutResv17 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDebutResv18')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDebutResv18 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateFinResv19')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateFinResv19 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateDebutResv20')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateDebutResv20 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateFinResv21')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateFinResv21 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateAnnResv22')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateAnnResv22 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.pseudoRoomYn23')"></span>
          </dt>
          <dd>
            <span>{{ table6.pseudoRoomYn23 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.createurResv24')"></span>
          </dt>
          <dd>
            <span>{{ table6.createurResv24 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nomCreateurResv25')"></span>
          </dt>
          <dd>
            <span>{{ table6.nomCreateurResv25 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGarantie26')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGarantie26 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.flgDed27')"></span>
          </dt>
          <dd>
            <span>{{ table6.flgDed27 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePays28')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePays28 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPays29')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPays29 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeNationalite30')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeNationalite30 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libNationalite31')"></span>
          </dt>
          <dd>
            <span>{{ table6.libNationalite31 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeSource32')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeSource32 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libSource33')"></span>
          </dt>
          <dd>
            <span>{{ table6.libSource33 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandSource34')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandSource34 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeOrigine35')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeOrigine35 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libOrigine36')"></span>
          </dt>
          <dd>
            <span>{{ table6.libOrigine36 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeMarche37')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeMarche37 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libMarche38')"></span>
          </dt>
          <dd>
            <span>{{ table6.libMarche38 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandMarche39')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandMarche39 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libGrandMarche40')"></span>
          </dt>
          <dd>
            <span>{{ table6.libGrandMarche40 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePrix41')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePrix41 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.categPrix42')"></span>
          </dt>
          <dd>
            <span>{{ table6.categPrix42 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPrix43')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPrix43 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numChb44')"></span>
          </dt>
          <dd>
            <span>{{ table6.numChb44 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChb45')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChb45 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChb46')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChb46 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.classChb47')"></span>
          </dt>
          <dd>
            <span>{{ table6.classChb47 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.caractChb48')"></span>
          </dt>
          <dd>
            <span>{{ table6.caractChb48 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChbDeReservation49')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChbDeReservation49 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChbDeResv50')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChbDeResv50 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChbDeResv51')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChbDeResv51 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDeReservation52')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDeReservation52 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribution53')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribution53 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribUserRegroup54')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribUserRegroup54 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numCrs55')"></span>
          </dt>
          <dd>
            <span>{{ table6.numCrs55 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeRefCrs56')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeRefCrs56 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.crsInsertDate57')"></span>
          </dt>
          <dd>
            <span>{{ table6.crsInsertDate57 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateCreaResv58')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateCreaResv58 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.datePremier59')"></span>
          </dt>
          <dd>
            <span>{{ table6.datePremier59 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutPremier60')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutPremier60 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernier61')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernier61 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernier62')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernier62 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernierPseudo63')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernierPseudo63 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernierPseudo64')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernierPseudo64 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtCreaAnn65')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtCreaAnn65 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtArrAnn66')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtArrAnn66 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.leadtime67')"></span>
          </dt>
          <dd>
            <span>{{ table6.leadtime67 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.los68')"></span>
          </dt>
          <dd>
            <span>{{ table6.los68 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.occupantsGroupe69')"></span>
          </dt>
          <dd>
            <span>{{ table6.occupantsGroupe69 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuitee70')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuitee70 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuiteeNnDed71')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuiteeNnDed71 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbResvAnn72')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbResvAnn72 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbAdu73')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbAdu73 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbEnf74')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbEnf74 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDayU75')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDayU75 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersArr76')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersArr76 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDep77')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDep77 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersAnn78')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersAnn78 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersNoshow79')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersNoshow79 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDayU80')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDayU80 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbArr81')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbArr81 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDep82')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDep82 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbAnn83')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbAnn83 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbNoshow84')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbNoshow84 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambre85')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambre85 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambre86')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambre86 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambreGlobal87')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambreGlobal87 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambreGlobal88')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambreGlobal88 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBq89')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBq89 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBq90')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBq90 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBqGlobal91')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBqGlobal91 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBqGlobal92')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBqGlobal92 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtra93')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtra93 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtra94')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtra94 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtraGlobal95')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtraGlobal95 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtraGlobal96')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtraGlobal96 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetTotal97')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetTotal97 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeTotal98')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeTotal98 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetTotalGlobal99')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetTotalGlobal99 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeTotalGlobal100')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeTotalGlobal100 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuChambre101')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuChambre101 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuBq102')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuBq102 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuExtra103')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuExtra103 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuTotal104')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuTotal104 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodChambreNbNuitees105')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodChambreNbNuitees105 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.techCreateDate106')"></span>
          </dt>
          <dd>
            <span>{{ table6.techCreateDate106 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.techUpdateDate107')"></span>
          </dt>
          <dd>
            <span>{{ table6.techUpdateDate107 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numLigne108')"></span>
          </dt>
          <dd>
            <span>{{ table6.numLigne108 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resort109')"></span>
          </dt>
          <dd>
            <span>{{ table6.resort109 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resvNameId110')"></span>
          </dt>
          <dd>
            <span>{{ table6.resvNameId110 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientOId111')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientOId111 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChb112')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChb112 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.confirmationNo113')"></span>
          </dt>
          <dd>
            <span>{{ table6.confirmationNo113 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientMdmId114')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientMdmId114 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nameId115')"></span>
          </dt>
          <dd>
            <span>{{ table6.nameId115 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.parentResvNameId116')"></span>
          </dt>
          <dd>
            <span>{{ table6.parentResvNameId116 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.contactId117')"></span>
          </dt>
          <dd>
            <span>{{ table6.contactId117 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceId118')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceId118 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceNom119')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceNom119 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.societeId120')"></span>
          </dt>
          <dd>
            <span>{{ table6.societeId120 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.groupeId121')"></span>
          </dt>
          <dd>
            <span>{{ table6.groupeId121 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numBloc122')"></span>
          </dt>
          <dd>
            <span>{{ table6.numBloc122 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeResv123')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeResv123 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutResv124')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutResv124 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDebutResv125')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDebutResv125 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateFinResv126')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateFinResv126 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateDebutResv127')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateDebutResv127 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateFinResv128')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateFinResv128 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateAnnResv129')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateAnnResv129 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.pseudoRoomYn130')"></span>
          </dt>
          <dd>
            <span>{{ table6.pseudoRoomYn130 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.createurResv131')"></span>
          </dt>
          <dd>
            <span>{{ table6.createurResv131 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nomCreateurResv132')"></span>
          </dt>
          <dd>
            <span>{{ table6.nomCreateurResv132 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGarantie133')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGarantie133 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.flgDed134')"></span>
          </dt>
          <dd>
            <span>{{ table6.flgDed134 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePays135')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePays135 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPays136')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPays136 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeNationalite137')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeNationalite137 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libNationalite138')"></span>
          </dt>
          <dd>
            <span>{{ table6.libNationalite138 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeSource139')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeSource139 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libSource140')"></span>
          </dt>
          <dd>
            <span>{{ table6.libSource140 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandSource141')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandSource141 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeOrigine142')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeOrigine142 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libOrigine143')"></span>
          </dt>
          <dd>
            <span>{{ table6.libOrigine143 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeMarche144')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeMarche144 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libMarche145')"></span>
          </dt>
          <dd>
            <span>{{ table6.libMarche145 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandMarche146')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandMarche146 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libGrandMarche147')"></span>
          </dt>
          <dd>
            <span>{{ table6.libGrandMarche147 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePrix148')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePrix148 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.categPrix149')"></span>
          </dt>
          <dd>
            <span>{{ table6.categPrix149 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPrix150')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPrix150 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numChb151')"></span>
          </dt>
          <dd>
            <span>{{ table6.numChb151 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChb152')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChb152 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChb153')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChb153 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.classChb154')"></span>
          </dt>
          <dd>
            <span>{{ table6.classChb154 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.caractChb155')"></span>
          </dt>
          <dd>
            <span>{{ table6.caractChb155 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChbDeReservation156')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChbDeReservation156 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChbDeResv157')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChbDeResv157 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChbDeResv158')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChbDeResv158 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDeReservation159')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDeReservation159 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribution160')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribution160 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribUserRegroup161')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribUserRegroup161 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numCrs162')"></span>
          </dt>
          <dd>
            <span>{{ table6.numCrs162 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeRefCrs163')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeRefCrs163 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.crsInsertDate164')"></span>
          </dt>
          <dd>
            <span>{{ table6.crsInsertDate164 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateCreaResv165')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateCreaResv165 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.datePremier166')"></span>
          </dt>
          <dd>
            <span>{{ table6.datePremier166 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutPremier167')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutPremier167 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernier168')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernier168 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernier169')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernier169 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernierPseudo170')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernierPseudo170 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernierPseudo171')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernierPseudo171 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtCreaAnn172')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtCreaAnn172 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtArrAnn173')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtArrAnn173 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.leadtime174')"></span>
          </dt>
          <dd>
            <span>{{ table6.leadtime174 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.los175')"></span>
          </dt>
          <dd>
            <span>{{ table6.los175 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.occupantsGroupe176')"></span>
          </dt>
          <dd>
            <span>{{ table6.occupantsGroupe176 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuitee177')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuitee177 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuiteeNnDed178')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuiteeNnDed178 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbResvAnn179')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbResvAnn179 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbAdu180')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbAdu180 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbEnf181')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbEnf181 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDayU182')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDayU182 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersArr183')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersArr183 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDep184')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDep184 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersAnn185')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersAnn185 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersNoshow186')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersNoshow186 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDayU187')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDayU187 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbArr188')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbArr188 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDep189')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDep189 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbAnn190')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbAnn190 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbNoshow191')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbNoshow191 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambre192')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambre192 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambre193')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambre193 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambreGlobal194')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambreGlobal194 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambreGlobal195')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambreGlobal195 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBq196')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBq196 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBq197')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBq197 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBqGlobal198')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBqGlobal198 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBqGlobal199')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBqGlobal199 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtra200')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtra200 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtra201')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtra201 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtraGlobal202')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtraGlobal202 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtraGlobal203')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtraGlobal203 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetTotal204')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetTotal204 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeTotal205')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeTotal205 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetTotalGlobal206')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetTotalGlobal206 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeTotalGlobal207')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeTotalGlobal207 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuChambre208')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuChambre208 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuBq209')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuBq209 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuExtra210')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuExtra210 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodRevenuTotal211')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodRevenuTotal211 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.prodChambreNbNuitees212')"></span>
          </dt>
          <dd>
            <span>{{ table6.prodChambreNbNuitees212 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.techCreateDate213')"></span>
          </dt>
          <dd>
            <span>{{ table6.techCreateDate213 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.techUpdateDate214')"></span>
          </dt>
          <dd>
            <span>{{ table6.techUpdateDate214 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numLigne215')"></span>
          </dt>
          <dd>
            <span>{{ table6.numLigne215 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resort216')"></span>
          </dt>
          <dd>
            <span>{{ table6.resort216 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.resvNameId217')"></span>
          </dt>
          <dd>
            <span>{{ table6.resvNameId217 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientOId218')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientOId218 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChb219')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChb219 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.confirmationNo220')"></span>
          </dt>
          <dd>
            <span>{{ table6.confirmationNo220 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.clientMdmId221')"></span>
          </dt>
          <dd>
            <span>{{ table6.clientMdmId221 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nameId222')"></span>
          </dt>
          <dd>
            <span>{{ table6.nameId222 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.parentResvNameId223')"></span>
          </dt>
          <dd>
            <span>{{ table6.parentResvNameId223 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.contactId224')"></span>
          </dt>
          <dd>
            <span>{{ table6.contactId224 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceId225')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceId225 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.agenceNom226')"></span>
          </dt>
          <dd>
            <span>{{ table6.agenceNom226 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.societeId227')"></span>
          </dt>
          <dd>
            <span>{{ table6.societeId227 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.groupeId228')"></span>
          </dt>
          <dd>
            <span>{{ table6.groupeId228 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numBloc229')"></span>
          </dt>
          <dd>
            <span>{{ table6.numBloc229 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeResv230')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeResv230 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutResv231')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutResv231 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDebutResv232')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDebutResv232 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateFinResv233')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateFinResv233 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateDebutResv234')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateDebutResv234 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.truncDateFinResv235')"></span>
          </dt>
          <dd>
            <span>{{ table6.truncDateFinResv235 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateAnnResv236')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateAnnResv236 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.pseudoRoomYn237')"></span>
          </dt>
          <dd>
            <span>{{ table6.pseudoRoomYn237 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.createurResv238')"></span>
          </dt>
          <dd>
            <span>{{ table6.createurResv238 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nomCreateurResv239')"></span>
          </dt>
          <dd>
            <span>{{ table6.nomCreateurResv239 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGarantie240')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGarantie240 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.flgDed241')"></span>
          </dt>
          <dd>
            <span>{{ table6.flgDed241 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePays242')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePays242 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPays243')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPays243 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeNationalite244')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeNationalite244 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libNationalite245')"></span>
          </dt>
          <dd>
            <span>{{ table6.libNationalite245 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeSource246')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeSource246 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libSource247')"></span>
          </dt>
          <dd>
            <span>{{ table6.libSource247 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandSource248')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandSource248 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeOrigine249')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeOrigine249 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libOrigine250')"></span>
          </dt>
          <dd>
            <span>{{ table6.libOrigine250 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeMarche251')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeMarche251 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libMarche252')"></span>
          </dt>
          <dd>
            <span>{{ table6.libMarche252 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeGrandMarche253')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeGrandMarche253 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libGrandMarche254')"></span>
          </dt>
          <dd>
            <span>{{ table6.libGrandMarche254 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codePrix255')"></span>
          </dt>
          <dd>
            <span>{{ table6.codePrix255 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.categPrix256')"></span>
          </dt>
          <dd>
            <span>{{ table6.categPrix256 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.libPrix257')"></span>
          </dt>
          <dd>
            <span>{{ table6.libPrix257 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numChb258')"></span>
          </dt>
          <dd>
            <span>{{ table6.numChb258 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChb259')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChb259 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChb260')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChb260 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.classChb261')"></span>
          </dt>
          <dd>
            <span>{{ table6.classChb261 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.caractChb262')"></span>
          </dt>
          <dd>
            <span>{{ table6.caractChb262 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeChbDeReservation263')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeChbDeReservation263 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.descriptionTypeChbDeResv264')"></span>
          </dt>
          <dd>
            <span>{{ table6.descriptionTypeChbDeResv264 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.codeTypeChbDeResv265')"></span>
          </dt>
          <dd>
            <span>{{ table6.codeTypeChbDeResv265 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDeReservation266')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDeReservation266 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribution267')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribution267 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.circuitDistribUserRegroup268')"></span>
          </dt>
          <dd>
            <span>{{ table6.circuitDistribUserRegroup268 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.numCrs269')"></span>
          </dt>
          <dd>
            <span>{{ table6.numCrs269 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.typeRefCrs270')"></span>
          </dt>
          <dd>
            <span>{{ table6.typeRefCrs270 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.crsInsertDate271')"></span>
          </dt>
          <dd>
            <span>{{ table6.crsInsertDate271 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateCreaResv272')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateCreaResv272 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.datePremier273')"></span>
          </dt>
          <dd>
            <span>{{ table6.datePremier273 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutPremier274')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutPremier274 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernier275')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernier275 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernier276')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernier276 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.dateDernierPseudo277')"></span>
          </dt>
          <dd>
            <span>{{ table6.dateDernierPseudo277 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.statutDernierPseudo278')"></span>
          </dt>
          <dd>
            <span>{{ table6.statutDernierPseudo278 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtCreaAnn279')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtCreaAnn279 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.diffDtArrAnn280')"></span>
          </dt>
          <dd>
            <span>{{ table6.diffDtArrAnn280 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.leadtime281')"></span>
          </dt>
          <dd>
            <span>{{ table6.leadtime281 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.los282')"></span>
          </dt>
          <dd>
            <span>{{ table6.los282 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.occupantsGroupe283')"></span>
          </dt>
          <dd>
            <span>{{ table6.occupantsGroupe283 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuitee284')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuitee284 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbNuiteeNnDed285')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbNuiteeNnDed285 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbResvAnn286')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbResvAnn286 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbAdu287')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbAdu287 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbEnf288')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbEnf288 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDayU289')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDayU289 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersArr290')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersArr290 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersDep291')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersDep291 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersAnn292')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersAnn292 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbPersNoshow293')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbPersNoshow293 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDayU294')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDayU294 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbArr295')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbArr295 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbDep296')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbDep296 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbAnn297')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbAnn297 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.nbChbNoshow298')"></span>
          </dt>
          <dd>
            <span>{{ table6.nbChbNoshow298 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambre299')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambre299 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambre300')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambre300 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetChambreGlobal301')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetChambreGlobal301 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeChambreGlobal302')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeChambreGlobal302 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBq303')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBq303 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBq304')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBq304 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetBqGlobal305')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetBqGlobal305 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeBqGlobal306')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeBqGlobal306 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtra307')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtra307 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtra308')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtra308 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuNetExtraGlobal309')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuNetExtraGlobal309 }}</span>
          </dd>
          <dt>
            <span v-text="t$('big10SampleApplicationApp.table6.revenuTaxeExtraGlobal310')"></span>
          </dt>
          <dd>
            <span>{{ table6.revenuTaxeExtraGlobal310 }}</span>
          </dd>
        </dl>
        <button type="submit" v-on:click.prevent="previousState()" class="btn btn-info" data-cy="entityDetailsBackButton">
          <font-awesome-icon icon="arrow-left"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.back')"></span>
        </button>
        <router-link v-if="table6.id" :to="{ name: 'Table6Edit', params: { table6Id: table6.id } }" custom v-slot="{ navigate }">
          <button @click="navigate" class="btn btn-primary">
            <font-awesome-icon icon="pencil-alt"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.edit')"></span>
          </button>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./table-6-details.component.ts"></script>
