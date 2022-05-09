package com.salcedoFawcett.services.clientService.persistence.crud;

import com.salcedoFawcett.services.clientService.persistence.entity.ContactData;
import org.springframework.data.repository.CrudRepository;

public interface ContactDataCrudRepository extends CrudRepository<ContactData, Integer> {
}
