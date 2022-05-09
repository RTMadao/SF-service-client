package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.CustomerParty;
import com.salcedoFawcett.services.clientService.persistence.entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PartyIdentificationMapper.class, AddressMapper.class, ContactDataMapper.class, TaxSchemaMapper.class, TaxLevelCodeMapper.class})
public interface ClientMapper {

    CustomerParty toCustomerParty(Client client);
    List<CustomerParty> toCustomerPartys(List<Client> clients);

    @InheritInverseConfiguration()
    Client toClient(CustomerParty customerParty);
}
