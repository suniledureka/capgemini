package com.capgemini.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.services.ResumeServices;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/ams/api/resume")
public class ResumeController {
	@Autowired
	private ResumeServices resumeService;
	
	@PostMapping("/{applicantId}")
	public ResponseEntity<?> saveResumeOfApplicant(@PathVariable Long applicantId, @RequestBody Resume resume){
		Resume savedResume = resumeService.addResume(applicantId, resume);
		if(savedResume != null)
			return new ResponseEntity<Resume>(savedResume, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}	
}
