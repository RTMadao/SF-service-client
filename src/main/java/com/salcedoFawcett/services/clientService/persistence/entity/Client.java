package com.salcedoFawcett.services.clientService.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String additionalAccountId;
    private int partyIdentificationId;
    private String partyName;
    private int phisicalAddressId;
    private String registrationName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "client_tax_level_code",
        joinColumns = @JoinColumn(name = "client_id"),
        inverseJoinColumns = @JoinColumn(name = "tax_level_code_id"))
    private Set<TaxLevelCode> taxesLevelCode;
    private int registrationAddressId;
    private String taxSchemeId;
    private int contactDataId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdditionalAccountId() {
        return additionalAccountId;
    }

    public void setAdditionalAccountId(String additionalAccountId) {
        this.additionalAccountId = additionalAccountId;
    }

    public int getPartyIdentificationId() {
        return partyIdentificationId;
    }

    public void setPartyIdentificationId(int partyIdentificationId) {
        this.partyIdentificationId = partyIdentificationId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getPhisicalAddressId() {
        return phisicalAddressId;
    }

    public void setPhisicalAddressId(int phisicalAddressId) {
        this.phisicalAddressId = phisicalAddressId;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public Set<TaxLevelCode> getTaxesLevelCode() {
        return taxesLevelCode;
    }

    public void setTaxesLevelCode(Set<TaxLevelCode> taxesLevelCode) {
        this.taxesLevelCode = taxesLevelCode;
    }

    public int getRegistrationAddressId() {
        return registrationAddressId;
    }

    public void setRegistrationAddressId(int registrationAddressId) {
        this.registrationAddressId = registrationAddressId;
    }

    public String getTaxSchemeId() {
        return taxSchemeId;
    }

    public void setTaxSchemeId(String taxSchemeId) {
        this.taxSchemeId = taxSchemeId;
    }

    public int getContactDataId() {
        return contactDataId;
    }

    public void setContactDataId(int contactDataId) {
        this.contactDataId = contactDataId;
    }
}
