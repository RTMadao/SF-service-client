package com.salcedoFawcett.services.clientService.persistence.crud;

import com.salcedoFawcett.services.clientService.persistence.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressCrudRepository extends CrudRepository<Address, Integer> {
}
