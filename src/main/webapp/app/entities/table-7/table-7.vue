<template>
  <div>
    <h2 id="page-heading" data-cy="Table7Heading">
      <span v-text="t$('big10SampleApplicationApp.table7.home.title')" id="table-7-heading"></span>
      <div class="d-flex justify-content-end">
        <button class="btn btn-info mr-2" v-on:click="handleSyncList" :disabled="isFetching">
          <font-awesome-icon icon="sync" :spin="isFetching"></font-awesome-icon>
          <span v-text="t$('big10SampleApplicationApp.table7.home.refreshListLabel')"></span>
        </button>
        <router-link :to="{ name: 'Table7Create' }" custom v-slot="{ navigate }">
          <button
            @click="navigate"
            id="jh-create-entity"
            data-cy="entityCreateButton"
            class="btn btn-primary jh-create-entity create-table-7"
          >
            <font-awesome-icon icon="plus"></font-awesome-icon>
            <span v-text="t$('big10SampleApplicationApp.table7.home.createLabel')"></span>
          </button>
        </router-link>
      </div>
    </h2>
    <br />
    <div class="alert alert-warning" v-if="!isFetching && table7s && table7s.length === 0">
      <span v-text="t$('big10SampleApplicationApp.table7.home.notFound')"></span>
    </div>
    <div class="table-responsive" v-if="table7s && table7s.length > 0">
      <table class="table table-striped" aria-describedby="table7s">
        <thead>
          <tr>
            <th scope="row"><span v-text="t$('global.field.id')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numLigne1')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resort2')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resvNameId3')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientOId4')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChb5')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.confirmationNo6')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientMdmId7')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nameId8')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.parentResvNameId9')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.contactId10')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceId11')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceNom12')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.societeId13')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.groupeId14')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numBloc15')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeResv16')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutResv17')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDebutResv18')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateFinResv19')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv20')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv21')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateAnnResv22')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn23')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.createurResv24')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv25')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGarantie26')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.flgDed27')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePays28')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPays29')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeNationalite30')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libNationalite31')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeSource32')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libSource33')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandSource34')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeOrigine35')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libOrigine36')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeMarche37')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libMarche38')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche39')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libGrandMarche40')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePrix41')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.categPrix42')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPrix43')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numChb44')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb45')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChb46')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.classChb47')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.caractChb48')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation49')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv50')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv51')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDeReservation52')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribution53')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup54')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numCrs55')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeRefCrs56')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.crsInsertDate57')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateCreaResv58')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.datePremier59')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutPremier60')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernier61')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernier62')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo63')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo64')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn65')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn66')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.leadtime67')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.los68')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe69')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuitee70')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed71')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbResvAnn72')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbAdu73')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbEnf74')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDayU75')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersArr76')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDep77')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersAnn78')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow79')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDayU80')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbArr81')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDep82')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbAnn83')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow84')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre85')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre86')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal87')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal88')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBq89')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq90')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal91')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal92')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra93')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra94')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal95')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal96')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetTotal97')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotal98')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetTotalGlobal99')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotalGlobal100')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuChambre101')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuBq102')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuExtra103')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuTotal104')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodChambreNbNuitees105')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.techCreateDate106')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.techUpdateDate107')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numLigne108')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resort109')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resvNameId110')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientOId111')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChb112')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.confirmationNo113')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientMdmId114')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nameId115')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.parentResvNameId116')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.contactId117')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceId118')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceNom119')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.societeId120')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.groupeId121')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numBloc122')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeResv123')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutResv124')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDebutResv125')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateFinResv126')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv127')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv128')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateAnnResv129')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn130')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.createurResv131')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv132')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGarantie133')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.flgDed134')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePays135')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPays136')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeNationalite137')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libNationalite138')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeSource139')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libSource140')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandSource141')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeOrigine142')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libOrigine143')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeMarche144')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libMarche145')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche146')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libGrandMarche147')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePrix148')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.categPrix149')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPrix150')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numChb151')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb152')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChb153')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.classChb154')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.caractChb155')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation156')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv157')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv158')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDeReservation159')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribution160')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup161')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numCrs162')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeRefCrs163')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.crsInsertDate164')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateCreaResv165')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.datePremier166')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutPremier167')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernier168')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernier169')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo170')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo171')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn172')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn173')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.leadtime174')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.los175')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe176')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuitee177')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed178')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbResvAnn179')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbAdu180')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbEnf181')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDayU182')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersArr183')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDep184')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersAnn185')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow186')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDayU187')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbArr188')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDep189')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbAnn190')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow191')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre192')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre193')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal194')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal195')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBq196')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq197')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal198')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal199')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra200')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra201')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal202')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal203')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetTotal204')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotal205')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetTotalGlobal206')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotalGlobal207')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuChambre208')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuBq209')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuExtra210')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodRevenuTotal211')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.prodChambreNbNuitees212')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.techCreateDate213')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.techUpdateDate214')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numLigne215')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resort216')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.resvNameId217')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientOId218')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChb219')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.confirmationNo220')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.clientMdmId221')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nameId222')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.parentResvNameId223')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.contactId224')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceId225')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.agenceNom226')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.societeId227')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.groupeId228')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numBloc229')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeResv230')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutResv231')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDebutResv232')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateFinResv233')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv234')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv235')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateAnnResv236')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn237')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.createurResv238')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv239')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGarantie240')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.flgDed241')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePays242')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPays243')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeNationalite244')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libNationalite245')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeSource246')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libSource247')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandSource248')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeOrigine249')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libOrigine250')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeMarche251')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libMarche252')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche253')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libGrandMarche254')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codePrix255')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.categPrix256')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.libPrix257')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numChb258')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb259')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChb260')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.classChb261')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.caractChb262')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation263')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv264')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv265')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDeReservation266')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribution267')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup268')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.numCrs269')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.typeRefCrs270')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.crsInsertDate271')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateCreaResv272')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.datePremier273')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutPremier274')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernier275')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernier276')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo277')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo278')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn279')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn280')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.leadtime281')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.los282')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe283')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuitee284')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed285')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbResvAnn286')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbAdu287')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbEnf288')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDayU289')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersArr290')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersDep291')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersAnn292')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow293')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDayU294')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbArr295')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbDep296')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbAnn297')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow298')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre299')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre300')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal301')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal302')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBq303')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq304')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal305')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal306')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra307')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra308')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal309')"></span></th>
            <th scope="row"><span v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal310')"></span></th>
            <th scope="row"></th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="table7 in table7s" :key="table7.id" data-cy="entityTable">
            <td>
              <router-link :to="{ name: 'Table7View', params: { table7Id: table7.id } }">{{ table7.id }}</router-link>
            </td>
            <td>{{ table7.numLigne1 }}</td>
            <td>{{ table7.resort2 }}</td>
            <td>{{ table7.resvNameId3 }}</td>
            <td>{{ table7.clientOId4 }}</td>
            <td>{{ table7.typeChb5 }}</td>
            <td>{{ table7.confirmationNo6 }}</td>
            <td>{{ table7.clientMdmId7 }}</td>
            <td>{{ table7.nameId8 }}</td>
            <td>{{ table7.parentResvNameId9 }}</td>
            <td>{{ table7.contactId10 }}</td>
            <td>{{ table7.agenceId11 }}</td>
            <td>{{ table7.agenceNom12 }}</td>
            <td>{{ table7.societeId13 }}</td>
            <td>{{ table7.groupeId14 }}</td>
            <td>{{ table7.numBloc15 }}</td>
            <td>{{ table7.typeResv16 }}</td>
            <td>{{ table7.statutResv17 }}</td>
            <td>{{ table7.dateDebutResv18 }}</td>
            <td>{{ table7.dateFinResv19 }}</td>
            <td>{{ table7.truncDateDebutResv20 }}</td>
            <td>{{ table7.truncDateFinResv21 }}</td>
            <td>{{ table7.dateAnnResv22 }}</td>
            <td>{{ table7.pseudoRoomYn23 }}</td>
            <td>{{ table7.createurResv24 }}</td>
            <td>{{ table7.nomCreateurResv25 }}</td>
            <td>{{ table7.codeGarantie26 }}</td>
            <td>{{ table7.flgDed27 }}</td>
            <td>{{ table7.codePays28 }}</td>
            <td>{{ table7.libPays29 }}</td>
            <td>{{ table7.codeNationalite30 }}</td>
            <td>{{ table7.libNationalite31 }}</td>
            <td>{{ table7.codeSource32 }}</td>
            <td>{{ table7.libSource33 }}</td>
            <td>{{ table7.codeGrandSource34 }}</td>
            <td>{{ table7.codeOrigine35 }}</td>
            <td>{{ table7.libOrigine36 }}</td>
            <td>{{ table7.codeMarche37 }}</td>
            <td>{{ table7.libMarche38 }}</td>
            <td>{{ table7.codeGrandMarche39 }}</td>
            <td>{{ table7.libGrandMarche40 }}</td>
            <td>{{ table7.codePrix41 }}</td>
            <td>{{ table7.categPrix42 }}</td>
            <td>{{ table7.libPrix43 }}</td>
            <td>{{ table7.numChb44 }}</td>
            <td>{{ table7.descriptionTypeChb45 }}</td>
            <td>{{ table7.codeTypeChb46 }}</td>
            <td>{{ table7.classChb47 }}</td>
            <td>{{ table7.caractChb48 }}</td>
            <td>{{ table7.typeChbDeReservation49 }}</td>
            <td>{{ table7.descriptionTypeChbDeResv50 }}</td>
            <td>{{ table7.codeTypeChbDeResv51 }}</td>
            <td>{{ table7.statutDeReservation52 }}</td>
            <td>{{ table7.circuitDistribution53 }}</td>
            <td>{{ table7.circuitDistribUserRegroup54 }}</td>
            <td>{{ table7.numCrs55 }}</td>
            <td>{{ table7.typeRefCrs56 }}</td>
            <td>{{ table7.crsInsertDate57 }}</td>
            <td>{{ table7.dateCreaResv58 }}</td>
            <td>{{ table7.datePremier59 }}</td>
            <td>{{ table7.statutPremier60 }}</td>
            <td>{{ table7.dateDernier61 }}</td>
            <td>{{ table7.statutDernier62 }}</td>
            <td>{{ table7.dateDernierPseudo63 }}</td>
            <td>{{ table7.statutDernierPseudo64 }}</td>
            <td>{{ table7.diffDtCreaAnn65 }}</td>
            <td>{{ table7.diffDtArrAnn66 }}</td>
            <td>{{ table7.leadtime67 }}</td>
            <td>{{ table7.los68 }}</td>
            <td>{{ table7.occupantsGroupe69 }}</td>
            <td>{{ table7.nbNuitee70 }}</td>
            <td>{{ table7.nbNuiteeNnDed71 }}</td>
            <td>{{ table7.nbResvAnn72 }}</td>
            <td>{{ table7.nbAdu73 }}</td>
            <td>{{ table7.nbEnf74 }}</td>
            <td>{{ table7.nbPersDayU75 }}</td>
            <td>{{ table7.nbPersArr76 }}</td>
            <td>{{ table7.nbPersDep77 }}</td>
            <td>{{ table7.nbPersAnn78 }}</td>
            <td>{{ table7.nbPersNoshow79 }}</td>
            <td>{{ table7.nbChbDayU80 }}</td>
            <td>{{ table7.nbChbArr81 }}</td>
            <td>{{ table7.nbChbDep82 }}</td>
            <td>{{ table7.nbChbAnn83 }}</td>
            <td>{{ table7.nbChbNoshow84 }}</td>
            <td>{{ table7.revenuNetChambre85 }}</td>
            <td>{{ table7.revenuTaxeChambre86 }}</td>
            <td>{{ table7.revenuNetChambreGlobal87 }}</td>
            <td>{{ table7.revenuTaxeChambreGlobal88 }}</td>
            <td>{{ table7.revenuNetBq89 }}</td>
            <td>{{ table7.revenuTaxeBq90 }}</td>
            <td>{{ table7.revenuNetBqGlobal91 }}</td>
            <td>{{ table7.revenuTaxeBqGlobal92 }}</td>
            <td>{{ table7.revenuNetExtra93 }}</td>
            <td>{{ table7.revenuTaxeExtra94 }}</td>
            <td>{{ table7.revenuNetExtraGlobal95 }}</td>
            <td>{{ table7.revenuTaxeExtraGlobal96 }}</td>
            <td>{{ table7.revenuNetTotal97 }}</td>
            <td>{{ table7.revenuTaxeTotal98 }}</td>
            <td>{{ table7.revenuNetTotalGlobal99 }}</td>
            <td>{{ table7.revenuTaxeTotalGlobal100 }}</td>
            <td>{{ table7.prodRevenuChambre101 }}</td>
            <td>{{ table7.prodRevenuBq102 }}</td>
            <td>{{ table7.prodRevenuExtra103 }}</td>
            <td>{{ table7.prodRevenuTotal104 }}</td>
            <td>{{ table7.prodChambreNbNuitees105 }}</td>
            <td>{{ table7.techCreateDate106 }}</td>
            <td>{{ table7.techUpdateDate107 }}</td>
            <td>{{ table7.numLigne108 }}</td>
            <td>{{ table7.resort109 }}</td>
            <td>{{ table7.resvNameId110 }}</td>
            <td>{{ table7.clientOId111 }}</td>
            <td>{{ table7.typeChb112 }}</td>
            <td>{{ table7.confirmationNo113 }}</td>
            <td>{{ table7.clientMdmId114 }}</td>
            <td>{{ table7.nameId115 }}</td>
            <td>{{ table7.parentResvNameId116 }}</td>
            <td>{{ table7.contactId117 }}</td>
            <td>{{ table7.agenceId118 }}</td>
            <td>{{ table7.agenceNom119 }}</td>
            <td>{{ table7.societeId120 }}</td>
            <td>{{ table7.groupeId121 }}</td>
            <td>{{ table7.numBloc122 }}</td>
            <td>{{ table7.typeResv123 }}</td>
            <td>{{ table7.statutResv124 }}</td>
            <td>{{ table7.dateDebutResv125 }}</td>
            <td>{{ table7.dateFinResv126 }}</td>
            <td>{{ table7.truncDateDebutResv127 }}</td>
            <td>{{ table7.truncDateFinResv128 }}</td>
            <td>{{ table7.dateAnnResv129 }}</td>
            <td>{{ table7.pseudoRoomYn130 }}</td>
            <td>{{ table7.createurResv131 }}</td>
            <td>{{ table7.nomCreateurResv132 }}</td>
            <td>{{ table7.codeGarantie133 }}</td>
            <td>{{ table7.flgDed134 }}</td>
            <td>{{ table7.codePays135 }}</td>
            <td>{{ table7.libPays136 }}</td>
            <td>{{ table7.codeNationalite137 }}</td>
            <td>{{ table7.libNationalite138 }}</td>
            <td>{{ table7.codeSource139 }}</td>
            <td>{{ table7.libSource140 }}</td>
            <td>{{ table7.codeGrandSource141 }}</td>
            <td>{{ table7.codeOrigine142 }}</td>
            <td>{{ table7.libOrigine143 }}</td>
            <td>{{ table7.codeMarche144 }}</td>
            <td>{{ table7.libMarche145 }}</td>
            <td>{{ table7.codeGrandMarche146 }}</td>
            <td>{{ table7.libGrandMarche147 }}</td>
            <td>{{ table7.codePrix148 }}</td>
            <td>{{ table7.categPrix149 }}</td>
            <td>{{ table7.libPrix150 }}</td>
            <td>{{ table7.numChb151 }}</td>
            <td>{{ table7.descriptionTypeChb152 }}</td>
            <td>{{ table7.codeTypeChb153 }}</td>
            <td>{{ table7.classChb154 }}</td>
            <td>{{ table7.caractChb155 }}</td>
            <td>{{ table7.typeChbDeReservation156 }}</td>
            <td>{{ table7.descriptionTypeChbDeResv157 }}</td>
            <td>{{ table7.codeTypeChbDeResv158 }}</td>
            <td>{{ table7.statutDeReservation159 }}</td>
            <td>{{ table7.circuitDistribution160 }}</td>
            <td>{{ table7.circuitDistribUserRegroup161 }}</td>
            <td>{{ table7.numCrs162 }}</td>
            <td>{{ table7.typeRefCrs163 }}</td>
            <td>{{ table7.crsInsertDate164 }}</td>
            <td>{{ table7.dateCreaResv165 }}</td>
            <td>{{ table7.datePremier166 }}</td>
            <td>{{ table7.statutPremier167 }}</td>
            <td>{{ table7.dateDernier168 }}</td>
            <td>{{ table7.statutDernier169 }}</td>
            <td>{{ table7.dateDernierPseudo170 }}</td>
            <td>{{ table7.statutDernierPseudo171 }}</td>
            <td>{{ table7.diffDtCreaAnn172 }}</td>
            <td>{{ table7.diffDtArrAnn173 }}</td>
            <td>{{ table7.leadtime174 }}</td>
            <td>{{ table7.los175 }}</td>
            <td>{{ table7.occupantsGroupe176 }}</td>
            <td>{{ table7.nbNuitee177 }}</td>
            <td>{{ table7.nbNuiteeNnDed178 }}</td>
            <td>{{ table7.nbResvAnn179 }}</td>
            <td>{{ table7.nbAdu180 }}</td>
            <td>{{ table7.nbEnf181 }}</td>
            <td>{{ table7.nbPersDayU182 }}</td>
            <td>{{ table7.nbPersArr183 }}</td>
            <td>{{ table7.nbPersDep184 }}</td>
            <td>{{ table7.nbPersAnn185 }}</td>
            <td>{{ table7.nbPersNoshow186 }}</td>
            <td>{{ table7.nbChbDayU187 }}</td>
            <td>{{ table7.nbChbArr188 }}</td>
            <td>{{ table7.nbChbDep189 }}</td>
            <td>{{ table7.nbChbAnn190 }}</td>
            <td>{{ table7.nbChbNoshow191 }}</td>
            <td>{{ table7.revenuNetChambre192 }}</td>
            <td>{{ table7.revenuTaxeChambre193 }}</td>
            <td>{{ table7.revenuNetChambreGlobal194 }}</td>
            <td>{{ table7.revenuTaxeChambreGlobal195 }}</td>
            <td>{{ table7.revenuNetBq196 }}</td>
            <td>{{ table7.revenuTaxeBq197 }}</td>
            <td>{{ table7.revenuNetBqGlobal198 }}</td>
            <td>{{ table7.revenuTaxeBqGlobal199 }}</td>
            <td>{{ table7.revenuNetExtra200 }}</td>
            <td>{{ table7.revenuTaxeExtra201 }}</td>
            <td>{{ table7.revenuNetExtraGlobal202 }}</td>
            <td>{{ table7.revenuTaxeExtraGlobal203 }}</td>
            <td>{{ table7.revenuNetTotal204 }}</td>
            <td>{{ table7.revenuTaxeTotal205 }}</td>
            <td>{{ table7.revenuNetTotalGlobal206 }}</td>
            <td>{{ table7.revenuTaxeTotalGlobal207 }}</td>
            <td>{{ table7.prodRevenuChambre208 }}</td>
            <td>{{ table7.prodRevenuBq209 }}</td>
            <td>{{ table7.prodRevenuExtra210 }}</td>
            <td>{{ table7.prodRevenuTotal211 }}</td>
            <td>{{ table7.prodChambreNbNuitees212 }}</td>
            <td>{{ table7.techCreateDate213 }}</td>
            <td>{{ table7.techUpdateDate214 }}</td>
            <td>{{ table7.numLigne215 }}</td>
            <td>{{ table7.resort216 }}</td>
            <td>{{ table7.resvNameId217 }}</td>
            <td>{{ table7.clientOId218 }}</td>
            <td>{{ table7.typeChb219 }}</td>
            <td>{{ table7.confirmationNo220 }}</td>
            <td>{{ table7.clientMdmId221 }}</td>
            <td>{{ table7.nameId222 }}</td>
            <td>{{ table7.parentResvNameId223 }}</td>
            <td>{{ table7.contactId224 }}</td>
            <td>{{ table7.agenceId225 }}</td>
            <td>{{ table7.agenceNom226 }}</td>
            <td>{{ table7.societeId227 }}</td>
            <td>{{ table7.groupeId228 }}</td>
            <td>{{ table7.numBloc229 }}</td>
            <td>{{ table7.typeResv230 }}</td>
            <td>{{ table7.statutResv231 }}</td>
            <td>{{ table7.dateDebutResv232 }}</td>
            <td>{{ table7.dateFinResv233 }}</td>
            <td>{{ table7.truncDateDebutResv234 }}</td>
            <td>{{ table7.truncDateFinResv235 }}</td>
            <td>{{ table7.dateAnnResv236 }}</td>
            <td>{{ table7.pseudoRoomYn237 }}</td>
            <td>{{ table7.createurResv238 }}</td>
            <td>{{ table7.nomCreateurResv239 }}</td>
            <td>{{ table7.codeGarantie240 }}</td>
            <td>{{ table7.flgDed241 }}</td>
            <td>{{ table7.codePays242 }}</td>
            <td>{{ table7.libPays243 }}</td>
            <td>{{ table7.codeNationalite244 }}</td>
            <td>{{ table7.libNationalite245 }}</td>
            <td>{{ table7.codeSource246 }}</td>
            <td>{{ table7.libSource247 }}</td>
            <td>{{ table7.codeGrandSource248 }}</td>
            <td>{{ table7.codeOrigine249 }}</td>
            <td>{{ table7.libOrigine250 }}</td>
            <td>{{ table7.codeMarche251 }}</td>
            <td>{{ table7.libMarche252 }}</td>
            <td>{{ table7.codeGrandMarche253 }}</td>
            <td>{{ table7.libGrandMarche254 }}</td>
            <td>{{ table7.codePrix255 }}</td>
            <td>{{ table7.categPrix256 }}</td>
            <td>{{ table7.libPrix257 }}</td>
            <td>{{ table7.numChb258 }}</td>
            <td>{{ table7.descriptionTypeChb259 }}</td>
            <td>{{ table7.codeTypeChb260 }}</td>
            <td>{{ table7.classChb261 }}</td>
            <td>{{ table7.caractChb262 }}</td>
            <td>{{ table7.typeChbDeReservation263 }}</td>
            <td>{{ table7.descriptionTypeChbDeResv264 }}</td>
            <td>{{ table7.codeTypeChbDeResv265 }}</td>
            <td>{{ table7.statutDeReservation266 }}</td>
            <td>{{ table7.circuitDistribution267 }}</td>
            <td>{{ table7.circuitDistribUserRegroup268 }}</td>
            <td>{{ table7.numCrs269 }}</td>
            <td>{{ table7.typeRefCrs270 }}</td>
            <td>{{ table7.crsInsertDate271 }}</td>
            <td>{{ table7.dateCreaResv272 }}</td>
            <td>{{ table7.datePremier273 }}</td>
            <td>{{ table7.statutPremier274 }}</td>
            <td>{{ table7.dateDernier275 }}</td>
            <td>{{ table7.statutDernier276 }}</td>
            <td>{{ table7.dateDernierPseudo277 }}</td>
            <td>{{ table7.statutDernierPseudo278 }}</td>
            <td>{{ table7.diffDtCreaAnn279 }}</td>
            <td>{{ table7.diffDtArrAnn280 }}</td>
            <td>{{ table7.leadtime281 }}</td>
            <td>{{ table7.los282 }}</td>
            <td>{{ table7.occupantsGroupe283 }}</td>
            <td>{{ table7.nbNuitee284 }}</td>
            <td>{{ table7.nbNuiteeNnDed285 }}</td>
            <td>{{ table7.nbResvAnn286 }}</td>
            <td>{{ table7.nbAdu287 }}</td>
            <td>{{ table7.nbEnf288 }}</td>
            <td>{{ table7.nbPersDayU289 }}</td>
            <td>{{ table7.nbPersArr290 }}</td>
            <td>{{ table7.nbPersDep291 }}</td>
            <td>{{ table7.nbPersAnn292 }}</td>
            <td>{{ table7.nbPersNoshow293 }}</td>
            <td>{{ table7.nbChbDayU294 }}</td>
            <td>{{ table7.nbChbArr295 }}</td>
            <td>{{ table7.nbChbDep296 }}</td>
            <td>{{ table7.nbChbAnn297 }}</td>
            <td>{{ table7.nbChbNoshow298 }}</td>
            <td>{{ table7.revenuNetChambre299 }}</td>
            <td>{{ table7.revenuTaxeChambre300 }}</td>
            <td>{{ table7.revenuNetChambreGlobal301 }}</td>
            <td>{{ table7.revenuTaxeChambreGlobal302 }}</td>
            <td>{{ table7.revenuNetBq303 }}</td>
            <td>{{ table7.revenuTaxeBq304 }}</td>
            <td>{{ table7.revenuNetBqGlobal305 }}</td>
            <td>{{ table7.revenuTaxeBqGlobal306 }}</td>
            <td>{{ table7.revenuNetExtra307 }}</td>
            <td>{{ table7.revenuTaxeExtra308 }}</td>
            <td>{{ table7.revenuNetExtraGlobal309 }}</td>
            <td>{{ table7.revenuTaxeExtraGlobal310 }}</td>
            <td class="text-right">
              <div class="btn-group">
                <router-link :to="{ name: 'Table7View', params: { table7Id: table7.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-info btn-sm details" data-cy="entityDetailsButton">
                    <font-awesome-icon icon="eye"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.view')"></span>
                  </button>
                </router-link>
                <router-link :to="{ name: 'Table7Edit', params: { table7Id: table7.id } }" custom v-slot="{ navigate }">
                  <button @click="navigate" class="btn btn-primary btn-sm edit" data-cy="entityEditButton">
                    <font-awesome-icon icon="pencil-alt"></font-awesome-icon>
                    <span class="d-none d-md-inline" v-text="t$('entity.action.edit')"></span>
                  </button>
                </router-link>
                <b-button
                  v-on:click="prepareRemove(table7)"
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
          id="big10SampleApplicationApp.table7.delete.question"
          data-cy="table7DeleteDialogHeading"
          v-text="t$('entity.delete.title')"
        ></span>
      </template>
      <div class="modal-body">
        <p id="jhi-delete-table7-heading" v-text="t$('big10SampleApplicationApp.table7.delete.question', { id: removeId })"></p>
      </div>
      <template #modal-footer>
        <div>
          <button type="button" class="btn btn-secondary" v-text="t$('entity.action.cancel')" v-on:click="closeDialog()"></button>
          <button
            type="button"
            class="btn btn-primary"
            id="jhi-confirm-delete-table7"
            data-cy="entityConfirmDeleteButton"
            v-text="t$('entity.action.delete')"
            v-on:click="removeTable7()"
          ></button>
        </div>
      </template>
    </b-modal>
  </div>
</template>

<script lang="ts" src="./table-7.component.ts"></script>
