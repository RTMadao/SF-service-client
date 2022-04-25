package com.salcedoFawcett.services.clientService.domain.model;

public class CustomerTaxesLevel {

    private int customerId;
    private String taxLevelCodeId;

    public CustomerTaxesLevel() {
    }

    public CustomerTaxesLevel(int customerId, String taxLevelCodeId) {
        this.customerId = customerId;
        this.taxLevelCodeId = taxLevelCodeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTaxLevelCodeId() {
        return taxLevelCodeId;
    }

    public void setTaxLevelCodeId(String taxLevelCodeId) {
        this.taxLevelCodeId = taxLevelCodeId;
    }
}
