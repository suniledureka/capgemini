package com.capgemini.ams.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ams.entities.Application;
import com.capgemini.ams.services.ApplicationServices;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ApplicationController {
	private ApplicationServices applicationService;
	
	@PostMapping("/api/{applicantId}/applications")
	public ResponseEntity<Application> createApplication(@PathVariable Long applicantId, @RequestBody Application application){
		Application savedApplication = applicationService.saveApplication(applicantId, application);
		return new ResponseEntity<>(savedApplication, HttpStatus.CREATED);
	}
}
