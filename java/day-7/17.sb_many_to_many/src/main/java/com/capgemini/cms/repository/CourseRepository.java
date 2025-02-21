package com.capgemini.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.cms.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
