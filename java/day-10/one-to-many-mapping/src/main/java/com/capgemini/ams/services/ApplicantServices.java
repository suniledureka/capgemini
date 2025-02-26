package com.capgemini.ams.services;
import org.springframework.stereotype.Service;

import com.capgemini.ams.entities.Applicant;
import com.capgemini.ams.entities.Resume;
import com.capgemini.ams.repositories.ApplicantRepository;

@Service
public class ApplicantServices {
	private ApplicantRepository applicantRepo;

	public ApplicantServices(ApplicantRepository applicantRepo) {
		super();
		this.applicantRepo = applicantRepo;
	}

	public Applicant saveApplicant(Applicant applicant) {
		if(!applicantRepo.existsById(applicant.getId())) {
			Resume resume = applicant.getResume();
			
			if(resume != null) {
				resume.setApplicant(applicant);
			}
			Applicant savedApplicant = applicantRepo.save(applicant);
			return savedApplicant;
		}
		return null;
	}

	public Applicant getApplicantById(Long applicantId) {
		Applicant appl = applicantRepo.findById(applicantId).get();
		System.out.println(appl);
		return appl;
	}
}
