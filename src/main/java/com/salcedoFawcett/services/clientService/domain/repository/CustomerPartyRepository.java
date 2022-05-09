package com.salcedoFawcett.services.clientService.domain.repository;

import com.salcedoFawcett.services.clientService.domain.model.CustomerParty;

import java.util.List;
import java.util.Optional;

public interface CustomerPartyRepository {

    List<CustomerParty> getAll();
    Optional<CustomerParty> getCustomerById(int customerID);
    Optional<CustomerParty> getCustomerByIdentification(double identification);
    CustomerParty save(CustomerParty customer);
    CustomerParty update(CustomerParty customer);
    boolean customerExist(int customerID);
    void delete(int customerID);

}
