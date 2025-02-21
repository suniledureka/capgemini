package com.capgemini.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.students.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}