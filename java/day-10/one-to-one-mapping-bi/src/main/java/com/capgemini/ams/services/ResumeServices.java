package com.capgemini.ams.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.repositories.ApplicantRepository;
import com.capgemini.ams.repositories.ResumeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResumeServices {	
	private ResumeRepository resumeRepo;
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
	
	public Resume getResumeById(Long resumeId) {
		Optional<Resume> resumeOptional = resumeRepo.findById(resumeId);
		if(resumeOptional.isPresent()) {
			Resume resume = resumeOptional.get();
			return resume;
		}else {
			return null;
		}
	}

}
