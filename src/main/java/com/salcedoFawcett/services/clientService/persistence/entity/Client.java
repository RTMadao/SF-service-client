package com.salcedoFawcett.services.clientService.persistence.entity;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String additionalAccountId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "party_identification_id", referencedColumnName = "id")
    private PartyIdentification partyIdentification;
    private String partyName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phisical_address_id", referencedColumnName = "id")
    private Address phisicalAddress;
    private String registrationName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "client_tax_level_code",
        joinColumns = @JoinColumn(name = "client_id"),
        inverseJoinColumns = @JoinColumn(name = "tax_level_code_id"))
    private Set<TaxLevelCode> taxesLevelCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_address_id", referencedColumnName = "id")
    private Address registrationAddress;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tax_scheme_id", referencedColumnName = "id")
    private TaxSchema taxSchema;
    @OneToMany(mappedBy="party", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ContactData> contactsData;
    private int electronicInvoiceContactId;

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

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
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

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentificationId) {
        this.partyIdentification = partyIdentificationId;
    }

    public Address getPhisicalAddress() {
        return phisicalAddress;
    }

    public void setPhisicalAddress(Address phisicalAddress) {
        this.phisicalAddress = phisicalAddress;
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

    public Set<ContactData> getContactsData() {
        return contactsData;
    }

    public void setContactsData(Set<ContactData> contactsData) {
        this.contactsData = contactsData;
    }

    public int getElectronicInvoiceContactId() {
        return this.electronicInvoiceContactId;
    }

    public void setElectronicInvoiceContactId(int electronicInvoiceContactId) {
        this.electronicInvoiceContactId = electronicInvoiceContactId;
    }

    public Client addContacts(){
        this.contactsData.forEach(contactData -> contactData.setParty(this));
        return this;
    }

    public Client addElectronicInvoiceContact(){
        this.electronicInvoiceContactId = this.contactsData.stream().filter(contactData -> contactData.isElectronicInvoiceContact()).collect(Collectors.toList()).get(0).getId();
        return this;
    }
}
