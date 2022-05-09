package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.PartyIdentification;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PartyIdentificationMapper {

    PartyIdentification toPartyIdentification(com.salcedoFawcett.services.clientService.persistence.entity.PartyIdentification partyIdentification);
    List<PartyIdentification> toPartyIdentificationList(List<com.salcedoFawcett.services.clientService.persistence.entity.PartyIdentification> partyIdentificationList);

    @Mappings({
            @Mapping(target = "client", ignore = true)
    })
    @InheritInverseConfiguration()
    com.salcedoFawcett.services.clientService.persistence.entity.PartyIdentification toPartyIdentification(PartyIdentification partyIdentification);
}
