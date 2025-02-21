package com.capgemini.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.boot.rest.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
