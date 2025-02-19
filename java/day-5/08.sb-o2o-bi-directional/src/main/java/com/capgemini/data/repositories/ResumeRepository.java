package com.capgemini.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.data.entities.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
