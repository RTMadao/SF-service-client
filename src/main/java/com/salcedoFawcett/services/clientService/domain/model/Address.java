package com.salcedoFawcett.services.clientService.domain.model;

public class Address {

    private int id;
    private String municipeId;
    private String departamentId;
    private String postalZone;
    private String addressLine;
    private String countryId;
    private String countryName;
    private String countryLanguage;

    public Address() {
    }

    public Address(int id, String municipeId, String departamentId, String postalZone, String addressLine, String countryId, String countryName, String countryLanguage) {
        this.id = id;
        this.municipeId = municipeId;
        this.departamentId = departamentId;
        this.postalZone = postalZone;
        this.addressLine = addressLine;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryLanguage = countryLanguage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipeId() {
        return municipeId;
    }

    public void setMunicipeId(String municipeId) {
        this.municipeId = municipeId;
    }

    public String getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(String departamentId) {
        this.departamentId = departamentId;
    }

    public String getPostalZone() {
        return postalZone;
    }

    public void setPostalZone(String postalZone) {
        this.postalZone = postalZone;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
