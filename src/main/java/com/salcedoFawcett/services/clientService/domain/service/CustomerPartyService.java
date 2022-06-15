package com.salcedoFawcett.services.clientService.domain.service;

import com.salcedoFawcett.services.clientService.domain.model.*;
import com.salcedoFawcett.services.clientService.domain.repository.CustomerPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerPartyService {
    @Autowired
    private CustomerPartyRepository customerPartyRepository;

    public List<CustomerParty> getAll(){
        return customerPartyRepository.getAll();
    }

    public Optional<CustomerParty> getById(int id){
        return customerPartyRepository.getCustomerById(id);
    }
    public Optional<CustomerParty> getByIdentification(int id){
        return customerPartyRepository.getCustomerByIdentification(id);
    }

    public CustomerParty save(CustomerParty customer){
        return customerPartyRepository.save(customer);
    }

    public Optional<CustomerParty> updateBasicInfo(CustomerParty customer){
        return  customerPartyRepository.getCustomerById(customer.getId()).map(customerParty -> {
            customerParty.setAdditionalAccountId(customer.getAdditionalAccountId());
            customerParty.setPartyIdentification(customer.getPartyIdentification());
            customerParty.setPartyName(customer.getPartyName());
            customerParty.setRegistrationName(customer.getRegistrationName());
            return customerPartyRepository.update(customerParty);
        });
    }

    public Optional<CustomerParty> updateTaxinfo(CustomerParty customer){
        return  customerPartyRepository.getCustomerById(customer.getId()).map(customerParty -> {
            customerParty.setTaxSchema(customer.getTaxSchema());
            customerParty.setTaxesLevelCode(customer.getTaxesLevelCode());
            return customerPartyRepository.update(customerParty);
        });
    }

    public Optional<CustomerParty> updateAddress(CustomerParty customer){
        return  customerPartyRepository.getCustomerById(customer.getId()).map(customerParty -> {
            customerParty.setPhisicalAddress(customer.getPhisicalAddress());
            customerParty.setRegistrationAddress(customer.getRegistrationAddress());
            return customerPartyRepository.update(customerParty);
        });
    }

    public Optional<CustomerParty> updateContactinfo(CustomerParty customer){
        return  customerPartyRepository.getCustomerById(customer.getId()).map(customerParty -> {
            customerParty.setContactsData(customer.getContactsData());
            return customerPartyRepository.update(customerParty);
        });
    }

    public Optional<CustomerParty> updateElectronicInvoiceContact(CustomerParty customer){
        return  customerPartyRepository.getCustomerById(customer.getId()).map(customerParty -> {
            customerParty.setElectronicInvoiceContactId(customer.getElectronicInvoiceContactId());
            return customerPartyRepository.update(customerParty);
        });
    }

    public boolean delete(int customerId){
        if (customerPartyRepository.customerExist(customerId)){
            customerPartyRepository.delete(customerId);
            return true;
        } return false;
    }
}
