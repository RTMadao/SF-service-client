package com.salcedoFawcett.services.clientService.domain.model;

public class PartyIdentification {

    private int id;
    private double partyIdentificationId;
    private int partyIdentificationSchemeId;
    private int partyIdentificationSchemeName;

    public PartyIdentification() {
    }

    public PartyIdentification(int id, double partyIdentificationId, int partyIdentificationSchemeId, int partyIdentificationSchemeName) {
        this.id = id;
        this.partyIdentificationId = partyIdentificationId;
        this.partyIdentificationSchemeId = partyIdentificationSchemeId;
        this.partyIdentificationSchemeName = partyIdentificationSchemeName;
    }

    public PartyIdentification(double partyIdentificationId, int partyIdentificationSchemeId, int partyIdentificationSchemeName) {
        this.partyIdentificationId = partyIdentificationId;
        this.partyIdentificationSchemeId = partyIdentificationSchemeId;
        this.partyIdentificationSchemeName = partyIdentificationSchemeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPartyIdentificationId() {
        return partyIdentificationId;
    }

    public void setPartyIdentificationId(double partyIdentificationId) {
        this.partyIdentificationId = partyIdentificationId;
    }

    public int getPartyIdentificationSchemeId() {
        return partyIdentificationSchemeId;
    }

    public void setPartyIdentificationSchemeId(int partyIdentificationSchemeId) {
        this.partyIdentificationSchemeId = partyIdentificationSchemeId;
    }

    public int getPartyIdentificationSchemeName() {
        return partyIdentificationSchemeName;
    }

    public void setPartyIdentificationSchemeName(int partyIdentificationSchemeName) {
        this.partyIdentificationSchemeName = partyIdentificationSchemeName;
    }
}
