package com.capgemini.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.services.ApplicantServices;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/ams/api/applicant")
public class ApplicantController {
	@Autowired
	private ApplicantServices applicantService;

	@PostMapping
	public ResponseEntity<?> saveApplicant(@RequestBody Applicant applicant){
		Applicant savedApplicant = applicantService.saveApplicant(applicant);
		if(savedApplicant != null)
			return new ResponseEntity<Applicant>(savedApplicant, HttpStatus.CREATED);
		else
			return ResponseEntity.badRequest().build();
	}	
	
	@GetMapping
	public ResponseEntity<Applicant> fetchApplicantById(@RequestParam Long applicantId) {
		Applicant applicant = applicantService.getApplicantById(applicantId);
		return ResponseEntity.ok().body(applicant);
	}
}
