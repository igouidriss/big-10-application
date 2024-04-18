<template>
  <div>
    <h2 id="page-heading" data-cy="Table5Heading">
      <span v-text="t$('big10SampleApplicationApp.table5.home.title')" id="table-5-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table5.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table5Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-5"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table5.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table5s && table5s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table5.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table5s && table5s.length > 0">
      <table class="table table-striped" aria-describedby="table5s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table5.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table5 in table5s" :key="table5.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table5View', params: { table5Id: table5.id } }">{{ table5.id }}</router-link>
            </td>
            <td>{{ table5.numLigne1 }}</td>
            <td>{{ table5.resort2 }}</td>
            <td>{{ table5.resvNameId3 }}</td>
            <td>{{ table5.clientOId4 }}</td>
            <td>{{ table5.typeChb5 }}</td>
            <td>{{ table5.confirmationNo6 }}</td>
            <td>{{ table5.clientMdmId7 }}</td>
            <td>{{ table5.nameId8 }}</td>
            <td>{{ table5.parentResvNameId9 }}</td>
            <td>{{ table5.contactId10 }}</td>
            <td>{{ table5.agenceId11 }}</td>
            <td>{{ table5.agenceNom12 }}</td>
            <td>{{ table5.societeId13 }}</td>
            <td>{{ table5.groupeId14 }}</td>
            <td>{{ table5.numBloc15 }}</td>
            <td>{{ table5.typeResv16 }}</td>
            <td>{{ table5.statutResv17 }}</td>
            <td>{{ table5.dateDebutResv18 }}</td>
            <td>{{ table5.dateFinResv19 }}</td>
            <td>{{ table5.truncDateDebutResv20 }}</td>
            <td>{{ table5.truncDateFinResv21 }}</td>
            <td>{{ table5.dateAnnResv22 }}</td>
            <td>{{ table5.pseudoRoomYn23 }}</td>
            <td>{{ table5.createurResv24 }}</td>
            <td>{{ table5.nomCreateurResv25 }}</td>
            <td>{{ table5.codeGarantie26 }}</td>
            <td>{{ table5.flgDed27 }}</td>
            <td>{{ table5.codePays28 }}</td>
            <td>{{ table5.libPays29 }}</td>
            <td>{{ table5.codeNationalite30 }}</td>
            <td>{{ table5.libNationalite31 }}</td>
            <td>{{ table5.codeSource32 }}</td>
            <td>{{ table5.libSource33 }}</td>
            <td>{{ table5.codeGrandSource34 }}</td>
            <td>{{ table5.codeOrigine35 }}</td>
            <td>{{ table5.libOrigine36 }}</td>
            <td>{{ table5.codeMarche37 }}</td>
            <td>{{ table5.libMarche38 }}</td>
            <td>{{ table5.codeGrandMarche39 }}</td>
            <td>{{ table5.libGrandMarche40 }}</td>
            <td>{{ table5.codePrix41 }}</td>
            <td>{{ table5.categPrix42 }}</td>
            <td>{{ table5.libPrix43 }}</td>
            <td>{{ table5.numChb44 }}</td>
            <td>{{ table5.descriptionTypeChb45 }}</td>
            <td>{{ table5.codeTypeChb46 }}</td>
            <td>{{ table5.classChb47 }}</td>
            <td>{{ table5.caractChb48 }}</td>
            <td>{{ table5.typeChbDeReservation49 }}</td>
            <td>{{ table5.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table5.codeTypeChbDeResv51 }}</td>
            <td>{{ table5.statutDeReservation52 }}</td>
            <td>{{ table5.circuitDistribution53 }}</td>
            <td>{{ table5.circuitDistribUserRegroup54 }}</td>
            <td>{{ table5.numCrs55 }}</td>
            <td>{{ table5.typeRefCrs56 }}</td>
            <td>{{ table5.crsInsertDate57 }}</td>
            <td>{{ table5.dateCreaResv58 }}</td>
            <td>{{ table5.datePremier59 }}</td>
            <td>{{ table5.statutPremier60 }}</td>
            <td>{{ table5.dateDernier61 }}</td>
            <td>{{ table5.statutDernier62 }}</td>
            <td>{{ table5.dateDernierPseudo63 }}</td>
            <td>{{ table5.statutDernierPseudo64 }}</td>
            <td>{{ table5.diffDtCreaAnn65 }}</td>
            <td>{{ table5.diffDtArrAnn66 }}</td>
            <td>{{ table5.leadtime67 }}</td>
            <td>{{ table5.los68 }}</td>
            <td>{{ table5.occupantsGroupe69 }}</td>
            <td>{{ table5.nbNuitee70 }}</td>
            <td>{{ table5.nbNuiteeNnDed71 }}</td>
            <td>{{ table5.nbResvAnn72 }}</td>
            <td>{{ table5.nbAdu73 }}</td>
            <td>{{ table5.nbEnf74 }}</td>
            <td>{{ table5.nbPersDayU75 }}</td>
            <td>{{ table5.nbPersArr76 }}</td>
            <td>{{ table5.nbPersDep77 }}</td>
            <td>{{ table5.nbPersAnn78 }}</td>
            <td>{{ table5.nbPersNoshow79 }}</td>
            <td>{{ table5.nbChbDayU80 }}</td>
            <td>{{ table5.nbChbArr81 }}</td>
            <td>{{ table5.nbChbDep82 }}</td>
            <td>{{ table5.nbChbAnn83 }}</td>
            <td>{{ table5.nbChbNoshow84 }}</td>
            <td>{{ table5.revenuNetChambre85 }}</td>
            <td>{{ table5.revenuTaxeChambre86 }}</td>
            <td>{{ table5.revenuNetChambreGlobal87 }}</td>
            <td>{{ table5.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table5.revenuNetBq89 }}</td>
            <td>{{ table5.revenuTaxeBq90 }}</td>
            <td>{{ table5.revenuNetBqGlobal91 }}</td>
            <td>{{ table5.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table5.revenuNetExtra93 }}</td>
            <td>{{ table5.revenuTaxeExtra94 }}</td>
            <td>{{ table5.revenuNetExtraGlobal95 }}</td>
            <td>{{ table5.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table5.revenuNetTotal97 }}</td>
            <td>{{ table5.revenuTaxeTotal98 }}</td>
            <td>{{ table5.revenuNetTotalGlobal99 }}</td>
            <td>{{ table5.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table5.prodRevenuChambre101 }}</td>
            <td>{{ table5.prodRevenuBq102 }}</td>
            <td>{{ table5.prodRevenuExtra103 }}</td>
            <td>{{ table5.prodRevenuTotal104 }}</td>
            <td>{{ table5.prodChambreNbNuitees105 }}</td>
            <td>{{ table5.techCreateDate106 }}</td>
            <td>{{ table5.techUpdateDate107 }}</td>
            <td>{{ table5.numLigne108 }}</td>
            <td>{{ table5.resort109 }}</td>
            <td>{{ table5.resvNameId110 }}</td>
            <td>{{ table5.clientOId111 }}</td>
            <td>{{ table5.typeChb112 }}</td>
            <td>{{ table5.confirmationNo113 }}</td>
            <td>{{ table5.clientMdmId114 }}</td>
            <td>{{ table5.nameId115 }}</td>
            <td>{{ table5.parentResvNameId116 }}</td>
            <td>{{ table5.contactId117 }}</td>
            <td>{{ table5.agenceId118 }}</td>
            <td>{{ table5.agenceNom119 }}</td>
            <td>{{ table5.societeId120 }}</td>
            <td>{{ table5.groupeId121 }}</td>
            <td>{{ table5.numBloc122 }}</td>
            <td>{{ table5.typeResv123 }}</td>
            <td>{{ table5.statutResv124 }}</td>
            <td>{{ table5.dateDebutResv125 }}</td>
            <td>{{ table5.dateFinResv126 }}</td>
            <td>{{ table5.truncDateDebutResv127 }}</td>
            <td>{{ table5.truncDateFinResv128 }}</td>
            <td>{{ table5.dateAnnResv129 }}</td>
            <td>{{ table5.pseudoRoomYn130 }}</td>
            <td>{{ table5.createurResv131 }}</td>
            <td>{{ table5.nomCreateurResv132 }}</td>
            <td>{{ table5.codeGarantie133 }}</td>
            <td>{{ table5.flgDed134 }}</td>
            <td>{{ table5.codePays135 }}</td>
            <td>{{ table5.libPays136 }}</td>
            <td>{{ table5.codeNationalite137 }}</td>
            <td>{{ table5.libNationalite138 }}</td>
            <td>{{ table5.codeSource139 }}</td>
            <td>{{ table5.libSource140 }}</td>
            <td>{{ table5.codeGrandSource141 }}</td>
            <td>{{ table5.codeOrigine142 }}</td>
            <td>{{ table5.libOrigine143 }}</td>
            <td>{{ table5.codeMarche144 }}</td>
            <td>{{ table5.libMarche145 }}</td>
            <td>{{ table5.codeGrandMarche146 }}</td>
            <td>{{ table5.libGrandMarche147 }}</td>
            <td>{{ table5.codePrix148 }}</td>
            <td>{{ table5.categPrix149 }}</td>
            <td>{{ table5.libPrix150 }}</td>
            <td>{{ table5.numChb151 }}</td>
            <td>{{ table5.descriptionTypeChb152 }}</td>
            <td>{{ table5.codeTypeChb153 }}</td>
            <td>{{ table5.classChb154 }}</td>
            <td>{{ table5.caractChb155 }}</td>
            <td>{{ table5.typeChbDeReservation156 }}</td>
            <td>{{ table5.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table5.codeTypeChbDeResv158 }}</td>
            <td>{{ table5.statutDeReservation159 }}</td>
            <td>{{ table5.circuitDistribution160 }}</td>
            <td>{{ table5.circuitDistribUserRegroup161 }}</td>
            <td>{{ table5.numCrs162 }}</td>
            <td>{{ table5.typeRefCrs163 }}</td>
            <td>{{ table5.crsInsertDate164 }}</td>
            <td>{{ table5.dateCreaResv165 }}</td>
            <td>{{ table5.datePremier166 }}</td>
            <td>{{ table5.statutPremier167 }}</td>
            <td>{{ table5.dateDernier168 }}</td>
            <td>{{ table5.statutDernier169 }}</td>
            <td>{{ table5.dateDernierPseudo170 }}</td>
            <td>{{ table5.statutDernierPseudo171 }}</td>
            <td>{{ table5.diffDtCreaAnn172 }}</td>
            <td>{{ table5.diffDtArrAnn173 }}</td>
            <td>{{ table5.leadtime174 }}</td>
            <td>{{ table5.los175 }}</td>
            <td>{{ table5.occupantsGroupe176 }}</td>
            <td>{{ table5.nbNuitee177 }}</td>
            <td>{{ table5.nbNuiteeNnDed178 }}</td>
            <td>{{ table5.nbResvAnn179 }}</td>
            <td>{{ table5.nbAdu180 }}</td>
            <td>{{ table5.nbEnf181 }}</td>
            <td>{{ table5.nbPersDayU182 }}</td>
            <td>{{ table5.nbPersArr183 }}</td>
            <td>{{ table5.nbPersDep184 }}</td>
            <td>{{ table5.nbPersAnn185 }}</td>
            <td>{{ table5.nbPersNoshow186 }}</td>
            <td>{{ table5.nbChbDayU187 }}</td>
            <td>{{ table5.nbChbArr188 }}</td>
            <td>{{ table5.nbChbDep189 }}</td>
            <td>{{ table5.nbChbAnn190 }}</td>
            <td>{{ table5.nbChbNoshow191 }}</td>
            <td>{{ table5.revenuNetChambre192 }}</td>
            <td>{{ table5.revenuTaxeChambre193 }}</td>
            <td>{{ table5.revenuNetChambreGlobal194 }}</td>
            <td>{{ table5.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table5.revenuNetBq196 }}</td>
            <td>{{ table5.revenuTaxeBq197 }}</td>
            <td>{{ table5.revenuNetBqGlobal198 }}</td>
            <td>{{ table5.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table5.revenuNetExtra200 }}</td>
            <td>{{ table5.revenuTaxeExtra201 }}</td>
            <td>{{ table5.revenuNetExtraGlobal202 }}</td>
            <td>{{ table5.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table5.revenuNetTotal204 }}</td>
            <td>{{ table5.revenuTaxeTotal205 }}</td>
            <td>{{ table5.revenuNetTotalGlobal206 }}</td>
            <td>{{ table5.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table5.prodRevenuChambre208 }}</td>
            <td>{{ table5.prodRevenuBq209 }}</td>
            <td>{{ table5.prodRevenuExtra210 }}</td>
            <td>{{ table5.prodRevenuTotal211 }}</td>
            <td>{{ table5.prodChambreNbNuitees212 }}</td>
            <td>{{ table5.techCreateDate213 }}</td>
            <td>{{ table5.techUpdateDate214 }}</td>
            <td>{{ table5.numLigne215 }}</td>
            <td>{{ table5.resort216 }}</td>
            <td>{{ table5.resvNameId217 }}</td>
            <td>{{ table5.clientOId218 }}</td>
            <td>{{ table5.typeChb219 }}</td>
            <td>{{ table5.confirmationNo220 }}</td>
            <td>{{ table5.clientMdmId221 }}</td>
            <td>{{ table5.nameId222 }}</td>
            <td>{{ table5.parentResvNameId223 }}</td>
            <td>{{ table5.contactId224 }}</td>
            <td>{{ table5.agenceId225 }}</td>
            <td>{{ table5.agenceNom226 }}</td>
            <td>{{ table5.societeId227 }}</td>
            <td>{{ table5.groupeId228 }}</td>
            <td>{{ table5.numBloc229 }}</td>
            <td>{{ table5.typeResv230 }}</td>
            <td>{{ table5.statutResv231 }}</td>
            <td>{{ table5.dateDebutResv232 }}</td>
            <td>{{ table5.dateFinResv233 }}</td>
            <td>{{ table5.truncDateDebutResv234 }}</td>
            <td>{{ table5.truncDateFinResv235 }}</td>
            <td>{{ table5.dateAnnResv236 }}</td>
            <td>{{ table5.pseudoRoomYn237 }}</td>
            <td>{{ table5.createurResv238 }}</td>
            <td>{{ table5.nomCreateurResv239 }}</td>
            <td>{{ table5.codeGarantie240 }}</td>
            <td>{{ table5.flgDed241 }}</td>
            <td>{{ table5.codePays242 }}</td>
            <td>{{ table5.libPays243 }}</td>
            <td>{{ table5.codeNationalite244 }}</td>
            <td>{{ table5.libNationalite245 }}</td>
            <td>{{ table5.codeSource246 }}</td>
            <td>{{ table5.libSource247 }}</td>
            <td>{{ table5.codeGrandSource248 }}</td>
            <td>{{ table5.codeOrigine249 }}</td>
            <td>{{ table5.libOrigine250 }}</td>
            <td>{{ table5.codeMarche251 }}</td>
            <td>{{ table5.libMarche252 }}</td>
            <td>{{ table5.codeGrandMarche253 }}</td>
            <td>{{ table5.libGrandMarche254 }}</td>
            <td>{{ table5.codePrix255 }}</td>
            <td>{{ table5.categPrix256 }}</td>
            <td>{{ table5.libPrix257 }}</td>
            <td>{{ table5.numChb258 }}</td>
            <td>{{ table5.descriptionTypeChb259 }}</td>
            <td>{{ table5.codeTypeChb260 }}</td>
            <td>{{ table5.classChb261 }}</td>
            <td>{{ table5.caractChb262 }}</td>
            <td>{{ table5.typeChbDeReservation263 }}</td>
            <td>{{ table5.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table5.codeTypeChbDeResv265 }}</td>
            <td>{{ table5.statutDeReservation266 }}</td>
            <td>{{ table5.circuitDistribution267 }}</td>
            <td>{{ table5.circuitDistribUserRegroup268 }}</td>
            <td>{{ table5.numCrs269 }}</td>
            <td>{{ table5.typeRefCrs270 }}</td>
            <td>{{ table5.crsInsertDate271 }}</td>
            <td>{{ table5.dateCreaResv272 }}</td>
            <td>{{ table5.datePremier273 }}</td>
            <td>{{ table5.statutPremier274 }}</td>
            <td>{{ table5.dateDernier275 }}</td>
            <td>{{ table5.statutDernier276 }}</td>
            <td>{{ table5.dateDernierPseudo277 }}</td>
            <td>{{ table5.statutDernierPseudo278 }}</td>
            <td>{{ table5.diffDtCreaAnn279 }}</td>
            <td>{{ table5.diffDtArrAnn280 }}</td>
            <td>{{ table5.leadtime281 }}</td>
            <td>{{ table5.los282 }}</td>
            <td>{{ table5.occupantsGroupe283 }}</td>
            <td>{{ table5.nbNuitee284 }}</td>
            <td>{{ table5.nbNuiteeNnDed285 }}</td>
            <td>{{ table5.nbResvAnn286 }}</td>
            <td>{{ table5.nbAdu287 }}</td>
            <td>{{ table5.nbEnf288 }}</td>
            <td>{{ table5.nbPersDayU289 }}</td>
            <td>{{ table5.nbPersArr290 }}</td>
            <td>{{ table5.nbPersDep291 }}</td>
            <td>{{ table5.nbPersAnn292 }}</td>
            <td>{{ table5.nbPersNoshow293 }}</td>
            <td>{{ table5.nbChbDayU294 }}</td>
            <td>{{ table5.nbChbArr295 }}</td>
            <td>{{ table5.nbChbDep296 }}</td>
            <td>{{ table5.nbChbAnn297 }}</td>
            <td>{{ table5.nbChbNoshow298 }}</td>
            <td>{{ table5.revenuNetChambre299 }}</td>
            <td>{{ table5.revenuTaxeChambre300 }}</td>
            <td>{{ table5.revenuNetChambreGlobal301 }}</td>
            <td>{{ table5.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table5.revenuNetBq303 }}</td>
            <td>{{ table5.revenuTaxeBq304 }}</td>
            <td>{{ table5.revenuNetBqGlobal305 }}</td>
            <td>{{ table5.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table5.revenuNetExtra307 }}</td>
            <td>{{ table5.revenuTaxeExtra308 }}</td>
            <td>{{ table5.revenuNetExtraGlobal309 }}</td>
            <td>{{ table5.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table5View', params: { table5Id: table5.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table5Edit', params: { table5Id: table5.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table5)"
                  variant="danger"
                  class="btn btn-sm"
                  data-cy="entityDeleteButton"
                  v-b-modal.removeEntity
                >
                  <font-awesome-icon icon="times"></font-awesome-icon>
                  <span class="d-none d-md-inline" v-text="t$('entity.action.delete')"></span>
                </b-button>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <b-modal ref="removeEntity" id="removeEntity">
      <template #modal-title>
        <span
          id="big10SampleApplicationApp.table5.delete.question"
          data-cy="table5DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table5-heading" v-text="t$('big10SampleApplicationApp.table5.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table5"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable5()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-5.component.ts"></script>
