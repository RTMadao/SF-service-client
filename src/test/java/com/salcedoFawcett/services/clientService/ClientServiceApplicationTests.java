package com.salcedoFawcett.services.clientService;

import com.salcedoFawcett.services.clientService.domain.model.*;
import com.salcedoFawcett.services.clientService.domain.service.CustomerPartyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
class ClientServiceApplicationTests {

	@Autowired
	private CustomerPartyService customerPartyService;
	@Test
	void getCustomer() {
		Optional<CustomerParty> customerParties =  customerPartyService.getById(1);
		System.out.println(customerParties.toString());
	}

	@Test
	void saveCustomer() {
		PartyIdentification partyIdentification = new PartyIdentification(123456789,6,31);
		CustomerParty customerParty = new CustomerParty("2",partyIdentification,"name",null,"name",null,null,null,null);
		customerPartyService.save(customerParty);
	}

}
