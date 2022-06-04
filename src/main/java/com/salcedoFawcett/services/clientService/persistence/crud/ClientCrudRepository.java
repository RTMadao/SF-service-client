package com.salcedoFawcett.services.clientService.persistence.crud;

import com.salcedoFawcett.services.clientService.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
    Optional<Client> findByPartyIdentificationPartyIdentificationId(long partyIdentificationId);
}
