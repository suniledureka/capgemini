package com.capgemini.boot.rest.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capgemini.boot.rest.services.WelcomeServices;

@WebMvcTest(value = WelcomeRestController.class)
class WelcomeRestControllerTest {
	@MockitoBean //from spring boot 3.4.0 before that @MockBean
	private WelcomeServices welService;
	
	@Autowired
	private MockMvc mockMvc; // is a mocked servlet environment that we can use to test our HTTP controller endpoints; used to send a request to REST API /welcome
	
	@Test
	void testShowWelcomeMessage() throws Exception {
		/*
		// define mock object behaviour
		Mockito.when(welService.generateWelcomeMesssage()).thenReturn("Welcome");
		
		// prepare HTTP get request - HttpServletRequestBuilder
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		
		// send request
		ResultActions perform = mockMvc.perform(reqBuilder);
		
		// hold the response
		MvcResult mvcResult = perform.andReturn();
		
		// get the response
		MockHttpServletResponse mvcResponse = mvcResult.getResponse();
		
		// validate the response
		int responseStatus = mvcResponse.getStatus();
		assertEquals(200, responseStatus);
		
		String responseText = mvcResponse.getContentAsString();
		assertEquals("Welcome", responseText);
		*/
		
		mockMvc.perform(MockMvcRequestBuilders.get("/welcome"))
		  		.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
