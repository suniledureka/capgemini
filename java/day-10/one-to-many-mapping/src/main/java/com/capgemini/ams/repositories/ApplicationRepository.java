package com.capgemini.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.ams.entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
