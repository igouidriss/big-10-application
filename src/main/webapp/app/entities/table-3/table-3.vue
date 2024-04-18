<template>
  <div>
    <h2 id="page-heading" data-cy="Table3Heading">
      <span v-text="t$('big10SampleApplicationApp.table3.home.title')" id="table-3-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table3.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table3Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-3"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table3.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table3s && table3s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table3.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table3s && table3s.length > 0">
      <table class="table table-striped" aria-describedby="table3s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table3.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table3 in table3s" :key="table3.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table3View', params: { table3Id: table3.id } }">{{ table3.id }}</router-link>
            </td>
            <td>{{ table3.numLigne1 }}</td>
            <td>{{ table3.resort2 }}</td>
            <td>{{ table3.resvNameId3 }}</td>
            <td>{{ table3.clientOId4 }}</td>
            <td>{{ table3.typeChb5 }}</td>
            <td>{{ table3.confirmationNo6 }}</td>
            <td>{{ table3.clientMdmId7 }}</td>
            <td>{{ table3.nameId8 }}</td>
            <td>{{ table3.parentResvNameId9 }}</td>
            <td>{{ table3.contactId10 }}</td>
            <td>{{ table3.agenceId11 }}</td>
            <td>{{ table3.agenceNom12 }}</td>
            <td>{{ table3.societeId13 }}</td>
            <td>{{ table3.groupeId14 }}</td>
            <td>{{ table3.numBloc15 }}</td>
            <td>{{ table3.typeResv16 }}</td>
            <td>{{ table3.statutResv17 }}</td>
            <td>{{ table3.dateDebutResv18 }}</td>
            <td>{{ table3.dateFinResv19 }}</td>
            <td>{{ table3.truncDateDebutResv20 }}</td>
            <td>{{ table3.truncDateFinResv21 }}</td>
            <td>{{ table3.dateAnnResv22 }}</td>
            <td>{{ table3.pseudoRoomYn23 }}</td>
            <td>{{ table3.createurResv24 }}</td>
            <td>{{ table3.nomCreateurResv25 }}</td>
            <td>{{ table3.codeGarantie26 }}</td>
            <td>{{ table3.flgDed27 }}</td>
            <td>{{ table3.codePays28 }}</td>
            <td>{{ table3.libPays29 }}</td>
            <td>{{ table3.codeNationalite30 }}</td>
            <td>{{ table3.libNationalite31 }}</td>
            <td>{{ table3.codeSource32 }}</td>
            <td>{{ table3.libSource33 }}</td>
            <td>{{ table3.codeGrandSource34 }}</td>
            <td>{{ table3.codeOrigine35 }}</td>
            <td>{{ table3.libOrigine36 }}</td>
            <td>{{ table3.codeMarche37 }}</td>
            <td>{{ table3.libMarche38 }}</td>
            <td>{{ table3.codeGrandMarche39 }}</td>
            <td>{{ table3.libGrandMarche40 }}</td>
            <td>{{ table3.codePrix41 }}</td>
            <td>{{ table3.categPrix42 }}</td>
            <td>{{ table3.libPrix43 }}</td>
            <td>{{ table3.numChb44 }}</td>
            <td>{{ table3.descriptionTypeChb45 }}</td>
            <td>{{ table3.codeTypeChb46 }}</td>
            <td>{{ table3.classChb47 }}</td>
            <td>{{ table3.caractChb48 }}</td>
            <td>{{ table3.typeChbDeReservation49 }}</td>
            <td>{{ table3.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table3.codeTypeChbDeResv51 }}</td>
            <td>{{ table3.statutDeReservation52 }}</td>
            <td>{{ table3.circuitDistribution53 }}</td>
            <td>{{ table3.circuitDistribUserRegroup54 }}</td>
            <td>{{ table3.numCrs55 }}</td>
            <td>{{ table3.typeRefCrs56 }}</td>
            <td>{{ table3.crsInsertDate57 }}</td>
            <td>{{ table3.dateCreaResv58 }}</td>
            <td>{{ table3.datePremier59 }}</td>
            <td>{{ table3.statutPremier60 }}</td>
            <td>{{ table3.dateDernier61 }}</td>
            <td>{{ table3.statutDernier62 }}</td>
            <td>{{ table3.dateDernierPseudo63 }}</td>
            <td>{{ table3.statutDernierPseudo64 }}</td>
            <td>{{ table3.diffDtCreaAnn65 }}</td>
            <td>{{ table3.diffDtArrAnn66 }}</td>
            <td>{{ table3.leadtime67 }}</td>
            <td>{{ table3.los68 }}</td>
            <td>{{ table3.occupantsGroupe69 }}</td>
            <td>{{ table3.nbNuitee70 }}</td>
            <td>{{ table3.nbNuiteeNnDed71 }}</td>
            <td>{{ table3.nbResvAnn72 }}</td>
            <td>{{ table3.nbAdu73 }}</td>
            <td>{{ table3.nbEnf74 }}</td>
            <td>{{ table3.nbPersDayU75 }}</td>
            <td>{{ table3.nbPersArr76 }}</td>
            <td>{{ table3.nbPersDep77 }}</td>
            <td>{{ table3.nbPersAnn78 }}</td>
            <td>{{ table3.nbPersNoshow79 }}</td>
            <td>{{ table3.nbChbDayU80 }}</td>
            <td>{{ table3.nbChbArr81 }}</td>
            <td>{{ table3.nbChbDep82 }}</td>
            <td>{{ table3.nbChbAnn83 }}</td>
            <td>{{ table3.nbChbNoshow84 }}</td>
            <td>{{ table3.revenuNetChambre85 }}</td>
            <td>{{ table3.revenuTaxeChambre86 }}</td>
            <td>{{ table3.revenuNetChambreGlobal87 }}</td>
            <td>{{ table3.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table3.revenuNetBq89 }}</td>
            <td>{{ table3.revenuTaxeBq90 }}</td>
            <td>{{ table3.revenuNetBqGlobal91 }}</td>
            <td>{{ table3.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table3.revenuNetExtra93 }}</td>
            <td>{{ table3.revenuTaxeExtra94 }}</td>
            <td>{{ table3.revenuNetExtraGlobal95 }}</td>
            <td>{{ table3.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table3.revenuNetTotal97 }}</td>
            <td>{{ table3.revenuTaxeTotal98 }}</td>
            <td>{{ table3.revenuNetTotalGlobal99 }}</td>
            <td>{{ table3.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table3.prodRevenuChambre101 }}</td>
            <td>{{ table3.prodRevenuBq102 }}</td>
            <td>{{ table3.prodRevenuExtra103 }}</td>
            <td>{{ table3.prodRevenuTotal104 }}</td>
            <td>{{ table3.prodChambreNbNuitees105 }}</td>
            <td>{{ table3.techCreateDate106 }}</td>
            <td>{{ table3.techUpdateDate107 }}</td>
            <td>{{ table3.numLigne108 }}</td>
            <td>{{ table3.resort109 }}</td>
            <td>{{ table3.resvNameId110 }}</td>
            <td>{{ table3.clientOId111 }}</td>
            <td>{{ table3.typeChb112 }}</td>
            <td>{{ table3.confirmationNo113 }}</td>
            <td>{{ table3.clientMdmId114 }}</td>
            <td>{{ table3.nameId115 }}</td>
            <td>{{ table3.parentResvNameId116 }}</td>
            <td>{{ table3.contactId117 }}</td>
            <td>{{ table3.agenceId118 }}</td>
            <td>{{ table3.agenceNom119 }}</td>
            <td>{{ table3.societeId120 }}</td>
            <td>{{ table3.groupeId121 }}</td>
            <td>{{ table3.numBloc122 }}</td>
            <td>{{ table3.typeResv123 }}</td>
            <td>{{ table3.statutResv124 }}</td>
            <td>{{ table3.dateDebutResv125 }}</td>
            <td>{{ table3.dateFinResv126 }}</td>
            <td>{{ table3.truncDateDebutResv127 }}</td>
            <td>{{ table3.truncDateFinResv128 }}</td>
            <td>{{ table3.dateAnnResv129 }}</td>
            <td>{{ table3.pseudoRoomYn130 }}</td>
            <td>{{ table3.createurResv131 }}</td>
            <td>{{ table3.nomCreateurResv132 }}</td>
            <td>{{ table3.codeGarantie133 }}</td>
            <td>{{ table3.flgDed134 }}</td>
            <td>{{ table3.codePays135 }}</td>
            <td>{{ table3.libPays136 }}</td>
            <td>{{ table3.codeNationalite137 }}</td>
            <td>{{ table3.libNationalite138 }}</td>
            <td>{{ table3.codeSource139 }}</td>
            <td>{{ table3.libSource140 }}</td>
            <td>{{ table3.codeGrandSource141 }}</td>
            <td>{{ table3.codeOrigine142 }}</td>
            <td>{{ table3.libOrigine143 }}</td>
            <td>{{ table3.codeMarche144 }}</td>
            <td>{{ table3.libMarche145 }}</td>
            <td>{{ table3.codeGrandMarche146 }}</td>
            <td>{{ table3.libGrandMarche147 }}</td>
            <td>{{ table3.codePrix148 }}</td>
            <td>{{ table3.categPrix149 }}</td>
            <td>{{ table3.libPrix150 }}</td>
            <td>{{ table3.numChb151 }}</td>
            <td>{{ table3.descriptionTypeChb152 }}</td>
            <td>{{ table3.codeTypeChb153 }}</td>
            <td>{{ table3.classChb154 }}</td>
            <td>{{ table3.caractChb155 }}</td>
            <td>{{ table3.typeChbDeReservation156 }}</td>
            <td>{{ table3.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table3.codeTypeChbDeResv158 }}</td>
            <td>{{ table3.statutDeReservation159 }}</td>
            <td>{{ table3.circuitDistribution160 }}</td>
            <td>{{ table3.circuitDistribUserRegroup161 }}</td>
            <td>{{ table3.numCrs162 }}</td>
            <td>{{ table3.typeRefCrs163 }}</td>
            <td>{{ table3.crsInsertDate164 }}</td>
            <td>{{ table3.dateCreaResv165 }}</td>
            <td>{{ table3.datePremier166 }}</td>
            <td>{{ table3.statutPremier167 }}</td>
            <td>{{ table3.dateDernier168 }}</td>
            <td>{{ table3.statutDernier169 }}</td>
            <td>{{ table3.dateDernierPseudo170 }}</td>
            <td>{{ table3.statutDernierPseudo171 }}</td>
            <td>{{ table3.diffDtCreaAnn172 }}</td>
            <td>{{ table3.diffDtArrAnn173 }}</td>
            <td>{{ table3.leadtime174 }}</td>
            <td>{{ table3.los175 }}</td>
            <td>{{ table3.occupantsGroupe176 }}</td>
            <td>{{ table3.nbNuitee177 }}</td>
            <td>{{ table3.nbNuiteeNnDed178 }}</td>
            <td>{{ table3.nbResvAnn179 }}</td>
            <td>{{ table3.nbAdu180 }}</td>
            <td>{{ table3.nbEnf181 }}</td>
            <td>{{ table3.nbPersDayU182 }}</td>
            <td>{{ table3.nbPersArr183 }}</td>
            <td>{{ table3.nbPersDep184 }}</td>
            <td>{{ table3.nbPersAnn185 }}</td>
            <td>{{ table3.nbPersNoshow186 }}</td>
            <td>{{ table3.nbChbDayU187 }}</td>
            <td>{{ table3.nbChbArr188 }}</td>
            <td>{{ table3.nbChbDep189 }}</td>
            <td>{{ table3.nbChbAnn190 }}</td>
            <td>{{ table3.nbChbNoshow191 }}</td>
            <td>{{ table3.revenuNetChambre192 }}</td>
            <td>{{ table3.revenuTaxeChambre193 }}</td>
            <td>{{ table3.revenuNetChambreGlobal194 }}</td>
            <td>{{ table3.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table3.revenuNetBq196 }}</td>
            <td>{{ table3.revenuTaxeBq197 }}</td>
            <td>{{ table3.revenuNetBqGlobal198 }}</td>
            <td>{{ table3.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table3.revenuNetExtra200 }}</td>
            <td>{{ table3.revenuTaxeExtra201 }}</td>
            <td>{{ table3.revenuNetExtraGlobal202 }}</td>
            <td>{{ table3.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table3.revenuNetTotal204 }}</td>
            <td>{{ table3.revenuTaxeTotal205 }}</td>
            <td>{{ table3.revenuNetTotalGlobal206 }}</td>
            <td>{{ table3.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table3.prodRevenuChambre208 }}</td>
            <td>{{ table3.prodRevenuBq209 }}</td>
            <td>{{ table3.prodRevenuExtra210 }}</td>
            <td>{{ table3.prodRevenuTotal211 }}</td>
            <td>{{ table3.prodChambreNbNuitees212 }}</td>
            <td>{{ table3.techCreateDate213 }}</td>
            <td>{{ table3.techUpdateDate214 }}</td>
            <td>{{ table3.numLigne215 }}</td>
            <td>{{ table3.resort216 }}</td>
            <td>{{ table3.resvNameId217 }}</td>
            <td>{{ table3.clientOId218 }}</td>
            <td>{{ table3.typeChb219 }}</td>
            <td>{{ table3.confirmationNo220 }}</td>
            <td>{{ table3.clientMdmId221 }}</td>
            <td>{{ table3.nameId222 }}</td>
            <td>{{ table3.parentResvNameId223 }}</td>
            <td>{{ table3.contactId224 }}</td>
            <td>{{ table3.agenceId225 }}</td>
            <td>{{ table3.agenceNom226 }}</td>
            <td>{{ table3.societeId227 }}</td>
            <td>{{ table3.groupeId228 }}</td>
            <td>{{ table3.numBloc229 }}</td>
            <td>{{ table3.typeResv230 }}</td>
            <td>{{ table3.statutResv231 }}</td>
            <td>{{ table3.dateDebutResv232 }}</td>
            <td>{{ table3.dateFinResv233 }}</td>
            <td>{{ table3.truncDateDebutResv234 }}</td>
            <td>{{ table3.truncDateFinResv235 }}</td>
            <td>{{ table3.dateAnnResv236 }}</td>
            <td>{{ table3.pseudoRoomYn237 }}</td>
            <td>{{ table3.createurResv238 }}</td>
            <td>{{ table3.nomCreateurResv239 }}</td>
            <td>{{ table3.codeGarantie240 }}</td>
            <td>{{ table3.flgDed241 }}</td>
            <td>{{ table3.codePays242 }}</td>
            <td>{{ table3.libPays243 }}</td>
            <td>{{ table3.codeNationalite244 }}</td>
            <td>{{ table3.libNationalite245 }}</td>
            <td>{{ table3.codeSource246 }}</td>
            <td>{{ table3.libSource247 }}</td>
            <td>{{ table3.codeGrandSource248 }}</td>
            <td>{{ table3.codeOrigine249 }}</td>
            <td>{{ table3.libOrigine250 }}</td>
            <td>{{ table3.codeMarche251 }}</td>
            <td>{{ table3.libMarche252 }}</td>
            <td>{{ table3.codeGrandMarche253 }}</td>
            <td>{{ table3.libGrandMarche254 }}</td>
            <td>{{ table3.codePrix255 }}</td>
            <td>{{ table3.categPrix256 }}</td>
            <td>{{ table3.libPrix257 }}</td>
            <td>{{ table3.numChb258 }}</td>
            <td>{{ table3.descriptionTypeChb259 }}</td>
            <td>{{ table3.codeTypeChb260 }}</td>
            <td>{{ table3.classChb261 }}</td>
            <td>{{ table3.caractChb262 }}</td>
            <td>{{ table3.typeChbDeReservation263 }}</td>
            <td>{{ table3.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table3.codeTypeChbDeResv265 }}</td>
            <td>{{ table3.statutDeReservation266 }}</td>
            <td>{{ table3.circuitDistribution267 }}</td>
            <td>{{ table3.circuitDistribUserRegroup268 }}</td>
            <td>{{ table3.numCrs269 }}</td>
            <td>{{ table3.typeRefCrs270 }}</td>
            <td>{{ table3.crsInsertDate271 }}</td>
            <td>{{ table3.dateCreaResv272 }}</td>
            <td>{{ table3.datePremier273 }}</td>
            <td>{{ table3.statutPremier274 }}</td>
            <td>{{ table3.dateDernier275 }}</td>
            <td>{{ table3.statutDernier276 }}</td>
            <td>{{ table3.dateDernierPseudo277 }}</td>
            <td>{{ table3.statutDernierPseudo278 }}</td>
            <td>{{ table3.diffDtCreaAnn279 }}</td>
            <td>{{ table3.diffDtArrAnn280 }}</td>
            <td>{{ table3.leadtime281 }}</td>
            <td>{{ table3.los282 }}</td>
            <td>{{ table3.occupantsGroupe283 }}</td>
            <td>{{ table3.nbNuitee284 }}</td>
            <td>{{ table3.nbNuiteeNnDed285 }}</td>
            <td>{{ table3.nbResvAnn286 }}</td>
            <td>{{ table3.nbAdu287 }}</td>
            <td>{{ table3.nbEnf288 }}</td>
            <td>{{ table3.nbPersDayU289 }}</td>
            <td>{{ table3.nbPersArr290 }}</td>
            <td>{{ table3.nbPersDep291 }}</td>
            <td>{{ table3.nbPersAnn292 }}</td>
            <td>{{ table3.nbPersNoshow293 }}</td>
            <td>{{ table3.nbChbDayU294 }}</td>
            <td>{{ table3.nbChbArr295 }}</td>
            <td>{{ table3.nbChbDep296 }}</td>
            <td>{{ table3.nbChbAnn297 }}</td>
            <td>{{ table3.nbChbNoshow298 }}</td>
            <td>{{ table3.revenuNetChambre299 }}</td>
            <td>{{ table3.revenuTaxeChambre300 }}</td>
            <td>{{ table3.revenuNetChambreGlobal301 }}</td>
            <td>{{ table3.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table3.revenuNetBq303 }}</td>
            <td>{{ table3.revenuTaxeBq304 }}</td>
            <td>{{ table3.revenuNetBqGlobal305 }}</td>
            <td>{{ table3.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table3.revenuNetExtra307 }}</td>
            <td>{{ table3.revenuTaxeExtra308 }}</td>
            <td>{{ table3.revenuNetExtraGlobal309 }}</td>
            <td>{{ table3.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table3View', params: { table3Id: table3.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table3Edit', params: { table3Id: table3.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table3)"
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
          id="big10SampleApplicationApp.table3.delete.question"
          data-cy="table3DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table3-heading" v-text="t$('big10SampleApplicationApp.table3.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table3"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable3()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-3.component.ts"></script>
