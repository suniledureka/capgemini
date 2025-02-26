package com.capgemini.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.ams.entities.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
