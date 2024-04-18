<template>
  <div class="row justify-content-center">
    <div class="col-8">
      <form name="editForm" role="form" novalidate v-on:submit.prevent="save()">
        <h2
          id="big10SampleApplicationApp.table7.home.createOrEditLabel"
          data-cy="Table7CreateUpdateHeading"
          v-text="t$('big10SampleApplicationApp.table7.home.createOrEditLabel')"
        ></h2>
        <div>
          <div class="form-group" v-if="table7.id">
            <label for="id" v-text="t$('global.field.id')"></label>
            <input type="text" class="form-control" id="id" name="id" v-model="table7.id" readonly />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numLigne1')" for="table-7-numLigne1"></label>
            <input
              type="number"
              class="form-control"
              name="numLigne1"
              id="table-7-numLigne1"
              data-cy="numLigne1"
              :class="{ valid: !v$.numLigne1.$invalid, invalid: v$.numLigne1.$invalid }"
              v-model.number="v$.numLigne1.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.resort2')" for="table-7-resort2"></label>
            <input
              type="text"
              class="form-control"
              name="resort2"
              id="table-7-resort2"
              data-cy="resort2"
              :class="{ valid: !v$.resort2.$invalid, invalid: v$.resort2.$invalid }"
              v-model="v$.resort2.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.resvNameId3')" for="table-7-resvNameId3"></label>
            <input
              type="number"
              class="form-control"
              name="resvNameId3"
              id="table-7-resvNameId3"
              data-cy="resvNameId3"
              :class="{ valid: !v$.resvNameId3.$invalid, invalid: v$.resvNameId3.$invalid }"
              v-model.number="v$.resvNameId3.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.clientOId4')" for="table-7-clientOId4"></label>
            <input
              type="text"
              class="form-control"
              name="clientOId4"
              id="table-7-clientOId4"
              data-cy="clientOId4"
              :class="{ valid: !v$.clientOId4.$invalid, invalid: v$.clientOId4.$invalid }"
              v-model="v$.clientOId4.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeChb5')" for="table-7-typeChb5"></label>
            <input
              type="text"
              class="form-control"
              name="typeChb5"
              id="table-7-typeChb5"
              data-cy="typeChb5"
              :class="{ valid: !v$.typeChb5.$invalid, invalid: v$.typeChb5.$invalid }"
              v-model="v$.typeChb5.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.confirmationNo6')"
              for="table-7-confirmationNo6"
            ></label>
            <input
              type="text"
              class="form-control"
              name="confirmationNo6"
              id="table-7-confirmationNo6"
              data-cy="confirmationNo6"
              :class="{ valid: !v$.confirmationNo6.$invalid, invalid: v$.confirmationNo6.$invalid }"
              v-model="v$.confirmationNo6.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.clientMdmId7')"
              for="table-7-clientMdmId7"
            ></label>
            <input
              type="text"
              class="form-control"
              name="clientMdmId7"
              id="table-7-clientMdmId7"
              data-cy="clientMdmId7"
              :class="{ valid: !v$.clientMdmId7.$invalid, invalid: v$.clientMdmId7.$invalid }"
              v-model="v$.clientMdmId7.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nameId8')" for="table-7-nameId8"></label>
            <input
              type="number"
              class="form-control"
              name="nameId8"
              id="table-7-nameId8"
              data-cy="nameId8"
              :class="{ valid: !v$.nameId8.$invalid, invalid: v$.nameId8.$invalid }"
              v-model.number="v$.nameId8.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.parentResvNameId9')"
              for="table-7-parentResvNameId9"
            ></label>
            <input
              type="number"
              class="form-control"
              name="parentResvNameId9"
              id="table-7-parentResvNameId9"
              data-cy="parentResvNameId9"
              :class="{ valid: !v$.parentResvNameId9.$invalid, invalid: v$.parentResvNameId9.$invalid }"
              v-model.number="v$.parentResvNameId9.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.contactId10')" for="table-7-contactId10"></label>
            <input
              type="number"
              class="form-control"
              name="contactId10"
              id="table-7-contactId10"
              data-cy="contactId10"
              :class="{ valid: !v$.contactId10.$invalid, invalid: v$.contactId10.$invalid }"
              v-model.number="v$.contactId10.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.agenceId11')" for="table-7-agenceId11"></label>
            <input
              type="number"
              class="form-control"
              name="agenceId11"
              id="table-7-agenceId11"
              data-cy="agenceId11"
              :class="{ valid: !v$.agenceId11.$invalid, invalid: v$.agenceId11.$invalid }"
              v-model.number="v$.agenceId11.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.agenceNom12')" for="table-7-agenceNom12"></label>
            <input
              type="text"
              class="form-control"
              name="agenceNom12"
              id="table-7-agenceNom12"
              data-cy="agenceNom12"
              :class="{ valid: !v$.agenceNom12.$invalid, invalid: v$.agenceNom12.$invalid }"
              v-model="v$.agenceNom12.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.societeId13')" for="table-7-societeId13"></label>
            <input
              type="number"
              class="form-control"
              name="societeId13"
              id="table-7-societeId13"
              data-cy="societeId13"
              :class="{ valid: !v$.societeId13.$invalid, invalid: v$.societeId13.$invalid }"
              v-model.number="v$.societeId13.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.groupeId14')" for="table-7-groupeId14"></label>
            <input
              type="number"
              class="form-control"
              name="groupeId14"
              id="table-7-groupeId14"
              data-cy="groupeId14"
              :class="{ valid: !v$.groupeId14.$invalid, invalid: v$.groupeId14.$invalid }"
              v-model.number="v$.groupeId14.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numBloc15')" for="table-7-numBloc15"></label>
            <input
              type="number"
              class="form-control"
              name="numBloc15"
              id="table-7-numBloc15"
              data-cy="numBloc15"
              :class="{ valid: !v$.numBloc15.$invalid, invalid: v$.numBloc15.$invalid }"
              v-model.number="v$.numBloc15.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeResv16')" for="table-7-typeResv16"></label>
            <input
              type="text"
              class="form-control"
              name="typeResv16"
              id="table-7-typeResv16"
              data-cy="typeResv16"
              :class="{ valid: !v$.typeResv16.$invalid, invalid: v$.typeResv16.$invalid }"
              v-model="v$.typeResv16.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutResv17')"
              for="table-7-statutResv17"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutResv17"
              id="table-7-statutResv17"
              data-cy="statutResv17"
              :class="{ valid: !v$.statutResv17.$invalid, invalid: v$.statutResv17.$invalid }"
              v-model="v$.statutResv17.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDebutResv18')"
              for="table-7-dateDebutResv18"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDebutResv18"
                  v-model="v$.dateDebutResv18.$model"
                  name="dateDebutResv18"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDebutResv18"
                data-cy="dateDebutResv18"
                type="text"
                class="form-control"
                name="dateDebutResv18"
                :class="{ valid: !v$.dateDebutResv18.$invalid, invalid: v$.dateDebutResv18.$invalid }"
                v-model="v$.dateDebutResv18.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateFinResv19')"
              for="table-7-dateFinResv19"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateFinResv19"
                  v-model="v$.dateFinResv19.$model"
                  name="dateFinResv19"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateFinResv19"
                data-cy="dateFinResv19"
                type="text"
                class="form-control"
                name="dateFinResv19"
                :class="{ valid: !v$.dateFinResv19.$invalid, invalid: v$.dateFinResv19.$invalid }"
                v-model="v$.dateFinResv19.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv20')"
              for="table-7-truncDateDebutResv20"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateDebutResv20"
                  v-model="v$.truncDateDebutResv20.$model"
                  name="truncDateDebutResv20"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateDebutResv20"
                data-cy="truncDateDebutResv20"
                type="text"
                class="form-control"
                name="truncDateDebutResv20"
                :class="{ valid: !v$.truncDateDebutResv20.$invalid, invalid: v$.truncDateDebutResv20.$invalid }"
                v-model="v$.truncDateDebutResv20.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv21')"
              for="table-7-truncDateFinResv21"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateFinResv21"
                  v-model="v$.truncDateFinResv21.$model"
                  name="truncDateFinResv21"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateFinResv21"
                data-cy="truncDateFinResv21"
                type="text"
                class="form-control"
                name="truncDateFinResv21"
                :class="{ valid: !v$.truncDateFinResv21.$invalid, invalid: v$.truncDateFinResv21.$invalid }"
                v-model="v$.truncDateFinResv21.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateAnnResv22')"
              for="table-7-dateAnnResv22"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateAnnResv22"
                  v-model="v$.dateAnnResv22.$model"
                  name="dateAnnResv22"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateAnnResv22"
                data-cy="dateAnnResv22"
                type="text"
                class="form-control"
                name="dateAnnResv22"
                :class="{ valid: !v$.dateAnnResv22.$invalid, invalid: v$.dateAnnResv22.$invalid }"
                v-model="v$.dateAnnResv22.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn23')"
              for="table-7-pseudoRoomYn23"
            ></label>
            <input
              type="text"
              class="form-control"
              name="pseudoRoomYn23"
              id="table-7-pseudoRoomYn23"
              data-cy="pseudoRoomYn23"
              :class="{ valid: !v$.pseudoRoomYn23.$invalid, invalid: v$.pseudoRoomYn23.$invalid }"
              v-model="v$.pseudoRoomYn23.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.createurResv24')"
              for="table-7-createurResv24"
            ></label>
            <input
              type="number"
              class="form-control"
              name="createurResv24"
              id="table-7-createurResv24"
              data-cy="createurResv24"
              :class="{ valid: !v$.createurResv24.$invalid, invalid: v$.createurResv24.$invalid }"
              v-model.number="v$.createurResv24.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv25')"
              for="table-7-nomCreateurResv25"
            ></label>
            <input
              type="text"
              class="form-control"
              name="nomCreateurResv25"
              id="table-7-nomCreateurResv25"
              data-cy="nomCreateurResv25"
              :class="{ valid: !v$.nomCreateurResv25.$invalid, invalid: v$.nomCreateurResv25.$invalid }"
              v-model="v$.nomCreateurResv25.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGarantie26')"
              for="table-7-codeGarantie26"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGarantie26"
              id="table-7-codeGarantie26"
              data-cy="codeGarantie26"
              :class="{ valid: !v$.codeGarantie26.$invalid, invalid: v$.codeGarantie26.$invalid }"
              v-model="v$.codeGarantie26.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.flgDed27')" for="table-7-flgDed27"></label>
            <input
              type="text"
              class="form-control"
              name="flgDed27"
              id="table-7-flgDed27"
              data-cy="flgDed27"
              :class="{ valid: !v$.flgDed27.$invalid, invalid: v$.flgDed27.$invalid }"
              v-model="v$.flgDed27.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePays28')" for="table-7-codePays28"></label>
            <input
              type="text"
              class="form-control"
              name="codePays28"
              id="table-7-codePays28"
              data-cy="codePays28"
              :class="{ valid: !v$.codePays28.$invalid, invalid: v$.codePays28.$invalid }"
              v-model="v$.codePays28.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPays29')" for="table-7-libPays29"></label>
            <input
              type="text"
              class="form-control"
              name="libPays29"
              id="table-7-libPays29"
              data-cy="libPays29"
              :class="{ valid: !v$.libPays29.$invalid, invalid: v$.libPays29.$invalid }"
              v-model="v$.libPays29.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeNationalite30')"
              for="table-7-codeNationalite30"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeNationalite30"
              id="table-7-codeNationalite30"
              data-cy="codeNationalite30"
              :class="{ valid: !v$.codeNationalite30.$invalid, invalid: v$.codeNationalite30.$invalid }"
              v-model="v$.codeNationalite30.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libNationalite31')"
              for="table-7-libNationalite31"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libNationalite31"
              id="table-7-libNationalite31"
              data-cy="libNationalite31"
              :class="{ valid: !v$.libNationalite31.$invalid, invalid: v$.libNationalite31.$invalid }"
              v-model="v$.libNationalite31.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeSource32')"
              for="table-7-codeSource32"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeSource32"
              id="table-7-codeSource32"
              data-cy="codeSource32"
              :class="{ valid: !v$.codeSource32.$invalid, invalid: v$.codeSource32.$invalid }"
              v-model="v$.codeSource32.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libSource33')" for="table-7-libSource33"></label>
            <input
              type="text"
              class="form-control"
              name="libSource33"
              id="table-7-libSource33"
              data-cy="libSource33"
              :class="{ valid: !v$.libSource33.$invalid, invalid: v$.libSource33.$invalid }"
              v-model="v$.libSource33.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandSource34')"
              for="table-7-codeGrandSource34"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandSource34"
              id="table-7-codeGrandSource34"
              data-cy="codeGrandSource34"
              :class="{ valid: !v$.codeGrandSource34.$invalid, invalid: v$.codeGrandSource34.$invalid }"
              v-model="v$.codeGrandSource34.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeOrigine35')"
              for="table-7-codeOrigine35"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeOrigine35"
              id="table-7-codeOrigine35"
              data-cy="codeOrigine35"
              :class="{ valid: !v$.codeOrigine35.$invalid, invalid: v$.codeOrigine35.$invalid }"
              v-model="v$.codeOrigine35.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libOrigine36')"
              for="table-7-libOrigine36"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libOrigine36"
              id="table-7-libOrigine36"
              data-cy="libOrigine36"
              :class="{ valid: !v$.libOrigine36.$invalid, invalid: v$.libOrigine36.$invalid }"
              v-model="v$.libOrigine36.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeMarche37')"
              for="table-7-codeMarche37"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeMarche37"
              id="table-7-codeMarche37"
              data-cy="codeMarche37"
              :class="{ valid: !v$.codeMarche37.$invalid, invalid: v$.codeMarche37.$invalid }"
              v-model="v$.codeMarche37.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libMarche38')" for="table-7-libMarche38"></label>
            <input
              type="text"
              class="form-control"
              name="libMarche38"
              id="table-7-libMarche38"
              data-cy="libMarche38"
              :class="{ valid: !v$.libMarche38.$invalid, invalid: v$.libMarche38.$invalid }"
              v-model="v$.libMarche38.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche39')"
              for="table-7-codeGrandMarche39"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandMarche39"
              id="table-7-codeGrandMarche39"
              data-cy="codeGrandMarche39"
              :class="{ valid: !v$.codeGrandMarche39.$invalid, invalid: v$.codeGrandMarche39.$invalid }"
              v-model="v$.codeGrandMarche39.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libGrandMarche40')"
              for="table-7-libGrandMarche40"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libGrandMarche40"
              id="table-7-libGrandMarche40"
              data-cy="libGrandMarche40"
              :class="{ valid: !v$.libGrandMarche40.$invalid, invalid: v$.libGrandMarche40.$invalid }"
              v-model="v$.libGrandMarche40.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePrix41')" for="table-7-codePrix41"></label>
            <input
              type="text"
              class="form-control"
              name="codePrix41"
              id="table-7-codePrix41"
              data-cy="codePrix41"
              :class="{ valid: !v$.codePrix41.$invalid, invalid: v$.codePrix41.$invalid }"
              v-model="v$.codePrix41.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.categPrix42')" for="table-7-categPrix42"></label>
            <input
              type="text"
              class="form-control"
              name="categPrix42"
              id="table-7-categPrix42"
              data-cy="categPrix42"
              :class="{ valid: !v$.categPrix42.$invalid, invalid: v$.categPrix42.$invalid }"
              v-model="v$.categPrix42.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPrix43')" for="table-7-libPrix43"></label>
            <input
              type="text"
              class="form-control"
              name="libPrix43"
              id="table-7-libPrix43"
              data-cy="libPrix43"
              :class="{ valid: !v$.libPrix43.$invalid, invalid: v$.libPrix43.$invalid }"
              v-model="v$.libPrix43.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numChb44')" for="table-7-numChb44"></label>
            <input
              type="text"
              class="form-control"
              name="numChb44"
              id="table-7-numChb44"
              data-cy="numChb44"
              :class="{ valid: !v$.numChb44.$invalid, invalid: v$.numChb44.$invalid }"
              v-model="v$.numChb44.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb45')"
              for="table-7-descriptionTypeChb45"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChb45"
              id="table-7-descriptionTypeChb45"
              data-cy="descriptionTypeChb45"
              :class="{ valid: !v$.descriptionTypeChb45.$invalid, invalid: v$.descriptionTypeChb45.$invalid }"
              v-model="v$.descriptionTypeChb45.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChb46')"
              for="table-7-codeTypeChb46"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChb46"
              id="table-7-codeTypeChb46"
              data-cy="codeTypeChb46"
              :class="{ valid: !v$.codeTypeChb46.$invalid, invalid: v$.codeTypeChb46.$invalid }"
              v-model="v$.codeTypeChb46.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.classChb47')" for="table-7-classChb47"></label>
            <input
              type="text"
              class="form-control"
              name="classChb47"
              id="table-7-classChb47"
              data-cy="classChb47"
              :class="{ valid: !v$.classChb47.$invalid, invalid: v$.classChb47.$invalid }"
              v-model="v$.classChb47.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.caractChb48')" for="table-7-caractChb48"></label>
            <input
              type="text"
              class="form-control"
              name="caractChb48"
              id="table-7-caractChb48"
              data-cy="caractChb48"
              :class="{ valid: !v$.caractChb48.$invalid, invalid: v$.caractChb48.$invalid }"
              v-model="v$.caractChb48.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation49')"
              for="table-7-typeChbDeReservation49"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeChbDeReservation49"
              id="table-7-typeChbDeReservation49"
              data-cy="typeChbDeReservation49"
              :class="{ valid: !v$.typeChbDeReservation49.$invalid, invalid: v$.typeChbDeReservation49.$invalid }"
              v-model="v$.typeChbDeReservation49.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv50')"
              for="table-7-descriptionTypeChbDeResv50"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChbDeResv50"
              id="table-7-descriptionTypeChbDeResv50"
              data-cy="descriptionTypeChbDeResv50"
              :class="{ valid: !v$.descriptionTypeChbDeResv50.$invalid, invalid: v$.descriptionTypeChbDeResv50.$invalid }"
              v-model="v$.descriptionTypeChbDeResv50.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv51')"
              for="table-7-codeTypeChbDeResv51"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChbDeResv51"
              id="table-7-codeTypeChbDeResv51"
              data-cy="codeTypeChbDeResv51"
              :class="{ valid: !v$.codeTypeChbDeResv51.$invalid, invalid: v$.codeTypeChbDeResv51.$invalid }"
              v-model="v$.codeTypeChbDeResv51.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDeReservation52')"
              for="table-7-statutDeReservation52"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDeReservation52"
              id="table-7-statutDeReservation52"
              data-cy="statutDeReservation52"
              :class="{ valid: !v$.statutDeReservation52.$invalid, invalid: v$.statutDeReservation52.$invalid }"
              v-model="v$.statutDeReservation52.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribution53')"
              for="table-7-circuitDistribution53"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribution53"
              id="table-7-circuitDistribution53"
              data-cy="circuitDistribution53"
              :class="{ valid: !v$.circuitDistribution53.$invalid, invalid: v$.circuitDistribution53.$invalid }"
              v-model="v$.circuitDistribution53.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup54')"
              for="table-7-circuitDistribUserRegroup54"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribUserRegroup54"
              id="table-7-circuitDistribUserRegroup54"
              data-cy="circuitDistribUserRegroup54"
              :class="{ valid: !v$.circuitDistribUserRegroup54.$invalid, invalid: v$.circuitDistribUserRegroup54.$invalid }"
              v-model="v$.circuitDistribUserRegroup54.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numCrs55')" for="table-7-numCrs55"></label>
            <input
              type="text"
              class="form-control"
              name="numCrs55"
              id="table-7-numCrs55"
              data-cy="numCrs55"
              :class="{ valid: !v$.numCrs55.$invalid, invalid: v$.numCrs55.$invalid }"
              v-model="v$.numCrs55.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeRefCrs56')"
              for="table-7-typeRefCrs56"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeRefCrs56"
              id="table-7-typeRefCrs56"
              data-cy="typeRefCrs56"
              :class="{ valid: !v$.typeRefCrs56.$invalid, invalid: v$.typeRefCrs56.$invalid }"
              v-model="v$.typeRefCrs56.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.crsInsertDate57')"
              for="table-7-crsInsertDate57"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-crsInsertDate57"
                  v-model="v$.crsInsertDate57.$model"
                  name="crsInsertDate57"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-crsInsertDate57"
                data-cy="crsInsertDate57"
                type="text"
                class="form-control"
                name="crsInsertDate57"
                :class="{ valid: !v$.crsInsertDate57.$invalid, invalid: v$.crsInsertDate57.$invalid }"
                v-model="v$.crsInsertDate57.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateCreaResv58')"
              for="table-7-dateCreaResv58"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateCreaResv58"
                  v-model="v$.dateCreaResv58.$model"
                  name="dateCreaResv58"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateCreaResv58"
                data-cy="dateCreaResv58"
                type="text"
                class="form-control"
                name="dateCreaResv58"
                :class="{ valid: !v$.dateCreaResv58.$invalid, invalid: v$.dateCreaResv58.$invalid }"
                v-model="v$.dateCreaResv58.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.datePremier59')"
              for="table-7-datePremier59"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-datePremier59"
                  v-model="v$.datePremier59.$model"
                  name="datePremier59"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-datePremier59"
                data-cy="datePremier59"
                type="text"
                class="form-control"
                name="datePremier59"
                :class="{ valid: !v$.datePremier59.$invalid, invalid: v$.datePremier59.$invalid }"
                v-model="v$.datePremier59.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutPremier60')"
              for="table-7-statutPremier60"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutPremier60"
              id="table-7-statutPremier60"
              data-cy="statutPremier60"
              :class="{ valid: !v$.statutPremier60.$invalid, invalid: v$.statutPremier60.$invalid }"
              v-model="v$.statutPremier60.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernier61')"
              for="table-7-dateDernier61"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernier61"
                  v-model="v$.dateDernier61.$model"
                  name="dateDernier61"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernier61"
                data-cy="dateDernier61"
                type="text"
                class="form-control"
                name="dateDernier61"
                :class="{ valid: !v$.dateDernier61.$invalid, invalid: v$.dateDernier61.$invalid }"
                v-model="v$.dateDernier61.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernier62')"
              for="table-7-statutDernier62"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernier62"
              id="table-7-statutDernier62"
              data-cy="statutDernier62"
              :class="{ valid: !v$.statutDernier62.$invalid, invalid: v$.statutDernier62.$invalid }"
              v-model="v$.statutDernier62.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo63')"
              for="table-7-dateDernierPseudo63"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernierPseudo63"
                  v-model="v$.dateDernierPseudo63.$model"
                  name="dateDernierPseudo63"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernierPseudo63"
                data-cy="dateDernierPseudo63"
                type="text"
                class="form-control"
                name="dateDernierPseudo63"
                :class="{ valid: !v$.dateDernierPseudo63.$invalid, invalid: v$.dateDernierPseudo63.$invalid }"
                v-model="v$.dateDernierPseudo63.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo64')"
              for="table-7-statutDernierPseudo64"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernierPseudo64"
              id="table-7-statutDernierPseudo64"
              data-cy="statutDernierPseudo64"
              :class="{ valid: !v$.statutDernierPseudo64.$invalid, invalid: v$.statutDernierPseudo64.$invalid }"
              v-model="v$.statutDernierPseudo64.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn65')"
              for="table-7-diffDtCreaAnn65"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtCreaAnn65"
              id="table-7-diffDtCreaAnn65"
              data-cy="diffDtCreaAnn65"
              :class="{ valid: !v$.diffDtCreaAnn65.$invalid, invalid: v$.diffDtCreaAnn65.$invalid }"
              v-model.number="v$.diffDtCreaAnn65.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn66')"
              for="table-7-diffDtArrAnn66"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtArrAnn66"
              id="table-7-diffDtArrAnn66"
              data-cy="diffDtArrAnn66"
              :class="{ valid: !v$.diffDtArrAnn66.$invalid, invalid: v$.diffDtArrAnn66.$invalid }"
              v-model.number="v$.diffDtArrAnn66.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.leadtime67')" for="table-7-leadtime67"></label>
            <input
              type="number"
              class="form-control"
              name="leadtime67"
              id="table-7-leadtime67"
              data-cy="leadtime67"
              :class="{ valid: !v$.leadtime67.$invalid, invalid: v$.leadtime67.$invalid }"
              v-model.number="v$.leadtime67.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.los68')" for="table-7-los68"></label>
            <input
              type="number"
              class="form-control"
              name="los68"
              id="table-7-los68"
              data-cy="los68"
              :class="{ valid: !v$.los68.$invalid, invalid: v$.los68.$invalid }"
              v-model.number="v$.los68.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe69')"
              for="table-7-occupantsGroupe69"
            ></label>
            <input
              type="text"
              class="form-control"
              name="occupantsGroupe69"
              id="table-7-occupantsGroupe69"
              data-cy="occupantsGroupe69"
              :class="{ valid: !v$.occupantsGroupe69.$invalid, invalid: v$.occupantsGroupe69.$invalid }"
              v-model="v$.occupantsGroupe69.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbNuitee70')" for="table-7-nbNuitee70"></label>
            <input
              type="number"
              class="form-control"
              name="nbNuitee70"
              id="table-7-nbNuitee70"
              data-cy="nbNuitee70"
              :class="{ valid: !v$.nbNuitee70.$invalid, invalid: v$.nbNuitee70.$invalid }"
              v-model.number="v$.nbNuitee70.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed71')"
              for="table-7-nbNuiteeNnDed71"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbNuiteeNnDed71"
              id="table-7-nbNuiteeNnDed71"
              data-cy="nbNuiteeNnDed71"
              :class="{ valid: !v$.nbNuiteeNnDed71.$invalid, invalid: v$.nbNuiteeNnDed71.$invalid }"
              v-model.number="v$.nbNuiteeNnDed71.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbResvAnn72')" for="table-7-nbResvAnn72"></label>
            <input
              type="number"
              class="form-control"
              name="nbResvAnn72"
              id="table-7-nbResvAnn72"
              data-cy="nbResvAnn72"
              :class="{ valid: !v$.nbResvAnn72.$invalid, invalid: v$.nbResvAnn72.$invalid }"
              v-model.number="v$.nbResvAnn72.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbAdu73')" for="table-7-nbAdu73"></label>
            <input
              type="number"
              class="form-control"
              name="nbAdu73"
              id="table-7-nbAdu73"
              data-cy="nbAdu73"
              :class="{ valid: !v$.nbAdu73.$invalid, invalid: v$.nbAdu73.$invalid }"
              v-model.number="v$.nbAdu73.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbEnf74')" for="table-7-nbEnf74"></label>
            <input
              type="number"
              class="form-control"
              name="nbEnf74"
              id="table-7-nbEnf74"
              data-cy="nbEnf74"
              :class="{ valid: !v$.nbEnf74.$invalid, invalid: v$.nbEnf74.$invalid }"
              v-model.number="v$.nbEnf74.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersDayU75')"
              for="table-7-nbPersDayU75"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDayU75"
              id="table-7-nbPersDayU75"
              data-cy="nbPersDayU75"
              :class="{ valid: !v$.nbPersDayU75.$invalid, invalid: v$.nbPersDayU75.$invalid }"
              v-model.number="v$.nbPersDayU75.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbPersArr76')" for="table-7-nbPersArr76"></label>
            <input
              type="number"
              class="form-control"
              name="nbPersArr76"
              id="table-7-nbPersArr76"
              data-cy="nbPersArr76"
              :class="{ valid: !v$.nbPersArr76.$invalid, invalid: v$.nbPersArr76.$invalid }"
              v-model.number="v$.nbPersArr76.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbPersDep77')" for="table-7-nbPersDep77"></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDep77"
              id="table-7-nbPersDep77"
              data-cy="nbPersDep77"
              :class="{ valid: !v$.nbPersDep77.$invalid, invalid: v$.nbPersDep77.$invalid }"
              v-model.number="v$.nbPersDep77.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbPersAnn78')" for="table-7-nbPersAnn78"></label>
            <input
              type="number"
              class="form-control"
              name="nbPersAnn78"
              id="table-7-nbPersAnn78"
              data-cy="nbPersAnn78"
              :class="{ valid: !v$.nbPersAnn78.$invalid, invalid: v$.nbPersAnn78.$invalid }"
              v-model.number="v$.nbPersAnn78.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow79')"
              for="table-7-nbPersNoshow79"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersNoshow79"
              id="table-7-nbPersNoshow79"
              data-cy="nbPersNoshow79"
              :class="{ valid: !v$.nbPersNoshow79.$invalid, invalid: v$.nbPersNoshow79.$invalid }"
              v-model.number="v$.nbPersNoshow79.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbDayU80')" for="table-7-nbChbDayU80"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDayU80"
              id="table-7-nbChbDayU80"
              data-cy="nbChbDayU80"
              :class="{ valid: !v$.nbChbDayU80.$invalid, invalid: v$.nbChbDayU80.$invalid }"
              v-model.number="v$.nbChbDayU80.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbArr81')" for="table-7-nbChbArr81"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbArr81"
              id="table-7-nbChbArr81"
              data-cy="nbChbArr81"
              :class="{ valid: !v$.nbChbArr81.$invalid, invalid: v$.nbChbArr81.$invalid }"
              v-model.number="v$.nbChbArr81.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbDep82')" for="table-7-nbChbDep82"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDep82"
              id="table-7-nbChbDep82"
              data-cy="nbChbDep82"
              :class="{ valid: !v$.nbChbDep82.$invalid, invalid: v$.nbChbDep82.$invalid }"
              v-model.number="v$.nbChbDep82.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbAnn83')" for="table-7-nbChbAnn83"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbAnn83"
              id="table-7-nbChbAnn83"
              data-cy="nbChbAnn83"
              :class="{ valid: !v$.nbChbAnn83.$invalid, invalid: v$.nbChbAnn83.$invalid }"
              v-model.number="v$.nbChbAnn83.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow84')"
              for="table-7-nbChbNoshow84"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbChbNoshow84"
              id="table-7-nbChbNoshow84"
              data-cy="nbChbNoshow84"
              :class="{ valid: !v$.nbChbNoshow84.$invalid, invalid: v$.nbChbNoshow84.$invalid }"
              v-model.number="v$.nbChbNoshow84.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre85')"
              for="table-7-revenuNetChambre85"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambre85"
              id="table-7-revenuNetChambre85"
              data-cy="revenuNetChambre85"
              :class="{ valid: !v$.revenuNetChambre85.$invalid, invalid: v$.revenuNetChambre85.$invalid }"
              v-model.number="v$.revenuNetChambre85.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre86')"
              for="table-7-revenuTaxeChambre86"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambre86"
              id="table-7-revenuTaxeChambre86"
              data-cy="revenuTaxeChambre86"
              :class="{ valid: !v$.revenuTaxeChambre86.$invalid, invalid: v$.revenuTaxeChambre86.$invalid }"
              v-model.number="v$.revenuTaxeChambre86.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal87')"
              for="table-7-revenuNetChambreGlobal87"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambreGlobal87"
              id="table-7-revenuNetChambreGlobal87"
              data-cy="revenuNetChambreGlobal87"
              :class="{ valid: !v$.revenuNetChambreGlobal87.$invalid, invalid: v$.revenuNetChambreGlobal87.$invalid }"
              v-model.number="v$.revenuNetChambreGlobal87.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal88')"
              for="table-7-revenuTaxeChambreGlobal88"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambreGlobal88"
              id="table-7-revenuTaxeChambreGlobal88"
              data-cy="revenuTaxeChambreGlobal88"
              :class="{ valid: !v$.revenuTaxeChambreGlobal88.$invalid, invalid: v$.revenuTaxeChambreGlobal88.$invalid }"
              v-model.number="v$.revenuTaxeChambreGlobal88.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBq89')"
              for="table-7-revenuNetBq89"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBq89"
              id="table-7-revenuNetBq89"
              data-cy="revenuNetBq89"
              :class="{ valid: !v$.revenuNetBq89.$invalid, invalid: v$.revenuNetBq89.$invalid }"
              v-model.number="v$.revenuNetBq89.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq90')"
              for="table-7-revenuTaxeBq90"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBq90"
              id="table-7-revenuTaxeBq90"
              data-cy="revenuTaxeBq90"
              :class="{ valid: !v$.revenuTaxeBq90.$invalid, invalid: v$.revenuTaxeBq90.$invalid }"
              v-model.number="v$.revenuTaxeBq90.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal91')"
              for="table-7-revenuNetBqGlobal91"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBqGlobal91"
              id="table-7-revenuNetBqGlobal91"
              data-cy="revenuNetBqGlobal91"
              :class="{ valid: !v$.revenuNetBqGlobal91.$invalid, invalid: v$.revenuNetBqGlobal91.$invalid }"
              v-model.number="v$.revenuNetBqGlobal91.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal92')"
              for="table-7-revenuTaxeBqGlobal92"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBqGlobal92"
              id="table-7-revenuTaxeBqGlobal92"
              data-cy="revenuTaxeBqGlobal92"
              :class="{ valid: !v$.revenuTaxeBqGlobal92.$invalid, invalid: v$.revenuTaxeBqGlobal92.$invalid }"
              v-model.number="v$.revenuTaxeBqGlobal92.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra93')"
              for="table-7-revenuNetExtra93"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtra93"
              id="table-7-revenuNetExtra93"
              data-cy="revenuNetExtra93"
              :class="{ valid: !v$.revenuNetExtra93.$invalid, invalid: v$.revenuNetExtra93.$invalid }"
              v-model.number="v$.revenuNetExtra93.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra94')"
              for="table-7-revenuTaxeExtra94"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtra94"
              id="table-7-revenuTaxeExtra94"
              data-cy="revenuTaxeExtra94"
              :class="{ valid: !v$.revenuTaxeExtra94.$invalid, invalid: v$.revenuTaxeExtra94.$invalid }"
              v-model.number="v$.revenuTaxeExtra94.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal95')"
              for="table-7-revenuNetExtraGlobal95"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtraGlobal95"
              id="table-7-revenuNetExtraGlobal95"
              data-cy="revenuNetExtraGlobal95"
              :class="{ valid: !v$.revenuNetExtraGlobal95.$invalid, invalid: v$.revenuNetExtraGlobal95.$invalid }"
              v-model.number="v$.revenuNetExtraGlobal95.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal96')"
              for="table-7-revenuTaxeExtraGlobal96"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtraGlobal96"
              id="table-7-revenuTaxeExtraGlobal96"
              data-cy="revenuTaxeExtraGlobal96"
              :class="{ valid: !v$.revenuTaxeExtraGlobal96.$invalid, invalid: v$.revenuTaxeExtraGlobal96.$invalid }"
              v-model.number="v$.revenuTaxeExtraGlobal96.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetTotal97')"
              for="table-7-revenuNetTotal97"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetTotal97"
              id="table-7-revenuNetTotal97"
              data-cy="revenuNetTotal97"
              :class="{ valid: !v$.revenuNetTotal97.$invalid, invalid: v$.revenuNetTotal97.$invalid }"
              v-model.number="v$.revenuNetTotal97.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotal98')"
              for="table-7-revenuTaxeTotal98"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeTotal98"
              id="table-7-revenuTaxeTotal98"
              data-cy="revenuTaxeTotal98"
              :class="{ valid: !v$.revenuTaxeTotal98.$invalid, invalid: v$.revenuTaxeTotal98.$invalid }"
              v-model.number="v$.revenuTaxeTotal98.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetTotalGlobal99')"
              for="table-7-revenuNetTotalGlobal99"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetTotalGlobal99"
              id="table-7-revenuNetTotalGlobal99"
              data-cy="revenuNetTotalGlobal99"
              :class="{ valid: !v$.revenuNetTotalGlobal99.$invalid, invalid: v$.revenuNetTotalGlobal99.$invalid }"
              v-model.number="v$.revenuNetTotalGlobal99.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotalGlobal100')"
              for="table-7-revenuTaxeTotalGlobal100"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeTotalGlobal100"
              id="table-7-revenuTaxeTotalGlobal100"
              data-cy="revenuTaxeTotalGlobal100"
              :class="{ valid: !v$.revenuTaxeTotalGlobal100.$invalid, invalid: v$.revenuTaxeTotalGlobal100.$invalid }"
              v-model.number="v$.revenuTaxeTotalGlobal100.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuChambre101')"
              for="table-7-prodRevenuChambre101"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuChambre101"
              id="table-7-prodRevenuChambre101"
              data-cy="prodRevenuChambre101"
              :class="{ valid: !v$.prodRevenuChambre101.$invalid, invalid: v$.prodRevenuChambre101.$invalid }"
              v-model.number="v$.prodRevenuChambre101.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuBq102')"
              for="table-7-prodRevenuBq102"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuBq102"
              id="table-7-prodRevenuBq102"
              data-cy="prodRevenuBq102"
              :class="{ valid: !v$.prodRevenuBq102.$invalid, invalid: v$.prodRevenuBq102.$invalid }"
              v-model.number="v$.prodRevenuBq102.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuExtra103')"
              for="table-7-prodRevenuExtra103"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuExtra103"
              id="table-7-prodRevenuExtra103"
              data-cy="prodRevenuExtra103"
              :class="{ valid: !v$.prodRevenuExtra103.$invalid, invalid: v$.prodRevenuExtra103.$invalid }"
              v-model.number="v$.prodRevenuExtra103.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuTotal104')"
              for="table-7-prodRevenuTotal104"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuTotal104"
              id="table-7-prodRevenuTotal104"
              data-cy="prodRevenuTotal104"
              :class="{ valid: !v$.prodRevenuTotal104.$invalid, invalid: v$.prodRevenuTotal104.$invalid }"
              v-model.number="v$.prodRevenuTotal104.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodChambreNbNuitees105')"
              for="table-7-prodChambreNbNuitees105"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodChambreNbNuitees105"
              id="table-7-prodChambreNbNuitees105"
              data-cy="prodChambreNbNuitees105"
              :class="{ valid: !v$.prodChambreNbNuitees105.$invalid, invalid: v$.prodChambreNbNuitees105.$invalid }"
              v-model.number="v$.prodChambreNbNuitees105.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.techCreateDate106')"
              for="table-7-techCreateDate106"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-techCreateDate106"
                  v-model="v$.techCreateDate106.$model"
                  name="techCreateDate106"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-techCreateDate106"
                data-cy="techCreateDate106"
                type="text"
                class="form-control"
                name="techCreateDate106"
                :class="{ valid: !v$.techCreateDate106.$invalid, invalid: v$.techCreateDate106.$invalid }"
                v-model="v$.techCreateDate106.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.techUpdateDate107')"
              for="table-7-techUpdateDate107"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-techUpdateDate107"
                  v-model="v$.techUpdateDate107.$model"
                  name="techUpdateDate107"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-techUpdateDate107"
                data-cy="techUpdateDate107"
                type="text"
                class="form-control"
                name="techUpdateDate107"
                :class="{ valid: !v$.techUpdateDate107.$invalid, invalid: v$.techUpdateDate107.$invalid }"
                v-model="v$.techUpdateDate107.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numLigne108')" for="table-7-numLigne108"></label>
            <input
              type="number"
              class="form-control"
              name="numLigne108"
              id="table-7-numLigne108"
              data-cy="numLigne108"
              :class="{ valid: !v$.numLigne108.$invalid, invalid: v$.numLigne108.$invalid }"
              v-model.number="v$.numLigne108.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.resort109')" for="table-7-resort109"></label>
            <input
              type="text"
              class="form-control"
              name="resort109"
              id="table-7-resort109"
              data-cy="resort109"
              :class="{ valid: !v$.resort109.$invalid, invalid: v$.resort109.$invalid }"
              v-model="v$.resort109.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.resvNameId110')"
              for="table-7-resvNameId110"
            ></label>
            <input
              type="number"
              class="form-control"
              name="resvNameId110"
              id="table-7-resvNameId110"
              data-cy="resvNameId110"
              :class="{ valid: !v$.resvNameId110.$invalid, invalid: v$.resvNameId110.$invalid }"
              v-model.number="v$.resvNameId110.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.clientOId111')"
              for="table-7-clientOId111"
            ></label>
            <input
              type="text"
              class="form-control"
              name="clientOId111"
              id="table-7-clientOId111"
              data-cy="clientOId111"
              :class="{ valid: !v$.clientOId111.$invalid, invalid: v$.clientOId111.$invalid }"
              v-model="v$.clientOId111.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeChb112')" for="table-7-typeChb112"></label>
            <input
              type="text"
              class="form-control"
              name="typeChb112"
              id="table-7-typeChb112"
              data-cy="typeChb112"
              :class="{ valid: !v$.typeChb112.$invalid, invalid: v$.typeChb112.$invalid }"
              v-model="v$.typeChb112.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.confirmationNo113')"
              for="table-7-confirmationNo113"
            ></label>
            <input
              type="text"
              class="form-control"
              name="confirmationNo113"
              id="table-7-confirmationNo113"
              data-cy="confirmationNo113"
              :class="{ valid: !v$.confirmationNo113.$invalid, invalid: v$.confirmationNo113.$invalid }"
              v-model="v$.confirmationNo113.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.clientMdmId114')"
              for="table-7-clientMdmId114"
            ></label>
            <input
              type="text"
              class="form-control"
              name="clientMdmId114"
              id="table-7-clientMdmId114"
              data-cy="clientMdmId114"
              :class="{ valid: !v$.clientMdmId114.$invalid, invalid: v$.clientMdmId114.$invalid }"
              v-model="v$.clientMdmId114.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nameId115')" for="table-7-nameId115"></label>
            <input
              type="number"
              class="form-control"
              name="nameId115"
              id="table-7-nameId115"
              data-cy="nameId115"
              :class="{ valid: !v$.nameId115.$invalid, invalid: v$.nameId115.$invalid }"
              v-model.number="v$.nameId115.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.parentResvNameId116')"
              for="table-7-parentResvNameId116"
            ></label>
            <input
              type="number"
              class="form-control"
              name="parentResvNameId116"
              id="table-7-parentResvNameId116"
              data-cy="parentResvNameId116"
              :class="{ valid: !v$.parentResvNameId116.$invalid, invalid: v$.parentResvNameId116.$invalid }"
              v-model.number="v$.parentResvNameId116.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.contactId117')"
              for="table-7-contactId117"
            ></label>
            <input
              type="number"
              class="form-control"
              name="contactId117"
              id="table-7-contactId117"
              data-cy="contactId117"
              :class="{ valid: !v$.contactId117.$invalid, invalid: v$.contactId117.$invalid }"
              v-model.number="v$.contactId117.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.agenceId118')" for="table-7-agenceId118"></label>
            <input
              type="number"
              class="form-control"
              name="agenceId118"
              id="table-7-agenceId118"
              data-cy="agenceId118"
              :class="{ valid: !v$.agenceId118.$invalid, invalid: v$.agenceId118.$invalid }"
              v-model.number="v$.agenceId118.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.agenceNom119')"
              for="table-7-agenceNom119"
            ></label>
            <input
              type="text"
              class="form-control"
              name="agenceNom119"
              id="table-7-agenceNom119"
              data-cy="agenceNom119"
              :class="{ valid: !v$.agenceNom119.$invalid, invalid: v$.agenceNom119.$invalid }"
              v-model="v$.agenceNom119.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.societeId120')"
              for="table-7-societeId120"
            ></label>
            <input
              type="number"
              class="form-control"
              name="societeId120"
              id="table-7-societeId120"
              data-cy="societeId120"
              :class="{ valid: !v$.societeId120.$invalid, invalid: v$.societeId120.$invalid }"
              v-model.number="v$.societeId120.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.groupeId121')" for="table-7-groupeId121"></label>
            <input
              type="number"
              class="form-control"
              name="groupeId121"
              id="table-7-groupeId121"
              data-cy="groupeId121"
              :class="{ valid: !v$.groupeId121.$invalid, invalid: v$.groupeId121.$invalid }"
              v-model.number="v$.groupeId121.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numBloc122')" for="table-7-numBloc122"></label>
            <input
              type="number"
              class="form-control"
              name="numBloc122"
              id="table-7-numBloc122"
              data-cy="numBloc122"
              :class="{ valid: !v$.numBloc122.$invalid, invalid: v$.numBloc122.$invalid }"
              v-model.number="v$.numBloc122.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeResv123')" for="table-7-typeResv123"></label>
            <input
              type="text"
              class="form-control"
              name="typeResv123"
              id="table-7-typeResv123"
              data-cy="typeResv123"
              :class="{ valid: !v$.typeResv123.$invalid, invalid: v$.typeResv123.$invalid }"
              v-model="v$.typeResv123.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutResv124')"
              for="table-7-statutResv124"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutResv124"
              id="table-7-statutResv124"
              data-cy="statutResv124"
              :class="{ valid: !v$.statutResv124.$invalid, invalid: v$.statutResv124.$invalid }"
              v-model="v$.statutResv124.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDebutResv125')"
              for="table-7-dateDebutResv125"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDebutResv125"
                  v-model="v$.dateDebutResv125.$model"
                  name="dateDebutResv125"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDebutResv125"
                data-cy="dateDebutResv125"
                type="text"
                class="form-control"
                name="dateDebutResv125"
                :class="{ valid: !v$.dateDebutResv125.$invalid, invalid: v$.dateDebutResv125.$invalid }"
                v-model="v$.dateDebutResv125.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateFinResv126')"
              for="table-7-dateFinResv126"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateFinResv126"
                  v-model="v$.dateFinResv126.$model"
                  name="dateFinResv126"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateFinResv126"
                data-cy="dateFinResv126"
                type="text"
                class="form-control"
                name="dateFinResv126"
                :class="{ valid: !v$.dateFinResv126.$invalid, invalid: v$.dateFinResv126.$invalid }"
                v-model="v$.dateFinResv126.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv127')"
              for="table-7-truncDateDebutResv127"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateDebutResv127"
                  v-model="v$.truncDateDebutResv127.$model"
                  name="truncDateDebutResv127"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateDebutResv127"
                data-cy="truncDateDebutResv127"
                type="text"
                class="form-control"
                name="truncDateDebutResv127"
                :class="{ valid: !v$.truncDateDebutResv127.$invalid, invalid: v$.truncDateDebutResv127.$invalid }"
                v-model="v$.truncDateDebutResv127.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv128')"
              for="table-7-truncDateFinResv128"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateFinResv128"
                  v-model="v$.truncDateFinResv128.$model"
                  name="truncDateFinResv128"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateFinResv128"
                data-cy="truncDateFinResv128"
                type="text"
                class="form-control"
                name="truncDateFinResv128"
                :class="{ valid: !v$.truncDateFinResv128.$invalid, invalid: v$.truncDateFinResv128.$invalid }"
                v-model="v$.truncDateFinResv128.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateAnnResv129')"
              for="table-7-dateAnnResv129"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateAnnResv129"
                  v-model="v$.dateAnnResv129.$model"
                  name="dateAnnResv129"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateAnnResv129"
                data-cy="dateAnnResv129"
                type="text"
                class="form-control"
                name="dateAnnResv129"
                :class="{ valid: !v$.dateAnnResv129.$invalid, invalid: v$.dateAnnResv129.$invalid }"
                v-model="v$.dateAnnResv129.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn130')"
              for="table-7-pseudoRoomYn130"
            ></label>
            <input
              type="text"
              class="form-control"
              name="pseudoRoomYn130"
              id="table-7-pseudoRoomYn130"
              data-cy="pseudoRoomYn130"
              :class="{ valid: !v$.pseudoRoomYn130.$invalid, invalid: v$.pseudoRoomYn130.$invalid }"
              v-model="v$.pseudoRoomYn130.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.createurResv131')"
              for="table-7-createurResv131"
            ></label>
            <input
              type="number"
              class="form-control"
              name="createurResv131"
              id="table-7-createurResv131"
              data-cy="createurResv131"
              :class="{ valid: !v$.createurResv131.$invalid, invalid: v$.createurResv131.$invalid }"
              v-model.number="v$.createurResv131.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv132')"
              for="table-7-nomCreateurResv132"
            ></label>
            <input
              type="text"
              class="form-control"
              name="nomCreateurResv132"
              id="table-7-nomCreateurResv132"
              data-cy="nomCreateurResv132"
              :class="{ valid: !v$.nomCreateurResv132.$invalid, invalid: v$.nomCreateurResv132.$invalid }"
              v-model="v$.nomCreateurResv132.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGarantie133')"
              for="table-7-codeGarantie133"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGarantie133"
              id="table-7-codeGarantie133"
              data-cy="codeGarantie133"
              :class="{ valid: !v$.codeGarantie133.$invalid, invalid: v$.codeGarantie133.$invalid }"
              v-model="v$.codeGarantie133.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.flgDed134')" for="table-7-flgDed134"></label>
            <input
              type="text"
              class="form-control"
              name="flgDed134"
              id="table-7-flgDed134"
              data-cy="flgDed134"
              :class="{ valid: !v$.flgDed134.$invalid, invalid: v$.flgDed134.$invalid }"
              v-model="v$.flgDed134.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePays135')" for="table-7-codePays135"></label>
            <input
              type="text"
              class="form-control"
              name="codePays135"
              id="table-7-codePays135"
              data-cy="codePays135"
              :class="{ valid: !v$.codePays135.$invalid, invalid: v$.codePays135.$invalid }"
              v-model="v$.codePays135.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPays136')" for="table-7-libPays136"></label>
            <input
              type="text"
              class="form-control"
              name="libPays136"
              id="table-7-libPays136"
              data-cy="libPays136"
              :class="{ valid: !v$.libPays136.$invalid, invalid: v$.libPays136.$invalid }"
              v-model="v$.libPays136.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeNationalite137')"
              for="table-7-codeNationalite137"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeNationalite137"
              id="table-7-codeNationalite137"
              data-cy="codeNationalite137"
              :class="{ valid: !v$.codeNationalite137.$invalid, invalid: v$.codeNationalite137.$invalid }"
              v-model="v$.codeNationalite137.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libNationalite138')"
              for="table-7-libNationalite138"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libNationalite138"
              id="table-7-libNationalite138"
              data-cy="libNationalite138"
              :class="{ valid: !v$.libNationalite138.$invalid, invalid: v$.libNationalite138.$invalid }"
              v-model="v$.libNationalite138.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeSource139')"
              for="table-7-codeSource139"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeSource139"
              id="table-7-codeSource139"
              data-cy="codeSource139"
              :class="{ valid: !v$.codeSource139.$invalid, invalid: v$.codeSource139.$invalid }"
              v-model="v$.codeSource139.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libSource140')"
              for="table-7-libSource140"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libSource140"
              id="table-7-libSource140"
              data-cy="libSource140"
              :class="{ valid: !v$.libSource140.$invalid, invalid: v$.libSource140.$invalid }"
              v-model="v$.libSource140.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandSource141')"
              for="table-7-codeGrandSource141"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandSource141"
              id="table-7-codeGrandSource141"
              data-cy="codeGrandSource141"
              :class="{ valid: !v$.codeGrandSource141.$invalid, invalid: v$.codeGrandSource141.$invalid }"
              v-model="v$.codeGrandSource141.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeOrigine142')"
              for="table-7-codeOrigine142"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeOrigine142"
              id="table-7-codeOrigine142"
              data-cy="codeOrigine142"
              :class="{ valid: !v$.codeOrigine142.$invalid, invalid: v$.codeOrigine142.$invalid }"
              v-model="v$.codeOrigine142.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libOrigine143')"
              for="table-7-libOrigine143"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libOrigine143"
              id="table-7-libOrigine143"
              data-cy="libOrigine143"
              :class="{ valid: !v$.libOrigine143.$invalid, invalid: v$.libOrigine143.$invalid }"
              v-model="v$.libOrigine143.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeMarche144')"
              for="table-7-codeMarche144"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeMarche144"
              id="table-7-codeMarche144"
              data-cy="codeMarche144"
              :class="{ valid: !v$.codeMarche144.$invalid, invalid: v$.codeMarche144.$invalid }"
              v-model="v$.codeMarche144.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libMarche145')"
              for="table-7-libMarche145"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libMarche145"
              id="table-7-libMarche145"
              data-cy="libMarche145"
              :class="{ valid: !v$.libMarche145.$invalid, invalid: v$.libMarche145.$invalid }"
              v-model="v$.libMarche145.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche146')"
              for="table-7-codeGrandMarche146"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandMarche146"
              id="table-7-codeGrandMarche146"
              data-cy="codeGrandMarche146"
              :class="{ valid: !v$.codeGrandMarche146.$invalid, invalid: v$.codeGrandMarche146.$invalid }"
              v-model="v$.codeGrandMarche146.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libGrandMarche147')"
              for="table-7-libGrandMarche147"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libGrandMarche147"
              id="table-7-libGrandMarche147"
              data-cy="libGrandMarche147"
              :class="{ valid: !v$.libGrandMarche147.$invalid, invalid: v$.libGrandMarche147.$invalid }"
              v-model="v$.libGrandMarche147.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePrix148')" for="table-7-codePrix148"></label>
            <input
              type="text"
              class="form-control"
              name="codePrix148"
              id="table-7-codePrix148"
              data-cy="codePrix148"
              :class="{ valid: !v$.codePrix148.$invalid, invalid: v$.codePrix148.$invalid }"
              v-model="v$.codePrix148.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.categPrix149')"
              for="table-7-categPrix149"
            ></label>
            <input
              type="text"
              class="form-control"
              name="categPrix149"
              id="table-7-categPrix149"
              data-cy="categPrix149"
              :class="{ valid: !v$.categPrix149.$invalid, invalid: v$.categPrix149.$invalid }"
              v-model="v$.categPrix149.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPrix150')" for="table-7-libPrix150"></label>
            <input
              type="text"
              class="form-control"
              name="libPrix150"
              id="table-7-libPrix150"
              data-cy="libPrix150"
              :class="{ valid: !v$.libPrix150.$invalid, invalid: v$.libPrix150.$invalid }"
              v-model="v$.libPrix150.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numChb151')" for="table-7-numChb151"></label>
            <input
              type="text"
              class="form-control"
              name="numChb151"
              id="table-7-numChb151"
              data-cy="numChb151"
              :class="{ valid: !v$.numChb151.$invalid, invalid: v$.numChb151.$invalid }"
              v-model="v$.numChb151.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb152')"
              for="table-7-descriptionTypeChb152"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChb152"
              id="table-7-descriptionTypeChb152"
              data-cy="descriptionTypeChb152"
              :class="{ valid: !v$.descriptionTypeChb152.$invalid, invalid: v$.descriptionTypeChb152.$invalid }"
              v-model="v$.descriptionTypeChb152.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChb153')"
              for="table-7-codeTypeChb153"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChb153"
              id="table-7-codeTypeChb153"
              data-cy="codeTypeChb153"
              :class="{ valid: !v$.codeTypeChb153.$invalid, invalid: v$.codeTypeChb153.$invalid }"
              v-model="v$.codeTypeChb153.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.classChb154')" for="table-7-classChb154"></label>
            <input
              type="text"
              class="form-control"
              name="classChb154"
              id="table-7-classChb154"
              data-cy="classChb154"
              :class="{ valid: !v$.classChb154.$invalid, invalid: v$.classChb154.$invalid }"
              v-model="v$.classChb154.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.caractChb155')"
              for="table-7-caractChb155"
            ></label>
            <input
              type="text"
              class="form-control"
              name="caractChb155"
              id="table-7-caractChb155"
              data-cy="caractChb155"
              :class="{ valid: !v$.caractChb155.$invalid, invalid: v$.caractChb155.$invalid }"
              v-model="v$.caractChb155.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation156')"
              for="table-7-typeChbDeReservation156"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeChbDeReservation156"
              id="table-7-typeChbDeReservation156"
              data-cy="typeChbDeReservation156"
              :class="{ valid: !v$.typeChbDeReservation156.$invalid, invalid: v$.typeChbDeReservation156.$invalid }"
              v-model="v$.typeChbDeReservation156.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv157')"
              for="table-7-descriptionTypeChbDeResv157"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChbDeResv157"
              id="table-7-descriptionTypeChbDeResv157"
              data-cy="descriptionTypeChbDeResv157"
              :class="{ valid: !v$.descriptionTypeChbDeResv157.$invalid, invalid: v$.descriptionTypeChbDeResv157.$invalid }"
              v-model="v$.descriptionTypeChbDeResv157.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv158')"
              for="table-7-codeTypeChbDeResv158"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChbDeResv158"
              id="table-7-codeTypeChbDeResv158"
              data-cy="codeTypeChbDeResv158"
              :class="{ valid: !v$.codeTypeChbDeResv158.$invalid, invalid: v$.codeTypeChbDeResv158.$invalid }"
              v-model="v$.codeTypeChbDeResv158.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDeReservation159')"
              for="table-7-statutDeReservation159"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDeReservation159"
              id="table-7-statutDeReservation159"
              data-cy="statutDeReservation159"
              :class="{ valid: !v$.statutDeReservation159.$invalid, invalid: v$.statutDeReservation159.$invalid }"
              v-model="v$.statutDeReservation159.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribution160')"
              for="table-7-circuitDistribution160"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribution160"
              id="table-7-circuitDistribution160"
              data-cy="circuitDistribution160"
              :class="{ valid: !v$.circuitDistribution160.$invalid, invalid: v$.circuitDistribution160.$invalid }"
              v-model="v$.circuitDistribution160.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup161')"
              for="table-7-circuitDistribUserRegroup161"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribUserRegroup161"
              id="table-7-circuitDistribUserRegroup161"
              data-cy="circuitDistribUserRegroup161"
              :class="{ valid: !v$.circuitDistribUserRegroup161.$invalid, invalid: v$.circuitDistribUserRegroup161.$invalid }"
              v-model="v$.circuitDistribUserRegroup161.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numCrs162')" for="table-7-numCrs162"></label>
            <input
              type="text"
              class="form-control"
              name="numCrs162"
              id="table-7-numCrs162"
              data-cy="numCrs162"
              :class="{ valid: !v$.numCrs162.$invalid, invalid: v$.numCrs162.$invalid }"
              v-model="v$.numCrs162.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeRefCrs163')"
              for="table-7-typeRefCrs163"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeRefCrs163"
              id="table-7-typeRefCrs163"
              data-cy="typeRefCrs163"
              :class="{ valid: !v$.typeRefCrs163.$invalid, invalid: v$.typeRefCrs163.$invalid }"
              v-model="v$.typeRefCrs163.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.crsInsertDate164')"
              for="table-7-crsInsertDate164"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-crsInsertDate164"
                  v-model="v$.crsInsertDate164.$model"
                  name="crsInsertDate164"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-crsInsertDate164"
                data-cy="crsInsertDate164"
                type="text"
                class="form-control"
                name="crsInsertDate164"
                :class="{ valid: !v$.crsInsertDate164.$invalid, invalid: v$.crsInsertDate164.$invalid }"
                v-model="v$.crsInsertDate164.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateCreaResv165')"
              for="table-7-dateCreaResv165"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateCreaResv165"
                  v-model="v$.dateCreaResv165.$model"
                  name="dateCreaResv165"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateCreaResv165"
                data-cy="dateCreaResv165"
                type="text"
                class="form-control"
                name="dateCreaResv165"
                :class="{ valid: !v$.dateCreaResv165.$invalid, invalid: v$.dateCreaResv165.$invalid }"
                v-model="v$.dateCreaResv165.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.datePremier166')"
              for="table-7-datePremier166"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-datePremier166"
                  v-model="v$.datePremier166.$model"
                  name="datePremier166"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-datePremier166"
                data-cy="datePremier166"
                type="text"
                class="form-control"
                name="datePremier166"
                :class="{ valid: !v$.datePremier166.$invalid, invalid: v$.datePremier166.$invalid }"
                v-model="v$.datePremier166.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutPremier167')"
              for="table-7-statutPremier167"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutPremier167"
              id="table-7-statutPremier167"
              data-cy="statutPremier167"
              :class="{ valid: !v$.statutPremier167.$invalid, invalid: v$.statutPremier167.$invalid }"
              v-model="v$.statutPremier167.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernier168')"
              for="table-7-dateDernier168"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernier168"
                  v-model="v$.dateDernier168.$model"
                  name="dateDernier168"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernier168"
                data-cy="dateDernier168"
                type="text"
                class="form-control"
                name="dateDernier168"
                :class="{ valid: !v$.dateDernier168.$invalid, invalid: v$.dateDernier168.$invalid }"
                v-model="v$.dateDernier168.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernier169')"
              for="table-7-statutDernier169"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernier169"
              id="table-7-statutDernier169"
              data-cy="statutDernier169"
              :class="{ valid: !v$.statutDernier169.$invalid, invalid: v$.statutDernier169.$invalid }"
              v-model="v$.statutDernier169.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo170')"
              for="table-7-dateDernierPseudo170"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernierPseudo170"
                  v-model="v$.dateDernierPseudo170.$model"
                  name="dateDernierPseudo170"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernierPseudo170"
                data-cy="dateDernierPseudo170"
                type="text"
                class="form-control"
                name="dateDernierPseudo170"
                :class="{ valid: !v$.dateDernierPseudo170.$invalid, invalid: v$.dateDernierPseudo170.$invalid }"
                v-model="v$.dateDernierPseudo170.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo171')"
              for="table-7-statutDernierPseudo171"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernierPseudo171"
              id="table-7-statutDernierPseudo171"
              data-cy="statutDernierPseudo171"
              :class="{ valid: !v$.statutDernierPseudo171.$invalid, invalid: v$.statutDernierPseudo171.$invalid }"
              v-model="v$.statutDernierPseudo171.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn172')"
              for="table-7-diffDtCreaAnn172"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtCreaAnn172"
              id="table-7-diffDtCreaAnn172"
              data-cy="diffDtCreaAnn172"
              :class="{ valid: !v$.diffDtCreaAnn172.$invalid, invalid: v$.diffDtCreaAnn172.$invalid }"
              v-model.number="v$.diffDtCreaAnn172.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn173')"
              for="table-7-diffDtArrAnn173"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtArrAnn173"
              id="table-7-diffDtArrAnn173"
              data-cy="diffDtArrAnn173"
              :class="{ valid: !v$.diffDtArrAnn173.$invalid, invalid: v$.diffDtArrAnn173.$invalid }"
              v-model.number="v$.diffDtArrAnn173.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.leadtime174')" for="table-7-leadtime174"></label>
            <input
              type="number"
              class="form-control"
              name="leadtime174"
              id="table-7-leadtime174"
              data-cy="leadtime174"
              :class="{ valid: !v$.leadtime174.$invalid, invalid: v$.leadtime174.$invalid }"
              v-model.number="v$.leadtime174.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.los175')" for="table-7-los175"></label>
            <input
              type="number"
              class="form-control"
              name="los175"
              id="table-7-los175"
              data-cy="los175"
              :class="{ valid: !v$.los175.$invalid, invalid: v$.los175.$invalid }"
              v-model.number="v$.los175.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe176')"
              for="table-7-occupantsGroupe176"
            ></label>
            <input
              type="text"
              class="form-control"
              name="occupantsGroupe176"
              id="table-7-occupantsGroupe176"
              data-cy="occupantsGroupe176"
              :class="{ valid: !v$.occupantsGroupe176.$invalid, invalid: v$.occupantsGroupe176.$invalid }"
              v-model="v$.occupantsGroupe176.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbNuitee177')" for="table-7-nbNuitee177"></label>
            <input
              type="number"
              class="form-control"
              name="nbNuitee177"
              id="table-7-nbNuitee177"
              data-cy="nbNuitee177"
              :class="{ valid: !v$.nbNuitee177.$invalid, invalid: v$.nbNuitee177.$invalid }"
              v-model.number="v$.nbNuitee177.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed178')"
              for="table-7-nbNuiteeNnDed178"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbNuiteeNnDed178"
              id="table-7-nbNuiteeNnDed178"
              data-cy="nbNuiteeNnDed178"
              :class="{ valid: !v$.nbNuiteeNnDed178.$invalid, invalid: v$.nbNuiteeNnDed178.$invalid }"
              v-model.number="v$.nbNuiteeNnDed178.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbResvAnn179')"
              for="table-7-nbResvAnn179"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbResvAnn179"
              id="table-7-nbResvAnn179"
              data-cy="nbResvAnn179"
              :class="{ valid: !v$.nbResvAnn179.$invalid, invalid: v$.nbResvAnn179.$invalid }"
              v-model.number="v$.nbResvAnn179.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbAdu180')" for="table-7-nbAdu180"></label>
            <input
              type="number"
              class="form-control"
              name="nbAdu180"
              id="table-7-nbAdu180"
              data-cy="nbAdu180"
              :class="{ valid: !v$.nbAdu180.$invalid, invalid: v$.nbAdu180.$invalid }"
              v-model.number="v$.nbAdu180.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbEnf181')" for="table-7-nbEnf181"></label>
            <input
              type="number"
              class="form-control"
              name="nbEnf181"
              id="table-7-nbEnf181"
              data-cy="nbEnf181"
              :class="{ valid: !v$.nbEnf181.$invalid, invalid: v$.nbEnf181.$invalid }"
              v-model.number="v$.nbEnf181.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersDayU182')"
              for="table-7-nbPersDayU182"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDayU182"
              id="table-7-nbPersDayU182"
              data-cy="nbPersDayU182"
              :class="{ valid: !v$.nbPersDayU182.$invalid, invalid: v$.nbPersDayU182.$invalid }"
              v-model.number="v$.nbPersDayU182.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersArr183')"
              for="table-7-nbPersArr183"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersArr183"
              id="table-7-nbPersArr183"
              data-cy="nbPersArr183"
              :class="{ valid: !v$.nbPersArr183.$invalid, invalid: v$.nbPersArr183.$invalid }"
              v-model.number="v$.nbPersArr183.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersDep184')"
              for="table-7-nbPersDep184"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDep184"
              id="table-7-nbPersDep184"
              data-cy="nbPersDep184"
              :class="{ valid: !v$.nbPersDep184.$invalid, invalid: v$.nbPersDep184.$invalid }"
              v-model.number="v$.nbPersDep184.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersAnn185')"
              for="table-7-nbPersAnn185"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersAnn185"
              id="table-7-nbPersAnn185"
              data-cy="nbPersAnn185"
              :class="{ valid: !v$.nbPersAnn185.$invalid, invalid: v$.nbPersAnn185.$invalid }"
              v-model.number="v$.nbPersAnn185.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow186')"
              for="table-7-nbPersNoshow186"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersNoshow186"
              id="table-7-nbPersNoshow186"
              data-cy="nbPersNoshow186"
              :class="{ valid: !v$.nbPersNoshow186.$invalid, invalid: v$.nbPersNoshow186.$invalid }"
              v-model.number="v$.nbPersNoshow186.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbChbDayU187')"
              for="table-7-nbChbDayU187"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDayU187"
              id="table-7-nbChbDayU187"
              data-cy="nbChbDayU187"
              :class="{ valid: !v$.nbChbDayU187.$invalid, invalid: v$.nbChbDayU187.$invalid }"
              v-model.number="v$.nbChbDayU187.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbArr188')" for="table-7-nbChbArr188"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbArr188"
              id="table-7-nbChbArr188"
              data-cy="nbChbArr188"
              :class="{ valid: !v$.nbChbArr188.$invalid, invalid: v$.nbChbArr188.$invalid }"
              v-model.number="v$.nbChbArr188.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbDep189')" for="table-7-nbChbDep189"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDep189"
              id="table-7-nbChbDep189"
              data-cy="nbChbDep189"
              :class="{ valid: !v$.nbChbDep189.$invalid, invalid: v$.nbChbDep189.$invalid }"
              v-model.number="v$.nbChbDep189.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbAnn190')" for="table-7-nbChbAnn190"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbAnn190"
              id="table-7-nbChbAnn190"
              data-cy="nbChbAnn190"
              :class="{ valid: !v$.nbChbAnn190.$invalid, invalid: v$.nbChbAnn190.$invalid }"
              v-model.number="v$.nbChbAnn190.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow191')"
              for="table-7-nbChbNoshow191"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbChbNoshow191"
              id="table-7-nbChbNoshow191"
              data-cy="nbChbNoshow191"
              :class="{ valid: !v$.nbChbNoshow191.$invalid, invalid: v$.nbChbNoshow191.$invalid }"
              v-model.number="v$.nbChbNoshow191.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre192')"
              for="table-7-revenuNetChambre192"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambre192"
              id="table-7-revenuNetChambre192"
              data-cy="revenuNetChambre192"
              :class="{ valid: !v$.revenuNetChambre192.$invalid, invalid: v$.revenuNetChambre192.$invalid }"
              v-model.number="v$.revenuNetChambre192.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre193')"
              for="table-7-revenuTaxeChambre193"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambre193"
              id="table-7-revenuTaxeChambre193"
              data-cy="revenuTaxeChambre193"
              :class="{ valid: !v$.revenuTaxeChambre193.$invalid, invalid: v$.revenuTaxeChambre193.$invalid }"
              v-model.number="v$.revenuTaxeChambre193.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal194')"
              for="table-7-revenuNetChambreGlobal194"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambreGlobal194"
              id="table-7-revenuNetChambreGlobal194"
              data-cy="revenuNetChambreGlobal194"
              :class="{ valid: !v$.revenuNetChambreGlobal194.$invalid, invalid: v$.revenuNetChambreGlobal194.$invalid }"
              v-model.number="v$.revenuNetChambreGlobal194.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal195')"
              for="table-7-revenuTaxeChambreGlobal195"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambreGlobal195"
              id="table-7-revenuTaxeChambreGlobal195"
              data-cy="revenuTaxeChambreGlobal195"
              :class="{ valid: !v$.revenuTaxeChambreGlobal195.$invalid, invalid: v$.revenuTaxeChambreGlobal195.$invalid }"
              v-model.number="v$.revenuTaxeChambreGlobal195.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBq196')"
              for="table-7-revenuNetBq196"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBq196"
              id="table-7-revenuNetBq196"
              data-cy="revenuNetBq196"
              :class="{ valid: !v$.revenuNetBq196.$invalid, invalid: v$.revenuNetBq196.$invalid }"
              v-model.number="v$.revenuNetBq196.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq197')"
              for="table-7-revenuTaxeBq197"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBq197"
              id="table-7-revenuTaxeBq197"
              data-cy="revenuTaxeBq197"
              :class="{ valid: !v$.revenuTaxeBq197.$invalid, invalid: v$.revenuTaxeBq197.$invalid }"
              v-model.number="v$.revenuTaxeBq197.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal198')"
              for="table-7-revenuNetBqGlobal198"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBqGlobal198"
              id="table-7-revenuNetBqGlobal198"
              data-cy="revenuNetBqGlobal198"
              :class="{ valid: !v$.revenuNetBqGlobal198.$invalid, invalid: v$.revenuNetBqGlobal198.$invalid }"
              v-model.number="v$.revenuNetBqGlobal198.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal199')"
              for="table-7-revenuTaxeBqGlobal199"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBqGlobal199"
              id="table-7-revenuTaxeBqGlobal199"
              data-cy="revenuTaxeBqGlobal199"
              :class="{ valid: !v$.revenuTaxeBqGlobal199.$invalid, invalid: v$.revenuTaxeBqGlobal199.$invalid }"
              v-model.number="v$.revenuTaxeBqGlobal199.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra200')"
              for="table-7-revenuNetExtra200"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtra200"
              id="table-7-revenuNetExtra200"
              data-cy="revenuNetExtra200"
              :class="{ valid: !v$.revenuNetExtra200.$invalid, invalid: v$.revenuNetExtra200.$invalid }"
              v-model.number="v$.revenuNetExtra200.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra201')"
              for="table-7-revenuTaxeExtra201"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtra201"
              id="table-7-revenuTaxeExtra201"
              data-cy="revenuTaxeExtra201"
              :class="{ valid: !v$.revenuTaxeExtra201.$invalid, invalid: v$.revenuTaxeExtra201.$invalid }"
              v-model.number="v$.revenuTaxeExtra201.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal202')"
              for="table-7-revenuNetExtraGlobal202"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtraGlobal202"
              id="table-7-revenuNetExtraGlobal202"
              data-cy="revenuNetExtraGlobal202"
              :class="{ valid: !v$.revenuNetExtraGlobal202.$invalid, invalid: v$.revenuNetExtraGlobal202.$invalid }"
              v-model.number="v$.revenuNetExtraGlobal202.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal203')"
              for="table-7-revenuTaxeExtraGlobal203"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtraGlobal203"
              id="table-7-revenuTaxeExtraGlobal203"
              data-cy="revenuTaxeExtraGlobal203"
              :class="{ valid: !v$.revenuTaxeExtraGlobal203.$invalid, invalid: v$.revenuTaxeExtraGlobal203.$invalid }"
              v-model.number="v$.revenuTaxeExtraGlobal203.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetTotal204')"
              for="table-7-revenuNetTotal204"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetTotal204"
              id="table-7-revenuNetTotal204"
              data-cy="revenuNetTotal204"
              :class="{ valid: !v$.revenuNetTotal204.$invalid, invalid: v$.revenuNetTotal204.$invalid }"
              v-model.number="v$.revenuNetTotal204.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotal205')"
              for="table-7-revenuTaxeTotal205"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeTotal205"
              id="table-7-revenuTaxeTotal205"
              data-cy="revenuTaxeTotal205"
              :class="{ valid: !v$.revenuTaxeTotal205.$invalid, invalid: v$.revenuTaxeTotal205.$invalid }"
              v-model.number="v$.revenuTaxeTotal205.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetTotalGlobal206')"
              for="table-7-revenuNetTotalGlobal206"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetTotalGlobal206"
              id="table-7-revenuNetTotalGlobal206"
              data-cy="revenuNetTotalGlobal206"
              :class="{ valid: !v$.revenuNetTotalGlobal206.$invalid, invalid: v$.revenuNetTotalGlobal206.$invalid }"
              v-model.number="v$.revenuNetTotalGlobal206.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeTotalGlobal207')"
              for="table-7-revenuTaxeTotalGlobal207"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeTotalGlobal207"
              id="table-7-revenuTaxeTotalGlobal207"
              data-cy="revenuTaxeTotalGlobal207"
              :class="{ valid: !v$.revenuTaxeTotalGlobal207.$invalid, invalid: v$.revenuTaxeTotalGlobal207.$invalid }"
              v-model.number="v$.revenuTaxeTotalGlobal207.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuChambre208')"
              for="table-7-prodRevenuChambre208"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuChambre208"
              id="table-7-prodRevenuChambre208"
              data-cy="prodRevenuChambre208"
              :class="{ valid: !v$.prodRevenuChambre208.$invalid, invalid: v$.prodRevenuChambre208.$invalid }"
              v-model.number="v$.prodRevenuChambre208.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuBq209')"
              for="table-7-prodRevenuBq209"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuBq209"
              id="table-7-prodRevenuBq209"
              data-cy="prodRevenuBq209"
              :class="{ valid: !v$.prodRevenuBq209.$invalid, invalid: v$.prodRevenuBq209.$invalid }"
              v-model.number="v$.prodRevenuBq209.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuExtra210')"
              for="table-7-prodRevenuExtra210"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuExtra210"
              id="table-7-prodRevenuExtra210"
              data-cy="prodRevenuExtra210"
              :class="{ valid: !v$.prodRevenuExtra210.$invalid, invalid: v$.prodRevenuExtra210.$invalid }"
              v-model.number="v$.prodRevenuExtra210.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodRevenuTotal211')"
              for="table-7-prodRevenuTotal211"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodRevenuTotal211"
              id="table-7-prodRevenuTotal211"
              data-cy="prodRevenuTotal211"
              :class="{ valid: !v$.prodRevenuTotal211.$invalid, invalid: v$.prodRevenuTotal211.$invalid }"
              v-model.number="v$.prodRevenuTotal211.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.prodChambreNbNuitees212')"
              for="table-7-prodChambreNbNuitees212"
            ></label>
            <input
              type="number"
              class="form-control"
              name="prodChambreNbNuitees212"
              id="table-7-prodChambreNbNuitees212"
              data-cy="prodChambreNbNuitees212"
              :class="{ valid: !v$.prodChambreNbNuitees212.$invalid, invalid: v$.prodChambreNbNuitees212.$invalid }"
              v-model.number="v$.prodChambreNbNuitees212.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.techCreateDate213')"
              for="table-7-techCreateDate213"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-techCreateDate213"
                  v-model="v$.techCreateDate213.$model"
                  name="techCreateDate213"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-techCreateDate213"
                data-cy="techCreateDate213"
                type="text"
                class="form-control"
                name="techCreateDate213"
                :class="{ valid: !v$.techCreateDate213.$invalid, invalid: v$.techCreateDate213.$invalid }"
                v-model="v$.techCreateDate213.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.techUpdateDate214')"
              for="table-7-techUpdateDate214"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-techUpdateDate214"
                  v-model="v$.techUpdateDate214.$model"
                  name="techUpdateDate214"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-techUpdateDate214"
                data-cy="techUpdateDate214"
                type="text"
                class="form-control"
                name="techUpdateDate214"
                :class="{ valid: !v$.techUpdateDate214.$invalid, invalid: v$.techUpdateDate214.$invalid }"
                v-model="v$.techUpdateDate214.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numLigne215')" for="table-7-numLigne215"></label>
            <input
              type="number"
              class="form-control"
              name="numLigne215"
              id="table-7-numLigne215"
              data-cy="numLigne215"
              :class="{ valid: !v$.numLigne215.$invalid, invalid: v$.numLigne215.$invalid }"
              v-model.number="v$.numLigne215.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.resort216')" for="table-7-resort216"></label>
            <input
              type="text"
              class="form-control"
              name="resort216"
              id="table-7-resort216"
              data-cy="resort216"
              :class="{ valid: !v$.resort216.$invalid, invalid: v$.resort216.$invalid }"
              v-model="v$.resort216.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.resvNameId217')"
              for="table-7-resvNameId217"
            ></label>
            <input
              type="number"
              class="form-control"
              name="resvNameId217"
              id="table-7-resvNameId217"
              data-cy="resvNameId217"
              :class="{ valid: !v$.resvNameId217.$invalid, invalid: v$.resvNameId217.$invalid }"
              v-model.number="v$.resvNameId217.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.clientOId218')"
              for="table-7-clientOId218"
            ></label>
            <input
              type="text"
              class="form-control"
              name="clientOId218"
              id="table-7-clientOId218"
              data-cy="clientOId218"
              :class="{ valid: !v$.clientOId218.$invalid, invalid: v$.clientOId218.$invalid }"
              v-model="v$.clientOId218.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeChb219')" for="table-7-typeChb219"></label>
            <input
              type="text"
              class="form-control"
              name="typeChb219"
              id="table-7-typeChb219"
              data-cy="typeChb219"
              :class="{ valid: !v$.typeChb219.$invalid, invalid: v$.typeChb219.$invalid }"
              v-model="v$.typeChb219.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.confirmationNo220')"
              for="table-7-confirmationNo220"
            ></label>
            <input
              type="text"
              class="form-control"
              name="confirmationNo220"
              id="table-7-confirmationNo220"
              data-cy="confirmationNo220"
              :class="{ valid: !v$.confirmationNo220.$invalid, invalid: v$.confirmationNo220.$invalid }"
              v-model="v$.confirmationNo220.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.clientMdmId221')"
              for="table-7-clientMdmId221"
            ></label>
            <input
              type="text"
              class="form-control"
              name="clientMdmId221"
              id="table-7-clientMdmId221"
              data-cy="clientMdmId221"
              :class="{ valid: !v$.clientMdmId221.$invalid, invalid: v$.clientMdmId221.$invalid }"
              v-model="v$.clientMdmId221.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nameId222')" for="table-7-nameId222"></label>
            <input
              type="number"
              class="form-control"
              name="nameId222"
              id="table-7-nameId222"
              data-cy="nameId222"
              :class="{ valid: !v$.nameId222.$invalid, invalid: v$.nameId222.$invalid }"
              v-model.number="v$.nameId222.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.parentResvNameId223')"
              for="table-7-parentResvNameId223"
            ></label>
            <input
              type="number"
              class="form-control"
              name="parentResvNameId223"
              id="table-7-parentResvNameId223"
              data-cy="parentResvNameId223"
              :class="{ valid: !v$.parentResvNameId223.$invalid, invalid: v$.parentResvNameId223.$invalid }"
              v-model.number="v$.parentResvNameId223.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.contactId224')"
              for="table-7-contactId224"
            ></label>
            <input
              type="number"
              class="form-control"
              name="contactId224"
              id="table-7-contactId224"
              data-cy="contactId224"
              :class="{ valid: !v$.contactId224.$invalid, invalid: v$.contactId224.$invalid }"
              v-model.number="v$.contactId224.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.agenceId225')" for="table-7-agenceId225"></label>
            <input
              type="number"
              class="form-control"
              name="agenceId225"
              id="table-7-agenceId225"
              data-cy="agenceId225"
              :class="{ valid: !v$.agenceId225.$invalid, invalid: v$.agenceId225.$invalid }"
              v-model.number="v$.agenceId225.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.agenceNom226')"
              for="table-7-agenceNom226"
            ></label>
            <input
              type="text"
              class="form-control"
              name="agenceNom226"
              id="table-7-agenceNom226"
              data-cy="agenceNom226"
              :class="{ valid: !v$.agenceNom226.$invalid, invalid: v$.agenceNom226.$invalid }"
              v-model="v$.agenceNom226.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.societeId227')"
              for="table-7-societeId227"
            ></label>
            <input
              type="number"
              class="form-control"
              name="societeId227"
              id="table-7-societeId227"
              data-cy="societeId227"
              :class="{ valid: !v$.societeId227.$invalid, invalid: v$.societeId227.$invalid }"
              v-model.number="v$.societeId227.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.groupeId228')" for="table-7-groupeId228"></label>
            <input
              type="number"
              class="form-control"
              name="groupeId228"
              id="table-7-groupeId228"
              data-cy="groupeId228"
              :class="{ valid: !v$.groupeId228.$invalid, invalid: v$.groupeId228.$invalid }"
              v-model.number="v$.groupeId228.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numBloc229')" for="table-7-numBloc229"></label>
            <input
              type="number"
              class="form-control"
              name="numBloc229"
              id="table-7-numBloc229"
              data-cy="numBloc229"
              :class="{ valid: !v$.numBloc229.$invalid, invalid: v$.numBloc229.$invalid }"
              v-model.number="v$.numBloc229.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.typeResv230')" for="table-7-typeResv230"></label>
            <input
              type="text"
              class="form-control"
              name="typeResv230"
              id="table-7-typeResv230"
              data-cy="typeResv230"
              :class="{ valid: !v$.typeResv230.$invalid, invalid: v$.typeResv230.$invalid }"
              v-model="v$.typeResv230.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutResv231')"
              for="table-7-statutResv231"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutResv231"
              id="table-7-statutResv231"
              data-cy="statutResv231"
              :class="{ valid: !v$.statutResv231.$invalid, invalid: v$.statutResv231.$invalid }"
              v-model="v$.statutResv231.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDebutResv232')"
              for="table-7-dateDebutResv232"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDebutResv232"
                  v-model="v$.dateDebutResv232.$model"
                  name="dateDebutResv232"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDebutResv232"
                data-cy="dateDebutResv232"
                type="text"
                class="form-control"
                name="dateDebutResv232"
                :class="{ valid: !v$.dateDebutResv232.$invalid, invalid: v$.dateDebutResv232.$invalid }"
                v-model="v$.dateDebutResv232.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateFinResv233')"
              for="table-7-dateFinResv233"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateFinResv233"
                  v-model="v$.dateFinResv233.$model"
                  name="dateFinResv233"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateFinResv233"
                data-cy="dateFinResv233"
                type="text"
                class="form-control"
                name="dateFinResv233"
                :class="{ valid: !v$.dateFinResv233.$invalid, invalid: v$.dateFinResv233.$invalid }"
                v-model="v$.dateFinResv233.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateDebutResv234')"
              for="table-7-truncDateDebutResv234"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateDebutResv234"
                  v-model="v$.truncDateDebutResv234.$model"
                  name="truncDateDebutResv234"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateDebutResv234"
                data-cy="truncDateDebutResv234"
                type="text"
                class="form-control"
                name="truncDateDebutResv234"
                :class="{ valid: !v$.truncDateDebutResv234.$invalid, invalid: v$.truncDateDebutResv234.$invalid }"
                v-model="v$.truncDateDebutResv234.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.truncDateFinResv235')"
              for="table-7-truncDateFinResv235"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-truncDateFinResv235"
                  v-model="v$.truncDateFinResv235.$model"
                  name="truncDateFinResv235"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-truncDateFinResv235"
                data-cy="truncDateFinResv235"
                type="text"
                class="form-control"
                name="truncDateFinResv235"
                :class="{ valid: !v$.truncDateFinResv235.$invalid, invalid: v$.truncDateFinResv235.$invalid }"
                v-model="v$.truncDateFinResv235.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateAnnResv236')"
              for="table-7-dateAnnResv236"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateAnnResv236"
                  v-model="v$.dateAnnResv236.$model"
                  name="dateAnnResv236"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateAnnResv236"
                data-cy="dateAnnResv236"
                type="text"
                class="form-control"
                name="dateAnnResv236"
                :class="{ valid: !v$.dateAnnResv236.$invalid, invalid: v$.dateAnnResv236.$invalid }"
                v-model="v$.dateAnnResv236.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.pseudoRoomYn237')"
              for="table-7-pseudoRoomYn237"
            ></label>
            <input
              type="text"
              class="form-control"
              name="pseudoRoomYn237"
              id="table-7-pseudoRoomYn237"
              data-cy="pseudoRoomYn237"
              :class="{ valid: !v$.pseudoRoomYn237.$invalid, invalid: v$.pseudoRoomYn237.$invalid }"
              v-model="v$.pseudoRoomYn237.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.createurResv238')"
              for="table-7-createurResv238"
            ></label>
            <input
              type="number"
              class="form-control"
              name="createurResv238"
              id="table-7-createurResv238"
              data-cy="createurResv238"
              :class="{ valid: !v$.createurResv238.$invalid, invalid: v$.createurResv238.$invalid }"
              v-model.number="v$.createurResv238.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nomCreateurResv239')"
              for="table-7-nomCreateurResv239"
            ></label>
            <input
              type="text"
              class="form-control"
              name="nomCreateurResv239"
              id="table-7-nomCreateurResv239"
              data-cy="nomCreateurResv239"
              :class="{ valid: !v$.nomCreateurResv239.$invalid, invalid: v$.nomCreateurResv239.$invalid }"
              v-model="v$.nomCreateurResv239.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGarantie240')"
              for="table-7-codeGarantie240"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGarantie240"
              id="table-7-codeGarantie240"
              data-cy="codeGarantie240"
              :class="{ valid: !v$.codeGarantie240.$invalid, invalid: v$.codeGarantie240.$invalid }"
              v-model="v$.codeGarantie240.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.flgDed241')" for="table-7-flgDed241"></label>
            <input
              type="text"
              class="form-control"
              name="flgDed241"
              id="table-7-flgDed241"
              data-cy="flgDed241"
              :class="{ valid: !v$.flgDed241.$invalid, invalid: v$.flgDed241.$invalid }"
              v-model="v$.flgDed241.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePays242')" for="table-7-codePays242"></label>
            <input
              type="text"
              class="form-control"
              name="codePays242"
              id="table-7-codePays242"
              data-cy="codePays242"
              :class="{ valid: !v$.codePays242.$invalid, invalid: v$.codePays242.$invalid }"
              v-model="v$.codePays242.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPays243')" for="table-7-libPays243"></label>
            <input
              type="text"
              class="form-control"
              name="libPays243"
              id="table-7-libPays243"
              data-cy="libPays243"
              :class="{ valid: !v$.libPays243.$invalid, invalid: v$.libPays243.$invalid }"
              v-model="v$.libPays243.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeNationalite244')"
              for="table-7-codeNationalite244"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeNationalite244"
              id="table-7-codeNationalite244"
              data-cy="codeNationalite244"
              :class="{ valid: !v$.codeNationalite244.$invalid, invalid: v$.codeNationalite244.$invalid }"
              v-model="v$.codeNationalite244.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libNationalite245')"
              for="table-7-libNationalite245"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libNationalite245"
              id="table-7-libNationalite245"
              data-cy="libNationalite245"
              :class="{ valid: !v$.libNationalite245.$invalid, invalid: v$.libNationalite245.$invalid }"
              v-model="v$.libNationalite245.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeSource246')"
              for="table-7-codeSource246"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeSource246"
              id="table-7-codeSource246"
              data-cy="codeSource246"
              :class="{ valid: !v$.codeSource246.$invalid, invalid: v$.codeSource246.$invalid }"
              v-model="v$.codeSource246.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libSource247')"
              for="table-7-libSource247"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libSource247"
              id="table-7-libSource247"
              data-cy="libSource247"
              :class="{ valid: !v$.libSource247.$invalid, invalid: v$.libSource247.$invalid }"
              v-model="v$.libSource247.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandSource248')"
              for="table-7-codeGrandSource248"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandSource248"
              id="table-7-codeGrandSource248"
              data-cy="codeGrandSource248"
              :class="{ valid: !v$.codeGrandSource248.$invalid, invalid: v$.codeGrandSource248.$invalid }"
              v-model="v$.codeGrandSource248.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeOrigine249')"
              for="table-7-codeOrigine249"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeOrigine249"
              id="table-7-codeOrigine249"
              data-cy="codeOrigine249"
              :class="{ valid: !v$.codeOrigine249.$invalid, invalid: v$.codeOrigine249.$invalid }"
              v-model="v$.codeOrigine249.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libOrigine250')"
              for="table-7-libOrigine250"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libOrigine250"
              id="table-7-libOrigine250"
              data-cy="libOrigine250"
              :class="{ valid: !v$.libOrigine250.$invalid, invalid: v$.libOrigine250.$invalid }"
              v-model="v$.libOrigine250.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeMarche251')"
              for="table-7-codeMarche251"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeMarche251"
              id="table-7-codeMarche251"
              data-cy="codeMarche251"
              :class="{ valid: !v$.codeMarche251.$invalid, invalid: v$.codeMarche251.$invalid }"
              v-model="v$.codeMarche251.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libMarche252')"
              for="table-7-libMarche252"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libMarche252"
              id="table-7-libMarche252"
              data-cy="libMarche252"
              :class="{ valid: !v$.libMarche252.$invalid, invalid: v$.libMarche252.$invalid }"
              v-model="v$.libMarche252.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeGrandMarche253')"
              for="table-7-codeGrandMarche253"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeGrandMarche253"
              id="table-7-codeGrandMarche253"
              data-cy="codeGrandMarche253"
              :class="{ valid: !v$.codeGrandMarche253.$invalid, invalid: v$.codeGrandMarche253.$invalid }"
              v-model="v$.codeGrandMarche253.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.libGrandMarche254')"
              for="table-7-libGrandMarche254"
            ></label>
            <input
              type="text"
              class="form-control"
              name="libGrandMarche254"
              id="table-7-libGrandMarche254"
              data-cy="libGrandMarche254"
              :class="{ valid: !v$.libGrandMarche254.$invalid, invalid: v$.libGrandMarche254.$invalid }"
              v-model="v$.libGrandMarche254.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.codePrix255')" for="table-7-codePrix255"></label>
            <input
              type="text"
              class="form-control"
              name="codePrix255"
              id="table-7-codePrix255"
              data-cy="codePrix255"
              :class="{ valid: !v$.codePrix255.$invalid, invalid: v$.codePrix255.$invalid }"
              v-model="v$.codePrix255.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.categPrix256')"
              for="table-7-categPrix256"
            ></label>
            <input
              type="text"
              class="form-control"
              name="categPrix256"
              id="table-7-categPrix256"
              data-cy="categPrix256"
              :class="{ valid: !v$.categPrix256.$invalid, invalid: v$.categPrix256.$invalid }"
              v-model="v$.categPrix256.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.libPrix257')" for="table-7-libPrix257"></label>
            <input
              type="text"
              class="form-control"
              name="libPrix257"
              id="table-7-libPrix257"
              data-cy="libPrix257"
              :class="{ valid: !v$.libPrix257.$invalid, invalid: v$.libPrix257.$invalid }"
              v-model="v$.libPrix257.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numChb258')" for="table-7-numChb258"></label>
            <input
              type="text"
              class="form-control"
              name="numChb258"
              id="table-7-numChb258"
              data-cy="numChb258"
              :class="{ valid: !v$.numChb258.$invalid, invalid: v$.numChb258.$invalid }"
              v-model="v$.numChb258.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChb259')"
              for="table-7-descriptionTypeChb259"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChb259"
              id="table-7-descriptionTypeChb259"
              data-cy="descriptionTypeChb259"
              :class="{ valid: !v$.descriptionTypeChb259.$invalid, invalid: v$.descriptionTypeChb259.$invalid }"
              v-model="v$.descriptionTypeChb259.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChb260')"
              for="table-7-codeTypeChb260"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChb260"
              id="table-7-codeTypeChb260"
              data-cy="codeTypeChb260"
              :class="{ valid: !v$.codeTypeChb260.$invalid, invalid: v$.codeTypeChb260.$invalid }"
              v-model="v$.codeTypeChb260.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.classChb261')" for="table-7-classChb261"></label>
            <input
              type="text"
              class="form-control"
              name="classChb261"
              id="table-7-classChb261"
              data-cy="classChb261"
              :class="{ valid: !v$.classChb261.$invalid, invalid: v$.classChb261.$invalid }"
              v-model="v$.classChb261.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.caractChb262')"
              for="table-7-caractChb262"
            ></label>
            <input
              type="text"
              class="form-control"
              name="caractChb262"
              id="table-7-caractChb262"
              data-cy="caractChb262"
              :class="{ valid: !v$.caractChb262.$invalid, invalid: v$.caractChb262.$invalid }"
              v-model="v$.caractChb262.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeChbDeReservation263')"
              for="table-7-typeChbDeReservation263"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeChbDeReservation263"
              id="table-7-typeChbDeReservation263"
              data-cy="typeChbDeReservation263"
              :class="{ valid: !v$.typeChbDeReservation263.$invalid, invalid: v$.typeChbDeReservation263.$invalid }"
              v-model="v$.typeChbDeReservation263.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.descriptionTypeChbDeResv264')"
              for="table-7-descriptionTypeChbDeResv264"
            ></label>
            <input
              type="text"
              class="form-control"
              name="descriptionTypeChbDeResv264"
              id="table-7-descriptionTypeChbDeResv264"
              data-cy="descriptionTypeChbDeResv264"
              :class="{ valid: !v$.descriptionTypeChbDeResv264.$invalid, invalid: v$.descriptionTypeChbDeResv264.$invalid }"
              v-model="v$.descriptionTypeChbDeResv264.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.codeTypeChbDeResv265')"
              for="table-7-codeTypeChbDeResv265"
            ></label>
            <input
              type="text"
              class="form-control"
              name="codeTypeChbDeResv265"
              id="table-7-codeTypeChbDeResv265"
              data-cy="codeTypeChbDeResv265"
              :class="{ valid: !v$.codeTypeChbDeResv265.$invalid, invalid: v$.codeTypeChbDeResv265.$invalid }"
              v-model="v$.codeTypeChbDeResv265.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDeReservation266')"
              for="table-7-statutDeReservation266"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDeReservation266"
              id="table-7-statutDeReservation266"
              data-cy="statutDeReservation266"
              :class="{ valid: !v$.statutDeReservation266.$invalid, invalid: v$.statutDeReservation266.$invalid }"
              v-model="v$.statutDeReservation266.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribution267')"
              for="table-7-circuitDistribution267"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribution267"
              id="table-7-circuitDistribution267"
              data-cy="circuitDistribution267"
              :class="{ valid: !v$.circuitDistribution267.$invalid, invalid: v$.circuitDistribution267.$invalid }"
              v-model="v$.circuitDistribution267.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.circuitDistribUserRegroup268')"
              for="table-7-circuitDistribUserRegroup268"
            ></label>
            <input
              type="text"
              class="form-control"
              name="circuitDistribUserRegroup268"
              id="table-7-circuitDistribUserRegroup268"
              data-cy="circuitDistribUserRegroup268"
              :class="{ valid: !v$.circuitDistribUserRegroup268.$invalid, invalid: v$.circuitDistribUserRegroup268.$invalid }"
              v-model="v$.circuitDistribUserRegroup268.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.numCrs269')" for="table-7-numCrs269"></label>
            <input
              type="text"
              class="form-control"
              name="numCrs269"
              id="table-7-numCrs269"
              data-cy="numCrs269"
              :class="{ valid: !v$.numCrs269.$invalid, invalid: v$.numCrs269.$invalid }"
              v-model="v$.numCrs269.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.typeRefCrs270')"
              for="table-7-typeRefCrs270"
            ></label>
            <input
              type="text"
              class="form-control"
              name="typeRefCrs270"
              id="table-7-typeRefCrs270"
              data-cy="typeRefCrs270"
              :class="{ valid: !v$.typeRefCrs270.$invalid, invalid: v$.typeRefCrs270.$invalid }"
              v-model="v$.typeRefCrs270.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.crsInsertDate271')"
              for="table-7-crsInsertDate271"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-crsInsertDate271"
                  v-model="v$.crsInsertDate271.$model"
                  name="crsInsertDate271"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-crsInsertDate271"
                data-cy="crsInsertDate271"
                type="text"
                class="form-control"
                name="crsInsertDate271"
                :class="{ valid: !v$.crsInsertDate271.$invalid, invalid: v$.crsInsertDate271.$invalid }"
                v-model="v$.crsInsertDate271.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateCreaResv272')"
              for="table-7-dateCreaResv272"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateCreaResv272"
                  v-model="v$.dateCreaResv272.$model"
                  name="dateCreaResv272"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateCreaResv272"
                data-cy="dateCreaResv272"
                type="text"
                class="form-control"
                name="dateCreaResv272"
                :class="{ valid: !v$.dateCreaResv272.$invalid, invalid: v$.dateCreaResv272.$invalid }"
                v-model="v$.dateCreaResv272.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.datePremier273')"
              for="table-7-datePremier273"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-datePremier273"
                  v-model="v$.datePremier273.$model"
                  name="datePremier273"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-datePremier273"
                data-cy="datePremier273"
                type="text"
                class="form-control"
                name="datePremier273"
                :class="{ valid: !v$.datePremier273.$invalid, invalid: v$.datePremier273.$invalid }"
                v-model="v$.datePremier273.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutPremier274')"
              for="table-7-statutPremier274"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutPremier274"
              id="table-7-statutPremier274"
              data-cy="statutPremier274"
              :class="{ valid: !v$.statutPremier274.$invalid, invalid: v$.statutPremier274.$invalid }"
              v-model="v$.statutPremier274.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernier275')"
              for="table-7-dateDernier275"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernier275"
                  v-model="v$.dateDernier275.$model"
                  name="dateDernier275"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernier275"
                data-cy="dateDernier275"
                type="text"
                class="form-control"
                name="dateDernier275"
                :class="{ valid: !v$.dateDernier275.$invalid, invalid: v$.dateDernier275.$invalid }"
                v-model="v$.dateDernier275.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernier276')"
              for="table-7-statutDernier276"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernier276"
              id="table-7-statutDernier276"
              data-cy="statutDernier276"
              :class="{ valid: !v$.statutDernier276.$invalid, invalid: v$.statutDernier276.$invalid }"
              v-model="v$.statutDernier276.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.dateDernierPseudo277')"
              for="table-7-dateDernierPseudo277"
            ></label>
            <b-input-group class="mb-3">
              <b-input-group-prepend>
                <b-form-datepicker
                  aria-controls="table-7-dateDernierPseudo277"
                  v-model="v$.dateDernierPseudo277.$model"
                  name="dateDernierPseudo277"
                  class="form-control"
                  :locale="currentLanguage"
                  button-only
                  today-button
                  reset-button
                  close-button
                >
                </b-form-datepicker>
              </b-input-group-prepend>
              <b-form-input
                id="table-7-dateDernierPseudo277"
                data-cy="dateDernierPseudo277"
                type="text"
                class="form-control"
                name="dateDernierPseudo277"
                :class="{ valid: !v$.dateDernierPseudo277.$invalid, invalid: v$.dateDernierPseudo277.$invalid }"
                v-model="v$.dateDernierPseudo277.$model"
              />
            </b-input-group>
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.statutDernierPseudo278')"
              for="table-7-statutDernierPseudo278"
            ></label>
            <input
              type="text"
              class="form-control"
              name="statutDernierPseudo278"
              id="table-7-statutDernierPseudo278"
              data-cy="statutDernierPseudo278"
              :class="{ valid: !v$.statutDernierPseudo278.$invalid, invalid: v$.statutDernierPseudo278.$invalid }"
              v-model="v$.statutDernierPseudo278.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtCreaAnn279')"
              for="table-7-diffDtCreaAnn279"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtCreaAnn279"
              id="table-7-diffDtCreaAnn279"
              data-cy="diffDtCreaAnn279"
              :class="{ valid: !v$.diffDtCreaAnn279.$invalid, invalid: v$.diffDtCreaAnn279.$invalid }"
              v-model.number="v$.diffDtCreaAnn279.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.diffDtArrAnn280')"
              for="table-7-diffDtArrAnn280"
            ></label>
            <input
              type="number"
              class="form-control"
              name="diffDtArrAnn280"
              id="table-7-diffDtArrAnn280"
              data-cy="diffDtArrAnn280"
              :class="{ valid: !v$.diffDtArrAnn280.$invalid, invalid: v$.diffDtArrAnn280.$invalid }"
              v-model.number="v$.diffDtArrAnn280.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.leadtime281')" for="table-7-leadtime281"></label>
            <input
              type="number"
              class="form-control"
              name="leadtime281"
              id="table-7-leadtime281"
              data-cy="leadtime281"
              :class="{ valid: !v$.leadtime281.$invalid, invalid: v$.leadtime281.$invalid }"
              v-model.number="v$.leadtime281.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.los282')" for="table-7-los282"></label>
            <input
              type="number"
              class="form-control"
              name="los282"
              id="table-7-los282"
              data-cy="los282"
              :class="{ valid: !v$.los282.$invalid, invalid: v$.los282.$invalid }"
              v-model.number="v$.los282.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.occupantsGroupe283')"
              for="table-7-occupantsGroupe283"
            ></label>
            <input
              type="text"
              class="form-control"
              name="occupantsGroupe283"
              id="table-7-occupantsGroupe283"
              data-cy="occupantsGroupe283"
              :class="{ valid: !v$.occupantsGroupe283.$invalid, invalid: v$.occupantsGroupe283.$invalid }"
              v-model="v$.occupantsGroupe283.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbNuitee284')" for="table-7-nbNuitee284"></label>
            <input
              type="number"
              class="form-control"
              name="nbNuitee284"
              id="table-7-nbNuitee284"
              data-cy="nbNuitee284"
              :class="{ valid: !v$.nbNuitee284.$invalid, invalid: v$.nbNuitee284.$invalid }"
              v-model.number="v$.nbNuitee284.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbNuiteeNnDed285')"
              for="table-7-nbNuiteeNnDed285"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbNuiteeNnDed285"
              id="table-7-nbNuiteeNnDed285"
              data-cy="nbNuiteeNnDed285"
              :class="{ valid: !v$.nbNuiteeNnDed285.$invalid, invalid: v$.nbNuiteeNnDed285.$invalid }"
              v-model.number="v$.nbNuiteeNnDed285.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbResvAnn286')"
              for="table-7-nbResvAnn286"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbResvAnn286"
              id="table-7-nbResvAnn286"
              data-cy="nbResvAnn286"
              :class="{ valid: !v$.nbResvAnn286.$invalid, invalid: v$.nbResvAnn286.$invalid }"
              v-model.number="v$.nbResvAnn286.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbAdu287')" for="table-7-nbAdu287"></label>
            <input
              type="number"
              class="form-control"
              name="nbAdu287"
              id="table-7-nbAdu287"
              data-cy="nbAdu287"
              :class="{ valid: !v$.nbAdu287.$invalid, invalid: v$.nbAdu287.$invalid }"
              v-model.number="v$.nbAdu287.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbEnf288')" for="table-7-nbEnf288"></label>
            <input
              type="number"
              class="form-control"
              name="nbEnf288"
              id="table-7-nbEnf288"
              data-cy="nbEnf288"
              :class="{ valid: !v$.nbEnf288.$invalid, invalid: v$.nbEnf288.$invalid }"
              v-model.number="v$.nbEnf288.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersDayU289')"
              for="table-7-nbPersDayU289"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDayU289"
              id="table-7-nbPersDayU289"
              data-cy="nbPersDayU289"
              :class="{ valid: !v$.nbPersDayU289.$invalid, invalid: v$.nbPersDayU289.$invalid }"
              v-model.number="v$.nbPersDayU289.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersArr290')"
              for="table-7-nbPersArr290"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersArr290"
              id="table-7-nbPersArr290"
              data-cy="nbPersArr290"
              :class="{ valid: !v$.nbPersArr290.$invalid, invalid: v$.nbPersArr290.$invalid }"
              v-model.number="v$.nbPersArr290.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersDep291')"
              for="table-7-nbPersDep291"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersDep291"
              id="table-7-nbPersDep291"
              data-cy="nbPersDep291"
              :class="{ valid: !v$.nbPersDep291.$invalid, invalid: v$.nbPersDep291.$invalid }"
              v-model.number="v$.nbPersDep291.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersAnn292')"
              for="table-7-nbPersAnn292"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersAnn292"
              id="table-7-nbPersAnn292"
              data-cy="nbPersAnn292"
              :class="{ valid: !v$.nbPersAnn292.$invalid, invalid: v$.nbPersAnn292.$invalid }"
              v-model.number="v$.nbPersAnn292.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbPersNoshow293')"
              for="table-7-nbPersNoshow293"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbPersNoshow293"
              id="table-7-nbPersNoshow293"
              data-cy="nbPersNoshow293"
              :class="{ valid: !v$.nbPersNoshow293.$invalid, invalid: v$.nbPersNoshow293.$invalid }"
              v-model.number="v$.nbPersNoshow293.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbChbDayU294')"
              for="table-7-nbChbDayU294"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDayU294"
              id="table-7-nbChbDayU294"
              data-cy="nbChbDayU294"
              :class="{ valid: !v$.nbChbDayU294.$invalid, invalid: v$.nbChbDayU294.$invalid }"
              v-model.number="v$.nbChbDayU294.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbArr295')" for="table-7-nbChbArr295"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbArr295"
              id="table-7-nbChbArr295"
              data-cy="nbChbArr295"
              :class="{ valid: !v$.nbChbArr295.$invalid, invalid: v$.nbChbArr295.$invalid }"
              v-model.number="v$.nbChbArr295.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbDep296')" for="table-7-nbChbDep296"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbDep296"
              id="table-7-nbChbDep296"
              data-cy="nbChbDep296"
              :class="{ valid: !v$.nbChbDep296.$invalid, invalid: v$.nbChbDep296.$invalid }"
              v-model.number="v$.nbChbDep296.$model"
            />
          </div>
          <div class="form-group">
            <label class="form-control-label" v-text="t$('big10SampleApplicationApp.table7.nbChbAnn297')" for="table-7-nbChbAnn297"></label>
            <input
              type="number"
              class="form-control"
              name="nbChbAnn297"
              id="table-7-nbChbAnn297"
              data-cy="nbChbAnn297"
              :class="{ valid: !v$.nbChbAnn297.$invalid, invalid: v$.nbChbAnn297.$invalid }"
              v-model.number="v$.nbChbAnn297.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.nbChbNoshow298')"
              for="table-7-nbChbNoshow298"
            ></label>
            <input
              type="number"
              class="form-control"
              name="nbChbNoshow298"
              id="table-7-nbChbNoshow298"
              data-cy="nbChbNoshow298"
              :class="{ valid: !v$.nbChbNoshow298.$invalid, invalid: v$.nbChbNoshow298.$invalid }"
              v-model.number="v$.nbChbNoshow298.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambre299')"
              for="table-7-revenuNetChambre299"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambre299"
              id="table-7-revenuNetChambre299"
              data-cy="revenuNetChambre299"
              :class="{ valid: !v$.revenuNetChambre299.$invalid, invalid: v$.revenuNetChambre299.$invalid }"
              v-model.number="v$.revenuNetChambre299.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambre300')"
              for="table-7-revenuTaxeChambre300"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambre300"
              id="table-7-revenuTaxeChambre300"
              data-cy="revenuTaxeChambre300"
              :class="{ valid: !v$.revenuTaxeChambre300.$invalid, invalid: v$.revenuTaxeChambre300.$invalid }"
              v-model.number="v$.revenuTaxeChambre300.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetChambreGlobal301')"
              for="table-7-revenuNetChambreGlobal301"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetChambreGlobal301"
              id="table-7-revenuNetChambreGlobal301"
              data-cy="revenuNetChambreGlobal301"
              :class="{ valid: !v$.revenuNetChambreGlobal301.$invalid, invalid: v$.revenuNetChambreGlobal301.$invalid }"
              v-model.number="v$.revenuNetChambreGlobal301.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeChambreGlobal302')"
              for="table-7-revenuTaxeChambreGlobal302"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeChambreGlobal302"
              id="table-7-revenuTaxeChambreGlobal302"
              data-cy="revenuTaxeChambreGlobal302"
              :class="{ valid: !v$.revenuTaxeChambreGlobal302.$invalid, invalid: v$.revenuTaxeChambreGlobal302.$invalid }"
              v-model.number="v$.revenuTaxeChambreGlobal302.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBq303')"
              for="table-7-revenuNetBq303"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBq303"
              id="table-7-revenuNetBq303"
              data-cy="revenuNetBq303"
              :class="{ valid: !v$.revenuNetBq303.$invalid, invalid: v$.revenuNetBq303.$invalid }"
              v-model.number="v$.revenuNetBq303.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBq304')"
              for="table-7-revenuTaxeBq304"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBq304"
              id="table-7-revenuTaxeBq304"
              data-cy="revenuTaxeBq304"
              :class="{ valid: !v$.revenuTaxeBq304.$invalid, invalid: v$.revenuTaxeBq304.$invalid }"
              v-model.number="v$.revenuTaxeBq304.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetBqGlobal305')"
              for="table-7-revenuNetBqGlobal305"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetBqGlobal305"
              id="table-7-revenuNetBqGlobal305"
              data-cy="revenuNetBqGlobal305"
              :class="{ valid: !v$.revenuNetBqGlobal305.$invalid, invalid: v$.revenuNetBqGlobal305.$invalid }"
              v-model.number="v$.revenuNetBqGlobal305.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeBqGlobal306')"
              for="table-7-revenuTaxeBqGlobal306"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeBqGlobal306"
              id="table-7-revenuTaxeBqGlobal306"
              data-cy="revenuTaxeBqGlobal306"
              :class="{ valid: !v$.revenuTaxeBqGlobal306.$invalid, invalid: v$.revenuTaxeBqGlobal306.$invalid }"
              v-model.number="v$.revenuTaxeBqGlobal306.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtra307')"
              for="table-7-revenuNetExtra307"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtra307"
              id="table-7-revenuNetExtra307"
              data-cy="revenuNetExtra307"
              :class="{ valid: !v$.revenuNetExtra307.$invalid, invalid: v$.revenuNetExtra307.$invalid }"
              v-model.number="v$.revenuNetExtra307.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtra308')"
              for="table-7-revenuTaxeExtra308"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtra308"
              id="table-7-revenuTaxeExtra308"
              data-cy="revenuTaxeExtra308"
              :class="{ valid: !v$.revenuTaxeExtra308.$invalid, invalid: v$.revenuTaxeExtra308.$invalid }"
              v-model.number="v$.revenuTaxeExtra308.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuNetExtraGlobal309')"
              for="table-7-revenuNetExtraGlobal309"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuNetExtraGlobal309"
              id="table-7-revenuNetExtraGlobal309"
              data-cy="revenuNetExtraGlobal309"
              :class="{ valid: !v$.revenuNetExtraGlobal309.$invalid, invalid: v$.revenuNetExtraGlobal309.$invalid }"
              v-model.number="v$.revenuNetExtraGlobal309.$model"
            />
          </div>
          <div class="form-group">
            <label
              class="form-control-label"
              v-text="t$('big10SampleApplicationApp.table7.revenuTaxeExtraGlobal310')"
              for="table-7-revenuTaxeExtraGlobal310"
            ></label>
            <input
              type="number"
              class="form-control"
              name="revenuTaxeExtraGlobal310"
              id="table-7-revenuTaxeExtraGlobal310"
              data-cy="revenuTaxeExtraGlobal310"
              :class="{ valid: !v$.revenuTaxeExtraGlobal310.$invalid, invalid: v$.revenuTaxeExtraGlobal310.$invalid }"
              v-model.number="v$.revenuTaxeExtraGlobal310.$model"
            />
          </div>
        </div>
        <div>
          <button type="button" id="cancel-save" data-cy="entityCreateCancelButton" class="btn btn-secondary" v-on:click="previousState()">
            <font-awesome-icon icon="ban"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.cancel')"></span>
          </button>
          <button
            type="submit"
            id="save-entity"
            data-cy="entityCreateSaveButton"
            :disabled="v$.$invalid || isSaving"
            class="btn btn-primary"
          >
            <font-awesome-icon icon="save"></font-awesome-icon>&nbsp;<span v-text="t$('entity.action.save')"></span>
          </button>
        </div>
      </form>
    </div>
  </div>
</template>
<script lang="ts" src="./table-7-update.component.ts"></script>
