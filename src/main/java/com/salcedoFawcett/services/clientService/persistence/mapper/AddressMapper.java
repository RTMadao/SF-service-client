package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toAddress(com.salcedoFawcett.services.clientService.persistence.entity.Address address);
    List<Address> toAddressList(List<com.salcedoFawcett.services.clientService.persistence.entity.Address> addressList);

    com.salcedoFawcett.services.clientService.persistence.entity.Address toAddress(Address address);
}
