package com.capgemini.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.boot.rest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
