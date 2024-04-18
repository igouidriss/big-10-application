<template>
  <div>
    <h2 id="page-heading" data-cy="Table10Heading">
      <span v-text="t$('big10SampleApplicationApp.table10.home.title')" id="table-10-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table10.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table10Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-10"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table10.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table10s && table10s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table10.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table10s && table10s.length > 0">
      <table class="table table-striped" aria-describedby="table10s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table10.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table10 in table10s" :key="table10.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table10View', params: { table10Id: table10.id } }">{{ table10.id }}</router-link>
            </td>
            <td>{{ table10.numLigne1 }}</td>
            <td>{{ table10.resort2 }}</td>
            <td>{{ table10.resvNameId3 }}</td>
            <td>{{ table10.clientOId4 }}</td>
            <td>{{ table10.typeChb5 }}</td>
            <td>{{ table10.confirmationNo6 }}</td>
            <td>{{ table10.clientMdmId7 }}</td>
            <td>{{ table10.nameId8 }}</td>
            <td>{{ table10.parentResvNameId9 }}</td>
            <td>{{ table10.contactId10 }}</td>
            <td>{{ table10.agenceId11 }}</td>
            <td>{{ table10.agenceNom12 }}</td>
            <td>{{ table10.societeId13 }}</td>
            <td>{{ table10.groupeId14 }}</td>
            <td>{{ table10.numBloc15 }}</td>
            <td>{{ table10.typeResv16 }}</td>
            <td>{{ table10.statutResv17 }}</td>
            <td>{{ table10.dateDebutResv18 }}</td>
            <td>{{ table10.dateFinResv19 }}</td>
            <td>{{ table10.truncDateDebutResv20 }}</td>
            <td>{{ table10.truncDateFinResv21 }}</td>
            <td>{{ table10.dateAnnResv22 }}</td>
            <td>{{ table10.pseudoRoomYn23 }}</td>
            <td>{{ table10.createurResv24 }}</td>
            <td>{{ table10.nomCreateurResv25 }}</td>
            <td>{{ table10.codeGarantie26 }}</td>
            <td>{{ table10.flgDed27 }}</td>
            <td>{{ table10.codePays28 }}</td>
            <td>{{ table10.libPays29 }}</td>
            <td>{{ table10.codeNationalite30 }}</td>
            <td>{{ table10.libNationalite31 }}</td>
            <td>{{ table10.codeSource32 }}</td>
            <td>{{ table10.libSource33 }}</td>
            <td>{{ table10.codeGrandSource34 }}</td>
            <td>{{ table10.codeOrigine35 }}</td>
            <td>{{ table10.libOrigine36 }}</td>
            <td>{{ table10.codeMarche37 }}</td>
            <td>{{ table10.libMarche38 }}</td>
            <td>{{ table10.codeGrandMarche39 }}</td>
            <td>{{ table10.libGrandMarche40 }}</td>
            <td>{{ table10.codePrix41 }}</td>
            <td>{{ table10.categPrix42 }}</td>
            <td>{{ table10.libPrix43 }}</td>
            <td>{{ table10.numChb44 }}</td>
            <td>{{ table10.descriptionTypeChb45 }}</td>
            <td>{{ table10.codeTypeChb46 }}</td>
            <td>{{ table10.classChb47 }}</td>
            <td>{{ table10.caractChb48 }}</td>
            <td>{{ table10.typeChbDeReservation49 }}</td>
            <td>{{ table10.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table10.codeTypeChbDeResv51 }}</td>
            <td>{{ table10.statutDeReservation52 }}</td>
            <td>{{ table10.circuitDistribution53 }}</td>
            <td>{{ table10.circuitDistribUserRegroup54 }}</td>
            <td>{{ table10.numCrs55 }}</td>
            <td>{{ table10.typeRefCrs56 }}</td>
            <td>{{ table10.crsInsertDate57 }}</td>
            <td>{{ table10.dateCreaResv58 }}</td>
            <td>{{ table10.datePremier59 }}</td>
            <td>{{ table10.statutPremier60 }}</td>
            <td>{{ table10.dateDernier61 }}</td>
            <td>{{ table10.statutDernier62 }}</td>
            <td>{{ table10.dateDernierPseudo63 }}</td>
            <td>{{ table10.statutDernierPseudo64 }}</td>
            <td>{{ table10.diffDtCreaAnn65 }}</td>
            <td>{{ table10.diffDtArrAnn66 }}</td>
            <td>{{ table10.leadtime67 }}</td>
            <td>{{ table10.los68 }}</td>
            <td>{{ table10.occupantsGroupe69 }}</td>
            <td>{{ table10.nbNuitee70 }}</td>
            <td>{{ table10.nbNuiteeNnDed71 }}</td>
            <td>{{ table10.nbResvAnn72 }}</td>
            <td>{{ table10.nbAdu73 }}</td>
            <td>{{ table10.nbEnf74 }}</td>
            <td>{{ table10.nbPersDayU75 }}</td>
            <td>{{ table10.nbPersArr76 }}</td>
            <td>{{ table10.nbPersDep77 }}</td>
            <td>{{ table10.nbPersAnn78 }}</td>
            <td>{{ table10.nbPersNoshow79 }}</td>
            <td>{{ table10.nbChbDayU80 }}</td>
            <td>{{ table10.nbChbArr81 }}</td>
            <td>{{ table10.nbChbDep82 }}</td>
            <td>{{ table10.nbChbAnn83 }}</td>
            <td>{{ table10.nbChbNoshow84 }}</td>
            <td>{{ table10.revenuNetChambre85 }}</td>
            <td>{{ table10.revenuTaxeChambre86 }}</td>
            <td>{{ table10.revenuNetChambreGlobal87 }}</td>
            <td>{{ table10.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table10.revenuNetBq89 }}</td>
            <td>{{ table10.revenuTaxeBq90 }}</td>
            <td>{{ table10.revenuNetBqGlobal91 }}</td>
            <td>{{ table10.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table10.revenuNetExtra93 }}</td>
            <td>{{ table10.revenuTaxeExtra94 }}</td>
            <td>{{ table10.revenuNetExtraGlobal95 }}</td>
            <td>{{ table10.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table10.revenuNetTotal97 }}</td>
            <td>{{ table10.revenuTaxeTotal98 }}</td>
            <td>{{ table10.revenuNetTotalGlobal99 }}</td>
            <td>{{ table10.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table10.prodRevenuChambre101 }}</td>
            <td>{{ table10.prodRevenuBq102 }}</td>
            <td>{{ table10.prodRevenuExtra103 }}</td>
            <td>{{ table10.prodRevenuTotal104 }}</td>
            <td>{{ table10.prodChambreNbNuitees105 }}</td>
            <td>{{ table10.techCreateDate106 }}</td>
            <td>{{ table10.techUpdateDate107 }}</td>
            <td>{{ table10.numLigne108 }}</td>
            <td>{{ table10.resort109 }}</td>
            <td>{{ table10.resvNameId110 }}</td>
            <td>{{ table10.clientOId111 }}</td>
            <td>{{ table10.typeChb112 }}</td>
            <td>{{ table10.confirmationNo113 }}</td>
            <td>{{ table10.clientMdmId114 }}</td>
            <td>{{ table10.nameId115 }}</td>
            <td>{{ table10.parentResvNameId116 }}</td>
            <td>{{ table10.contactId117 }}</td>
            <td>{{ table10.agenceId118 }}</td>
            <td>{{ table10.agenceNom119 }}</td>
            <td>{{ table10.societeId120 }}</td>
            <td>{{ table10.groupeId121 }}</td>
            <td>{{ table10.numBloc122 }}</td>
            <td>{{ table10.typeResv123 }}</td>
            <td>{{ table10.statutResv124 }}</td>
            <td>{{ table10.dateDebutResv125 }}</td>
            <td>{{ table10.dateFinResv126 }}</td>
            <td>{{ table10.truncDateDebutResv127 }}</td>
            <td>{{ table10.truncDateFinResv128 }}</td>
            <td>{{ table10.dateAnnResv129 }}</td>
            <td>{{ table10.pseudoRoomYn130 }}</td>
            <td>{{ table10.createurResv131 }}</td>
            <td>{{ table10.nomCreateurResv132 }}</td>
            <td>{{ table10.codeGarantie133 }}</td>
            <td>{{ table10.flgDed134 }}</td>
            <td>{{ table10.codePays135 }}</td>
            <td>{{ table10.libPays136 }}</td>
            <td>{{ table10.codeNationalite137 }}</td>
            <td>{{ table10.libNationalite138 }}</td>
            <td>{{ table10.codeSource139 }}</td>
            <td>{{ table10.libSource140 }}</td>
            <td>{{ table10.codeGrandSource141 }}</td>
            <td>{{ table10.codeOrigine142 }}</td>
            <td>{{ table10.libOrigine143 }}</td>
            <td>{{ table10.codeMarche144 }}</td>
            <td>{{ table10.libMarche145 }}</td>
            <td>{{ table10.codeGrandMarche146 }}</td>
            <td>{{ table10.libGrandMarche147 }}</td>
            <td>{{ table10.codePrix148 }}</td>
            <td>{{ table10.categPrix149 }}</td>
            <td>{{ table10.libPrix150 }}</td>
            <td>{{ table10.numChb151 }}</td>
            <td>{{ table10.descriptionTypeChb152 }}</td>
            <td>{{ table10.codeTypeChb153 }}</td>
            <td>{{ table10.classChb154 }}</td>
            <td>{{ table10.caractChb155 }}</td>
            <td>{{ table10.typeChbDeReservation156 }}</td>
            <td>{{ table10.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table10.codeTypeChbDeResv158 }}</td>
            <td>{{ table10.statutDeReservation159 }}</td>
            <td>{{ table10.circuitDistribution160 }}</td>
            <td>{{ table10.circuitDistribUserRegroup161 }}</td>
            <td>{{ table10.numCrs162 }}</td>
            <td>{{ table10.typeRefCrs163 }}</td>
            <td>{{ table10.crsInsertDate164 }}</td>
            <td>{{ table10.dateCreaResv165 }}</td>
            <td>{{ table10.datePremier166 }}</td>
            <td>{{ table10.statutPremier167 }}</td>
            <td>{{ table10.dateDernier168 }}</td>
            <td>{{ table10.statutDernier169 }}</td>
            <td>{{ table10.dateDernierPseudo170 }}</td>
            <td>{{ table10.statutDernierPseudo171 }}</td>
            <td>{{ table10.diffDtCreaAnn172 }}</td>
            <td>{{ table10.diffDtArrAnn173 }}</td>
            <td>{{ table10.leadtime174 }}</td>
            <td>{{ table10.los175 }}</td>
            <td>{{ table10.occupantsGroupe176 }}</td>
            <td>{{ table10.nbNuitee177 }}</td>
            <td>{{ table10.nbNuiteeNnDed178 }}</td>
            <td>{{ table10.nbResvAnn179 }}</td>
            <td>{{ table10.nbAdu180 }}</td>
            <td>{{ table10.nbEnf181 }}</td>
            <td>{{ table10.nbPersDayU182 }}</td>
            <td>{{ table10.nbPersArr183 }}</td>
            <td>{{ table10.nbPersDep184 }}</td>
            <td>{{ table10.nbPersAnn185 }}</td>
            <td>{{ table10.nbPersNoshow186 }}</td>
            <td>{{ table10.nbChbDayU187 }}</td>
            <td>{{ table10.nbChbArr188 }}</td>
            <td>{{ table10.nbChbDep189 }}</td>
            <td>{{ table10.nbChbAnn190 }}</td>
            <td>{{ table10.nbChbNoshow191 }}</td>
            <td>{{ table10.revenuNetChambre192 }}</td>
            <td>{{ table10.revenuTaxeChambre193 }}</td>
            <td>{{ table10.revenuNetChambreGlobal194 }}</td>
            <td>{{ table10.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table10.revenuNetBq196 }}</td>
            <td>{{ table10.revenuTaxeBq197 }}</td>
            <td>{{ table10.revenuNetBqGlobal198 }}</td>
            <td>{{ table10.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table10.revenuNetExtra200 }}</td>
            <td>{{ table10.revenuTaxeExtra201 }}</td>
            <td>{{ table10.revenuNetExtraGlobal202 }}</td>
            <td>{{ table10.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table10.revenuNetTotal204 }}</td>
            <td>{{ table10.revenuTaxeTotal205 }}</td>
            <td>{{ table10.revenuNetTotalGlobal206 }}</td>
            <td>{{ table10.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table10.prodRevenuChambre208 }}</td>
            <td>{{ table10.prodRevenuBq209 }}</td>
            <td>{{ table10.prodRevenuExtra210 }}</td>
            <td>{{ table10.prodRevenuTotal211 }}</td>
            <td>{{ table10.prodChambreNbNuitees212 }}</td>
            <td>{{ table10.techCreateDate213 }}</td>
            <td>{{ table10.techUpdateDate214 }}</td>
            <td>{{ table10.numLigne215 }}</td>
            <td>{{ table10.resort216 }}</td>
            <td>{{ table10.resvNameId217 }}</td>
            <td>{{ table10.clientOId218 }}</td>
            <td>{{ table10.typeChb219 }}</td>
            <td>{{ table10.confirmationNo220 }}</td>
            <td>{{ table10.clientMdmId221 }}</td>
            <td>{{ table10.nameId222 }}</td>
            <td>{{ table10.parentResvNameId223 }}</td>
            <td>{{ table10.contactId224 }}</td>
            <td>{{ table10.agenceId225 }}</td>
            <td>{{ table10.agenceNom226 }}</td>
            <td>{{ table10.societeId227 }}</td>
            <td>{{ table10.groupeId228 }}</td>
            <td>{{ table10.numBloc229 }}</td>
            <td>{{ table10.typeResv230 }}</td>
            <td>{{ table10.statutResv231 }}</td>
            <td>{{ table10.dateDebutResv232 }}</td>
            <td>{{ table10.dateFinResv233 }}</td>
            <td>{{ table10.truncDateDebutResv234 }}</td>
            <td>{{ table10.truncDateFinResv235 }}</td>
            <td>{{ table10.dateAnnResv236 }}</td>
            <td>{{ table10.pseudoRoomYn237 }}</td>
            <td>{{ table10.createurResv238 }}</td>
            <td>{{ table10.nomCreateurResv239 }}</td>
            <td>{{ table10.codeGarantie240 }}</td>
            <td>{{ table10.flgDed241 }}</td>
            <td>{{ table10.codePays242 }}</td>
            <td>{{ table10.libPays243 }}</td>
            <td>{{ table10.codeNationalite244 }}</td>
            <td>{{ table10.libNationalite245 }}</td>
            <td>{{ table10.codeSource246 }}</td>
            <td>{{ table10.libSource247 }}</td>
            <td>{{ table10.codeGrandSource248 }}</td>
            <td>{{ table10.codeOrigine249 }}</td>
            <td>{{ table10.libOrigine250 }}</td>
            <td>{{ table10.codeMarche251 }}</td>
            <td>{{ table10.libMarche252 }}</td>
            <td>{{ table10.codeGrandMarche253 }}</td>
            <td>{{ table10.libGrandMarche254 }}</td>
            <td>{{ table10.codePrix255 }}</td>
            <td>{{ table10.categPrix256 }}</td>
            <td>{{ table10.libPrix257 }}</td>
            <td>{{ table10.numChb258 }}</td>
            <td>{{ table10.descriptionTypeChb259 }}</td>
            <td>{{ table10.codeTypeChb260 }}</td>
            <td>{{ table10.classChb261 }}</td>
            <td>{{ table10.caractChb262 }}</td>
            <td>{{ table10.typeChbDeReservation263 }}</td>
            <td>{{ table10.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table10.codeTypeChbDeResv265 }}</td>
            <td>{{ table10.statutDeReservation266 }}</td>
            <td>{{ table10.circuitDistribution267 }}</td>
            <td>{{ table10.circuitDistribUserRegroup268 }}</td>
            <td>{{ table10.numCrs269 }}</td>
            <td>{{ table10.typeRefCrs270 }}</td>
            <td>{{ table10.crsInsertDate271 }}</td>
            <td>{{ table10.dateCreaResv272 }}</td>
            <td>{{ table10.datePremier273 }}</td>
            <td>{{ table10.statutPremier274 }}</td>
            <td>{{ table10.dateDernier275 }}</td>
            <td>{{ table10.statutDernier276 }}</td>
            <td>{{ table10.dateDernierPseudo277 }}</td>
            <td>{{ table10.statutDernierPseudo278 }}</td>
            <td>{{ table10.diffDtCreaAnn279 }}</td>
            <td>{{ table10.diffDtArrAnn280 }}</td>
            <td>{{ table10.leadtime281 }}</td>
            <td>{{ table10.los282 }}</td>
            <td>{{ table10.occupantsGroupe283 }}</td>
            <td>{{ table10.nbNuitee284 }}</td>
            <td>{{ table10.nbNuiteeNnDed285 }}</td>
            <td>{{ table10.nbResvAnn286 }}</td>
            <td>{{ table10.nbAdu287 }}</td>
            <td>{{ table10.nbEnf288 }}</td>
            <td>{{ table10.nbPersDayU289 }}</td>
            <td>{{ table10.nbPersArr290 }}</td>
            <td>{{ table10.nbPersDep291 }}</td>
            <td>{{ table10.nbPersAnn292 }}</td>
            <td>{{ table10.nbPersNoshow293 }}</td>
            <td>{{ table10.nbChbDayU294 }}</td>
            <td>{{ table10.nbChbArr295 }}</td>
            <td>{{ table10.nbChbDep296 }}</td>
            <td>{{ table10.nbChbAnn297 }}</td>
            <td>{{ table10.nbChbNoshow298 }}</td>
            <td>{{ table10.revenuNetChambre299 }}</td>
            <td>{{ table10.revenuTaxeChambre300 }}</td>
            <td>{{ table10.revenuNetChambreGlobal301 }}</td>
            <td>{{ table10.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table10.revenuNetBq303 }}</td>
            <td>{{ table10.revenuTaxeBq304 }}</td>
            <td>{{ table10.revenuNetBqGlobal305 }}</td>
            <td>{{ table10.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table10.revenuNetExtra307 }}</td>
            <td>{{ table10.revenuTaxeExtra308 }}</td>
            <td>{{ table10.revenuNetExtraGlobal309 }}</td>
            <td>{{ table10.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table10View', params: { table10Id: table10.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table10Edit', params: { table10Id: table10.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table10)"
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
          id="big10SampleApplicationApp.table10.delete.question"
          data-cy="table10DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table10-heading" v-text="t$('big10SampleApplicationApp.table10.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table10"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable10()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-10.component.ts"></script>
