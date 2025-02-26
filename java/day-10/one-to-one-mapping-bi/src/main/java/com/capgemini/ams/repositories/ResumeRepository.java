package com.capgemini.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.ams.entities.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
