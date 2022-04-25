package com.salcedoFawcett.services.clientService.Client;

import com.salcedoFawcett.services.clientService.domain.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient("parameter-service")
public interface ParameterClient {

    @GetMapping("/party_identification/{id}")
    public ResponseEntity<PartyIdentification> getPartyIdentificationById(@PathVariable("id") int id);
    @PostMapping("/party_identification/save")
    public  ResponseEntity<PartyIdentification> savePartyIdentification(@RequestBody PartyIdentification partyIdentification);
    @PutMapping("/party_identification/update")
    public  ResponseEntity<PartyIdentification> updatePartyIdentification(@RequestBody PartyIdentification partyIdentification);

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") int id);
    @PostMapping("/address/save")
    public  ResponseEntity<Address> saveAddress(@RequestBody Address address);
    @PutMapping("/address/update")
    public  ResponseEntity<Address> updateAddress(@RequestBody Address address);

    @GetMapping("/parameter/tax_schema/{id}")
    public  ResponseEntity<TaxSchema> getTaxSchemaById(@PathVariable("id") String id);
    @PostMapping("/parameter/tax_schema/save")
    public  ResponseEntity<TaxSchema> saveTaxSchema(@RequestBody TaxSchema taxSchema);

    @GetMapping("/contact_data/{id}")
    public  ResponseEntity<Contact> getContactDataById(@PathVariable("id") int id);
    @PostMapping("/contact_data/save")
    public  ResponseEntity<Contact> saveContactData(@RequestBody Contact contactData);
    @PutMapping("/contact_data/update")
    public  ResponseEntity<Contact> updateContactData(@RequestBody Contact contactData);

    @PostMapping("/aditional_party/save")
    public  ResponseEntity<AditionalCostumerParty> saveAditionalParty(@RequestBody AditionalCostumerParty aditionalParty);
}
