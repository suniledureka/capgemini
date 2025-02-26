package com.capgemini.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.services.ResumeServices;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ResumeController {
	@Autowired
	private ResumeServices resumeService;
	
	@PostMapping("/ams/api/{applicantId}/resume")
	public ResponseEntity<?> saveResumeOfApplicant(@PathVariable Long applicantId, @RequestBody Resume resume){
		Resume savedResume = resumeService.addResume(applicantId, resume);
		if(savedResume != null)
			return new ResponseEntity<Resume>(savedResume, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/ams/api/resume")
	public ResponseEntity<Resume> findResume(@RequestParam Long resumeId){
		Resume resume = resumeService.getResumeById(resumeId);
		if(resume != null) {
			return ResponseEntity.ok(resume);
		}
		return ResponseEntity.badRequest().build();
	}
}
