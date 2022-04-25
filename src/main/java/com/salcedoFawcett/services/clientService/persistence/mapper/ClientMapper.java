package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.CustomerParty;
import com.salcedoFawcett.services.clientService.persistence.entity.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "partyIdentificationId", target = "partyIdentification.id"),
            @Mapping(source = "phisicalAddressId", target = "phisicalAddress.id"),
            @Mapping(source = "registrationAddressId", target = "registrationAddress.id"),
            @Mapping(source = "taxSchemeId", target = "taxSchema.id"),
            @Mapping(source = "contactDataId", target = "contactData.id")
    })
    CustomerParty toCustomerParty(Client client);

    List<CustomerParty> toCustomerPartys(List<Client> clients);

    @InheritInverseConfiguration()
    Client toClient(CustomerParty customerParty);
}
