<template>
  <div>
    <h2 id="page-heading" data-cy="Table2Heading">
      <span v-text="t$('big10SampleApplicationApp.table2.home.title')" id="table-2-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table2.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table2Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-2"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table2.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table2s && table2s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table2.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table2s && table2s.length > 0">
      <table class="table table-striped" aria-describedby="table2s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table2.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table2 in table2s" :key="table2.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table2View', params: { table2Id: table2.id } }">{{ table2.id }}</router-link>
            </td>
            <td>{{ table2.numLigne1 }}</td>
            <td>{{ table2.resort2 }}</td>
            <td>{{ table2.resvNameId3 }}</td>
            <td>{{ table2.clientOId4 }}</td>
            <td>{{ table2.typeChb5 }}</td>
            <td>{{ table2.confirmationNo6 }}</td>
            <td>{{ table2.clientMdmId7 }}</td>
            <td>{{ table2.nameId8 }}</td>
            <td>{{ table2.parentResvNameId9 }}</td>
            <td>{{ table2.contactId10 }}</td>
            <td>{{ table2.agenceId11 }}</td>
            <td>{{ table2.agenceNom12 }}</td>
            <td>{{ table2.societeId13 }}</td>
            <td>{{ table2.groupeId14 }}</td>
            <td>{{ table2.numBloc15 }}</td>
            <td>{{ table2.typeResv16 }}</td>
            <td>{{ table2.statutResv17 }}</td>
            <td>{{ table2.dateDebutResv18 }}</td>
            <td>{{ table2.dateFinResv19 }}</td>
            <td>{{ table2.truncDateDebutResv20 }}</td>
            <td>{{ table2.truncDateFinResv21 }}</td>
            <td>{{ table2.dateAnnResv22 }}</td>
            <td>{{ table2.pseudoRoomYn23 }}</td>
            <td>{{ table2.createurResv24 }}</td>
            <td>{{ table2.nomCreateurResv25 }}</td>
            <td>{{ table2.codeGarantie26 }}</td>
            <td>{{ table2.flgDed27 }}</td>
            <td>{{ table2.codePays28 }}</td>
            <td>{{ table2.libPays29 }}</td>
            <td>{{ table2.codeNationalite30 }}</td>
            <td>{{ table2.libNationalite31 }}</td>
            <td>{{ table2.codeSource32 }}</td>
            <td>{{ table2.libSource33 }}</td>
            <td>{{ table2.codeGrandSource34 }}</td>
            <td>{{ table2.codeOrigine35 }}</td>
            <td>{{ table2.libOrigine36 }}</td>
            <td>{{ table2.codeMarche37 }}</td>
            <td>{{ table2.libMarche38 }}</td>
            <td>{{ table2.codeGrandMarche39 }}</td>
            <td>{{ table2.libGrandMarche40 }}</td>
            <td>{{ table2.codePrix41 }}</td>
            <td>{{ table2.categPrix42 }}</td>
            <td>{{ table2.libPrix43 }}</td>
            <td>{{ table2.numChb44 }}</td>
            <td>{{ table2.descriptionTypeChb45 }}</td>
            <td>{{ table2.codeTypeChb46 }}</td>
            <td>{{ table2.classChb47 }}</td>
            <td>{{ table2.caractChb48 }}</td>
            <td>{{ table2.typeChbDeReservation49 }}</td>
            <td>{{ table2.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table2.codeTypeChbDeResv51 }}</td>
            <td>{{ table2.statutDeReservation52 }}</td>
            <td>{{ table2.circuitDistribution53 }}</td>
            <td>{{ table2.circuitDistribUserRegroup54 }}</td>
            <td>{{ table2.numCrs55 }}</td>
            <td>{{ table2.typeRefCrs56 }}</td>
            <td>{{ table2.crsInsertDate57 }}</td>
            <td>{{ table2.dateCreaResv58 }}</td>
            <td>{{ table2.datePremier59 }}</td>
            <td>{{ table2.statutPremier60 }}</td>
            <td>{{ table2.dateDernier61 }}</td>
            <td>{{ table2.statutDernier62 }}</td>
            <td>{{ table2.dateDernierPseudo63 }}</td>
            <td>{{ table2.statutDernierPseudo64 }}</td>
            <td>{{ table2.diffDtCreaAnn65 }}</td>
            <td>{{ table2.diffDtArrAnn66 }}</td>
            <td>{{ table2.leadtime67 }}</td>
            <td>{{ table2.los68 }}</td>
            <td>{{ table2.occupantsGroupe69 }}</td>
            <td>{{ table2.nbNuitee70 }}</td>
            <td>{{ table2.nbNuiteeNnDed71 }}</td>
            <td>{{ table2.nbResvAnn72 }}</td>
            <td>{{ table2.nbAdu73 }}</td>
            <td>{{ table2.nbEnf74 }}</td>
            <td>{{ table2.nbPersDayU75 }}</td>
            <td>{{ table2.nbPersArr76 }}</td>
            <td>{{ table2.nbPersDep77 }}</td>
            <td>{{ table2.nbPersAnn78 }}</td>
            <td>{{ table2.nbPersNoshow79 }}</td>
            <td>{{ table2.nbChbDayU80 }}</td>
            <td>{{ table2.nbChbArr81 }}</td>
            <td>{{ table2.nbChbDep82 }}</td>
            <td>{{ table2.nbChbAnn83 }}</td>
            <td>{{ table2.nbChbNoshow84 }}</td>
            <td>{{ table2.revenuNetChambre85 }}</td>
            <td>{{ table2.revenuTaxeChambre86 }}</td>
            <td>{{ table2.revenuNetChambreGlobal87 }}</td>
            <td>{{ table2.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table2.revenuNetBq89 }}</td>
            <td>{{ table2.revenuTaxeBq90 }}</td>
            <td>{{ table2.revenuNetBqGlobal91 }}</td>
            <td>{{ table2.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table2.revenuNetExtra93 }}</td>
            <td>{{ table2.revenuTaxeExtra94 }}</td>
            <td>{{ table2.revenuNetExtraGlobal95 }}</td>
            <td>{{ table2.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table2.revenuNetTotal97 }}</td>
            <td>{{ table2.revenuTaxeTotal98 }}</td>
            <td>{{ table2.revenuNetTotalGlobal99 }}</td>
            <td>{{ table2.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table2.prodRevenuChambre101 }}</td>
            <td>{{ table2.prodRevenuBq102 }}</td>
            <td>{{ table2.prodRevenuExtra103 }}</td>
            <td>{{ table2.prodRevenuTotal104 }}</td>
            <td>{{ table2.prodChambreNbNuitees105 }}</td>
            <td>{{ table2.techCreateDate106 }}</td>
            <td>{{ table2.techUpdateDate107 }}</td>
            <td>{{ table2.numLigne108 }}</td>
            <td>{{ table2.resort109 }}</td>
            <td>{{ table2.resvNameId110 }}</td>
            <td>{{ table2.clientOId111 }}</td>
            <td>{{ table2.typeChb112 }}</td>
            <td>{{ table2.confirmationNo113 }}</td>
            <td>{{ table2.clientMdmId114 }}</td>
            <td>{{ table2.nameId115 }}</td>
            <td>{{ table2.parentResvNameId116 }}</td>
            <td>{{ table2.contactId117 }}</td>
            <td>{{ table2.agenceId118 }}</td>
            <td>{{ table2.agenceNom119 }}</td>
            <td>{{ table2.societeId120 }}</td>
            <td>{{ table2.groupeId121 }}</td>
            <td>{{ table2.numBloc122 }}</td>
            <td>{{ table2.typeResv123 }}</td>
            <td>{{ table2.statutResv124 }}</td>
            <td>{{ table2.dateDebutResv125 }}</td>
            <td>{{ table2.dateFinResv126 }}</td>
            <td>{{ table2.truncDateDebutResv127 }}</td>
            <td>{{ table2.truncDateFinResv128 }}</td>
            <td>{{ table2.dateAnnResv129 }}</td>
            <td>{{ table2.pseudoRoomYn130 }}</td>
            <td>{{ table2.createurResv131 }}</td>
            <td>{{ table2.nomCreateurResv132 }}</td>
            <td>{{ table2.codeGarantie133 }}</td>
            <td>{{ table2.flgDed134 }}</td>
            <td>{{ table2.codePays135 }}</td>
            <td>{{ table2.libPays136 }}</td>
            <td>{{ table2.codeNationalite137 }}</td>
            <td>{{ table2.libNationalite138 }}</td>
            <td>{{ table2.codeSource139 }}</td>
            <td>{{ table2.libSource140 }}</td>
            <td>{{ table2.codeGrandSource141 }}</td>
            <td>{{ table2.codeOrigine142 }}</td>
            <td>{{ table2.libOrigine143 }}</td>
            <td>{{ table2.codeMarche144 }}</td>
            <td>{{ table2.libMarche145 }}</td>
            <td>{{ table2.codeGrandMarche146 }}</td>
            <td>{{ table2.libGrandMarche147 }}</td>
            <td>{{ table2.codePrix148 }}</td>
            <td>{{ table2.categPrix149 }}</td>
            <td>{{ table2.libPrix150 }}</td>
            <td>{{ table2.numChb151 }}</td>
            <td>{{ table2.descriptionTypeChb152 }}</td>
            <td>{{ table2.codeTypeChb153 }}</td>
            <td>{{ table2.classChb154 }}</td>
            <td>{{ table2.caractChb155 }}</td>
            <td>{{ table2.typeChbDeReservation156 }}</td>
            <td>{{ table2.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table2.codeTypeChbDeResv158 }}</td>
            <td>{{ table2.statutDeReservation159 }}</td>
            <td>{{ table2.circuitDistribution160 }}</td>
            <td>{{ table2.circuitDistribUserRegroup161 }}</td>
            <td>{{ table2.numCrs162 }}</td>
            <td>{{ table2.typeRefCrs163 }}</td>
            <td>{{ table2.crsInsertDate164 }}</td>
            <td>{{ table2.dateCreaResv165 }}</td>
            <td>{{ table2.datePremier166 }}</td>
            <td>{{ table2.statutPremier167 }}</td>
            <td>{{ table2.dateDernier168 }}</td>
            <td>{{ table2.statutDernier169 }}</td>
            <td>{{ table2.dateDernierPseudo170 }}</td>
            <td>{{ table2.statutDernierPseudo171 }}</td>
            <td>{{ table2.diffDtCreaAnn172 }}</td>
            <td>{{ table2.diffDtArrAnn173 }}</td>
            <td>{{ table2.leadtime174 }}</td>
            <td>{{ table2.los175 }}</td>
            <td>{{ table2.occupantsGroupe176 }}</td>
            <td>{{ table2.nbNuitee177 }}</td>
            <td>{{ table2.nbNuiteeNnDed178 }}</td>
            <td>{{ table2.nbResvAnn179 }}</td>
            <td>{{ table2.nbAdu180 }}</td>
            <td>{{ table2.nbEnf181 }}</td>
            <td>{{ table2.nbPersDayU182 }}</td>
            <td>{{ table2.nbPersArr183 }}</td>
            <td>{{ table2.nbPersDep184 }}</td>
            <td>{{ table2.nbPersAnn185 }}</td>
            <td>{{ table2.nbPersNoshow186 }}</td>
            <td>{{ table2.nbChbDayU187 }}</td>
            <td>{{ table2.nbChbArr188 }}</td>
            <td>{{ table2.nbChbDep189 }}</td>
            <td>{{ table2.nbChbAnn190 }}</td>
            <td>{{ table2.nbChbNoshow191 }}</td>
            <td>{{ table2.revenuNetChambre192 }}</td>
            <td>{{ table2.revenuTaxeChambre193 }}</td>
            <td>{{ table2.revenuNetChambreGlobal194 }}</td>
            <td>{{ table2.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table2.revenuNetBq196 }}</td>
            <td>{{ table2.revenuTaxeBq197 }}</td>
            <td>{{ table2.revenuNetBqGlobal198 }}</td>
            <td>{{ table2.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table2.revenuNetExtra200 }}</td>
            <td>{{ table2.revenuTaxeExtra201 }}</td>
            <td>{{ table2.revenuNetExtraGlobal202 }}</td>
            <td>{{ table2.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table2.revenuNetTotal204 }}</td>
            <td>{{ table2.revenuTaxeTotal205 }}</td>
            <td>{{ table2.revenuNetTotalGlobal206 }}</td>
            <td>{{ table2.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table2.prodRevenuChambre208 }}</td>
            <td>{{ table2.prodRevenuBq209 }}</td>
            <td>{{ table2.prodRevenuExtra210 }}</td>
            <td>{{ table2.prodRevenuTotal211 }}</td>
            <td>{{ table2.prodChambreNbNuitees212 }}</td>
            <td>{{ table2.techCreateDate213 }}</td>
            <td>{{ table2.techUpdateDate214 }}</td>
            <td>{{ table2.numLigne215 }}</td>
            <td>{{ table2.resort216 }}</td>
            <td>{{ table2.resvNameId217 }}</td>
            <td>{{ table2.clientOId218 }}</td>
            <td>{{ table2.typeChb219 }}</td>
            <td>{{ table2.confirmationNo220 }}</td>
            <td>{{ table2.clientMdmId221 }}</td>
            <td>{{ table2.nameId222 }}</td>
            <td>{{ table2.parentResvNameId223 }}</td>
            <td>{{ table2.contactId224 }}</td>
            <td>{{ table2.agenceId225 }}</td>
            <td>{{ table2.agenceNom226 }}</td>
            <td>{{ table2.societeId227 }}</td>
            <td>{{ table2.groupeId228 }}</td>
            <td>{{ table2.numBloc229 }}</td>
            <td>{{ table2.typeResv230 }}</td>
            <td>{{ table2.statutResv231 }}</td>
            <td>{{ table2.dateDebutResv232 }}</td>
            <td>{{ table2.dateFinResv233 }}</td>
            <td>{{ table2.truncDateDebutResv234 }}</td>
            <td>{{ table2.truncDateFinResv235 }}</td>
            <td>{{ table2.dateAnnResv236 }}</td>
            <td>{{ table2.pseudoRoomYn237 }}</td>
            <td>{{ table2.createurResv238 }}</td>
            <td>{{ table2.nomCreateurResv239 }}</td>
            <td>{{ table2.codeGarantie240 }}</td>
            <td>{{ table2.flgDed241 }}</td>
            <td>{{ table2.codePays242 }}</td>
            <td>{{ table2.libPays243 }}</td>
            <td>{{ table2.codeNationalite244 }}</td>
            <td>{{ table2.libNationalite245 }}</td>
            <td>{{ table2.codeSource246 }}</td>
            <td>{{ table2.libSource247 }}</td>
            <td>{{ table2.codeGrandSource248 }}</td>
            <td>{{ table2.codeOrigine249 }}</td>
            <td>{{ table2.libOrigine250 }}</td>
            <td>{{ table2.codeMarche251 }}</td>
            <td>{{ table2.libMarche252 }}</td>
            <td>{{ table2.codeGrandMarche253 }}</td>
            <td>{{ table2.libGrandMarche254 }}</td>
            <td>{{ table2.codePrix255 }}</td>
            <td>{{ table2.categPrix256 }}</td>
            <td>{{ table2.libPrix257 }}</td>
            <td>{{ table2.numChb258 }}</td>
            <td>{{ table2.descriptionTypeChb259 }}</td>
            <td>{{ table2.codeTypeChb260 }}</td>
            <td>{{ table2.classChb261 }}</td>
            <td>{{ table2.caractChb262 }}</td>
            <td>{{ table2.typeChbDeReservation263 }}</td>
            <td>{{ table2.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table2.codeTypeChbDeResv265 }}</td>
            <td>{{ table2.statutDeReservation266 }}</td>
            <td>{{ table2.circuitDistribution267 }}</td>
            <td>{{ table2.circuitDistribUserRegroup268 }}</td>
            <td>{{ table2.numCrs269 }}</td>
            <td>{{ table2.typeRefCrs270 }}</td>
            <td>{{ table2.crsInsertDate271 }}</td>
            <td>{{ table2.dateCreaResv272 }}</td>
            <td>{{ table2.datePremier273 }}</td>
            <td>{{ table2.statutPremier274 }}</td>
            <td>{{ table2.dateDernier275 }}</td>
            <td>{{ table2.statutDernier276 }}</td>
            <td>{{ table2.dateDernierPseudo277 }}</td>
            <td>{{ table2.statutDernierPseudo278 }}</td>
            <td>{{ table2.diffDtCreaAnn279 }}</td>
            <td>{{ table2.diffDtArrAnn280 }}</td>
            <td>{{ table2.leadtime281 }}</td>
            <td>{{ table2.los282 }}</td>
            <td>{{ table2.occupantsGroupe283 }}</td>
            <td>{{ table2.nbNuitee284 }}</td>
            <td>{{ table2.nbNuiteeNnDed285 }}</td>
            <td>{{ table2.nbResvAnn286 }}</td>
            <td>{{ table2.nbAdu287 }}</td>
            <td>{{ table2.nbEnf288 }}</td>
            <td>{{ table2.nbPersDayU289 }}</td>
            <td>{{ table2.nbPersArr290 }}</td>
            <td>{{ table2.nbPersDep291 }}</td>
            <td>{{ table2.nbPersAnn292 }}</td>
            <td>{{ table2.nbPersNoshow293 }}</td>
            <td>{{ table2.nbChbDayU294 }}</td>
            <td>{{ table2.nbChbArr295 }}</td>
            <td>{{ table2.nbChbDep296 }}</td>
            <td>{{ table2.nbChbAnn297 }}</td>
            <td>{{ table2.nbChbNoshow298 }}</td>
            <td>{{ table2.revenuNetChambre299 }}</td>
            <td>{{ table2.revenuTaxeChambre300 }}</td>
            <td>{{ table2.revenuNetChambreGlobal301 }}</td>
            <td>{{ table2.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table2.revenuNetBq303 }}</td>
            <td>{{ table2.revenuTaxeBq304 }}</td>
            <td>{{ table2.revenuNetBqGlobal305 }}</td>
            <td>{{ table2.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table2.revenuNetExtra307 }}</td>
            <td>{{ table2.revenuTaxeExtra308 }}</td>
            <td>{{ table2.revenuNetExtraGlobal309 }}</td>
            <td>{{ table2.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table2View', params: { table2Id: table2.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table2Edit', params: { table2Id: table2.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table2)"
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
          id="big10SampleApplicationApp.table2.delete.question"
          data-cy="table2DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table2-heading" v-text="t$('big10SampleApplicationApp.table2.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table2"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable2()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-2.component.ts"></script>
