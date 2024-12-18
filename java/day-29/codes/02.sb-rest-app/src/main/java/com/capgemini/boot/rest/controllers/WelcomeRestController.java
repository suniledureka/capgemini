package com.capgemini.boot.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/capgem")
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String showWelcomeMessageGet() {
		return "Welcome to Capgemini from GET";
	}
	
	@PostMapping("/welcome")
	public String showWelcomeMessagePost() {
		return "Welcome to Capgemini from POST";
	}
	
	@PutMapping("/welcome")
	public String showWelcomeMessagePut() {
		return "Welcome to Capgemini from PUT";
	}
	
	@DeleteMapping("/welcome")
	public String showWelcomeMessageDelete() {
		return "Welcome to Capgemini from DELETE";
	}
	
	@PatchMapping("/welcome")
	public String showWelcomeMessagePatch() {
		return "Welcome to Capgemini from PATCH";
	}	
}
