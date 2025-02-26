package com.capgemini.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.services.ApplicantServices;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/ams/api/applicant")
public class ApplicantController {	
	private ApplicantServices applicantService;

	@PostMapping
	public ResponseEntity<?> saveApplicant(@RequestBody Applicant applicant){
		boolean saveStatus = applicantService.saveApplicant(applicant);
		if(saveStatus)
			return new ResponseEntity<String>(HttpStatus.CREATED);
		else
			return ResponseEntity.badRequest().build();
	}
	
	
}
