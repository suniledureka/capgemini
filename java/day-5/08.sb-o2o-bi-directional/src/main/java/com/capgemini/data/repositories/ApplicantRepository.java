package com.capgemini.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.data.entities.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
