<template>
  <div>
    <h2 id="page-heading" data-cy="Table9Heading">
      <span v-text="t$('big10SampleApplicationApp.table9.home.title')" id="table-9-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table9.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table9Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-9"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table9.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table9s && table9s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table9.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table9s && table9s.length > 0">
      <table class="table table-striped" aria-describedby="table9s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table9.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table9 in table9s" :key="table9.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table9View', params: { table9Id: table9.id } }">{{ table9.id }}</router-link>
            </td>
            <td>{{ table9.numLigne1 }}</td>
            <td>{{ table9.resort2 }}</td>
            <td>{{ table9.resvNameId3 }}</td>
            <td>{{ table9.clientOId4 }}</td>
            <td>{{ table9.typeChb5 }}</td>
            <td>{{ table9.confirmationNo6 }}</td>
            <td>{{ table9.clientMdmId7 }}</td>
            <td>{{ table9.nameId8 }}</td>
            <td>{{ table9.parentResvNameId9 }}</td>
            <td>{{ table9.contactId10 }}</td>
            <td>{{ table9.agenceId11 }}</td>
            <td>{{ table9.agenceNom12 }}</td>
            <td>{{ table9.societeId13 }}</td>
            <td>{{ table9.groupeId14 }}</td>
            <td>{{ table9.numBloc15 }}</td>
            <td>{{ table9.typeResv16 }}</td>
            <td>{{ table9.statutResv17 }}</td>
            <td>{{ table9.dateDebutResv18 }}</td>
            <td>{{ table9.dateFinResv19 }}</td>
            <td>{{ table9.truncDateDebutResv20 }}</td>
            <td>{{ table9.truncDateFinResv21 }}</td>
            <td>{{ table9.dateAnnResv22 }}</td>
            <td>{{ table9.pseudoRoomYn23 }}</td>
            <td>{{ table9.createurResv24 }}</td>
            <td>{{ table9.nomCreateurResv25 }}</td>
            <td>{{ table9.codeGarantie26 }}</td>
            <td>{{ table9.flgDed27 }}</td>
            <td>{{ table9.codePays28 }}</td>
            <td>{{ table9.libPays29 }}</td>
            <td>{{ table9.codeNationalite30 }}</td>
            <td>{{ table9.libNationalite31 }}</td>
            <td>{{ table9.codeSource32 }}</td>
            <td>{{ table9.libSource33 }}</td>
            <td>{{ table9.codeGrandSource34 }}</td>
            <td>{{ table9.codeOrigine35 }}</td>
            <td>{{ table9.libOrigine36 }}</td>
            <td>{{ table9.codeMarche37 }}</td>
            <td>{{ table9.libMarche38 }}</td>
            <td>{{ table9.codeGrandMarche39 }}</td>
            <td>{{ table9.libGrandMarche40 }}</td>
            <td>{{ table9.codePrix41 }}</td>
            <td>{{ table9.categPrix42 }}</td>
            <td>{{ table9.libPrix43 }}</td>
            <td>{{ table9.numChb44 }}</td>
            <td>{{ table9.descriptionTypeChb45 }}</td>
            <td>{{ table9.codeTypeChb46 }}</td>
            <td>{{ table9.classChb47 }}</td>
            <td>{{ table9.caractChb48 }}</td>
            <td>{{ table9.typeChbDeReservation49 }}</td>
            <td>{{ table9.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table9.codeTypeChbDeResv51 }}</td>
            <td>{{ table9.statutDeReservation52 }}</td>
            <td>{{ table9.circuitDistribution53 }}</td>
            <td>{{ table9.circuitDistribUserRegroup54 }}</td>
            <td>{{ table9.numCrs55 }}</td>
            <td>{{ table9.typeRefCrs56 }}</td>
            <td>{{ table9.crsInsertDate57 }}</td>
            <td>{{ table9.dateCreaResv58 }}</td>
            <td>{{ table9.datePremier59 }}</td>
            <td>{{ table9.statutPremier60 }}</td>
            <td>{{ table9.dateDernier61 }}</td>
            <td>{{ table9.statutDernier62 }}</td>
            <td>{{ table9.dateDernierPseudo63 }}</td>
            <td>{{ table9.statutDernierPseudo64 }}</td>
            <td>{{ table9.diffDtCreaAnn65 }}</td>
            <td>{{ table9.diffDtArrAnn66 }}</td>
            <td>{{ table9.leadtime67 }}</td>
            <td>{{ table9.los68 }}</td>
            <td>{{ table9.occupantsGroupe69 }}</td>
            <td>{{ table9.nbNuitee70 }}</td>
            <td>{{ table9.nbNuiteeNnDed71 }}</td>
            <td>{{ table9.nbResvAnn72 }}</td>
            <td>{{ table9.nbAdu73 }}</td>
            <td>{{ table9.nbEnf74 }}</td>
            <td>{{ table9.nbPersDayU75 }}</td>
            <td>{{ table9.nbPersArr76 }}</td>
            <td>{{ table9.nbPersDep77 }}</td>
            <td>{{ table9.nbPersAnn78 }}</td>
            <td>{{ table9.nbPersNoshow79 }}</td>
            <td>{{ table9.nbChbDayU80 }}</td>
            <td>{{ table9.nbChbArr81 }}</td>
            <td>{{ table9.nbChbDep82 }}</td>
            <td>{{ table9.nbChbAnn83 }}</td>
            <td>{{ table9.nbChbNoshow84 }}</td>
            <td>{{ table9.revenuNetChambre85 }}</td>
            <td>{{ table9.revenuTaxeChambre86 }}</td>
            <td>{{ table9.revenuNetChambreGlobal87 }}</td>
            <td>{{ table9.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table9.revenuNetBq89 }}</td>
            <td>{{ table9.revenuTaxeBq90 }}</td>
            <td>{{ table9.revenuNetBqGlobal91 }}</td>
            <td>{{ table9.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table9.revenuNetExtra93 }}</td>
            <td>{{ table9.revenuTaxeExtra94 }}</td>
            <td>{{ table9.revenuNetExtraGlobal95 }}</td>
            <td>{{ table9.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table9.revenuNetTotal97 }}</td>
            <td>{{ table9.revenuTaxeTotal98 }}</td>
            <td>{{ table9.revenuNetTotalGlobal99 }}</td>
            <td>{{ table9.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table9.prodRevenuChambre101 }}</td>
            <td>{{ table9.prodRevenuBq102 }}</td>
            <td>{{ table9.prodRevenuExtra103 }}</td>
            <td>{{ table9.prodRevenuTotal104 }}</td>
            <td>{{ table9.prodChambreNbNuitees105 }}</td>
            <td>{{ table9.techCreateDate106 }}</td>
            <td>{{ table9.techUpdateDate107 }}</td>
            <td>{{ table9.numLigne108 }}</td>
            <td>{{ table9.resort109 }}</td>
            <td>{{ table9.resvNameId110 }}</td>
            <td>{{ table9.clientOId111 }}</td>
            <td>{{ table9.typeChb112 }}</td>
            <td>{{ table9.confirmationNo113 }}</td>
            <td>{{ table9.clientMdmId114 }}</td>
            <td>{{ table9.nameId115 }}</td>
            <td>{{ table9.parentResvNameId116 }}</td>
            <td>{{ table9.contactId117 }}</td>
            <td>{{ table9.agenceId118 }}</td>
            <td>{{ table9.agenceNom119 }}</td>
            <td>{{ table9.societeId120 }}</td>
            <td>{{ table9.groupeId121 }}</td>
            <td>{{ table9.numBloc122 }}</td>
            <td>{{ table9.typeResv123 }}</td>
            <td>{{ table9.statutResv124 }}</td>
            <td>{{ table9.dateDebutResv125 }}</td>
            <td>{{ table9.dateFinResv126 }}</td>
            <td>{{ table9.truncDateDebutResv127 }}</td>
            <td>{{ table9.truncDateFinResv128 }}</td>
            <td>{{ table9.dateAnnResv129 }}</td>
            <td>{{ table9.pseudoRoomYn130 }}</td>
            <td>{{ table9.createurResv131 }}</td>
            <td>{{ table9.nomCreateurResv132 }}</td>
            <td>{{ table9.codeGarantie133 }}</td>
            <td>{{ table9.flgDed134 }}</td>
            <td>{{ table9.codePays135 }}</td>
            <td>{{ table9.libPays136 }}</td>
            <td>{{ table9.codeNationalite137 }}</td>
            <td>{{ table9.libNationalite138 }}</td>
            <td>{{ table9.codeSource139 }}</td>
            <td>{{ table9.libSource140 }}</td>
            <td>{{ table9.codeGrandSource141 }}</td>
            <td>{{ table9.codeOrigine142 }}</td>
            <td>{{ table9.libOrigine143 }}</td>
            <td>{{ table9.codeMarche144 }}</td>
            <td>{{ table9.libMarche145 }}</td>
            <td>{{ table9.codeGrandMarche146 }}</td>
            <td>{{ table9.libGrandMarche147 }}</td>
            <td>{{ table9.codePrix148 }}</td>
            <td>{{ table9.categPrix149 }}</td>
            <td>{{ table9.libPrix150 }}</td>
            <td>{{ table9.numChb151 }}</td>
            <td>{{ table9.descriptionTypeChb152 }}</td>
            <td>{{ table9.codeTypeChb153 }}</td>
            <td>{{ table9.classChb154 }}</td>
            <td>{{ table9.caractChb155 }}</td>
            <td>{{ table9.typeChbDeReservation156 }}</td>
            <td>{{ table9.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table9.codeTypeChbDeResv158 }}</td>
            <td>{{ table9.statutDeReservation159 }}</td>
            <td>{{ table9.circuitDistribution160 }}</td>
            <td>{{ table9.circuitDistribUserRegroup161 }}</td>
            <td>{{ table9.numCrs162 }}</td>
            <td>{{ table9.typeRefCrs163 }}</td>
            <td>{{ table9.crsInsertDate164 }}</td>
            <td>{{ table9.dateCreaResv165 }}</td>
            <td>{{ table9.datePremier166 }}</td>
            <td>{{ table9.statutPremier167 }}</td>
            <td>{{ table9.dateDernier168 }}</td>
            <td>{{ table9.statutDernier169 }}</td>
            <td>{{ table9.dateDernierPseudo170 }}</td>
            <td>{{ table9.statutDernierPseudo171 }}</td>
            <td>{{ table9.diffDtCreaAnn172 }}</td>
            <td>{{ table9.diffDtArrAnn173 }}</td>
            <td>{{ table9.leadtime174 }}</td>
            <td>{{ table9.los175 }}</td>
            <td>{{ table9.occupantsGroupe176 }}</td>
            <td>{{ table9.nbNuitee177 }}</td>
            <td>{{ table9.nbNuiteeNnDed178 }}</td>
            <td>{{ table9.nbResvAnn179 }}</td>
            <td>{{ table9.nbAdu180 }}</td>
            <td>{{ table9.nbEnf181 }}</td>
            <td>{{ table9.nbPersDayU182 }}</td>
            <td>{{ table9.nbPersArr183 }}</td>
            <td>{{ table9.nbPersDep184 }}</td>
            <td>{{ table9.nbPersAnn185 }}</td>
            <td>{{ table9.nbPersNoshow186 }}</td>
            <td>{{ table9.nbChbDayU187 }}</td>
            <td>{{ table9.nbChbArr188 }}</td>
            <td>{{ table9.nbChbDep189 }}</td>
            <td>{{ table9.nbChbAnn190 }}</td>
            <td>{{ table9.nbChbNoshow191 }}</td>
            <td>{{ table9.revenuNetChambre192 }}</td>
            <td>{{ table9.revenuTaxeChambre193 }}</td>
            <td>{{ table9.revenuNetChambreGlobal194 }}</td>
            <td>{{ table9.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table9.revenuNetBq196 }}</td>
            <td>{{ table9.revenuTaxeBq197 }}</td>
            <td>{{ table9.revenuNetBqGlobal198 }}</td>
            <td>{{ table9.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table9.revenuNetExtra200 }}</td>
            <td>{{ table9.revenuTaxeExtra201 }}</td>
            <td>{{ table9.revenuNetExtraGlobal202 }}</td>
            <td>{{ table9.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table9.revenuNetTotal204 }}</td>
            <td>{{ table9.revenuTaxeTotal205 }}</td>
            <td>{{ table9.revenuNetTotalGlobal206 }}</td>
            <td>{{ table9.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table9.prodRevenuChambre208 }}</td>
            <td>{{ table9.prodRevenuBq209 }}</td>
            <td>{{ table9.prodRevenuExtra210 }}</td>
            <td>{{ table9.prodRevenuTotal211 }}</td>
            <td>{{ table9.prodChambreNbNuitees212 }}</td>
            <td>{{ table9.techCreateDate213 }}</td>
            <td>{{ table9.techUpdateDate214 }}</td>
            <td>{{ table9.numLigne215 }}</td>
            <td>{{ table9.resort216 }}</td>
            <td>{{ table9.resvNameId217 }}</td>
            <td>{{ table9.clientOId218 }}</td>
            <td>{{ table9.typeChb219 }}</td>
            <td>{{ table9.confirmationNo220 }}</td>
            <td>{{ table9.clientMdmId221 }}</td>
            <td>{{ table9.nameId222 }}</td>
            <td>{{ table9.parentResvNameId223 }}</td>
            <td>{{ table9.contactId224 }}</td>
            <td>{{ table9.agenceId225 }}</td>
            <td>{{ table9.agenceNom226 }}</td>
            <td>{{ table9.societeId227 }}</td>
            <td>{{ table9.groupeId228 }}</td>
            <td>{{ table9.numBloc229 }}</td>
            <td>{{ table9.typeResv230 }}</td>
            <td>{{ table9.statutResv231 }}</td>
            <td>{{ table9.dateDebutResv232 }}</td>
            <td>{{ table9.dateFinResv233 }}</td>
            <td>{{ table9.truncDateDebutResv234 }}</td>
            <td>{{ table9.truncDateFinResv235 }}</td>
            <td>{{ table9.dateAnnResv236 }}</td>
            <td>{{ table9.pseudoRoomYn237 }}</td>
            <td>{{ table9.createurResv238 }}</td>
            <td>{{ table9.nomCreateurResv239 }}</td>
            <td>{{ table9.codeGarantie240 }}</td>
            <td>{{ table9.flgDed241 }}</td>
            <td>{{ table9.codePays242 }}</td>
            <td>{{ table9.libPays243 }}</td>
            <td>{{ table9.codeNationalite244 }}</td>
            <td>{{ table9.libNationalite245 }}</td>
            <td>{{ table9.codeSource246 }}</td>
            <td>{{ table9.libSource247 }}</td>
            <td>{{ table9.codeGrandSource248 }}</td>
            <td>{{ table9.codeOrigine249 }}</td>
            <td>{{ table9.libOrigine250 }}</td>
            <td>{{ table9.codeMarche251 }}</td>
            <td>{{ table9.libMarche252 }}</td>
            <td>{{ table9.codeGrandMarche253 }}</td>
            <td>{{ table9.libGrandMarche254 }}</td>
            <td>{{ table9.codePrix255 }}</td>
            <td>{{ table9.categPrix256 }}</td>
            <td>{{ table9.libPrix257 }}</td>
            <td>{{ table9.numChb258 }}</td>
            <td>{{ table9.descriptionTypeChb259 }}</td>
            <td>{{ table9.codeTypeChb260 }}</td>
            <td>{{ table9.classChb261 }}</td>
            <td>{{ table9.caractChb262 }}</td>
            <td>{{ table9.typeChbDeReservation263 }}</td>
            <td>{{ table9.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table9.codeTypeChbDeResv265 }}</td>
            <td>{{ table9.statutDeReservation266 }}</td>
            <td>{{ table9.circuitDistribution267 }}</td>
            <td>{{ table9.circuitDistribUserRegroup268 }}</td>
            <td>{{ table9.numCrs269 }}</td>
            <td>{{ table9.typeRefCrs270 }}</td>
            <td>{{ table9.crsInsertDate271 }}</td>
            <td>{{ table9.dateCreaResv272 }}</td>
            <td>{{ table9.datePremier273 }}</td>
            <td>{{ table9.statutPremier274 }}</td>
            <td>{{ table9.dateDernier275 }}</td>
            <td>{{ table9.statutDernier276 }}</td>
            <td>{{ table9.dateDernierPseudo277 }}</td>
            <td>{{ table9.statutDernierPseudo278 }}</td>
            <td>{{ table9.diffDtCreaAnn279 }}</td>
            <td>{{ table9.diffDtArrAnn280 }}</td>
            <td>{{ table9.leadtime281 }}</td>
            <td>{{ table9.los282 }}</td>
            <td>{{ table9.occupantsGroupe283 }}</td>
            <td>{{ table9.nbNuitee284 }}</td>
            <td>{{ table9.nbNuiteeNnDed285 }}</td>
            <td>{{ table9.nbResvAnn286 }}</td>
            <td>{{ table9.nbAdu287 }}</td>
            <td>{{ table9.nbEnf288 }}</td>
            <td>{{ table9.nbPersDayU289 }}</td>
            <td>{{ table9.nbPersArr290 }}</td>
            <td>{{ table9.nbPersDep291 }}</td>
            <td>{{ table9.nbPersAnn292 }}</td>
            <td>{{ table9.nbPersNoshow293 }}</td>
            <td>{{ table9.nbChbDayU294 }}</td>
            <td>{{ table9.nbChbArr295 }}</td>
            <td>{{ table9.nbChbDep296 }}</td>
            <td>{{ table9.nbChbAnn297 }}</td>
            <td>{{ table9.nbChbNoshow298 }}</td>
            <td>{{ table9.revenuNetChambre299 }}</td>
            <td>{{ table9.revenuTaxeChambre300 }}</td>
            <td>{{ table9.revenuNetChambreGlobal301 }}</td>
            <td>{{ table9.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table9.revenuNetBq303 }}</td>
            <td>{{ table9.revenuTaxeBq304 }}</td>
            <td>{{ table9.revenuNetBqGlobal305 }}</td>
            <td>{{ table9.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table9.revenuNetExtra307 }}</td>
            <td>{{ table9.revenuTaxeExtra308 }}</td>
            <td>{{ table9.revenuNetExtraGlobal309 }}</td>
            <td>{{ table9.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table9View', params: { table9Id: table9.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table9Edit', params: { table9Id: table9.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table9)"
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
          id="big10SampleApplicationApp.table9.delete.question"
          data-cy="table9DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table9-heading" v-text="t$('big10SampleApplicationApp.table9.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table9"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable9()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-9.component.ts"></script>
