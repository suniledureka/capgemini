package com.capgemini.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.data.entities.Applicant;
import com.capgemini.data.entities.Resume;
import com.capgemini.data.repositories.ApplicantRepository;
import com.capgemini.data.repositories.ResumeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{
	private ApplicantRepository applicantRepo;
	private ResumeRepository resumeRepo;
	
	public Application(ApplicantRepository applicantRepo, ResumeRepository resumeRepo) {
		super();
		this.applicantRepo = applicantRepo;
		this.resumeRepo = resumeRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Applicant applicant = new Applicant();
		
		applicant.setId(101L);
		applicant.setName("Praveen");
		applicant.setEmail("praveen@gmail.com");
		applicant.setPhone("9848586878");
		
		Resume resume = new Resume();
		resume.setContents("Praveen\'s Resume Data");
		resume.setApplicant(applicant);
		
		applicantRepo.save(applicant);
		resumeRepo.save(resume);
	}

}
