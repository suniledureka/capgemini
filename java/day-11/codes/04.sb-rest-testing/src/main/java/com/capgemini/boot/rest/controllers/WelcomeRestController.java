package com.capgemini.boot.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.boot.rest.services.WelcomeServices;

@RestController
public class WelcomeRestController {
	@Autowired
	private WelcomeServices welcomeService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> showWelcomeMessage(){
		String message = welcomeService.generateWelcomeMesssage();
		return ResponseEntity.ok(message);
	}
}
