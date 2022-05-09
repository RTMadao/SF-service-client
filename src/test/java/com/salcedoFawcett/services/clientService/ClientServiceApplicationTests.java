package com.salcedoFawcett.services.clientService;

import com.salcedoFawcett.services.clientService.domain.model.*;
import com.salcedoFawcett.services.clientService.domain.repository.CustomerPartyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ClientServiceApplicationTests {

	@Autowired
	private CustomerPartyRepository repository;
	@Test
	void getCustomer() {
		List<CustomerParty> customerParties =  repository.getAll();
		System.out.println(customerParties.toString());
	}

}
