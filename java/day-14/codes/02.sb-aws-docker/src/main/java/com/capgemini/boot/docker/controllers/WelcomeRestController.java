package com.capgemini.boot.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Dockerizing Spring Boot Application";
	}
}
