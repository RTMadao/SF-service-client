package com.salcedoFawcett.services.clientService.domain.model;

public class AditionalCostumerParty {

    private int id;
    private String registrationName;
    private PartyIdentification partyIdentification;
    private int partecipationPercent;
    private String corporateRegistrationScheme;

    public AditionalCostumerParty() {
    }

    public AditionalCostumerParty(int id, String registrationName, PartyIdentification partyIdentification, int partecipationPercent, String corporateRegistrationScheme) {
        this.id = id;
        this.registrationName = registrationName;
        this.partyIdentification = partyIdentification;
        this.partecipationPercent = partecipationPercent;
        this.corporateRegistrationScheme = corporateRegistrationScheme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public int getPartecipationPercent() {
        return partecipationPercent;
    }

    public void setPartecipationPercent(int partecipationPercent) {
        this.partecipationPercent = partecipationPercent;
    }

    public String getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    public void setCorporateRegistrationScheme(String corporateRegistrationScheme) {
        this.corporateRegistrationScheme = corporateRegistrationScheme;
    }
}
