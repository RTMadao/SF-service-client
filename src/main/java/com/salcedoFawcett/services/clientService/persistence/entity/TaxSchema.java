package com.salcedoFawcett.services.clientService.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_schema")
public class TaxSchema {
    @Id
    private String id;
    private String name;
    public TaxSchema() {
    }
    public TaxSchema(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
