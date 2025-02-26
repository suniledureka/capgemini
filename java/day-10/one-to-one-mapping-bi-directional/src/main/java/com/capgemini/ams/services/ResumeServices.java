package com.capgemini.ams.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.repositories.ApplicantRepository;
import com.capgemini.ams.repositories.ResumeRepository;

@Service
public class ResumeServices {
	@Autowired
	private ResumeRepository resumeRepo;
	@Autowired
	private ApplicantRepository applicantRepo;
	
	public Resume addResume(Long applicantId, Resume resume) {
		Optional<Applicant> optApplicant = applicantRepo.findById(applicantId);
		if(optApplicant.isPresent()) {
			Applicant applicant = optApplicant.get();
			resume.setApplicant(applicant);
			Resume savedResume = resumeRepo.save(resume);
			return savedResume;
		}
		return null;
	}

}
