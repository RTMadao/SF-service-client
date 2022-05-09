package com.salcedoFawcett.services.clientService.persistence.repository;

import com.salcedoFawcett.services.clientService.domain.model.CustomerParty;
import com.salcedoFawcett.services.clientService.domain.repository.CustomerPartyRepository;
import com.salcedoFawcett.services.clientService.persistence.crud.ClientCrudRepository;
import com.salcedoFawcett.services.clientService.persistence.entity.Client;
import com.salcedoFawcett.services.clientService.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements CustomerPartyRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;
    @Autowired
    private ClientMapper mapper;


    @Override
    public List<CustomerParty> getAll() {
        List<Client> list = (List<Client>) clientCrudRepository.findAll();
        return mapper.toCustomerPartys(list);
    }

    @Override
    public Optional<CustomerParty> getCustomerById(int customerID) {
        return clientCrudRepository.findById(customerID).map(mapper::toCustomerParty);
    }

    @Override
    public Optional<CustomerParty> getCustomerByIdentification(double identification) {
        return Optional.empty();
    }

    @Override
    public CustomerParty save(CustomerParty customer) {
        Client client = mapper.toClient(customer).addContacts();
        client = clientCrudRepository.save(client).addElectronicInvoiceContact();
        return mapper.toCustomerParty(clientCrudRepository.save(client));
    }

    @Override
    public CustomerParty update(CustomerParty customer) {
        return mapper.toCustomerParty(clientCrudRepository.save(mapper.toClient(customer).addContacts()));
    }

    @Override
    public boolean customerExist(int customerID) {
        return clientCrudRepository.existsById(customerID);
    }

    @Override
    public void delete(int customerID) {
        clientCrudRepository.deleteById(customerID);
    }
}
