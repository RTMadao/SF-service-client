package com.salcedoFawcett.services.clientService.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "party_identification")
public class PartyIdentification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long partyIdentificationId;
    private int partyIdentificationSchemeId;
    private int partyIdentificationSchemeName;

    @OneToOne(mappedBy = "partyIdentification")
    private Client client;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPartyIdentificationId() {
        return partyIdentificationId;
    }

    public void setPartyIdentificationId(long partyIdentificationId) {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
