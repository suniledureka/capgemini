package com.capgemini.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.boot.rest.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
