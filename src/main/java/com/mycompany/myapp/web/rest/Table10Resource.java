package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Table10;
import com.mycompany.myapp.repository.Table10Repository;
import com.mycompany.myapp.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link com.mycompany.myapp.domain.Table10}.
 */
@RestController
@RequestMapping("/api/table-10-s")
@Transactional
public class Table10Resource {

    private final Logger log = LoggerFactory.getLogger(Table10Resource.class);

    private static final String ENTITY_NAME = "table10";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final Table10Repository table10Repository;

    public Table10Resource(Table10Repository table10Repository) {
        this.table10Repository = table10Repository;
    }

    /**
     * {@code POST  /table-10-s} : Create a new table10.
     *
     * @param table10 the table10 to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new table10, or with status {@code 400 (Bad Request)} if the table10 has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("")
    public ResponseEntity<Table10> createTable10(@RequestBody Table10 table10) throws URISyntaxException {
        log.debug("REST request to save Table10 : {}", table10);
        if (table10.getId() != null) {
            throw new BadRequestAlertException("A new table10 cannot already have an ID", ENTITY_NAME, "idexists");
        }
        table10 = table10Repository.save(table10);
        return ResponseEntity.created(new URI("/api/table-10-s/" + table10.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, table10.getId().toString()))
            .body(table10);
    }

    /**
     * {@code PUT  /table-10-s/:id} : Updates an existing table10.
     *
     * @param id the id of the table10 to save.
     * @param table10 the table10 to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated table10,
     * or with status {@code 400 (Bad Request)} if the table10 is not valid,
     * or with status {@code 500 (Internal Server Error)} if the table10 couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Table10> updateTable10(@PathVariable(value = "id", required = false) final Long id, @RequestBody Table10 table10)
        throws URISyntaxException {
        log.debug("REST request to update Table10 : {}, {}", id, table10);
        if (table10.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, table10.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!table10Repository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        table10 = table10Repository.save(table10);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, table10.getId().toString()))
            .body(table10);
    }

    /**
     * {@code PATCH  /table-10-s/:id} : Partial updates given fields of an existing table10, field will ignore if it is null
     *
     * @param id the id of the table10 to save.
     * @param table10 the table10 to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated table10,
     * or with status {@code 400 (Bad Request)} if the table10 is not valid,
     * or with status {@code 404 (Not Found)} if the table10 is not found,
     * or with status {@code 500 (Internal Server Error)} if the table10 couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<Table10> partialUpdateTable10(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody Table10 table10
    ) throws URISyntaxException {
        log.debug("REST request to partial update Table10 partially : {}, {}", id, table10);
        if (table10.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, table10.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!table10Repository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<Table10> result = table10Repository
            .findById(table10.getId())
            .map(existingTable10 -> {
                if (table10.getNumLigne1() != null) {
                    existingTable10.setNumLigne1(table10.getNumLigne1());
                }
                if (table10.getResort2() != null) {
                    existingTable10.setResort2(table10.getResort2());
                }
                if (table10.getResvNameId3() != null) {
                    existingTable10.setResvNameId3(table10.getResvNameId3());
                }
                if (table10.getClientOId4() != null) {
                    existingTable10.setClientOId4(table10.getClientOId4());
                }
                if (table10.getTypeChb5() != null) {
                    existingTable10.setTypeChb5(table10.getTypeChb5());
                }
                if (table10.getConfirmationNo6() != null) {
                    existingTable10.setConfirmationNo6(table10.getConfirmationNo6());
                }
                if (table10.getClientMdmId7() != null) {
                    existingTable10.setClientMdmId7(table10.getClientMdmId7());
                }
                if (table10.getNameId8() != null) {
                    existingTable10.setNameId8(table10.getNameId8());
                }
                if (table10.getParentResvNameId9() != null) {
                    existingTable10.setParentResvNameId9(table10.getParentResvNameId9());
                }
                if (table10.getContactId10() != null) {
                    existingTable10.setContactId10(table10.getContactId10());
                }
                if (table10.getAgenceId11() != null) {
                    existingTable10.setAgenceId11(table10.getAgenceId11());
                }
                if (table10.getAgenceNom12() != null) {
                    existingTable10.setAgenceNom12(table10.getAgenceNom12());
                }
                if (table10.getSocieteId13() != null) {
                    existingTable10.setSocieteId13(table10.getSocieteId13());
                }
                if (table10.getGroupeId14() != null) {
                    existingTable10.setGroupeId14(table10.getGroupeId14());
                }
                if (table10.getNumBloc15() != null) {
                    existingTable10.setNumBloc15(table10.getNumBloc15());
                }
                if (table10.getTypeResv16() != null) {
                    existingTable10.setTypeResv16(table10.getTypeResv16());
                }
                if (table10.getStatutResv17() != null) {
                    existingTable10.setStatutResv17(table10.getStatutResv17());
                }
                if (table10.getDateDebutResv18() != null) {
                    existingTable10.setDateDebutResv18(table10.getDateDebutResv18());
                }
                if (table10.getDateFinResv19() != null) {
                    existingTable10.setDateFinResv19(table10.getDateFinResv19());
                }
                if (table10.getTruncDateDebutResv20() != null) {
                    existingTable10.setTruncDateDebutResv20(table10.getTruncDateDebutResv20());
                }
                if (table10.getTruncDateFinResv21() != null) {
                    existingTable10.setTruncDateFinResv21(table10.getTruncDateFinResv21());
                }
                if (table10.getDateAnnResv22() != null) {
                    existingTable10.setDateAnnResv22(table10.getDateAnnResv22());
                }
                if (table10.getPseudoRoomYn23() != null) {
                    existingTable10.setPseudoRoomYn23(table10.getPseudoRoomYn23());
                }
                if (table10.getCreateurResv24() != null) {
                    existingTable10.setCreateurResv24(table10.getCreateurResv24());
                }
                if (table10.getNomCreateurResv25() != null) {
                    existingTable10.setNomCreateurResv25(table10.getNomCreateurResv25());
                }
                if (table10.getCodeGarantie26() != null) {
                    existingTable10.setCodeGarantie26(table10.getCodeGarantie26());
                }
                if (table10.getFlgDed27() != null) {
                    existingTable10.setFlgDed27(table10.getFlgDed27());
                }
                if (table10.getCodePays28() != null) {
                    existingTable10.setCodePays28(table10.getCodePays28());
                }
                if (table10.getLibPays29() != null) {
                    existingTable10.setLibPays29(table10.getLibPays29());
                }
                if (table10.getCodeNationalite30() != null) {
                    existingTable10.setCodeNationalite30(table10.getCodeNationalite30());
                }
                if (table10.getLibNationalite31() != null) {
                    existingTable10.setLibNationalite31(table10.getLibNationalite31());
                }
                if (table10.getCodeSource32() != null) {
                    existingTable10.setCodeSource32(table10.getCodeSource32());
                }
                if (table10.getLibSource33() != null) {
                    existingTable10.setLibSource33(table10.getLibSource33());
                }
                if (table10.getCodeGrandSource34() != null) {
                    existingTable10.setCodeGrandSource34(table10.getCodeGrandSource34());
                }
                if (table10.getCodeOrigine35() != null) {
                    existingTable10.setCodeOrigine35(table10.getCodeOrigine35());
                }
                if (table10.getLibOrigine36() != null) {
                    existingTable10.setLibOrigine36(table10.getLibOrigine36());
                }
                if (table10.getCodeMarche37() != null) {
                    existingTable10.setCodeMarche37(table10.getCodeMarche37());
                }
                if (table10.getLibMarche38() != null) {
                    existingTable10.setLibMarche38(table10.getLibMarche38());
                }
                if (table10.getCodeGrandMarche39() != null) {
                    existingTable10.setCodeGrandMarche39(table10.getCodeGrandMarche39());
                }
                if (table10.getLibGrandMarche40() != null) {
                    existingTable10.setLibGrandMarche40(table10.getLibGrandMarche40());
                }
                if (table10.getCodePrix41() != null) {
                    existingTable10.setCodePrix41(table10.getCodePrix41());
                }
                if (table10.getCategPrix42() != null) {
                    existingTable10.setCategPrix42(table10.getCategPrix42());
                }
                if (table10.getLibPrix43() != null) {
                    existingTable10.setLibPrix43(table10.getLibPrix43());
                }
                if (table10.getNumChb44() != null) {
                    existingTable10.setNumChb44(table10.getNumChb44());
                }
                if (table10.getDescriptionTypeChb45() != null) {
                    existingTable10.setDescriptionTypeChb45(table10.getDescriptionTypeChb45());
                }
                if (table10.getCodeTypeChb46() != null) {
                    existingTable10.setCodeTypeChb46(table10.getCodeTypeChb46());
                }
                if (table10.getClassChb47() != null) {
                    existingTable10.setClassChb47(table10.getClassChb47());
                }
                if (table10.getCaractChb48() != null) {
                    existingTable10.setCaractChb48(table10.getCaractChb48());
                }
                if (table10.getTypeChbDeReservation49() != null) {
                    existingTable10.setTypeChbDeReservation49(table10.getTypeChbDeReservation49());
                }
                if (table10.getDescriptionTypeChbDeResv50() != null) {
                    existingTable10.setDescriptionTypeChbDeResv50(table10.getDescriptionTypeChbDeResv50());
                }
                if (table10.getCodeTypeChbDeResv51() != null) {
                    existingTable10.setCodeTypeChbDeResv51(table10.getCodeTypeChbDeResv51());
                }
                if (table10.getStatutDeReservation52() != null) {
                    existingTable10.setStatutDeReservation52(table10.getStatutDeReservation52());
                }
                if (table10.getCircuitDistribution53() != null) {
                    existingTable10.setCircuitDistribution53(table10.getCircuitDistribution53());
                }
                if (table10.getCircuitDistribUserRegroup54() != null) {
                    existingTable10.setCircuitDistribUserRegroup54(table10.getCircuitDistribUserRegroup54());
                }
                if (table10.getNumCrs55() != null) {
                    existingTable10.setNumCrs55(table10.getNumCrs55());
                }
                if (table10.getTypeRefCrs56() != null) {
                    existingTable10.setTypeRefCrs56(table10.getTypeRefCrs56());
                }
                if (table10.getCrsInsertDate57() != null) {
                    existingTable10.setCrsInsertDate57(table10.getCrsInsertDate57());
                }
                if (table10.getDateCreaResv58() != null) {
                    existingTable10.setDateCreaResv58(table10.getDateCreaResv58());
                }
                if (table10.getDatePremier59() != null) {
                    existingTable10.setDatePremier59(table10.getDatePremier59());
                }
                if (table10.getStatutPremier60() != null) {
                    existingTable10.setStatutPremier60(table10.getStatutPremier60());
                }
                if (table10.getDateDernier61() != null) {
                    existingTable10.setDateDernier61(table10.getDateDernier61());
                }
                if (table10.getStatutDernier62() != null) {
                    existingTable10.setStatutDernier62(table10.getStatutDernier62());
                }
                if (table10.getDateDernierPseudo63() != null) {
                    existingTable10.setDateDernierPseudo63(table10.getDateDernierPseudo63());
                }
                if (table10.getStatutDernierPseudo64() != null) {
                    existingTable10.setStatutDernierPseudo64(table10.getStatutDernierPseudo64());
                }
                if (table10.getDiffDtCreaAnn65() != null) {
                    existingTable10.setDiffDtCreaAnn65(table10.getDiffDtCreaAnn65());
                }
                if (table10.getDiffDtArrAnn66() != null) {
                    existingTable10.setDiffDtArrAnn66(table10.getDiffDtArrAnn66());
                }
                if (table10.getLeadtime67() != null) {
                    existingTable10.setLeadtime67(table10.getLeadtime67());
                }
                if (table10.getLos68() != null) {
                    existingTable10.setLos68(table10.getLos68());
                }
                if (table10.getOccupantsGroupe69() != null) {
                    existingTable10.setOccupantsGroupe69(table10.getOccupantsGroupe69());
                }
                if (table10.getNbNuitee70() != null) {
                    existingTable10.setNbNuitee70(table10.getNbNuitee70());
                }
                if (table10.getNbNuiteeNnDed71() != null) {
                    existingTable10.setNbNuiteeNnDed71(table10.getNbNuiteeNnDed71());
                }
                if (table10.getNbResvAnn72() != null) {
                    existingTable10.setNbResvAnn72(table10.getNbResvAnn72());
                }
                if (table10.getNbAdu73() != null) {
                    existingTable10.setNbAdu73(table10.getNbAdu73());
                }
                if (table10.getNbEnf74() != null) {
                    existingTable10.setNbEnf74(table10.getNbEnf74());
                }
                if (table10.getNbPersDayU75() != null) {
                    existingTable10.setNbPersDayU75(table10.getNbPersDayU75());
                }
                if (table10.getNbPersArr76() != null) {
                    existingTable10.setNbPersArr76(table10.getNbPersArr76());
                }
                if (table10.getNbPersDep77() != null) {
                    existingTable10.setNbPersDep77(table10.getNbPersDep77());
                }
                if (table10.getNbPersAnn78() != null) {
                    existingTable10.setNbPersAnn78(table10.getNbPersAnn78());
                }
                if (table10.getNbPersNoshow79() != null) {
                    existingTable10.setNbPersNoshow79(table10.getNbPersNoshow79());
                }
                if (table10.getNbChbDayU80() != null) {
                    existingTable10.setNbChbDayU80(table10.getNbChbDayU80());
                }
                if (table10.getNbChbArr81() != null) {
                    existingTable10.setNbChbArr81(table10.getNbChbArr81());
                }
                if (table10.getNbChbDep82() != null) {
                    existingTable10.setNbChbDep82(table10.getNbChbDep82());
                }
                if (table10.getNbChbAnn83() != null) {
                    existingTable10.setNbChbAnn83(table10.getNbChbAnn83());
                }
                if (table10.getNbChbNoshow84() != null) {
                    existingTable10.setNbChbNoshow84(table10.getNbChbNoshow84());
                }
                if (table10.getRevenuNetChambre85() != null) {
                    existingTable10.setRevenuNetChambre85(table10.getRevenuNetChambre85());
                }
                if (table10.getRevenuTaxeChambre86() != null) {
                    existingTable10.setRevenuTaxeChambre86(table10.getRevenuTaxeChambre86());
                }
                if (table10.getRevenuNetChambreGlobal87() != null) {
                    existingTable10.setRevenuNetChambreGlobal87(table10.getRevenuNetChambreGlobal87());
                }
                if (table10.getRevenuTaxeChambreGlobal88() != null) {
                    existingTable10.setRevenuTaxeChambreGlobal88(table10.getRevenuTaxeChambreGlobal88());
                }
                if (table10.getRevenuNetBq89() != null) {
                    existingTable10.setRevenuNetBq89(table10.getRevenuNetBq89());
                }
                if (table10.getRevenuTaxeBq90() != null) {
                    existingTable10.setRevenuTaxeBq90(table10.getRevenuTaxeBq90());
                }
                if (table10.getRevenuNetBqGlobal91() != null) {
                    existingTable10.setRevenuNetBqGlobal91(table10.getRevenuNetBqGlobal91());
                }
                if (table10.getRevenuTaxeBqGlobal92() != null) {
                    existingTable10.setRevenuTaxeBqGlobal92(table10.getRevenuTaxeBqGlobal92());
                }
                if (table10.getRevenuNetExtra93() != null) {
                    existingTable10.setRevenuNetExtra93(table10.getRevenuNetExtra93());
                }
                if (table10.getRevenuTaxeExtra94() != null) {
                    existingTable10.setRevenuTaxeExtra94(table10.getRevenuTaxeExtra94());
                }
                if (table10.getRevenuNetExtraGlobal95() != null) {
                    existingTable10.setRevenuNetExtraGlobal95(table10.getRevenuNetExtraGlobal95());
                }
                if (table10.getRevenuTaxeExtraGlobal96() != null) {
                    existingTable10.setRevenuTaxeExtraGlobal96(table10.getRevenuTaxeExtraGlobal96());
                }
                if (table10.getRevenuNetTotal97() != null) {
                    existingTable10.setRevenuNetTotal97(table10.getRevenuNetTotal97());
                }
                if (table10.getRevenuTaxeTotal98() != null) {
                    existingTable10.setRevenuTaxeTotal98(table10.getRevenuTaxeTotal98());
                }
                if (table10.getRevenuNetTotalGlobal99() != null) {
                    existingTable10.setRevenuNetTotalGlobal99(table10.getRevenuNetTotalGlobal99());
                }
                if (table10.getRevenuTaxeTotalGlobal100() != null) {
                    existingTable10.setRevenuTaxeTotalGlobal100(table10.getRevenuTaxeTotalGlobal100());
                }
                if (table10.getProdRevenuChambre101() != null) {
                    existingTable10.setProdRevenuChambre101(table10.getProdRevenuChambre101());
                }
                if (table10.getProdRevenuBq102() != null) {
                    existingTable10.setProdRevenuBq102(table10.getProdRevenuBq102());
                }
                if (table10.getProdRevenuExtra103() != null) {
                    existingTable10.setProdRevenuExtra103(table10.getProdRevenuExtra103());
                }
                if (table10.getProdRevenuTotal104() != null) {
                    existingTable10.setProdRevenuTotal104(table10.getProdRevenuTotal104());
                }
                if (table10.getProdChambreNbNuitees105() != null) {
                    existingTable10.setProdChambreNbNuitees105(table10.getProdChambreNbNuitees105());
                }
                if (table10.getTechCreateDate106() != null) {
                    existingTable10.setTechCreateDate106(table10.getTechCreateDate106());
                }
                if (table10.getTechUpdateDate107() != null) {
                    existingTable10.setTechUpdateDate107(table10.getTechUpdateDate107());
                }
                if (table10.getNumLigne108() != null) {
                    existingTable10.setNumLigne108(table10.getNumLigne108());
                }
                if (table10.getResort109() != null) {
                    existingTable10.setResort109(table10.getResort109());
                }
                if (table10.getResvNameId110() != null) {
                    existingTable10.setResvNameId110(table10.getResvNameId110());
                }
                if (table10.getClientOId111() != null) {
                    existingTable10.setClientOId111(table10.getClientOId111());
                }
                if (table10.getTypeChb112() != null) {
                    existingTable10.setTypeChb112(table10.getTypeChb112());
                }
                if (table10.getConfirmationNo113() != null) {
                    existingTable10.setConfirmationNo113(table10.getConfirmationNo113());
                }
                if (table10.getClientMdmId114() != null) {
                    existingTable10.setClientMdmId114(table10.getClientMdmId114());
                }
                if (table10.getNameId115() != null) {
                    existingTable10.setNameId115(table10.getNameId115());
                }
                if (table10.getParentResvNameId116() != null) {
                    existingTable10.setParentResvNameId116(table10.getParentResvNameId116());
                }
                if (table10.getContactId117() != null) {
                    existingTable10.setContactId117(table10.getContactId117());
                }
                if (table10.getAgenceId118() != null) {
                    existingTable10.setAgenceId118(table10.getAgenceId118());
                }
                if (table10.getAgenceNom119() != null) {
                    existingTable10.setAgenceNom119(table10.getAgenceNom119());
                }
                if (table10.getSocieteId120() != null) {
                    existingTable10.setSocieteId120(table10.getSocieteId120());
                }
                if (table10.getGroupeId121() != null) {
                    existingTable10.setGroupeId121(table10.getGroupeId121());
                }
                if (table10.getNumBloc122() != null) {
                    existingTable10.setNumBloc122(table10.getNumBloc122());
                }
                if (table10.getTypeResv123() != null) {
                    existingTable10.setTypeResv123(table10.getTypeResv123());
                }
                if (table10.getStatutResv124() != null) {
                    existingTable10.setStatutResv124(table10.getStatutResv124());
                }
                if (table10.getDateDebutResv125() != null) {
                    existingTable10.setDateDebutResv125(table10.getDateDebutResv125());
                }
                if (table10.getDateFinResv126() != null) {
                    existingTable10.setDateFinResv126(table10.getDateFinResv126());
                }
                if (table10.getTruncDateDebutResv127() != null) {
                    existingTable10.setTruncDateDebutResv127(table10.getTruncDateDebutResv127());
                }
                if (table10.getTruncDateFinResv128() != null) {
                    existingTable10.setTruncDateFinResv128(table10.getTruncDateFinResv128());
                }
                if (table10.getDateAnnResv129() != null) {
                    existingTable10.setDateAnnResv129(table10.getDateAnnResv129());
                }
                if (table10.getPseudoRoomYn130() != null) {
                    existingTable10.setPseudoRoomYn130(table10.getPseudoRoomYn130());
                }
                if (table10.getCreateurResv131() != null) {
                    existingTable10.setCreateurResv131(table10.getCreateurResv131());
                }
                if (table10.getNomCreateurResv132() != null) {
                    existingTable10.setNomCreateurResv132(table10.getNomCreateurResv132());
                }
                if (table10.getCodeGarantie133() != null) {
                    existingTable10.setCodeGarantie133(table10.getCodeGarantie133());
                }
                if (table10.getFlgDed134() != null) {
                    existingTable10.setFlgDed134(table10.getFlgDed134());
                }
                if (table10.getCodePays135() != null) {
                    existingTable10.setCodePays135(table10.getCodePays135());
                }
                if (table10.getLibPays136() != null) {
                    existingTable10.setLibPays136(table10.getLibPays136());
                }
                if (table10.getCodeNationalite137() != null) {
                    existingTable10.setCodeNationalite137(table10.getCodeNationalite137());
                }
                if (table10.getLibNationalite138() != null) {
                    existingTable10.setLibNationalite138(table10.getLibNationalite138());
                }
                if (table10.getCodeSource139() != null) {
                    existingTable10.setCodeSource139(table10.getCodeSource139());
                }
                if (table10.getLibSource140() != null) {
                    existingTable10.setLibSource140(table10.getLibSource140());
                }
                if (table10.getCodeGrandSource141() != null) {
                    existingTable10.setCodeGrandSource141(table10.getCodeGrandSource141());
                }
                if (table10.getCodeOrigine142() != null) {
                    existingTable10.setCodeOrigine142(table10.getCodeOrigine142());
                }
                if (table10.getLibOrigine143() != null) {
                    existingTable10.setLibOrigine143(table10.getLibOrigine143());
                }
                if (table10.getCodeMarche144() != null) {
                    existingTable10.setCodeMarche144(table10.getCodeMarche144());
                }
                if (table10.getLibMarche145() != null) {
                    existingTable10.setLibMarche145(table10.getLibMarche145());
                }
                if (table10.getCodeGrandMarche146() != null) {
                    existingTable10.setCodeGrandMarche146(table10.getCodeGrandMarche146());
                }
                if (table10.getLibGrandMarche147() != null) {
                    existingTable10.setLibGrandMarche147(table10.getLibGrandMarche147());
                }
                if (table10.getCodePrix148() != null) {
                    existingTable10.setCodePrix148(table10.getCodePrix148());
                }
                if (table10.getCategPrix149() != null) {
                    existingTable10.setCategPrix149(table10.getCategPrix149());
                }
                if (table10.getLibPrix150() != null) {
                    existingTable10.setLibPrix150(table10.getLibPrix150());
                }
                if (table10.getNumChb151() != null) {
                    existingTable10.setNumChb151(table10.getNumChb151());
                }
                if (table10.getDescriptionTypeChb152() != null) {
                    existingTable10.setDescriptionTypeChb152(table10.getDescriptionTypeChb152());
                }
                if (table10.getCodeTypeChb153() != null) {
                    existingTable10.setCodeTypeChb153(table10.getCodeTypeChb153());
                }
                if (table10.getClassChb154() != null) {
                    existingTable10.setClassChb154(table10.getClassChb154());
                }
                if (table10.getCaractChb155() != null) {
                    existingTable10.setCaractChb155(table10.getCaractChb155());
                }
                if (table10.getTypeChbDeReservation156() != null) {
                    existingTable10.setTypeChbDeReservation156(table10.getTypeChbDeReservation156());
                }
                if (table10.getDescriptionTypeChbDeResv157() != null) {
                    existingTable10.setDescriptionTypeChbDeResv157(table10.getDescriptionTypeChbDeResv157());
                }
                if (table10.getCodeTypeChbDeResv158() != null) {
                    existingTable10.setCodeTypeChbDeResv158(table10.getCodeTypeChbDeResv158());
                }
                if (table10.getStatutDeReservation159() != null) {
                    existingTable10.setStatutDeReservation159(table10.getStatutDeReservation159());
                }
                if (table10.getCircuitDistribution160() != null) {
                    existingTable10.setCircuitDistribution160(table10.getCircuitDistribution160());
                }
                if (table10.getCircuitDistribUserRegroup161() != null) {
                    existingTable10.setCircuitDistribUserRegroup161(table10.getCircuitDistribUserRegroup161());
                }
                if (table10.getNumCrs162() != null) {
                    existingTable10.setNumCrs162(table10.getNumCrs162());
                }
                if (table10.getTypeRefCrs163() != null) {
                    existingTable10.setTypeRefCrs163(table10.getTypeRefCrs163());
                }
                if (table10.getCrsInsertDate164() != null) {
                    existingTable10.setCrsInsertDate164(table10.getCrsInsertDate164());
                }
                if (table10.getDateCreaResv165() != null) {
                    existingTable10.setDateCreaResv165(table10.getDateCreaResv165());
                }
                if (table10.getDatePremier166() != null) {
                    existingTable10.setDatePremier166(table10.getDatePremier166());
                }
                if (table10.getStatutPremier167() != null) {
                    existingTable10.setStatutPremier167(table10.getStatutPremier167());
                }
                if (table10.getDateDernier168() != null) {
                    existingTable10.setDateDernier168(table10.getDateDernier168());
                }
                if (table10.getStatutDernier169() != null) {
                    existingTable10.setStatutDernier169(table10.getStatutDernier169());
                }
                if (table10.getDateDernierPseudo170() != null) {
                    existingTable10.setDateDernierPseudo170(table10.getDateDernierPseudo170());
                }
                if (table10.getStatutDernierPseudo171() != null) {
                    existingTable10.setStatutDernierPseudo171(table10.getStatutDernierPseudo171());
                }
                if (table10.getDiffDtCreaAnn172() != null) {
                    existingTable10.setDiffDtCreaAnn172(table10.getDiffDtCreaAnn172());
                }
                if (table10.getDiffDtArrAnn173() != null) {
                    existingTable10.setDiffDtArrAnn173(table10.getDiffDtArrAnn173());
                }
                if (table10.getLeadtime174() != null) {
                    existingTable10.setLeadtime174(table10.getLeadtime174());
                }
                if (table10.getLos175() != null) {
                    existingTable10.setLos175(table10.getLos175());
                }
                if (table10.getOccupantsGroupe176() != null) {
                    existingTable10.setOccupantsGroupe176(table10.getOccupantsGroupe176());
                }
                if (table10.getNbNuitee177() != null) {
                    existingTable10.setNbNuitee177(table10.getNbNuitee177());
                }
                if (table10.getNbNuiteeNnDed178() != null) {
                    existingTable10.setNbNuiteeNnDed178(table10.getNbNuiteeNnDed178());
                }
                if (table10.getNbResvAnn179() != null) {
                    existingTable10.setNbResvAnn179(table10.getNbResvAnn179());
                }
                if (table10.getNbAdu180() != null) {
                    existingTable10.setNbAdu180(table10.getNbAdu180());
                }
                if (table10.getNbEnf181() != null) {
                    existingTable10.setNbEnf181(table10.getNbEnf181());
                }
                if (table10.getNbPersDayU182() != null) {
                    existingTable10.setNbPersDayU182(table10.getNbPersDayU182());
                }
                if (table10.getNbPersArr183() != null) {
                    existingTable10.setNbPersArr183(table10.getNbPersArr183());
                }
                if (table10.getNbPersDep184() != null) {
                    existingTable10.setNbPersDep184(table10.getNbPersDep184());
                }
                if (table10.getNbPersAnn185() != null) {
                    existingTable10.setNbPersAnn185(table10.getNbPersAnn185());
                }
                if (table10.getNbPersNoshow186() != null) {
                    existingTable10.setNbPersNoshow186(table10.getNbPersNoshow186());
                }
                if (table10.getNbChbDayU187() != null) {
                    existingTable10.setNbChbDayU187(table10.getNbChbDayU187());
                }
                if (table10.getNbChbArr188() != null) {
                    existingTable10.setNbChbArr188(table10.getNbChbArr188());
                }
                if (table10.getNbChbDep189() != null) {
                    existingTable10.setNbChbDep189(table10.getNbChbDep189());
                }
                if (table10.getNbChbAnn190() != null) {
                    existingTable10.setNbChbAnn190(table10.getNbChbAnn190());
                }
                if (table10.getNbChbNoshow191() != null) {
                    existingTable10.setNbChbNoshow191(table10.getNbChbNoshow191());
                }
                if (table10.getRevenuNetChambre192() != null) {
                    existingTable10.setRevenuNetChambre192(table10.getRevenuNetChambre192());
                }
                if (table10.getRevenuTaxeChambre193() != null) {
                    existingTable10.setRevenuTaxeChambre193(table10.getRevenuTaxeChambre193());
                }
                if (table10.getRevenuNetChambreGlobal194() != null) {
                    existingTable10.setRevenuNetChambreGlobal194(table10.getRevenuNetChambreGlobal194());
                }
                if (table10.getRevenuTaxeChambreGlobal195() != null) {
                    existingTable10.setRevenuTaxeChambreGlobal195(table10.getRevenuTaxeChambreGlobal195());
                }
                if (table10.getRevenuNetBq196() != null) {
                    existingTable10.setRevenuNetBq196(table10.getRevenuNetBq196());
                }
                if (table10.getRevenuTaxeBq197() != null) {
                    existingTable10.setRevenuTaxeBq197(table10.getRevenuTaxeBq197());
                }
                if (table10.getRevenuNetBqGlobal198() != null) {
                    existingTable10.setRevenuNetBqGlobal198(table10.getRevenuNetBqGlobal198());
                }
                if (table10.getRevenuTaxeBqGlobal199() != null) {
                    existingTable10.setRevenuTaxeBqGlobal199(table10.getRevenuTaxeBqGlobal199());
                }
                if (table10.getRevenuNetExtra200() != null) {
                    existingTable10.setRevenuNetExtra200(table10.getRevenuNetExtra200());
                }
                if (table10.getRevenuTaxeExtra201() != null) {
                    existingTable10.setRevenuTaxeExtra201(table10.getRevenuTaxeExtra201());
                }
                if (table10.getRevenuNetExtraGlobal202() != null) {
                    existingTable10.setRevenuNetExtraGlobal202(table10.getRevenuNetExtraGlobal202());
                }
                if (table10.getRevenuTaxeExtraGlobal203() != null) {
                    existingTable10.setRevenuTaxeExtraGlobal203(table10.getRevenuTaxeExtraGlobal203());
                }
                if (table10.getRevenuNetTotal204() != null) {
                    existingTable10.setRevenuNetTotal204(table10.getRevenuNetTotal204());
                }
                if (table10.getRevenuTaxeTotal205() != null) {
                    existingTable10.setRevenuTaxeTotal205(table10.getRevenuTaxeTotal205());
                }
                if (table10.getRevenuNetTotalGlobal206() != null) {
                    existingTable10.setRevenuNetTotalGlobal206(table10.getRevenuNetTotalGlobal206());
                }
                if (table10.getRevenuTaxeTotalGlobal207() != null) {
                    existingTable10.setRevenuTaxeTotalGlobal207(table10.getRevenuTaxeTotalGlobal207());
                }
                if (table10.getProdRevenuChambre208() != null) {
                    existingTable10.setProdRevenuChambre208(table10.getProdRevenuChambre208());
                }
                if (table10.getProdRevenuBq209() != null) {
                    existingTable10.setProdRevenuBq209(table10.getProdRevenuBq209());
                }
                if (table10.getProdRevenuExtra210() != null) {
                    existingTable10.setProdRevenuExtra210(table10.getProdRevenuExtra210());
                }
                if (table10.getProdRevenuTotal211() != null) {
                    existingTable10.setProdRevenuTotal211(table10.getProdRevenuTotal211());
                }
                if (table10.getProdChambreNbNuitees212() != null) {
                    existingTable10.setProdChambreNbNuitees212(table10.getProdChambreNbNuitees212());
                }
                if (table10.getTechCreateDate213() != null) {
                    existingTable10.setTechCreateDate213(table10.getTechCreateDate213());
                }
                if (table10.getTechUpdateDate214() != null) {
                    existingTable10.setTechUpdateDate214(table10.getTechUpdateDate214());
                }
                if (table10.getNumLigne215() != null) {
                    existingTable10.setNumLigne215(table10.getNumLigne215());
                }
                if (table10.getResort216() != null) {
                    existingTable10.setResort216(table10.getResort216());
                }
                if (table10.getResvNameId217() != null) {
                    existingTable10.setResvNameId217(table10.getResvNameId217());
                }
                if (table10.getClientOId218() != null) {
                    existingTable10.setClientOId218(table10.getClientOId218());
                }
                if (table10.getTypeChb219() != null) {
                    existingTable10.setTypeChb219(table10.getTypeChb219());
                }
                if (table10.getConfirmationNo220() != null) {
                    existingTable10.setConfirmationNo220(table10.getConfirmationNo220());
                }
                if (table10.getClientMdmId221() != null) {
                    existingTable10.setClientMdmId221(table10.getClientMdmId221());
                }
                if (table10.getNameId222() != null) {
                    existingTable10.setNameId222(table10.getNameId222());
                }
                if (table10.getParentResvNameId223() != null) {
                    existingTable10.setParentResvNameId223(table10.getParentResvNameId223());
                }
                if (table10.getContactId224() != null) {
                    existingTable10.setContactId224(table10.getContactId224());
                }
                if (table10.getAgenceId225() != null) {
                    existingTable10.setAgenceId225(table10.getAgenceId225());
                }
                if (table10.getAgenceNom226() != null) {
                    existingTable10.setAgenceNom226(table10.getAgenceNom226());
                }
                if (table10.getSocieteId227() != null) {
                    existingTable10.setSocieteId227(table10.getSocieteId227());
                }
                if (table10.getGroupeId228() != null) {
                    existingTable10.setGroupeId228(table10.getGroupeId228());
                }
                if (table10.getNumBloc229() != null) {
                    existingTable10.setNumBloc229(table10.getNumBloc229());
                }
                if (table10.getTypeResv230() != null) {
                    existingTable10.setTypeResv230(table10.getTypeResv230());
                }
                if (table10.getStatutResv231() != null) {
                    existingTable10.setStatutResv231(table10.getStatutResv231());
                }
                if (table10.getDateDebutResv232() != null) {
                    existingTable10.setDateDebutResv232(table10.getDateDebutResv232());
                }
                if (table10.getDateFinResv233() != null) {
                    existingTable10.setDateFinResv233(table10.getDateFinResv233());
                }
                if (table10.getTruncDateDebutResv234() != null) {
                    existingTable10.setTruncDateDebutResv234(table10.getTruncDateDebutResv234());
                }
                if (table10.getTruncDateFinResv235() != null) {
                    existingTable10.setTruncDateFinResv235(table10.getTruncDateFinResv235());
                }
                if (table10.getDateAnnResv236() != null) {
                    existingTable10.setDateAnnResv236(table10.getDateAnnResv236());
                }
                if (table10.getPseudoRoomYn237() != null) {
                    existingTable10.setPseudoRoomYn237(table10.getPseudoRoomYn237());
                }
                if (table10.getCreateurResv238() != null) {
                    existingTable10.setCreateurResv238(table10.getCreateurResv238());
                }
                if (table10.getNomCreateurResv239() != null) {
                    existingTable10.setNomCreateurResv239(table10.getNomCreateurResv239());
                }
                if (table10.getCodeGarantie240() != null) {
                    existingTable10.setCodeGarantie240(table10.getCodeGarantie240());
                }
                if (table10.getFlgDed241() != null) {
                    existingTable10.setFlgDed241(table10.getFlgDed241());
                }
                if (table10.getCodePays242() != null) {
                    existingTable10.setCodePays242(table10.getCodePays242());
                }
                if (table10.getLibPays243() != null) {
                    existingTable10.setLibPays243(table10.getLibPays243());
                }
                if (table10.getCodeNationalite244() != null) {
                    existingTable10.setCodeNationalite244(table10.getCodeNationalite244());
                }
                if (table10.getLibNationalite245() != null) {
                    existingTable10.setLibNationalite245(table10.getLibNationalite245());
                }
                if (table10.getCodeSource246() != null) {
                    existingTable10.setCodeSource246(table10.getCodeSource246());
                }
                if (table10.getLibSource247() != null) {
                    existingTable10.setLibSource247(table10.getLibSource247());
                }
                if (table10.getCodeGrandSource248() != null) {
                    existingTable10.setCodeGrandSource248(table10.getCodeGrandSource248());
                }
                if (table10.getCodeOrigine249() != null) {
                    existingTable10.setCodeOrigine249(table10.getCodeOrigine249());
                }
                if (table10.getLibOrigine250() != null) {
                    existingTable10.setLibOrigine250(table10.getLibOrigine250());
                }
                if (table10.getCodeMarche251() != null) {
                    existingTable10.setCodeMarche251(table10.getCodeMarche251());
                }
                if (table10.getLibMarche252() != null) {
                    existingTable10.setLibMarche252(table10.getLibMarche252());
                }
                if (table10.getCodeGrandMarche253() != null) {
                    existingTable10.setCodeGrandMarche253(table10.getCodeGrandMarche253());
                }
                if (table10.getLibGrandMarche254() != null) {
                    existingTable10.setLibGrandMarche254(table10.getLibGrandMarche254());
                }
                if (table10.getCodePrix255() != null) {
                    existingTable10.setCodePrix255(table10.getCodePrix255());
                }
                if (table10.getCategPrix256() != null) {
                    existingTable10.setCategPrix256(table10.getCategPrix256());
                }
                if (table10.getLibPrix257() != null) {
                    existingTable10.setLibPrix257(table10.getLibPrix257());
                }
                if (table10.getNumChb258() != null) {
                    existingTable10.setNumChb258(table10.getNumChb258());
                }
                if (table10.getDescriptionTypeChb259() != null) {
                    existingTable10.setDescriptionTypeChb259(table10.getDescriptionTypeChb259());
                }
                if (table10.getCodeTypeChb260() != null) {
                    existingTable10.setCodeTypeChb260(table10.getCodeTypeChb260());
                }
                if (table10.getClassChb261() != null) {
                    existingTable10.setClassChb261(table10.getClassChb261());
                }
                if (table10.getCaractChb262() != null) {
                    existingTable10.setCaractChb262(table10.getCaractChb262());
                }
                if (table10.getTypeChbDeReservation263() != null) {
                    existingTable10.setTypeChbDeReservation263(table10.getTypeChbDeReservation263());
                }
                if (table10.getDescriptionTypeChbDeResv264() != null) {
                    existingTable10.setDescriptionTypeChbDeResv264(table10.getDescriptionTypeChbDeResv264());
                }
                if (table10.getCodeTypeChbDeResv265() != null) {
                    existingTable10.setCodeTypeChbDeResv265(table10.getCodeTypeChbDeResv265());
                }
                if (table10.getStatutDeReservation266() != null) {
                    existingTable10.setStatutDeReservation266(table10.getStatutDeReservation266());
                }
                if (table10.getCircuitDistribution267() != null) {
                    existingTable10.setCircuitDistribution267(table10.getCircuitDistribution267());
                }
                if (table10.getCircuitDistribUserRegroup268() != null) {
                    existingTable10.setCircuitDistribUserRegroup268(table10.getCircuitDistribUserRegroup268());
                }
                if (table10.getNumCrs269() != null) {
                    existingTable10.setNumCrs269(table10.getNumCrs269());
                }
                if (table10.getTypeRefCrs270() != null) {
                    existingTable10.setTypeRefCrs270(table10.getTypeRefCrs270());
                }
                if (table10.getCrsInsertDate271() != null) {
                    existingTable10.setCrsInsertDate271(table10.getCrsInsertDate271());
                }
                if (table10.getDateCreaResv272() != null) {
                    existingTable10.setDateCreaResv272(table10.getDateCreaResv272());
                }
                if (table10.getDatePremier273() != null) {
                    existingTable10.setDatePremier273(table10.getDatePremier273());
                }
                if (table10.getStatutPremier274() != null) {
                    existingTable10.setStatutPremier274(table10.getStatutPremier274());
                }
                if (table10.getDateDernier275() != null) {
                    existingTable10.setDateDernier275(table10.getDateDernier275());
                }
                if (table10.getStatutDernier276() != null) {
                    existingTable10.setStatutDernier276(table10.getStatutDernier276());
                }
                if (table10.getDateDernierPseudo277() != null) {
                    existingTable10.setDateDernierPseudo277(table10.getDateDernierPseudo277());
                }
                if (table10.getStatutDernierPseudo278() != null) {
                    existingTable10.setStatutDernierPseudo278(table10.getStatutDernierPseudo278());
                }
                if (table10.getDiffDtCreaAnn279() != null) {
                    existingTable10.setDiffDtCreaAnn279(table10.getDiffDtCreaAnn279());
                }
                if (table10.getDiffDtArrAnn280() != null) {
                    existingTable10.setDiffDtArrAnn280(table10.getDiffDtArrAnn280());
                }
                if (table10.getLeadtime281() != null) {
                    existingTable10.setLeadtime281(table10.getLeadtime281());
                }
                if (table10.getLos282() != null) {
                    existingTable10.setLos282(table10.getLos282());
                }
                if (table10.getOccupantsGroupe283() != null) {
                    existingTable10.setOccupantsGroupe283(table10.getOccupantsGroupe283());
                }
                if (table10.getNbNuitee284() != null) {
                    existingTable10.setNbNuitee284(table10.getNbNuitee284());
                }
                if (table10.getNbNuiteeNnDed285() != null) {
                    existingTable10.setNbNuiteeNnDed285(table10.getNbNuiteeNnDed285());
                }
                if (table10.getNbResvAnn286() != null) {
                    existingTable10.setNbResvAnn286(table10.getNbResvAnn286());
                }
                if (table10.getNbAdu287() != null) {
                    existingTable10.setNbAdu287(table10.getNbAdu287());
                }
                if (table10.getNbEnf288() != null) {
                    existingTable10.setNbEnf288(table10.getNbEnf288());
                }
                if (table10.getNbPersDayU289() != null) {
                    existingTable10.setNbPersDayU289(table10.getNbPersDayU289());
                }
                if (table10.getNbPersArr290() != null) {
                    existingTable10.setNbPersArr290(table10.getNbPersArr290());
                }
                if (table10.getNbPersDep291() != null) {
                    existingTable10.setNbPersDep291(table10.getNbPersDep291());
                }
                if (table10.getNbPersAnn292() != null) {
                    existingTable10.setNbPersAnn292(table10.getNbPersAnn292());
                }
                if (table10.getNbPersNoshow293() != null) {
                    existingTable10.setNbPersNoshow293(table10.getNbPersNoshow293());
                }
                if (table10.getNbChbDayU294() != null) {
                    existingTable10.setNbChbDayU294(table10.getNbChbDayU294());
                }
                if (table10.getNbChbArr295() != null) {
                    existingTable10.setNbChbArr295(table10.getNbChbArr295());
                }
                if (table10.getNbChbDep296() != null) {
                    existingTable10.setNbChbDep296(table10.getNbChbDep296());
                }
                if (table10.getNbChbAnn297() != null) {
                    existingTable10.setNbChbAnn297(table10.getNbChbAnn297());
                }
                if (table10.getNbChbNoshow298() != null) {
                    existingTable10.setNbChbNoshow298(table10.getNbChbNoshow298());
                }
                if (table10.getRevenuNetChambre299() != null) {
                    existingTable10.setRevenuNetChambre299(table10.getRevenuNetChambre299());
                }
                if (table10.getRevenuTaxeChambre300() != null) {
                    existingTable10.setRevenuTaxeChambre300(table10.getRevenuTaxeChambre300());
                }
                if (table10.getRevenuNetChambreGlobal301() != null) {
                    existingTable10.setRevenuNetChambreGlobal301(table10.getRevenuNetChambreGlobal301());
                }
                if (table10.getRevenuTaxeChambreGlobal302() != null) {
                    existingTable10.setRevenuTaxeChambreGlobal302(table10.getRevenuTaxeChambreGlobal302());
                }
                if (table10.getRevenuNetBq303() != null) {
                    existingTable10.setRevenuNetBq303(table10.getRevenuNetBq303());
                }
                if (table10.getRevenuTaxeBq304() != null) {
                    existingTable10.setRevenuTaxeBq304(table10.getRevenuTaxeBq304());
                }
                if (table10.getRevenuNetBqGlobal305() != null) {
                    existingTable10.setRevenuNetBqGlobal305(table10.getRevenuNetBqGlobal305());
                }
                if (table10.getRevenuTaxeBqGlobal306() != null) {
                    existingTable10.setRevenuTaxeBqGlobal306(table10.getRevenuTaxeBqGlobal306());
                }
                if (table10.getRevenuNetExtra307() != null) {
                    existingTable10.setRevenuNetExtra307(table10.getRevenuNetExtra307());
                }
                if (table10.getRevenuTaxeExtra308() != null) {
                    existingTable10.setRevenuTaxeExtra308(table10.getRevenuTaxeExtra308());
                }
                if (table10.getRevenuNetExtraGlobal309() != null) {
                    existingTable10.setRevenuNetExtraGlobal309(table10.getRevenuNetExtraGlobal309());
                }
                if (table10.getRevenuTaxeExtraGlobal310() != null) {
                    existingTable10.setRevenuTaxeExtraGlobal310(table10.getRevenuTaxeExtraGlobal310());
                }

                return existingTable10;
            })
            .map(table10Repository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, table10.getId().toString())
        );
    }

    /**
     * {@code GET  /table-10-s} : get all the table10s.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of table10s in body.
     */
    @GetMapping("")
    public List<Table10> getAllTable10s() {
        log.debug("REST request to get all Table10s");
        return table10Repository.findAll();
    }

    /**
     * {@code GET  /table-10-s/:id} : get the "id" table10.
     *
     * @param id the id of the table10 to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the table10, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Table10> getTable10(@PathVariable("id") Long id) {
        log.debug("REST request to get Table10 : {}", id);
        Optional<Table10> table10 = table10Repository.findById(id);
        return ResponseUtil.wrapOrNotFound(table10);
    }

    /**
     * {@code DELETE  /table-10-s/:id} : delete the "id" table10.
     *
     * @param id the id of the table10 to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTable10(@PathVariable("id") Long id) {
        log.debug("REST request to delete Table10 : {}", id);
        table10Repository.deleteById(id);
        return ResponseEntity.noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
