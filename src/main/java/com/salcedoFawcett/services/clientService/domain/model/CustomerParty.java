package com.salcedoFawcett.services.clientService.domain.model;

import java.util.Set;

public class CustomerParty {

    private int id;
    private String additionalAccountId;
    private PartyIdentification partyIdentification;
    private String partyName;
    private Address phisicalAddress;
    private String registrationName;
    private Set<TaxLevelCode> taxesLevelCode;
    private Address registrationAddress;
    private TaxSchema taxSchema;
    private int electronicInvoiceContactId;
    private Set<Contact> contactsData;

    public CustomerParty() {
    }

    public CustomerParty(int id, String additionalAccountId, PartyIdentification partyIdentification, String partyName, Address phisicalAddress, String registrationName, Set<TaxLevelCode> taxesLevelCode, Address registrationAddress, TaxSchema taxSchema, int electronicInvoiceContactId, Set<Contact> contactsData) {
        this.id = id;
        this.additionalAccountId = additionalAccountId;
        this.partyIdentification = partyIdentification;
        this.partyName = partyName;
        this.phisicalAddress = phisicalAddress;
        this.registrationName = registrationName;
        this.taxesLevelCode = taxesLevelCode;
        this.registrationAddress = registrationAddress;
        this.taxSchema = taxSchema;
        this.electronicInvoiceContactId = electronicInvoiceContactId;
        this.contactsData = contactsData;
    }

    public CustomerParty(String additionalAccountId, PartyIdentification partyIdentification, String partyName, Address phisicalAddress, String registrationName, Set<TaxLevelCode> taxesLevelCode, Address registrationAddress, TaxSchema taxSchema, int electronicInvoiceContactId, Set<Contact> contactsData) {
        this.additionalAccountId = additionalAccountId;
        this.partyIdentification = partyIdentification;
        this.partyName = partyName;
        this.phisicalAddress = phisicalAddress;
        this.registrationName = registrationName;
        this.taxesLevelCode = taxesLevelCode;
        this.registrationAddress = registrationAddress;
        this.taxSchema = taxSchema;
        this.electronicInvoiceContactId = electronicInvoiceContactId;
        this.contactsData = contactsData;
    }

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

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Address getPhisicalAddress() {
        return phisicalAddress;
    }

    public void setPhisicalAddress(Address phisicalAddress) {
        this.phisicalAddress = phisicalAddress;
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

    public Address getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public TaxSchema getTaxSchema() {
        return taxSchema;
    }

    public void setTaxSchema(TaxSchema taxSchema) {
        this.taxSchema = taxSchema;
    }

    public Set<Contact> getContactsData() {
        return contactsData;
    }

    public void setContactsData(Set<Contact> contactsData) {
        this.contactsData = contactsData;
    }

    public int getElectronicInvoiceContactId() {
        return electronicInvoiceContactId;
    }

    public void setElectronicInvoiceContactId(int electronicInvoiceContactId) {
        this.electronicInvoiceContactId = electronicInvoiceContactId;
    }
}
