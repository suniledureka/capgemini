package com.capgemini.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.cms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
