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
	public ResponseEntity<Applicant> saveApplicant(@RequestBody Applicant applicant){
		System.out.println(applicant);
		Applicant savedApplicant = applicantService.saveApplicant(applicant);
		if(savedApplicant != null)
			return new ResponseEntity<>(savedApplicant, HttpStatus.CREATED);
		else
			return ResponseEntity.badRequest().build();
	}
	
	
}
