package com.salcedoFawcett.services.clientService.persistence.mapper;

import com.salcedoFawcett.services.clientService.domain.model.Contact;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactDataMapper {

    Contact toContact(com.salcedoFawcett.services.clientService.persistence.entity.ContactData contact);
    List<Contact> toContactList(List<com.salcedoFawcett.services.clientService.persistence.entity.ContactData> contactList);

    @Mappings({
            @Mapping(target = "party", ignore = true)
    })
    @InheritInverseConfiguration()
    com.salcedoFawcett.services.clientService.persistence.entity.ContactData toContact(Contact contact);
}
