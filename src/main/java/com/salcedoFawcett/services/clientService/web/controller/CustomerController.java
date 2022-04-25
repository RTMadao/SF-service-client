package com.salcedoFawcett.services.clientService.web.controller;

import com.salcedoFawcett.services.clientService.domain.model.Address;
import com.salcedoFawcett.services.clientService.domain.model.CustomerParty;
import com.salcedoFawcett.services.clientService.domain.service.CustomerPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerPartyService customerPartyService;

    @GetMapping("/all")
    public ResponseEntity<List<CustomerParty>> getAll(){
        return new ResponseEntity<>(customerPartyService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<CustomerParty> getCustomerPartyById(@PathVariable("id") int id) {
        return customerPartyService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<CustomerParty> saveCustomerParty(@RequestBody CustomerParty contactData){
        return new ResponseEntity<>(customerPartyService.save(contactData), HttpStatus.CREATED);
    }

    @PutMapping("/update/basic_info")
    public  ResponseEntity<CustomerParty> updateBasicInfo(@RequestBody CustomerParty customer) {
        return  customerPartyService.updateBasicInfo(customer).map(customerUpdates -> new ResponseEntity<>(customerUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/update/tax_info")
    public  ResponseEntity<CustomerParty> updateTaxinfo(@RequestBody CustomerParty customer) {
        return  customerPartyService.updateTaxinfo(customer).map(customerUpdates -> new ResponseEntity<>(customerUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/update/address_info/{id}")
    public  ResponseEntity<CustomerParty> updateAddress(@PathVariable("id") int id, @RequestBody Address address) {
        return  customerPartyService.updateAddress(id,address).map(customerUpdates -> new ResponseEntity<>(customerUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/update/contact_info")
    public  ResponseEntity<CustomerParty> updateContactinfo(@RequestBody CustomerParty customer) {
        return  customerPartyService.updateContactinfo(customer).map(customerUpdates -> new ResponseEntity<>(customerUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
