package com.capgemini.ams.services;
import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.repositories.ApplicantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApplicantServices {	
	private ApplicantRepository applicantRepo;
	
	public Applicant saveApplicant(Applicant applicant) {
		if(!applicantRepo.existsById(applicant.getId())) {
			
			if(applicant.getResume() != null) {
				Resume resume = applicant.getResume();
				resume.setApplicant(applicant);
			}
			
			Applicant savedApplicant = applicantRepo.save(applicant);
			return savedApplicant;
		}
		return null;
	}
	
	
}
