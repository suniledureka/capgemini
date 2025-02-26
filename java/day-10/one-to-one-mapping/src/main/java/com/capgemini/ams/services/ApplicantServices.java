package com.capgemini.ams.services;
import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.repositories.ApplicantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicantServices {	
	private ApplicantRepository applicantRepo;
	
	public boolean saveApplicant(Applicant applicant) {
		if(!applicantRepo.existsById(applicant.getId())) {
			applicantRepo.save(applicant);
			return true;
		}
		return false;
	}
}
