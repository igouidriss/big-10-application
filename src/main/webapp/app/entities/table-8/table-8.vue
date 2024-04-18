<template>
  <div>
    <h2 id="page-heading" data-cy="Table8Heading">
      <span v-text="t$('big10SampleApplicationApp.table8.home.title')" id="table-8-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table8.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table8Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-8"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table8.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table8s && table8s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table8.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table8s && table8s.length > 0">
      <table class="table table-striped" aria-describedby="table8s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table8.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table8 in table8s" :key="table8.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table8View', params: { table8Id: table8.id } }">{{ table8.id }}</router-link>
            </td>
            <td>{{ table8.numLigne1 }}</td>
            <td>{{ table8.resort2 }}</td>
            <td>{{ table8.resvNameId3 }}</td>
            <td>{{ table8.clientOId4 }}</td>
            <td>{{ table8.typeChb5 }}</td>
            <td>{{ table8.confirmationNo6 }}</td>
            <td>{{ table8.clientMdmId7 }}</td>
            <td>{{ table8.nameId8 }}</td>
            <td>{{ table8.parentResvNameId9 }}</td>
            <td>{{ table8.contactId10 }}</td>
            <td>{{ table8.agenceId11 }}</td>
            <td>{{ table8.agenceNom12 }}</td>
            <td>{{ table8.societeId13 }}</td>
            <td>{{ table8.groupeId14 }}</td>
            <td>{{ table8.numBloc15 }}</td>
            <td>{{ table8.typeResv16 }}</td>
            <td>{{ table8.statutResv17 }}</td>
            <td>{{ table8.dateDebutResv18 }}</td>
            <td>{{ table8.dateFinResv19 }}</td>
            <td>{{ table8.truncDateDebutResv20 }}</td>
            <td>{{ table8.truncDateFinResv21 }}</td>
            <td>{{ table8.dateAnnResv22 }}</td>
            <td>{{ table8.pseudoRoomYn23 }}</td>
            <td>{{ table8.createurResv24 }}</td>
            <td>{{ table8.nomCreateurResv25 }}</td>
            <td>{{ table8.codeGarantie26 }}</td>
            <td>{{ table8.flgDed27 }}</td>
            <td>{{ table8.codePays28 }}</td>
            <td>{{ table8.libPays29 }}</td>
            <td>{{ table8.codeNationalite30 }}</td>
            <td>{{ table8.libNationalite31 }}</td>
            <td>{{ table8.codeSource32 }}</td>
            <td>{{ table8.libSource33 }}</td>
            <td>{{ table8.codeGrandSource34 }}</td>
            <td>{{ table8.codeOrigine35 }}</td>
            <td>{{ table8.libOrigine36 }}</td>
            <td>{{ table8.codeMarche37 }}</td>
            <td>{{ table8.libMarche38 }}</td>
            <td>{{ table8.codeGrandMarche39 }}</td>
            <td>{{ table8.libGrandMarche40 }}</td>
            <td>{{ table8.codePrix41 }}</td>
            <td>{{ table8.categPrix42 }}</td>
            <td>{{ table8.libPrix43 }}</td>
            <td>{{ table8.numChb44 }}</td>
            <td>{{ table8.descriptionTypeChb45 }}</td>
            <td>{{ table8.codeTypeChb46 }}</td>
            <td>{{ table8.classChb47 }}</td>
            <td>{{ table8.caractChb48 }}</td>
            <td>{{ table8.typeChbDeReservation49 }}</td>
            <td>{{ table8.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table8.codeTypeChbDeResv51 }}</td>
            <td>{{ table8.statutDeReservation52 }}</td>
            <td>{{ table8.circuitDistribution53 }}</td>
            <td>{{ table8.circuitDistribUserRegroup54 }}</td>
            <td>{{ table8.numCrs55 }}</td>
            <td>{{ table8.typeRefCrs56 }}</td>
            <td>{{ table8.crsInsertDate57 }}</td>
            <td>{{ table8.dateCreaResv58 }}</td>
            <td>{{ table8.datePremier59 }}</td>
            <td>{{ table8.statutPremier60 }}</td>
            <td>{{ table8.dateDernier61 }}</td>
            <td>{{ table8.statutDernier62 }}</td>
            <td>{{ table8.dateDernierPseudo63 }}</td>
            <td>{{ table8.statutDernierPseudo64 }}</td>
            <td>{{ table8.diffDtCreaAnn65 }}</td>
            <td>{{ table8.diffDtArrAnn66 }}</td>
            <td>{{ table8.leadtime67 }}</td>
            <td>{{ table8.los68 }}</td>
            <td>{{ table8.occupantsGroupe69 }}</td>
            <td>{{ table8.nbNuitee70 }}</td>
            <td>{{ table8.nbNuiteeNnDed71 }}</td>
            <td>{{ table8.nbResvAnn72 }}</td>
            <td>{{ table8.nbAdu73 }}</td>
            <td>{{ table8.nbEnf74 }}</td>
            <td>{{ table8.nbPersDayU75 }}</td>
            <td>{{ table8.nbPersArr76 }}</td>
            <td>{{ table8.nbPersDep77 }}</td>
            <td>{{ table8.nbPersAnn78 }}</td>
            <td>{{ table8.nbPersNoshow79 }}</td>
            <td>{{ table8.nbChbDayU80 }}</td>
            <td>{{ table8.nbChbArr81 }}</td>
            <td>{{ table8.nbChbDep82 }}</td>
            <td>{{ table8.nbChbAnn83 }}</td>
            <td>{{ table8.nbChbNoshow84 }}</td>
            <td>{{ table8.revenuNetChambre85 }}</td>
            <td>{{ table8.revenuTaxeChambre86 }}</td>
            <td>{{ table8.revenuNetChambreGlobal87 }}</td>
            <td>{{ table8.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table8.revenuNetBq89 }}</td>
            <td>{{ table8.revenuTaxeBq90 }}</td>
            <td>{{ table8.revenuNetBqGlobal91 }}</td>
            <td>{{ table8.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table8.revenuNetExtra93 }}</td>
            <td>{{ table8.revenuTaxeExtra94 }}</td>
            <td>{{ table8.revenuNetExtraGlobal95 }}</td>
            <td>{{ table8.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table8.revenuNetTotal97 }}</td>
            <td>{{ table8.revenuTaxeTotal98 }}</td>
            <td>{{ table8.revenuNetTotalGlobal99 }}</td>
            <td>{{ table8.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table8.prodRevenuChambre101 }}</td>
            <td>{{ table8.prodRevenuBq102 }}</td>
            <td>{{ table8.prodRevenuExtra103 }}</td>
            <td>{{ table8.prodRevenuTotal104 }}</td>
            <td>{{ table8.prodChambreNbNuitees105 }}</td>
            <td>{{ table8.techCreateDate106 }}</td>
            <td>{{ table8.techUpdateDate107 }}</td>
            <td>{{ table8.numLigne108 }}</td>
            <td>{{ table8.resort109 }}</td>
            <td>{{ table8.resvNameId110 }}</td>
            <td>{{ table8.clientOId111 }}</td>
            <td>{{ table8.typeChb112 }}</td>
            <td>{{ table8.confirmationNo113 }}</td>
            <td>{{ table8.clientMdmId114 }}</td>
            <td>{{ table8.nameId115 }}</td>
            <td>{{ table8.parentResvNameId116 }}</td>
            <td>{{ table8.contactId117 }}</td>
            <td>{{ table8.agenceId118 }}</td>
            <td>{{ table8.agenceNom119 }}</td>
            <td>{{ table8.societeId120 }}</td>
            <td>{{ table8.groupeId121 }}</td>
            <td>{{ table8.numBloc122 }}</td>
            <td>{{ table8.typeResv123 }}</td>
            <td>{{ table8.statutResv124 }}</td>
            <td>{{ table8.dateDebutResv125 }}</td>
            <td>{{ table8.dateFinResv126 }}</td>
            <td>{{ table8.truncDateDebutResv127 }}</td>
            <td>{{ table8.truncDateFinResv128 }}</td>
            <td>{{ table8.dateAnnResv129 }}</td>
            <td>{{ table8.pseudoRoomYn130 }}</td>
            <td>{{ table8.createurResv131 }}</td>
            <td>{{ table8.nomCreateurResv132 }}</td>
            <td>{{ table8.codeGarantie133 }}</td>
            <td>{{ table8.flgDed134 }}</td>
            <td>{{ table8.codePays135 }}</td>
            <td>{{ table8.libPays136 }}</td>
            <td>{{ table8.codeNationalite137 }}</td>
            <td>{{ table8.libNationalite138 }}</td>
            <td>{{ table8.codeSource139 }}</td>
            <td>{{ table8.libSource140 }}</td>
            <td>{{ table8.codeGrandSource141 }}</td>
            <td>{{ table8.codeOrigine142 }}</td>
            <td>{{ table8.libOrigine143 }}</td>
            <td>{{ table8.codeMarche144 }}</td>
            <td>{{ table8.libMarche145 }}</td>
            <td>{{ table8.codeGrandMarche146 }}</td>
            <td>{{ table8.libGrandMarche147 }}</td>
            <td>{{ table8.codePrix148 }}</td>
            <td>{{ table8.categPrix149 }}</td>
            <td>{{ table8.libPrix150 }}</td>
            <td>{{ table8.numChb151 }}</td>
            <td>{{ table8.descriptionTypeChb152 }}</td>
            <td>{{ table8.codeTypeChb153 }}</td>
            <td>{{ table8.classChb154 }}</td>
            <td>{{ table8.caractChb155 }}</td>
            <td>{{ table8.typeChbDeReservation156 }}</td>
            <td>{{ table8.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table8.codeTypeChbDeResv158 }}</td>
            <td>{{ table8.statutDeReservation159 }}</td>
            <td>{{ table8.circuitDistribution160 }}</td>
            <td>{{ table8.circuitDistribUserRegroup161 }}</td>
            <td>{{ table8.numCrs162 }}</td>
            <td>{{ table8.typeRefCrs163 }}</td>
            <td>{{ table8.crsInsertDate164 }}</td>
            <td>{{ table8.dateCreaResv165 }}</td>
            <td>{{ table8.datePremier166 }}</td>
            <td>{{ table8.statutPremier167 }}</td>
            <td>{{ table8.dateDernier168 }}</td>
            <td>{{ table8.statutDernier169 }}</td>
            <td>{{ table8.dateDernierPseudo170 }}</td>
            <td>{{ table8.statutDernierPseudo171 }}</td>
            <td>{{ table8.diffDtCreaAnn172 }}</td>
            <td>{{ table8.diffDtArrAnn173 }}</td>
            <td>{{ table8.leadtime174 }}</td>
            <td>{{ table8.los175 }}</td>
            <td>{{ table8.occupantsGroupe176 }}</td>
            <td>{{ table8.nbNuitee177 }}</td>
            <td>{{ table8.nbNuiteeNnDed178 }}</td>
            <td>{{ table8.nbResvAnn179 }}</td>
            <td>{{ table8.nbAdu180 }}</td>
            <td>{{ table8.nbEnf181 }}</td>
            <td>{{ table8.nbPersDayU182 }}</td>
            <td>{{ table8.nbPersArr183 }}</td>
            <td>{{ table8.nbPersDep184 }}</td>
            <td>{{ table8.nbPersAnn185 }}</td>
            <td>{{ table8.nbPersNoshow186 }}</td>
            <td>{{ table8.nbChbDayU187 }}</td>
            <td>{{ table8.nbChbArr188 }}</td>
            <td>{{ table8.nbChbDep189 }}</td>
            <td>{{ table8.nbChbAnn190 }}</td>
            <td>{{ table8.nbChbNoshow191 }}</td>
            <td>{{ table8.revenuNetChambre192 }}</td>
            <td>{{ table8.revenuTaxeChambre193 }}</td>
            <td>{{ table8.revenuNetChambreGlobal194 }}</td>
            <td>{{ table8.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table8.revenuNetBq196 }}</td>
            <td>{{ table8.revenuTaxeBq197 }}</td>
            <td>{{ table8.revenuNetBqGlobal198 }}</td>
            <td>{{ table8.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table8.revenuNetExtra200 }}</td>
            <td>{{ table8.revenuTaxeExtra201 }}</td>
            <td>{{ table8.revenuNetExtraGlobal202 }}</td>
            <td>{{ table8.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table8.revenuNetTotal204 }}</td>
            <td>{{ table8.revenuTaxeTotal205 }}</td>
            <td>{{ table8.revenuNetTotalGlobal206 }}</td>
            <td>{{ table8.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table8.prodRevenuChambre208 }}</td>
            <td>{{ table8.prodRevenuBq209 }}</td>
            <td>{{ table8.prodRevenuExtra210 }}</td>
            <td>{{ table8.prodRevenuTotal211 }}</td>
            <td>{{ table8.prodChambreNbNuitees212 }}</td>
            <td>{{ table8.techCreateDate213 }}</td>
            <td>{{ table8.techUpdateDate214 }}</td>
            <td>{{ table8.numLigne215 }}</td>
            <td>{{ table8.resort216 }}</td>
            <td>{{ table8.resvNameId217 }}</td>
            <td>{{ table8.clientOId218 }}</td>
            <td>{{ table8.typeChb219 }}</td>
            <td>{{ table8.confirmationNo220 }}</td>
            <td>{{ table8.clientMdmId221 }}</td>
            <td>{{ table8.nameId222 }}</td>
            <td>{{ table8.parentResvNameId223 }}</td>
            <td>{{ table8.contactId224 }}</td>
            <td>{{ table8.agenceId225 }}</td>
            <td>{{ table8.agenceNom226 }}</td>
            <td>{{ table8.societeId227 }}</td>
            <td>{{ table8.groupeId228 }}</td>
            <td>{{ table8.numBloc229 }}</td>
            <td>{{ table8.typeResv230 }}</td>
            <td>{{ table8.statutResv231 }}</td>
            <td>{{ table8.dateDebutResv232 }}</td>
            <td>{{ table8.dateFinResv233 }}</td>
            <td>{{ table8.truncDateDebutResv234 }}</td>
            <td>{{ table8.truncDateFinResv235 }}</td>
            <td>{{ table8.dateAnnResv236 }}</td>
            <td>{{ table8.pseudoRoomYn237 }}</td>
            <td>{{ table8.createurResv238 }}</td>
            <td>{{ table8.nomCreateurResv239 }}</td>
            <td>{{ table8.codeGarantie240 }}</td>
            <td>{{ table8.flgDed241 }}</td>
            <td>{{ table8.codePays242 }}</td>
            <td>{{ table8.libPays243 }}</td>
            <td>{{ table8.codeNationalite244 }}</td>
            <td>{{ table8.libNationalite245 }}</td>
            <td>{{ table8.codeSource246 }}</td>
            <td>{{ table8.libSource247 }}</td>
            <td>{{ table8.codeGrandSource248 }}</td>
            <td>{{ table8.codeOrigine249 }}</td>
            <td>{{ table8.libOrigine250 }}</td>
            <td>{{ table8.codeMarche251 }}</td>
            <td>{{ table8.libMarche252 }}</td>
            <td>{{ table8.codeGrandMarche253 }}</td>
            <td>{{ table8.libGrandMarche254 }}</td>
            <td>{{ table8.codePrix255 }}</td>
            <td>{{ table8.categPrix256 }}</td>
            <td>{{ table8.libPrix257 }}</td>
            <td>{{ table8.numChb258 }}</td>
            <td>{{ table8.descriptionTypeChb259 }}</td>
            <td>{{ table8.codeTypeChb260 }}</td>
            <td>{{ table8.classChb261 }}</td>
            <td>{{ table8.caractChb262 }}</td>
            <td>{{ table8.typeChbDeReservation263 }}</td>
            <td>{{ table8.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table8.codeTypeChbDeResv265 }}</td>
            <td>{{ table8.statutDeReservation266 }}</td>
            <td>{{ table8.circuitDistribution267 }}</td>
            <td>{{ table8.circuitDistribUserRegroup268 }}</td>
            <td>{{ table8.numCrs269 }}</td>
            <td>{{ table8.typeRefCrs270 }}</td>
            <td>{{ table8.crsInsertDate271 }}</td>
            <td>{{ table8.dateCreaResv272 }}</td>
            <td>{{ table8.datePremier273 }}</td>
            <td>{{ table8.statutPremier274 }}</td>
            <td>{{ table8.dateDernier275 }}</td>
            <td>{{ table8.statutDernier276 }}</td>
            <td>{{ table8.dateDernierPseudo277 }}</td>
            <td>{{ table8.statutDernierPseudo278 }}</td>
            <td>{{ table8.diffDtCreaAnn279 }}</td>
            <td>{{ table8.diffDtArrAnn280 }}</td>
            <td>{{ table8.leadtime281 }}</td>
            <td>{{ table8.los282 }}</td>
            <td>{{ table8.occupantsGroupe283 }}</td>
            <td>{{ table8.nbNuitee284 }}</td>
            <td>{{ table8.nbNuiteeNnDed285 }}</td>
            <td>{{ table8.nbResvAnn286 }}</td>
            <td>{{ table8.nbAdu287 }}</td>
            <td>{{ table8.nbEnf288 }}</td>
            <td>{{ table8.nbPersDayU289 }}</td>
            <td>{{ table8.nbPersArr290 }}</td>
            <td>{{ table8.nbPersDep291 }}</td>
            <td>{{ table8.nbPersAnn292 }}</td>
            <td>{{ table8.nbPersNoshow293 }}</td>
            <td>{{ table8.nbChbDayU294 }}</td>
            <td>{{ table8.nbChbArr295 }}</td>
            <td>{{ table8.nbChbDep296 }}</td>
            <td>{{ table8.nbChbAnn297 }}</td>
            <td>{{ table8.nbChbNoshow298 }}</td>
            <td>{{ table8.revenuNetChambre299 }}</td>
            <td>{{ table8.revenuTaxeChambre300 }}</td>
            <td>{{ table8.revenuNetChambreGlobal301 }}</td>
            <td>{{ table8.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table8.revenuNetBq303 }}</td>
            <td>{{ table8.revenuTaxeBq304 }}</td>
            <td>{{ table8.revenuNetBqGlobal305 }}</td>
            <td>{{ table8.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table8.revenuNetExtra307 }}</td>
            <td>{{ table8.revenuTaxeExtra308 }}</td>
            <td>{{ table8.revenuNetExtraGlobal309 }}</td>
            <td>{{ table8.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table8View', params: { table8Id: table8.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table8Edit', params: { table8Id: table8.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table8)"
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
          id="big10SampleApplicationApp.table8.delete.question"
          data-cy="table8DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table8-heading" v-text="t$('big10SampleApplicationApp.table8.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table8"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable8()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-8.component.ts"></script>
