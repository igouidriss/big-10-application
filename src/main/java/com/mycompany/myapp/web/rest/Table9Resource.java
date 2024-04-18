package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Table9;
import com.mycompany.myapp.repository.Table9Repository;
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
 * REST controller for managing {@link com.mycompany.myapp.domain.Table9}.
 */
@RestController
@RequestMapping("/api/table-9-s")
@Transactional
public class Table9Resource {

    private final Logger log = LoggerFactory.getLogger(Table9Resource.class);

    private static final String ENTITY_NAME = "table9";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final Table9Repository table9Repository;

    public Table9Resource(Table9Repository table9Repository) {
        this.table9Repository = table9Repository;
    }

    /**
     * {@code POST  /table-9-s} : Create a new table9.
     *
     * @param table9 the table9 to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new table9, or with status {@code 400 (Bad Request)} if the table9 has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("")
    public ResponseEntity<Table9> createTable9(@RequestBody Table9 table9) throws URISyntaxException {
        log.debug("REST request to save Table9 : {}", table9);
        if (table9.getId() != null) {
            throw new BadRequestAlertException("A new table9 cannot already have an ID", ENTITY_NAME, "idexists");
        }
        table9 = table9Repository.save(table9);
        return ResponseEntity.created(new URI("/api/table-9-s/" + table9.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, table9.getId().toString()))
            .body(table9);
    }

    /**
     * {@code PUT  /table-9-s/:id} : Updates an existing table9.
     *
     * @param id the id of the table9 to save.
     * @param table9 the table9 to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated table9,
     * or with status {@code 400 (Bad Request)} if the table9 is not valid,
     * or with status {@code 500 (Internal Server Error)} if the table9 couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Table9> updateTable9(@PathVariable(value = "id", required = false) final Long id, @RequestBody Table9 table9)
        throws URISyntaxException {
        log.debug("REST request to update Table9 : {}, {}", id, table9);
        if (table9.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, table9.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!table9Repository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        table9 = table9Repository.save(table9);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, table9.getId().toString()))
            .body(table9);
    }

    /**
     * {@code PATCH  /table-9-s/:id} : Partial updates given fields of an existing table9, field will ignore if it is null
     *
     * @param id the id of the table9 to save.
     * @param table9 the table9 to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated table9,
     * or with status {@code 400 (Bad Request)} if the table9 is not valid,
     * or with status {@code 404 (Not Found)} if the table9 is not found,
     * or with status {@code 500 (Internal Server Error)} if the table9 couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<Table9> partialUpdateTable9(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody Table9 table9
    ) throws URISyntaxException {
        log.debug("REST request to partial update Table9 partially : {}, {}", id, table9);
        if (table9.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, table9.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!table9Repository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<Table9> result = table9Repository
            .findById(table9.getId())
            .map(existingTable9 -> {
                if (table9.getNumLigne1() != null) {
                    existingTable9.setNumLigne1(table9.getNumLigne1());
                }
                if (table9.getResort2() != null) {
                    existingTable9.setResort2(table9.getResort2());
                }
                if (table9.getResvNameId3() != null) {
                    existingTable9.setResvNameId3(table9.getResvNameId3());
                }
                if (table9.getClientOId4() != null) {
                    existingTable9.setClientOId4(table9.getClientOId4());
                }
                if (table9.getTypeChb5() != null) {
                    existingTable9.setTypeChb5(table9.getTypeChb5());
                }
                if (table9.getConfirmationNo6() != null) {
                    existingTable9.setConfirmationNo6(table9.getConfirmationNo6());
                }
                if (table9.getClientMdmId7() != null) {
                    existingTable9.setClientMdmId7(table9.getClientMdmId7());
                }
                if (table9.getNameId8() != null) {
                    existingTable9.setNameId8(table9.getNameId8());
                }
                if (table9.getParentResvNameId9() != null) {
                    existingTable9.setParentResvNameId9(table9.getParentResvNameId9());
                }
                if (table9.getContactId10() != null) {
                    existingTable9.setContactId10(table9.getContactId10());
                }
                if (table9.getAgenceId11() != null) {
                    existingTable9.setAgenceId11(table9.getAgenceId11());
                }
                if (table9.getAgenceNom12() != null) {
                    existingTable9.setAgenceNom12(table9.getAgenceNom12());
                }
                if (table9.getSocieteId13() != null) {
                    existingTable9.setSocieteId13(table9.getSocieteId13());
                }
                if (table9.getGroupeId14() != null) {
                    existingTable9.setGroupeId14(table9.getGroupeId14());
                }
                if (table9.getNumBloc15() != null) {
                    existingTable9.setNumBloc15(table9.getNumBloc15());
                }
                if (table9.getTypeResv16() != null) {
                    existingTable9.setTypeResv16(table9.getTypeResv16());
                }
                if (table9.getStatutResv17() != null) {
                    existingTable9.setStatutResv17(table9.getStatutResv17());
                }
                if (table9.getDateDebutResv18() != null) {
                    existingTable9.setDateDebutResv18(table9.getDateDebutResv18());
                }
                if (table9.getDateFinResv19() != null) {
                    existingTable9.setDateFinResv19(table9.getDateFinResv19());
                }
                if (table9.getTruncDateDebutResv20() != null) {
                    existingTable9.setTruncDateDebutResv20(table9.getTruncDateDebutResv20());
                }
                if (table9.getTruncDateFinResv21() != null) {
                    existingTable9.setTruncDateFinResv21(table9.getTruncDateFinResv21());
                }
                if (table9.getDateAnnResv22() != null) {
                    existingTable9.setDateAnnResv22(table9.getDateAnnResv22());
                }
                if (table9.getPseudoRoomYn23() != null) {
                    existingTable9.setPseudoRoomYn23(table9.getPseudoRoomYn23());
                }
                if (table9.getCreateurResv24() != null) {
                    existingTable9.setCreateurResv24(table9.getCreateurResv24());
                }
                if (table9.getNomCreateurResv25() != null) {
                    existingTable9.setNomCreateurResv25(table9.getNomCreateurResv25());
                }
                if (table9.getCodeGarantie26() != null) {
                    existingTable9.setCodeGarantie26(table9.getCodeGarantie26());
                }
                if (table9.getFlgDed27() != null) {
                    existingTable9.setFlgDed27(table9.getFlgDed27());
                }
                if (table9.getCodePays28() != null) {
                    existingTable9.setCodePays28(table9.getCodePays28());
                }
                if (table9.getLibPays29() != null) {
                    existingTable9.setLibPays29(table9.getLibPays29());
                }
                if (table9.getCodeNationalite30() != null) {
                    existingTable9.setCodeNationalite30(table9.getCodeNationalite30());
                }
                if (table9.getLibNationalite31() != null) {
                    existingTable9.setLibNationalite31(table9.getLibNationalite31());
                }
                if (table9.getCodeSource32() != null) {
                    existingTable9.setCodeSource32(table9.getCodeSource32());
                }
                if (table9.getLibSource33() != null) {
                    existingTable9.setLibSource33(table9.getLibSource33());
                }
                if (table9.getCodeGrandSource34() != null) {
                    existingTable9.setCodeGrandSource34(table9.getCodeGrandSource34());
                }
                if (table9.getCodeOrigine35() != null) {
                    existingTable9.setCodeOrigine35(table9.getCodeOrigine35());
                }
                if (table9.getLibOrigine36() != null) {
                    existingTable9.setLibOrigine36(table9.getLibOrigine36());
                }
                if (table9.getCodeMarche37() != null) {
                    existingTable9.setCodeMarche37(table9.getCodeMarche37());
                }
                if (table9.getLibMarche38() != null) {
                    existingTable9.setLibMarche38(table9.getLibMarche38());
                }
                if (table9.getCodeGrandMarche39() != null) {
                    existingTable9.setCodeGrandMarche39(table9.getCodeGrandMarche39());
                }
                if (table9.getLibGrandMarche40() != null) {
                    existingTable9.setLibGrandMarche40(table9.getLibGrandMarche40());
                }
                if (table9.getCodePrix41() != null) {
                    existingTable9.setCodePrix41(table9.getCodePrix41());
                }
                if (table9.getCategPrix42() != null) {
                    existingTable9.setCategPrix42(table9.getCategPrix42());
                }
                if (table9.getLibPrix43() != null) {
                    existingTable9.setLibPrix43(table9.getLibPrix43());
                }
                if (table9.getNumChb44() != null) {
                    existingTable9.setNumChb44(table9.getNumChb44());
                }
                if (table9.getDescriptionTypeChb45() != null) {
                    existingTable9.setDescriptionTypeChb45(table9.getDescriptionTypeChb45());
                }
                if (table9.getCodeTypeChb46() != null) {
                    existingTable9.setCodeTypeChb46(table9.getCodeTypeChb46());
                }
                if (table9.getClassChb47() != null) {
                    existingTable9.setClassChb47(table9.getClassChb47());
                }
                if (table9.getCaractChb48() != null) {
                    existingTable9.setCaractChb48(table9.getCaractChb48());
                }
                if (table9.getTypeChbDeReservation49() != null) {
                    existingTable9.setTypeChbDeReservation49(table9.getTypeChbDeReservation49());
                }
                if (table9.getDescriptionTypeChbDeResv50() != null) {
                    existingTable9.setDescriptionTypeChbDeResv50(table9.getDescriptionTypeChbDeResv50());
                }
                if (table9.getCodeTypeChbDeResv51() != null) {
                    existingTable9.setCodeTypeChbDeResv51(table9.getCodeTypeChbDeResv51());
                }
                if (table9.getStatutDeReservation52() != null) {
                    existingTable9.setStatutDeReservation52(table9.getStatutDeReservation52());
                }
                if (table9.getCircuitDistribution53() != null) {
                    existingTable9.setCircuitDistribution53(table9.getCircuitDistribution53());
                }
                if (table9.getCircuitDistribUserRegroup54() != null) {
                    existingTable9.setCircuitDistribUserRegroup54(table9.getCircuitDistribUserRegroup54());
                }
                if (table9.getNumCrs55() != null) {
                    existingTable9.setNumCrs55(table9.getNumCrs55());
                }
                if (table9.getTypeRefCrs56() != null) {
                    existingTable9.setTypeRefCrs56(table9.getTypeRefCrs56());
                }
                if (table9.getCrsInsertDate57() != null) {
                    existingTable9.setCrsInsertDate57(table9.getCrsInsertDate57());
                }
                if (table9.getDateCreaResv58() != null) {
                    existingTable9.setDateCreaResv58(table9.getDateCreaResv58());
                }
                if (table9.getDatePremier59() != null) {
                    existingTable9.setDatePremier59(table9.getDatePremier59());
                }
                if (table9.getStatutPremier60() != null) {
                    existingTable9.setStatutPremier60(table9.getStatutPremier60());
                }
                if (table9.getDateDernier61() != null) {
                    existingTable9.setDateDernier61(table9.getDateDernier61());
                }
                if (table9.getStatutDernier62() != null) {
                    existingTable9.setStatutDernier62(table9.getStatutDernier62());
                }
                if (table9.getDateDernierPseudo63() != null) {
                    existingTable9.setDateDernierPseudo63(table9.getDateDernierPseudo63());
                }
                if (table9.getStatutDernierPseudo64() != null) {
                    existingTable9.setStatutDernierPseudo64(table9.getStatutDernierPseudo64());
                }
                if (table9.getDiffDtCreaAnn65() != null) {
                    existingTable9.setDiffDtCreaAnn65(table9.getDiffDtCreaAnn65());
                }
                if (table9.getDiffDtArrAnn66() != null) {
                    existingTable9.setDiffDtArrAnn66(table9.getDiffDtArrAnn66());
                }
                if (table9.getLeadtime67() != null) {
                    existingTable9.setLeadtime67(table9.getLeadtime67());
                }
                if (table9.getLos68() != null) {
                    existingTable9.setLos68(table9.getLos68());
                }
                if (table9.getOccupantsGroupe69() != null) {
                    existingTable9.setOccupantsGroupe69(table9.getOccupantsGroupe69());
                }
                if (table9.getNbNuitee70() != null) {
                    existingTable9.setNbNuitee70(table9.getNbNuitee70());
                }
                if (table9.getNbNuiteeNnDed71() != null) {
                    existingTable9.setNbNuiteeNnDed71(table9.getNbNuiteeNnDed71());
                }
                if (table9.getNbResvAnn72() != null) {
                    existingTable9.setNbResvAnn72(table9.getNbResvAnn72());
                }
                if (table9.getNbAdu73() != null) {
                    existingTable9.setNbAdu73(table9.getNbAdu73());
                }
                if (table9.getNbEnf74() != null) {
                    existingTable9.setNbEnf74(table9.getNbEnf74());
                }
                if (table9.getNbPersDayU75() != null) {
                    existingTable9.setNbPersDayU75(table9.getNbPersDayU75());
                }
                if (table9.getNbPersArr76() != null) {
                    existingTable9.setNbPersArr76(table9.getNbPersArr76());
                }
                if (table9.getNbPersDep77() != null) {
                    existingTable9.setNbPersDep77(table9.getNbPersDep77());
                }
                if (table9.getNbPersAnn78() != null) {
                    existingTable9.setNbPersAnn78(table9.getNbPersAnn78());
                }
                if (table9.getNbPersNoshow79() != null) {
                    existingTable9.setNbPersNoshow79(table9.getNbPersNoshow79());
                }
                if (table9.getNbChbDayU80() != null) {
                    existingTable9.setNbChbDayU80(table9.getNbChbDayU80());
                }
                if (table9.getNbChbArr81() != null) {
                    existingTable9.setNbChbArr81(table9.getNbChbArr81());
                }
                if (table9.getNbChbDep82() != null) {
                    existingTable9.setNbChbDep82(table9.getNbChbDep82());
                }
                if (table9.getNbChbAnn83() != null) {
                    existingTable9.setNbChbAnn83(table9.getNbChbAnn83());
                }
                if (table9.getNbChbNoshow84() != null) {
                    existingTable9.setNbChbNoshow84(table9.getNbChbNoshow84());
                }
                if (table9.getRevenuNetChambre85() != null) {
                    existingTable9.setRevenuNetChambre85(table9.getRevenuNetChambre85());
                }
                if (table9.getRevenuTaxeChambre86() != null) {
                    existingTable9.setRevenuTaxeChambre86(table9.getRevenuTaxeChambre86());
                }
                if (table9.getRevenuNetChambreGlobal87() != null) {
                    existingTable9.setRevenuNetChambreGlobal87(table9.getRevenuNetChambreGlobal87());
                }
                if (table9.getRevenuTaxeChambreGlobal88() != null) {
                    existingTable9.setRevenuTaxeChambreGlobal88(table9.getRevenuTaxeChambreGlobal88());
                }
                if (table9.getRevenuNetBq89() != null) {
                    existingTable9.setRevenuNetBq89(table9.getRevenuNetBq89());
                }
                if (table9.getRevenuTaxeBq90() != null) {
                    existingTable9.setRevenuTaxeBq90(table9.getRevenuTaxeBq90());
                }
                if (table9.getRevenuNetBqGlobal91() != null) {
                    existingTable9.setRevenuNetBqGlobal91(table9.getRevenuNetBqGlobal91());
                }
                if (table9.getRevenuTaxeBqGlobal92() != null) {
                    existingTable9.setRevenuTaxeBqGlobal92(table9.getRevenuTaxeBqGlobal92());
                }
                if (table9.getRevenuNetExtra93() != null) {
                    existingTable9.setRevenuNetExtra93(table9.getRevenuNetExtra93());
                }
                if (table9.getRevenuTaxeExtra94() != null) {
                    existingTable9.setRevenuTaxeExtra94(table9.getRevenuTaxeExtra94());
                }
                if (table9.getRevenuNetExtraGlobal95() != null) {
                    existingTable9.setRevenuNetExtraGlobal95(table9.getRevenuNetExtraGlobal95());
                }
                if (table9.getRevenuTaxeExtraGlobal96() != null) {
                    existingTable9.setRevenuTaxeExtraGlobal96(table9.getRevenuTaxeExtraGlobal96());
                }
                if (table9.getRevenuNetTotal97() != null) {
                    existingTable9.setRevenuNetTotal97(table9.getRevenuNetTotal97());
                }
                if (table9.getRevenuTaxeTotal98() != null) {
                    existingTable9.setRevenuTaxeTotal98(table9.getRevenuTaxeTotal98());
                }
                if (table9.getRevenuNetTotalGlobal99() != null) {
                    existingTable9.setRevenuNetTotalGlobal99(table9.getRevenuNetTotalGlobal99());
                }
                if (table9.getRevenuTaxeTotalGlobal100() != null) {
                    existingTable9.setRevenuTaxeTotalGlobal100(table9.getRevenuTaxeTotalGlobal100());
                }
                if (table9.getProdRevenuChambre101() != null) {
                    existingTable9.setProdRevenuChambre101(table9.getProdRevenuChambre101());
                }
                if (table9.getProdRevenuBq102() != null) {
                    existingTable9.setProdRevenuBq102(table9.getProdRevenuBq102());
                }
                if (table9.getProdRevenuExtra103() != null) {
                    existingTable9.setProdRevenuExtra103(table9.getProdRevenuExtra103());
                }
                if (table9.getProdRevenuTotal104() != null) {
                    existingTable9.setProdRevenuTotal104(table9.getProdRevenuTotal104());
                }
                if (table9.getProdChambreNbNuitees105() != null) {
                    existingTable9.setProdChambreNbNuitees105(table9.getProdChambreNbNuitees105());
                }
                if (table9.getTechCreateDate106() != null) {
                    existingTable9.setTechCreateDate106(table9.getTechCreateDate106());
                }
                if (table9.getTechUpdateDate107() != null) {
                    existingTable9.setTechUpdateDate107(table9.getTechUpdateDate107());
                }
                if (table9.getNumLigne108() != null) {
                    existingTable9.setNumLigne108(table9.getNumLigne108());
                }
                if (table9.getResort109() != null) {
                    existingTable9.setResort109(table9.getResort109());
                }
                if (table9.getResvNameId110() != null) {
                    existingTable9.setResvNameId110(table9.getResvNameId110());
                }
                if (table9.getClientOId111() != null) {
                    existingTable9.setClientOId111(table9.getClientOId111());
                }
                if (table9.getTypeChb112() != null) {
                    existingTable9.setTypeChb112(table9.getTypeChb112());
                }
                if (table9.getConfirmationNo113() != null) {
                    existingTable9.setConfirmationNo113(table9.getConfirmationNo113());
                }
                if (table9.getClientMdmId114() != null) {
                    existingTable9.setClientMdmId114(table9.getClientMdmId114());
                }
                if (table9.getNameId115() != null) {
                    existingTable9.setNameId115(table9.getNameId115());
                }
                if (table9.getParentResvNameId116() != null) {
                    existingTable9.setParentResvNameId116(table9.getParentResvNameId116());
                }
                if (table9.getContactId117() != null) {
                    existingTable9.setContactId117(table9.getContactId117());
                }
                if (table9.getAgenceId118() != null) {
                    existingTable9.setAgenceId118(table9.getAgenceId118());
                }
                if (table9.getAgenceNom119() != null) {
                    existingTable9.setAgenceNom119(table9.getAgenceNom119());
                }
                if (table9.getSocieteId120() != null) {
                    existingTable9.setSocieteId120(table9.getSocieteId120());
                }
                if (table9.getGroupeId121() != null) {
                    existingTable9.setGroupeId121(table9.getGroupeId121());
                }
                if (table9.getNumBloc122() != null) {
                    existingTable9.setNumBloc122(table9.getNumBloc122());
                }
                if (table9.getTypeResv123() != null) {
                    existingTable9.setTypeResv123(table9.getTypeResv123());
                }
                if (table9.getStatutResv124() != null) {
                    existingTable9.setStatutResv124(table9.getStatutResv124());
                }
                if (table9.getDateDebutResv125() != null) {
                    existingTable9.setDateDebutResv125(table9.getDateDebutResv125());
                }
                if (table9.getDateFinResv126() != null) {
                    existingTable9.setDateFinResv126(table9.getDateFinResv126());
                }
                if (table9.getTruncDateDebutResv127() != null) {
                    existingTable9.setTruncDateDebutResv127(table9.getTruncDateDebutResv127());
                }
                if (table9.getTruncDateFinResv128() != null) {
                    existingTable9.setTruncDateFinResv128(table9.getTruncDateFinResv128());
                }
                if (table9.getDateAnnResv129() != null) {
                    existingTable9.setDateAnnResv129(table9.getDateAnnResv129());
                }
                if (table9.getPseudoRoomYn130() != null) {
                    existingTable9.setPseudoRoomYn130(table9.getPseudoRoomYn130());
                }
                if (table9.getCreateurResv131() != null) {
                    existingTable9.setCreateurResv131(table9.getCreateurResv131());
                }
                if (table9.getNomCreateurResv132() != null) {
                    existingTable9.setNomCreateurResv132(table9.getNomCreateurResv132());
                }
                if (table9.getCodeGarantie133() != null) {
                    existingTable9.setCodeGarantie133(table9.getCodeGarantie133());
                }
                if (table9.getFlgDed134() != null) {
                    existingTable9.setFlgDed134(table9.getFlgDed134());
                }
                if (table9.getCodePays135() != null) {
                    existingTable9.setCodePays135(table9.getCodePays135());
                }
                if (table9.getLibPays136() != null) {
                    existingTable9.setLibPays136(table9.getLibPays136());
                }
                if (table9.getCodeNationalite137() != null) {
                    existingTable9.setCodeNationalite137(table9.getCodeNationalite137());
                }
                if (table9.getLibNationalite138() != null) {
                    existingTable9.setLibNationalite138(table9.getLibNationalite138());
                }
                if (table9.getCodeSource139() != null) {
                    existingTable9.setCodeSource139(table9.getCodeSource139());
                }
                if (table9.getLibSource140() != null) {
                    existingTable9.setLibSource140(table9.getLibSource140());
                }
                if (table9.getCodeGrandSource141() != null) {
                    existingTable9.setCodeGrandSource141(table9.getCodeGrandSource141());
                }
                if (table9.getCodeOrigine142() != null) {
                    existingTable9.setCodeOrigine142(table9.getCodeOrigine142());
                }
                if (table9.getLibOrigine143() != null) {
                    existingTable9.setLibOrigine143(table9.getLibOrigine143());
                }
                if (table9.getCodeMarche144() != null) {
                    existingTable9.setCodeMarche144(table9.getCodeMarche144());
                }
                if (table9.getLibMarche145() != null) {
                    existingTable9.setLibMarche145(table9.getLibMarche145());
                }
                if (table9.getCodeGrandMarche146() != null) {
                    existingTable9.setCodeGrandMarche146(table9.getCodeGrandMarche146());
                }
                if (table9.getLibGrandMarche147() != null) {
                    existingTable9.setLibGrandMarche147(table9.getLibGrandMarche147());
                }
                if (table9.getCodePrix148() != null) {
                    existingTable9.setCodePrix148(table9.getCodePrix148());
                }
                if (table9.getCategPrix149() != null) {
                    existingTable9.setCategPrix149(table9.getCategPrix149());
                }
                if (table9.getLibPrix150() != null) {
                    existingTable9.setLibPrix150(table9.getLibPrix150());
                }
                if (table9.getNumChb151() != null) {
                    existingTable9.setNumChb151(table9.getNumChb151());
                }
                if (table9.getDescriptionTypeChb152() != null) {
                    existingTable9.setDescriptionTypeChb152(table9.getDescriptionTypeChb152());
                }
                if (table9.getCodeTypeChb153() != null) {
                    existingTable9.setCodeTypeChb153(table9.getCodeTypeChb153());
                }
                if (table9.getClassChb154() != null) {
                    existingTable9.setClassChb154(table9.getClassChb154());
                }
                if (table9.getCaractChb155() != null) {
                    existingTable9.setCaractChb155(table9.getCaractChb155());
                }
                if (table9.getTypeChbDeReservation156() != null) {
                    existingTable9.setTypeChbDeReservation156(table9.getTypeChbDeReservation156());
                }
                if (table9.getDescriptionTypeChbDeResv157() != null) {
                    existingTable9.setDescriptionTypeChbDeResv157(table9.getDescriptionTypeChbDeResv157());
                }
                if (table9.getCodeTypeChbDeResv158() != null) {
                    existingTable9.setCodeTypeChbDeResv158(table9.getCodeTypeChbDeResv158());
                }
                if (table9.getStatutDeReservation159() != null) {
                    existingTable9.setStatutDeReservation159(table9.getStatutDeReservation159());
                }
                if (table9.getCircuitDistribution160() != null) {
                    existingTable9.setCircuitDistribution160(table9.getCircuitDistribution160());
                }
                if (table9.getCircuitDistribUserRegroup161() != null) {
                    existingTable9.setCircuitDistribUserRegroup161(table9.getCircuitDistribUserRegroup161());
                }
                if (table9.getNumCrs162() != null) {
                    existingTable9.setNumCrs162(table9.getNumCrs162());
                }
                if (table9.getTypeRefCrs163() != null) {
                    existingTable9.setTypeRefCrs163(table9.getTypeRefCrs163());
                }
                if (table9.getCrsInsertDate164() != null) {
                    existingTable9.setCrsInsertDate164(table9.getCrsInsertDate164());
                }
                if (table9.getDateCreaResv165() != null) {
                    existingTable9.setDateCreaResv165(table9.getDateCreaResv165());
                }
                if (table9.getDatePremier166() != null) {
                    existingTable9.setDatePremier166(table9.getDatePremier166());
                }
                if (table9.getStatutPremier167() != null) {
                    existingTable9.setStatutPremier167(table9.getStatutPremier167());
                }
                if (table9.getDateDernier168() != null) {
                    existingTable9.setDateDernier168(table9.getDateDernier168());
                }
                if (table9.getStatutDernier169() != null) {
                    existingTable9.setStatutDernier169(table9.getStatutDernier169());
                }
                if (table9.getDateDernierPseudo170() != null) {
                    existingTable9.setDateDernierPseudo170(table9.getDateDernierPseudo170());
                }
                if (table9.getStatutDernierPseudo171() != null) {
                    existingTable9.setStatutDernierPseudo171(table9.getStatutDernierPseudo171());
                }
                if (table9.getDiffDtCreaAnn172() != null) {
                    existingTable9.setDiffDtCreaAnn172(table9.getDiffDtCreaAnn172());
                }
                if (table9.getDiffDtArrAnn173() != null) {
                    existingTable9.setDiffDtArrAnn173(table9.getDiffDtArrAnn173());
                }
                if (table9.getLeadtime174() != null) {
                    existingTable9.setLeadtime174(table9.getLeadtime174());
                }
                if (table9.getLos175() != null) {
                    existingTable9.setLos175(table9.getLos175());
                }
                if (table9.getOccupantsGroupe176() != null) {
                    existingTable9.setOccupantsGroupe176(table9.getOccupantsGroupe176());
                }
                if (table9.getNbNuitee177() != null) {
                    existingTable9.setNbNuitee177(table9.getNbNuitee177());
                }
                if (table9.getNbNuiteeNnDed178() != null) {
                    existingTable9.setNbNuiteeNnDed178(table9.getNbNuiteeNnDed178());
                }
                if (table9.getNbResvAnn179() != null) {
                    existingTable9.setNbResvAnn179(table9.getNbResvAnn179());
                }
                if (table9.getNbAdu180() != null) {
                    existingTable9.setNbAdu180(table9.getNbAdu180());
                }
                if (table9.getNbEnf181() != null) {
                    existingTable9.setNbEnf181(table9.getNbEnf181());
                }
                if (table9.getNbPersDayU182() != null) {
                    existingTable9.setNbPersDayU182(table9.getNbPersDayU182());
                }
                if (table9.getNbPersArr183() != null) {
                    existingTable9.setNbPersArr183(table9.getNbPersArr183());
                }
                if (table9.getNbPersDep184() != null) {
                    existingTable9.setNbPersDep184(table9.getNbPersDep184());
                }
                if (table9.getNbPersAnn185() != null) {
                    existingTable9.setNbPersAnn185(table9.getNbPersAnn185());
                }
                if (table9.getNbPersNoshow186() != null) {
                    existingTable9.setNbPersNoshow186(table9.getNbPersNoshow186());
                }
                if (table9.getNbChbDayU187() != null) {
                    existingTable9.setNbChbDayU187(table9.getNbChbDayU187());
                }
                if (table9.getNbChbArr188() != null) {
                    existingTable9.setNbChbArr188(table9.getNbChbArr188());
                }
                if (table9.getNbChbDep189() != null) {
                    existingTable9.setNbChbDep189(table9.getNbChbDep189());
                }
                if (table9.getNbChbAnn190() != null) {
                    existingTable9.setNbChbAnn190(table9.getNbChbAnn190());
                }
                if (table9.getNbChbNoshow191() != null) {
                    existingTable9.setNbChbNoshow191(table9.getNbChbNoshow191());
                }
                if (table9.getRevenuNetChambre192() != null) {
                    existingTable9.setRevenuNetChambre192(table9.getRevenuNetChambre192());
                }
                if (table9.getRevenuTaxeChambre193() != null) {
                    existingTable9.setRevenuTaxeChambre193(table9.getRevenuTaxeChambre193());
                }
                if (table9.getRevenuNetChambreGlobal194() != null) {
                    existingTable9.setRevenuNetChambreGlobal194(table9.getRevenuNetChambreGlobal194());
                }
                if (table9.getRevenuTaxeChambreGlobal195() != null) {
                    existingTable9.setRevenuTaxeChambreGlobal195(table9.getRevenuTaxeChambreGlobal195());
                }
                if (table9.getRevenuNetBq196() != null) {
                    existingTable9.setRevenuNetBq196(table9.getRevenuNetBq196());
                }
                if (table9.getRevenuTaxeBq197() != null) {
                    existingTable9.setRevenuTaxeBq197(table9.getRevenuTaxeBq197());
                }
                if (table9.getRevenuNetBqGlobal198() != null) {
                    existingTable9.setRevenuNetBqGlobal198(table9.getRevenuNetBqGlobal198());
                }
                if (table9.getRevenuTaxeBqGlobal199() != null) {
                    existingTable9.setRevenuTaxeBqGlobal199(table9.getRevenuTaxeBqGlobal199());
                }
                if (table9.getRevenuNetExtra200() != null) {
                    existingTable9.setRevenuNetExtra200(table9.getRevenuNetExtra200());
                }
                if (table9.getRevenuTaxeExtra201() != null) {
                    existingTable9.setRevenuTaxeExtra201(table9.getRevenuTaxeExtra201());
                }
                if (table9.getRevenuNetExtraGlobal202() != null) {
                    existingTable9.setRevenuNetExtraGlobal202(table9.getRevenuNetExtraGlobal202());
                }
                if (table9.getRevenuTaxeExtraGlobal203() != null) {
                    existingTable9.setRevenuTaxeExtraGlobal203(table9.getRevenuTaxeExtraGlobal203());
                }
                if (table9.getRevenuNetTotal204() != null) {
                    existingTable9.setRevenuNetTotal204(table9.getRevenuNetTotal204());
                }
                if (table9.getRevenuTaxeTotal205() != null) {
                    existingTable9.setRevenuTaxeTotal205(table9.getRevenuTaxeTotal205());
                }
                if (table9.getRevenuNetTotalGlobal206() != null) {
                    existingTable9.setRevenuNetTotalGlobal206(table9.getRevenuNetTotalGlobal206());
                }
                if (table9.getRevenuTaxeTotalGlobal207() != null) {
                    existingTable9.setRevenuTaxeTotalGlobal207(table9.getRevenuTaxeTotalGlobal207());
                }
                if (table9.getProdRevenuChambre208() != null) {
                    existingTable9.setProdRevenuChambre208(table9.getProdRevenuChambre208());
                }
                if (table9.getProdRevenuBq209() != null) {
                    existingTable9.setProdRevenuBq209(table9.getProdRevenuBq209());
                }
                if (table9.getProdRevenuExtra210() != null) {
                    existingTable9.setProdRevenuExtra210(table9.getProdRevenuExtra210());
                }
                if (table9.getProdRevenuTotal211() != null) {
                    existingTable9.setProdRevenuTotal211(table9.getProdRevenuTotal211());
                }
                if (table9.getProdChambreNbNuitees212() != null) {
                    existingTable9.setProdChambreNbNuitees212(table9.getProdChambreNbNuitees212());
                }
                if (table9.getTechCreateDate213() != null) {
                    existingTable9.setTechCreateDate213(table9.getTechCreateDate213());
                }
                if (table9.getTechUpdateDate214() != null) {
                    existingTable9.setTechUpdateDate214(table9.getTechUpdateDate214());
                }
                if (table9.getNumLigne215() != null) {
                    existingTable9.setNumLigne215(table9.getNumLigne215());
                }
                if (table9.getResort216() != null) {
                    existingTable9.setResort216(table9.getResort216());
                }
                if (table9.getResvNameId217() != null) {
                    existingTable9.setResvNameId217(table9.getResvNameId217());
                }
                if (table9.getClientOId218() != null) {
                    existingTable9.setClientOId218(table9.getClientOId218());
                }
                if (table9.getTypeChb219() != null) {
                    existingTable9.setTypeChb219(table9.getTypeChb219());
                }
                if (table9.getConfirmationNo220() != null) {
                    existingTable9.setConfirmationNo220(table9.getConfirmationNo220());
                }
                if (table9.getClientMdmId221() != null) {
                    existingTable9.setClientMdmId221(table9.getClientMdmId221());
                }
                if (table9.getNameId222() != null) {
                    existingTable9.setNameId222(table9.getNameId222());
                }
                if (table9.getParentResvNameId223() != null) {
                    existingTable9.setParentResvNameId223(table9.getParentResvNameId223());
                }
                if (table9.getContactId224() != null) {
                    existingTable9.setContactId224(table9.getContactId224());
                }
                if (table9.getAgenceId225() != null) {
                    existingTable9.setAgenceId225(table9.getAgenceId225());
                }
                if (table9.getAgenceNom226() != null) {
                    existingTable9.setAgenceNom226(table9.getAgenceNom226());
                }
                if (table9.getSocieteId227() != null) {
                    existingTable9.setSocieteId227(table9.getSocieteId227());
                }
                if (table9.getGroupeId228() != null) {
                    existingTable9.setGroupeId228(table9.getGroupeId228());
                }
                if (table9.getNumBloc229() != null) {
                    existingTable9.setNumBloc229(table9.getNumBloc229());
                }
                if (table9.getTypeResv230() != null) {
                    existingTable9.setTypeResv230(table9.getTypeResv230());
                }
                if (table9.getStatutResv231() != null) {
                    existingTable9.setStatutResv231(table9.getStatutResv231());
                }
                if (table9.getDateDebutResv232() != null) {
                    existingTable9.setDateDebutResv232(table9.getDateDebutResv232());
                }
                if (table9.getDateFinResv233() != null) {
                    existingTable9.setDateFinResv233(table9.getDateFinResv233());
                }
                if (table9.getTruncDateDebutResv234() != null) {
                    existingTable9.setTruncDateDebutResv234(table9.getTruncDateDebutResv234());
                }
                if (table9.getTruncDateFinResv235() != null) {
                    existingTable9.setTruncDateFinResv235(table9.getTruncDateFinResv235());
                }
                if (table9.getDateAnnResv236() != null) {
                    existingTable9.setDateAnnResv236(table9.getDateAnnResv236());
                }
                if (table9.getPseudoRoomYn237() != null) {
                    existingTable9.setPseudoRoomYn237(table9.getPseudoRoomYn237());
                }
                if (table9.getCreateurResv238() != null) {
                    existingTable9.setCreateurResv238(table9.getCreateurResv238());
                }
                if (table9.getNomCreateurResv239() != null) {
                    existingTable9.setNomCreateurResv239(table9.getNomCreateurResv239());
                }
                if (table9.getCodeGarantie240() != null) {
                    existingTable9.setCodeGarantie240(table9.getCodeGarantie240());
                }
                if (table9.getFlgDed241() != null) {
                    existingTable9.setFlgDed241(table9.getFlgDed241());
                }
                if (table9.getCodePays242() != null) {
                    existingTable9.setCodePays242(table9.getCodePays242());
                }
                if (table9.getLibPays243() != null) {
                    existingTable9.setLibPays243(table9.getLibPays243());
                }
                if (table9.getCodeNationalite244() != null) {
                    existingTable9.setCodeNationalite244(table9.getCodeNationalite244());
                }
                if (table9.getLibNationalite245() != null) {
                    existingTable9.setLibNationalite245(table9.getLibNationalite245());
                }
                if (table9.getCodeSource246() != null) {
                    existingTable9.setCodeSource246(table9.getCodeSource246());
                }
                if (table9.getLibSource247() != null) {
                    existingTable9.setLibSource247(table9.getLibSource247());
                }
                if (table9.getCodeGrandSource248() != null) {
                    existingTable9.setCodeGrandSource248(table9.getCodeGrandSource248());
                }
                if (table9.getCodeOrigine249() != null) {
                    existingTable9.setCodeOrigine249(table9.getCodeOrigine249());
                }
                if (table9.getLibOrigine250() != null) {
                    existingTable9.setLibOrigine250(table9.getLibOrigine250());
                }
                if (table9.getCodeMarche251() != null) {
                    existingTable9.setCodeMarche251(table9.getCodeMarche251());
                }
                if (table9.getLibMarche252() != null) {
                    existingTable9.setLibMarche252(table9.getLibMarche252());
                }
                if (table9.getCodeGrandMarche253() != null) {
                    existingTable9.setCodeGrandMarche253(table9.getCodeGrandMarche253());
                }
                if (table9.getLibGrandMarche254() != null) {
                    existingTable9.setLibGrandMarche254(table9.getLibGrandMarche254());
                }
                if (table9.getCodePrix255() != null) {
                    existingTable9.setCodePrix255(table9.getCodePrix255());
                }
                if (table9.getCategPrix256() != null) {
                    existingTable9.setCategPrix256(table9.getCategPrix256());
                }
                if (table9.getLibPrix257() != null) {
                    existingTable9.setLibPrix257(table9.getLibPrix257());
                }
                if (table9.getNumChb258() != null) {
                    existingTable9.setNumChb258(table9.getNumChb258());
                }
                if (table9.getDescriptionTypeChb259() != null) {
                    existingTable9.setDescriptionTypeChb259(table9.getDescriptionTypeChb259());
                }
                if (table9.getCodeTypeChb260() != null) {
                    existingTable9.setCodeTypeChb260(table9.getCodeTypeChb260());
                }
                if (table9.getClassChb261() != null) {
                    existingTable9.setClassChb261(table9.getClassChb261());
                }
                if (table9.getCaractChb262() != null) {
                    existingTable9.setCaractChb262(table9.getCaractChb262());
                }
                if (table9.getTypeChbDeReservation263() != null) {
                    existingTable9.setTypeChbDeReservation263(table9.getTypeChbDeReservation263());
                }
                if (table9.getDescriptionTypeChbDeResv264() != null) {
                    existingTable9.setDescriptionTypeChbDeResv264(table9.getDescriptionTypeChbDeResv264());
                }
                if (table9.getCodeTypeChbDeResv265() != null) {
                    existingTable9.setCodeTypeChbDeResv265(table9.getCodeTypeChbDeResv265());
                }
                if (table9.getStatutDeReservation266() != null) {
                    existingTable9.setStatutDeReservation266(table9.getStatutDeReservation266());
                }
                if (table9.getCircuitDistribution267() != null) {
                    existingTable9.setCircuitDistribution267(table9.getCircuitDistribution267());
                }
                if (table9.getCircuitDistribUserRegroup268() != null) {
                    existingTable9.setCircuitDistribUserRegroup268(table9.getCircuitDistribUserRegroup268());
                }
                if (table9.getNumCrs269() != null) {
                    existingTable9.setNumCrs269(table9.getNumCrs269());
                }
                if (table9.getTypeRefCrs270() != null) {
                    existingTable9.setTypeRefCrs270(table9.getTypeRefCrs270());
                }
                if (table9.getCrsInsertDate271() != null) {
                    existingTable9.setCrsInsertDate271(table9.getCrsInsertDate271());
                }
                if (table9.getDateCreaResv272() != null) {
                    existingTable9.setDateCreaResv272(table9.getDateCreaResv272());
                }
                if (table9.getDatePremier273() != null) {
                    existingTable9.setDatePremier273(table9.getDatePremier273());
                }
                if (table9.getStatutPremier274() != null) {
                    existingTable9.setStatutPremier274(table9.getStatutPremier274());
                }
                if (table9.getDateDernier275() != null) {
                    existingTable9.setDateDernier275(table9.getDateDernier275());
                }
                if (table9.getStatutDernier276() != null) {
                    existingTable9.setStatutDernier276(table9.getStatutDernier276());
                }
                if (table9.getDateDernierPseudo277() != null) {
                    existingTable9.setDateDernierPseudo277(table9.getDateDernierPseudo277());
                }
                if (table9.getStatutDernierPseudo278() != null) {
                    existingTable9.setStatutDernierPseudo278(table9.getStatutDernierPseudo278());
                }
                if (table9.getDiffDtCreaAnn279() != null) {
                    existingTable9.setDiffDtCreaAnn279(table9.getDiffDtCreaAnn279());
                }
                if (table9.getDiffDtArrAnn280() != null) {
                    existingTable9.setDiffDtArrAnn280(table9.getDiffDtArrAnn280());
                }
                if (table9.getLeadtime281() != null) {
                    existingTable9.setLeadtime281(table9.getLeadtime281());
                }
                if (table9.getLos282() != null) {
                    existingTable9.setLos282(table9.getLos282());
                }
                if (table9.getOccupantsGroupe283() != null) {
                    existingTable9.setOccupantsGroupe283(table9.getOccupantsGroupe283());
                }
                if (table9.getNbNuitee284() != null) {
                    existingTable9.setNbNuitee284(table9.getNbNuitee284());
                }
                if (table9.getNbNuiteeNnDed285() != null) {
                    existingTable9.setNbNuiteeNnDed285(table9.getNbNuiteeNnDed285());
                }
                if (table9.getNbResvAnn286() != null) {
                    existingTable9.setNbResvAnn286(table9.getNbResvAnn286());
                }
                if (table9.getNbAdu287() != null) {
                    existingTable9.setNbAdu287(table9.getNbAdu287());
                }
                if (table9.getNbEnf288() != null) {
                    existingTable9.setNbEnf288(table9.getNbEnf288());
                }
                if (table9.getNbPersDayU289() != null) {
                    existingTable9.setNbPersDayU289(table9.getNbPersDayU289());
                }
                if (table9.getNbPersArr290() != null) {
                    existingTable9.setNbPersArr290(table9.getNbPersArr290());
                }
                if (table9.getNbPersDep291() != null) {
                    existingTable9.setNbPersDep291(table9.getNbPersDep291());
                }
                if (table9.getNbPersAnn292() != null) {
                    existingTable9.setNbPersAnn292(table9.getNbPersAnn292());
                }
                if (table9.getNbPersNoshow293() != null) {
                    existingTable9.setNbPersNoshow293(table9.getNbPersNoshow293());
                }
                if (table9.getNbChbDayU294() != null) {
                    existingTable9.setNbChbDayU294(table9.getNbChbDayU294());
                }
                if (table9.getNbChbArr295() != null) {
                    existingTable9.setNbChbArr295(table9.getNbChbArr295());
                }
                if (table9.getNbChbDep296() != null) {
                    existingTable9.setNbChbDep296(table9.getNbChbDep296());
                }
                if (table9.getNbChbAnn297() != null) {
                    existingTable9.setNbChbAnn297(table9.getNbChbAnn297());
                }
                if (table9.getNbChbNoshow298() != null) {
                    existingTable9.setNbChbNoshow298(table9.getNbChbNoshow298());
                }
                if (table9.getRevenuNetChambre299() != null) {
                    existingTable9.setRevenuNetChambre299(table9.getRevenuNetChambre299());
                }
                if (table9.getRevenuTaxeChambre300() != null) {
                    existingTable9.setRevenuTaxeChambre300(table9.getRevenuTaxeChambre300());
                }
                if (table9.getRevenuNetChambreGlobal301() != null) {
                    existingTable9.setRevenuNetChambreGlobal301(table9.getRevenuNetChambreGlobal301());
                }
                if (table9.getRevenuTaxeChambreGlobal302() != null) {
                    existingTable9.setRevenuTaxeChambreGlobal302(table9.getRevenuTaxeChambreGlobal302());
                }
                if (table9.getRevenuNetBq303() != null) {
                    existingTable9.setRevenuNetBq303(table9.getRevenuNetBq303());
                }
                if (table9.getRevenuTaxeBq304() != null) {
                    existingTable9.setRevenuTaxeBq304(table9.getRevenuTaxeBq304());
                }
                if (table9.getRevenuNetBqGlobal305() != null) {
                    existingTable9.setRevenuNetBqGlobal305(table9.getRevenuNetBqGlobal305());
                }
                if (table9.getRevenuTaxeBqGlobal306() != null) {
                    existingTable9.setRevenuTaxeBqGlobal306(table9.getRevenuTaxeBqGlobal306());
                }
                if (table9.getRevenuNetExtra307() != null) {
                    existingTable9.setRevenuNetExtra307(table9.getRevenuNetExtra307());
                }
                if (table9.getRevenuTaxeExtra308() != null) {
                    existingTable9.setRevenuTaxeExtra308(table9.getRevenuTaxeExtra308());
                }
                if (table9.getRevenuNetExtraGlobal309() != null) {
                    existingTable9.setRevenuNetExtraGlobal309(table9.getRevenuNetExtraGlobal309());
                }
                if (table9.getRevenuTaxeExtraGlobal310() != null) {
                    existingTable9.setRevenuTaxeExtraGlobal310(table9.getRevenuTaxeExtraGlobal310());
                }

                return existingTable9;
            })
            .map(table9Repository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, table9.getId().toString())
        );
    }

    /**
     * {@code GET  /table-9-s} : get all the table9s.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of table9s in body.
     */
    @GetMapping("")
    public List<Table9> getAllTable9s() {
        log.debug("REST request to get all Table9s");
        return table9Repository.findAll();
    }

    /**
     * {@code GET  /table-9-s/:id} : get the "id" table9.
     *
     * @param id the id of the table9 to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the table9, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Table9> getTable9(@PathVariable("id") Long id) {
        log.debug("REST request to get Table9 : {}", id);
        Optional<Table9> table9 = table9Repository.findById(id);
        return ResponseUtil.wrapOrNotFound(table9);
    }

    /**
     * {@code DELETE  /table-9-s/:id} : delete the "id" table9.
     *
     * @param id the id of the table9 to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTable9(@PathVariable("id") Long id) {
        log.debug("REST request to delete Table9 : {}", id);
        table9Repository.deleteById(id);
        return ResponseEntity.noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
