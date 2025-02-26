package com.capgemini.ams.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.entities.Application;
import com.capgemini.ams.repositories.ApplicantRepository;
import com.capgemini.ams.repositories.ApplicationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicationServices {
	private ApplicationRepository applicationRepo;
	private ApplicantRepository applicantRepo;
	
	public Application saveApplication(Long applicantId, Application application) {
		Optional<Applicant> applicantOptional = applicantRepo.findById(applicantId);
		if(applicantOptional.isPresent()) {
			Applicant applicant = applicantOptional.get();
			application.setApplicant(applicant);
			return applicationRepo.save(application);
		}else {
			throw new RuntimeException("Applicant not found with ID: " + applicantId);
		}
		
	}
}
