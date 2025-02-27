package com.capgemini.boot.rest.controllers;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capgemini.boot.rest.entities.User;
import com.capgemini.boot.rest.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class RegistrationRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	private UserRepository userRepo;
	
	@BeforeEach
	public void cleanDbBeforeEachTest() {
		userRepo.deleteAll();
	}
	
	@Test
	void testCreateUser_Valid_User() throws Exception {
		User user = new User();
		
		user.setUsername("sanjay");
		user.setPassword("password123#");
		user.setRole("ROLE_ADMIN");
		 
		String userInJsonString = objectMapper.writeValueAsString(user);
		
		mockMvc.perform(MockMvcRequestBuilders
								.post("/register/user")
								.contentType(MediaType.APPLICATION_JSON)
								.content(userInJsonString)
					   )
					   .andExpect(MockMvcResultMatchers.status().isOk())
					   .andExpect(MockMvcResultMatchers.jsonPath("$.username").value("sanjay"))
					   .andExpect(MockMvcResultMatchers.jsonPath("$.password").value(Matchers.not("password123#")))
					   .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
					   .andExpect(MockMvcResultMatchers.jsonPath("$.role").exists());	
	}

	
	@Test
	void testCreateUser_userWithOutPassword() throws Exception {
		User user = new User();
		
		user.setUsername("praveen");
		user.setRole("ROLE_MANAGER");
		 
		String userInJsonString = objectMapper.writeValueAsString(user);
		
		mockMvc.perform(MockMvcRequestBuilders
								.post("/register/user")
								.contentType(MediaType.APPLICATION_JSON)
								.content(userInJsonString)
					   )
					.andExpect(MockMvcResultMatchers.status().isInternalServerError());
	}	
}
