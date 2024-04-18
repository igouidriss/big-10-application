<template>
  <div>
    <h2 id="page-heading" data-cy="Table4Heading">
      <span v-text="t$('big10SampleApplicationApp.table4.home.title')" id="table-4-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table4.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table4Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-4"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table4.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table4s && table4s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table4.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table4s && table4s.length > 0">
      <table class="table table-striped" aria-describedby="table4s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table4.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table4 in table4s" :key="table4.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table4View', params: { table4Id: table4.id } }">{{ table4.id }}</router-link>
            </td>
            <td>{{ table4.numLigne1 }}</td>
            <td>{{ table4.resort2 }}</td>
            <td>{{ table4.resvNameId3 }}</td>
            <td>{{ table4.clientOId4 }}</td>
            <td>{{ table4.typeChb5 }}</td>
            <td>{{ table4.confirmationNo6 }}</td>
            <td>{{ table4.clientMdmId7 }}</td>
            <td>{{ table4.nameId8 }}</td>
            <td>{{ table4.parentResvNameId9 }}</td>
            <td>{{ table4.contactId10 }}</td>
            <td>{{ table4.agenceId11 }}</td>
            <td>{{ table4.agenceNom12 }}</td>
            <td>{{ table4.societeId13 }}</td>
            <td>{{ table4.groupeId14 }}</td>
            <td>{{ table4.numBloc15 }}</td>
            <td>{{ table4.typeResv16 }}</td>
            <td>{{ table4.statutResv17 }}</td>
            <td>{{ table4.dateDebutResv18 }}</td>
            <td>{{ table4.dateFinResv19 }}</td>
            <td>{{ table4.truncDateDebutResv20 }}</td>
            <td>{{ table4.truncDateFinResv21 }}</td>
            <td>{{ table4.dateAnnResv22 }}</td>
            <td>{{ table4.pseudoRoomYn23 }}</td>
            <td>{{ table4.createurResv24 }}</td>
            <td>{{ table4.nomCreateurResv25 }}</td>
            <td>{{ table4.codeGarantie26 }}</td>
            <td>{{ table4.flgDed27 }}</td>
            <td>{{ table4.codePays28 }}</td>
            <td>{{ table4.libPays29 }}</td>
            <td>{{ table4.codeNationalite30 }}</td>
            <td>{{ table4.libNationalite31 }}</td>
            <td>{{ table4.codeSource32 }}</td>
            <td>{{ table4.libSource33 }}</td>
            <td>{{ table4.codeGrandSource34 }}</td>
            <td>{{ table4.codeOrigine35 }}</td>
            <td>{{ table4.libOrigine36 }}</td>
            <td>{{ table4.codeMarche37 }}</td>
            <td>{{ table4.libMarche38 }}</td>
            <td>{{ table4.codeGrandMarche39 }}</td>
            <td>{{ table4.libGrandMarche40 }}</td>
            <td>{{ table4.codePrix41 }}</td>
            <td>{{ table4.categPrix42 }}</td>
            <td>{{ table4.libPrix43 }}</td>
            <td>{{ table4.numChb44 }}</td>
            <td>{{ table4.descriptionTypeChb45 }}</td>
            <td>{{ table4.codeTypeChb46 }}</td>
            <td>{{ table4.classChb47 }}</td>
            <td>{{ table4.caractChb48 }}</td>
            <td>{{ table4.typeChbDeReservation49 }}</td>
            <td>{{ table4.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table4.codeTypeChbDeResv51 }}</td>
            <td>{{ table4.statutDeReservation52 }}</td>
            <td>{{ table4.circuitDistribution53 }}</td>
            <td>{{ table4.circuitDistribUserRegroup54 }}</td>
            <td>{{ table4.numCrs55 }}</td>
            <td>{{ table4.typeRefCrs56 }}</td>
            <td>{{ table4.crsInsertDate57 }}</td>
            <td>{{ table4.dateCreaResv58 }}</td>
            <td>{{ table4.datePremier59 }}</td>
            <td>{{ table4.statutPremier60 }}</td>
            <td>{{ table4.dateDernier61 }}</td>
            <td>{{ table4.statutDernier62 }}</td>
            <td>{{ table4.dateDernierPseudo63 }}</td>
            <td>{{ table4.statutDernierPseudo64 }}</td>
            <td>{{ table4.diffDtCreaAnn65 }}</td>
            <td>{{ table4.diffDtArrAnn66 }}</td>
            <td>{{ table4.leadtime67 }}</td>
            <td>{{ table4.los68 }}</td>
            <td>{{ table4.occupantsGroupe69 }}</td>
            <td>{{ table4.nbNuitee70 }}</td>
            <td>{{ table4.nbNuiteeNnDed71 }}</td>
            <td>{{ table4.nbResvAnn72 }}</td>
            <td>{{ table4.nbAdu73 }}</td>
            <td>{{ table4.nbEnf74 }}</td>
            <td>{{ table4.nbPersDayU75 }}</td>
            <td>{{ table4.nbPersArr76 }}</td>
            <td>{{ table4.nbPersDep77 }}</td>
            <td>{{ table4.nbPersAnn78 }}</td>
            <td>{{ table4.nbPersNoshow79 }}</td>
            <td>{{ table4.nbChbDayU80 }}</td>
            <td>{{ table4.nbChbArr81 }}</td>
            <td>{{ table4.nbChbDep82 }}</td>
            <td>{{ table4.nbChbAnn83 }}</td>
            <td>{{ table4.nbChbNoshow84 }}</td>
            <td>{{ table4.revenuNetChambre85 }}</td>
            <td>{{ table4.revenuTaxeChambre86 }}</td>
            <td>{{ table4.revenuNetChambreGlobal87 }}</td>
            <td>{{ table4.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table4.revenuNetBq89 }}</td>
            <td>{{ table4.revenuTaxeBq90 }}</td>
            <td>{{ table4.revenuNetBqGlobal91 }}</td>
            <td>{{ table4.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table4.revenuNetExtra93 }}</td>
            <td>{{ table4.revenuTaxeExtra94 }}</td>
            <td>{{ table4.revenuNetExtraGlobal95 }}</td>
            <td>{{ table4.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table4.revenuNetTotal97 }}</td>
            <td>{{ table4.revenuTaxeTotal98 }}</td>
            <td>{{ table4.revenuNetTotalGlobal99 }}</td>
            <td>{{ table4.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table4.prodRevenuChambre101 }}</td>
            <td>{{ table4.prodRevenuBq102 }}</td>
            <td>{{ table4.prodRevenuExtra103 }}</td>
            <td>{{ table4.prodRevenuTotal104 }}</td>
            <td>{{ table4.prodChambreNbNuitees105 }}</td>
            <td>{{ table4.techCreateDate106 }}</td>
            <td>{{ table4.techUpdateDate107 }}</td>
            <td>{{ table4.numLigne108 }}</td>
            <td>{{ table4.resort109 }}</td>
            <td>{{ table4.resvNameId110 }}</td>
            <td>{{ table4.clientOId111 }}</td>
            <td>{{ table4.typeChb112 }}</td>
            <td>{{ table4.confirmationNo113 }}</td>
            <td>{{ table4.clientMdmId114 }}</td>
            <td>{{ table4.nameId115 }}</td>
            <td>{{ table4.parentResvNameId116 }}</td>
            <td>{{ table4.contactId117 }}</td>
            <td>{{ table4.agenceId118 }}</td>
            <td>{{ table4.agenceNom119 }}</td>
            <td>{{ table4.societeId120 }}</td>
            <td>{{ table4.groupeId121 }}</td>
            <td>{{ table4.numBloc122 }}</td>
            <td>{{ table4.typeResv123 }}</td>
            <td>{{ table4.statutResv124 }}</td>
            <td>{{ table4.dateDebutResv125 }}</td>
            <td>{{ table4.dateFinResv126 }}</td>
            <td>{{ table4.truncDateDebutResv127 }}</td>
            <td>{{ table4.truncDateFinResv128 }}</td>
            <td>{{ table4.dateAnnResv129 }}</td>
            <td>{{ table4.pseudoRoomYn130 }}</td>
            <td>{{ table4.createurResv131 }}</td>
            <td>{{ table4.nomCreateurResv132 }}</td>
            <td>{{ table4.codeGarantie133 }}</td>
            <td>{{ table4.flgDed134 }}</td>
            <td>{{ table4.codePays135 }}</td>
            <td>{{ table4.libPays136 }}</td>
            <td>{{ table4.codeNationalite137 }}</td>
            <td>{{ table4.libNationalite138 }}</td>
            <td>{{ table4.codeSource139 }}</td>
            <td>{{ table4.libSource140 }}</td>
            <td>{{ table4.codeGrandSource141 }}</td>
            <td>{{ table4.codeOrigine142 }}</td>
            <td>{{ table4.libOrigine143 }}</td>
            <td>{{ table4.codeMarche144 }}</td>
            <td>{{ table4.libMarche145 }}</td>
            <td>{{ table4.codeGrandMarche146 }}</td>
            <td>{{ table4.libGrandMarche147 }}</td>
            <td>{{ table4.codePrix148 }}</td>
            <td>{{ table4.categPrix149 }}</td>
            <td>{{ table4.libPrix150 }}</td>
            <td>{{ table4.numChb151 }}</td>
            <td>{{ table4.descriptionTypeChb152 }}</td>
            <td>{{ table4.codeTypeChb153 }}</td>
            <td>{{ table4.classChb154 }}</td>
            <td>{{ table4.caractChb155 }}</td>
            <td>{{ table4.typeChbDeReservation156 }}</td>
            <td>{{ table4.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table4.codeTypeChbDeResv158 }}</td>
            <td>{{ table4.statutDeReservation159 }}</td>
            <td>{{ table4.circuitDistribution160 }}</td>
            <td>{{ table4.circuitDistribUserRegroup161 }}</td>
            <td>{{ table4.numCrs162 }}</td>
            <td>{{ table4.typeRefCrs163 }}</td>
            <td>{{ table4.crsInsertDate164 }}</td>
            <td>{{ table4.dateCreaResv165 }}</td>
            <td>{{ table4.datePremier166 }}</td>
            <td>{{ table4.statutPremier167 }}</td>
            <td>{{ table4.dateDernier168 }}</td>
            <td>{{ table4.statutDernier169 }}</td>
            <td>{{ table4.dateDernierPseudo170 }}</td>
            <td>{{ table4.statutDernierPseudo171 }}</td>
            <td>{{ table4.diffDtCreaAnn172 }}</td>
            <td>{{ table4.diffDtArrAnn173 }}</td>
            <td>{{ table4.leadtime174 }}</td>
            <td>{{ table4.los175 }}</td>
            <td>{{ table4.occupantsGroupe176 }}</td>
            <td>{{ table4.nbNuitee177 }}</td>
            <td>{{ table4.nbNuiteeNnDed178 }}</td>
            <td>{{ table4.nbResvAnn179 }}</td>
            <td>{{ table4.nbAdu180 }}</td>
            <td>{{ table4.nbEnf181 }}</td>
            <td>{{ table4.nbPersDayU182 }}</td>
            <td>{{ table4.nbPersArr183 }}</td>
            <td>{{ table4.nbPersDep184 }}</td>
            <td>{{ table4.nbPersAnn185 }}</td>
            <td>{{ table4.nbPersNoshow186 }}</td>
            <td>{{ table4.nbChbDayU187 }}</td>
            <td>{{ table4.nbChbArr188 }}</td>
            <td>{{ table4.nbChbDep189 }}</td>
            <td>{{ table4.nbChbAnn190 }}</td>
            <td>{{ table4.nbChbNoshow191 }}</td>
            <td>{{ table4.revenuNetChambre192 }}</td>
            <td>{{ table4.revenuTaxeChambre193 }}</td>
            <td>{{ table4.revenuNetChambreGlobal194 }}</td>
            <td>{{ table4.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table4.revenuNetBq196 }}</td>
            <td>{{ table4.revenuTaxeBq197 }}</td>
            <td>{{ table4.revenuNetBqGlobal198 }}</td>
            <td>{{ table4.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table4.revenuNetExtra200 }}</td>
            <td>{{ table4.revenuTaxeExtra201 }}</td>
            <td>{{ table4.revenuNetExtraGlobal202 }}</td>
            <td>{{ table4.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table4.revenuNetTotal204 }}</td>
            <td>{{ table4.revenuTaxeTotal205 }}</td>
            <td>{{ table4.revenuNetTotalGlobal206 }}</td>
            <td>{{ table4.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table4.prodRevenuChambre208 }}</td>
            <td>{{ table4.prodRevenuBq209 }}</td>
            <td>{{ table4.prodRevenuExtra210 }}</td>
            <td>{{ table4.prodRevenuTotal211 }}</td>
            <td>{{ table4.prodChambreNbNuitees212 }}</td>
            <td>{{ table4.techCreateDate213 }}</td>
            <td>{{ table4.techUpdateDate214 }}</td>
            <td>{{ table4.numLigne215 }}</td>
            <td>{{ table4.resort216 }}</td>
            <td>{{ table4.resvNameId217 }}</td>
            <td>{{ table4.clientOId218 }}</td>
            <td>{{ table4.typeChb219 }}</td>
            <td>{{ table4.confirmationNo220 }}</td>
            <td>{{ table4.clientMdmId221 }}</td>
            <td>{{ table4.nameId222 }}</td>
            <td>{{ table4.parentResvNameId223 }}</td>
            <td>{{ table4.contactId224 }}</td>
            <td>{{ table4.agenceId225 }}</td>
            <td>{{ table4.agenceNom226 }}</td>
            <td>{{ table4.societeId227 }}</td>
            <td>{{ table4.groupeId228 }}</td>
            <td>{{ table4.numBloc229 }}</td>
            <td>{{ table4.typeResv230 }}</td>
            <td>{{ table4.statutResv231 }}</td>
            <td>{{ table4.dateDebutResv232 }}</td>
            <td>{{ table4.dateFinResv233 }}</td>
            <td>{{ table4.truncDateDebutResv234 }}</td>
            <td>{{ table4.truncDateFinResv235 }}</td>
            <td>{{ table4.dateAnnResv236 }}</td>
            <td>{{ table4.pseudoRoomYn237 }}</td>
            <td>{{ table4.createurResv238 }}</td>
            <td>{{ table4.nomCreateurResv239 }}</td>
            <td>{{ table4.codeGarantie240 }}</td>
            <td>{{ table4.flgDed241 }}</td>
            <td>{{ table4.codePays242 }}</td>
            <td>{{ table4.libPays243 }}</td>
            <td>{{ table4.codeNationalite244 }}</td>
            <td>{{ table4.libNationalite245 }}</td>
            <td>{{ table4.codeSource246 }}</td>
            <td>{{ table4.libSource247 }}</td>
            <td>{{ table4.codeGrandSource248 }}</td>
            <td>{{ table4.codeOrigine249 }}</td>
            <td>{{ table4.libOrigine250 }}</td>
            <td>{{ table4.codeMarche251 }}</td>
            <td>{{ table4.libMarche252 }}</td>
            <td>{{ table4.codeGrandMarche253 }}</td>
            <td>{{ table4.libGrandMarche254 }}</td>
            <td>{{ table4.codePrix255 }}</td>
            <td>{{ table4.categPrix256 }}</td>
            <td>{{ table4.libPrix257 }}</td>
            <td>{{ table4.numChb258 }}</td>
            <td>{{ table4.descriptionTypeChb259 }}</td>
            <td>{{ table4.codeTypeChb260 }}</td>
            <td>{{ table4.classChb261 }}</td>
            <td>{{ table4.caractChb262 }}</td>
            <td>{{ table4.typeChbDeReservation263 }}</td>
            <td>{{ table4.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table4.codeTypeChbDeResv265 }}</td>
            <td>{{ table4.statutDeReservation266 }}</td>
            <td>{{ table4.circuitDistribution267 }}</td>
            <td>{{ table4.circuitDistribUserRegroup268 }}</td>
            <td>{{ table4.numCrs269 }}</td>
            <td>{{ table4.typeRefCrs270 }}</td>
            <td>{{ table4.crsInsertDate271 }}</td>
            <td>{{ table4.dateCreaResv272 }}</td>
            <td>{{ table4.datePremier273 }}</td>
            <td>{{ table4.statutPremier274 }}</td>
            <td>{{ table4.dateDernier275 }}</td>
            <td>{{ table4.statutDernier276 }}</td>
            <td>{{ table4.dateDernierPseudo277 }}</td>
            <td>{{ table4.statutDernierPseudo278 }}</td>
            <td>{{ table4.diffDtCreaAnn279 }}</td>
            <td>{{ table4.diffDtArrAnn280 }}</td>
            <td>{{ table4.leadtime281 }}</td>
            <td>{{ table4.los282 }}</td>
            <td>{{ table4.occupantsGroupe283 }}</td>
            <td>{{ table4.nbNuitee284 }}</td>
            <td>{{ table4.nbNuiteeNnDed285 }}</td>
            <td>{{ table4.nbResvAnn286 }}</td>
            <td>{{ table4.nbAdu287 }}</td>
            <td>{{ table4.nbEnf288 }}</td>
            <td>{{ table4.nbPersDayU289 }}</td>
            <td>{{ table4.nbPersArr290 }}</td>
            <td>{{ table4.nbPersDep291 }}</td>
            <td>{{ table4.nbPersAnn292 }}</td>
            <td>{{ table4.nbPersNoshow293 }}</td>
            <td>{{ table4.nbChbDayU294 }}</td>
            <td>{{ table4.nbChbArr295 }}</td>
            <td>{{ table4.nbChbDep296 }}</td>
            <td>{{ table4.nbChbAnn297 }}</td>
            <td>{{ table4.nbChbNoshow298 }}</td>
            <td>{{ table4.revenuNetChambre299 }}</td>
            <td>{{ table4.revenuTaxeChambre300 }}</td>
            <td>{{ table4.revenuNetChambreGlobal301 }}</td>
            <td>{{ table4.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table4.revenuNetBq303 }}</td>
            <td>{{ table4.revenuTaxeBq304 }}</td>
            <td>{{ table4.revenuNetBqGlobal305 }}</td>
            <td>{{ table4.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table4.revenuNetExtra307 }}</td>
            <td>{{ table4.revenuTaxeExtra308 }}</td>
            <td>{{ table4.revenuNetExtraGlobal309 }}</td>
            <td>{{ table4.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table4View', params: { table4Id: table4.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table4Edit', params: { table4Id: table4.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table4)"
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
          id="big10SampleApplicationApp.table4.delete.question"
          data-cy="table4DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table4-heading" v-text="t$('big10SampleApplicationApp.table4.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table4"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable4()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-4.component.ts"></script>
