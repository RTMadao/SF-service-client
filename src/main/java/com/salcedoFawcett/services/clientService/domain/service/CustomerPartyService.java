package com.salcedoFawcett.services.clientService.domain.service;

import com.salcedoFawcett.services.clientService.Client.ParameterClient;
import com.salcedoFawcett.services.clientService.domain.model.*;
import com.salcedoFawcett.services.clientService.domain.repository.CustomerPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerPartyService {
    @Autowired
    private CustomerPartyRepository customerPartyRepository;
    @Autowired
    private ParameterClient parameterClient;

    public List<CustomerParty> getAll(){
        return customerPartyRepository.getAll()
                .stream()
                .map(customer -> this.loadData(customer)).collect(Collectors.toList());
    }

    public Optional<CustomerParty> getById(int id){
        return customerPartyRepository.getCustomerById(id).map(this::loadData);
    }

    public CustomerParty save(CustomerParty customer){

        PartyIdentification customerPartyIdentification = parameterClient.savePartyIdentification(customer.getPartyIdentification()).getBody();
        customer.setPartyIdentification(customerPartyIdentification);
        Address customerPhisicalAddress = (customer.getPhisicalAddress() == null)?null:parameterClient.saveAddress(customer.getPhisicalAddress()).getBody();
        customer.setPhisicalAddress(customerPhisicalAddress);
        Address customerRegistrationAddress = (customer.getRegistrationAddress() == null)?null:parameterClient.saveAddress(customer.getRegistrationAddress()).getBody();
        customer.setRegistrationAddress(customerRegistrationAddress);
        TaxSchema customerTaxSchema = (customer.getTaxSchema() == null)?null:parameterClient.saveTaxSchema(customer.getTaxSchema()).getBody();
        customer.setTaxSchema(customerTaxSchema);
        Contact customerContact = (customer.getContactData() == null)?null:parameterClient.saveContactData(customer.getContactData()).getBody();
        customer.setContactData(customerContact);

        CustomerParty newCustomer = customerPartyRepository.save(customer);

        newCustomer.setPartyIdentification(customerPartyIdentification);
        newCustomer.setPhisicalAddress(customerPhisicalAddress);
        newCustomer.setRegistrationAddress(customerRegistrationAddress);
        newCustomer.setTaxSchema(customerTaxSchema);
        newCustomer.setContactData(customerContact);

        return  newCustomer;
    }

    public Optional<CustomerParty> updateBasicInfo(CustomerParty customer){
        if (customerPartyRepository.customerExist(customer.getId())){
            customer.setPartyIdentification(parameterClient.updatePartyIdentification(customer.getPartyIdentification()).getBody());
            return Optional.of(this.loadData(customerPartyRepository.save(customer)));
        } else return Optional.empty();
    }

    public Optional<CustomerParty> updateTaxinfo(CustomerParty customer){
        if (customerPartyRepository.customerExist(customer.getId())){
            return Optional.of(this.loadData(customerPartyRepository.save(customer)));
        } else return Optional.empty();
    }

    public Optional<CustomerParty> updateAddress(int customerId, Address address){
        if (customerPartyRepository.customerExist(customerId)){
            parameterClient.updateAddress(address);
            return this.getById(customerId);
        } else return Optional.empty();
    }

    public Optional<CustomerParty> updateContactinfo(CustomerParty customer){
        if (customerPartyRepository.customerExist(customer.getId())){
            customer.setContactData(parameterClient.updateContactData(customer.getContactData()).getBody());
            return Optional.of(this.loadData(customer));
        } else return Optional.empty();
    }

    public CustomerParty loadData(CustomerParty customer){
        customer.setPartyIdentification(parameterClient.getPartyIdentificationById(customer.getPartyIdentification().getId()).getBody());
        customer.setPhisicalAddress(parameterClient.getAddressById(customer.getPhisicalAddress().getId()).getBody());
        customer.setRegistrationAddress(parameterClient.getAddressById(customer.getRegistrationAddress().getId()).getBody());
        customer.setTaxSchema(parameterClient.getTaxSchemaById(customer.getTaxSchema().getId()).getBody());
        customer.setContactData(parameterClient.getContactDataById(customer.getContactData().getId()).getBody());
        return customer;
    }
}
