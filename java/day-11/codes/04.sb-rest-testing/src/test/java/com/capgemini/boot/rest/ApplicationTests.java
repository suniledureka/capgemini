package com.capgemini.boot.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.boot.rest.controllers.WelcomeRestController;
import com.capgemini.boot.rest.services.WelcomeServices;

@SpringBootTest
class ApplicationTests {
	@Autowired
	WelcomeServices welService;
	
	@Autowired
	WelcomeRestController welController;
	
	@Test
	void contextLoadsService() {		
		assertThat(welService).isNotNull();
	}

	@Test
	void contextLoadsController() {
		assertThat(welController).isNotNull();
	}	

}
