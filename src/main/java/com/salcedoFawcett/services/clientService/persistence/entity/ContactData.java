package com.salcedoFawcett.services.clientService.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "party_contact_data")
public class ContactData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telephone;
    private String telefax;
    private String electronicMail;
    private String note;
    @Transient
    private boolean isElectronicInvoiceContact;

    @ManyToOne()
    @JoinColumn(name = "party_id")
    private Client party;

    public ContactData(){}

    public ContactData(int id, String name, String telephone, String telefax, String electronicMail, String note, boolean isElectronicInvoiceContact, Client party) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.telefax = telefax;
        this.electronicMail = electronicMail;
        this.note = note;
        this.isElectronicInvoiceContact = isElectronicInvoiceContact;
        this.party = party;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getElectronicMail() {
        return electronicMail;
    }

    public void setElectronicMail(String electronicMail) {
        this.electronicMail = electronicMail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Client getParty() {
        return party;
    }

    public void setParty(Client party) {
        this.party = party;
    }

    public boolean isElectronicInvoiceContact() {
        return isElectronicInvoiceContact;
    }

    public void setElectronicInvoiceContact(boolean electronicInvoiceContact) {
        isElectronicInvoiceContact = electronicInvoiceContact;
    }
}
