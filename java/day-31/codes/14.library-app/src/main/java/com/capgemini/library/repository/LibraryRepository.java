package com.capgemini.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.library.entity.Book;

public interface LibraryRepository extends CrudRepository<Book, Integer> {

}
