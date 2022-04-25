package com.salcedoFawcett.services.clientService.persistence.crud;

import com.salcedoFawcett.services.clientService.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
