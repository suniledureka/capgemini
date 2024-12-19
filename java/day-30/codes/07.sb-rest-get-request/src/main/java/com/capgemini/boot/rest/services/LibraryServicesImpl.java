package com.capgemini.boot.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.boot.rest.dto.Book;
import com.capgemini.boot.rest.repository.LibraryRepository;

@Service
public class LibraryServicesImpl implements LibraryServices {
	private LibraryRepository libRepo;
	
	//constructor injection
	public LibraryServicesImpl(LibraryRepository libRepo) {
		super();
		this.libRepo = libRepo;
	}

	@Override
	public List<Book> getAllBooks() {		
		return libRepo.getBooks();
	}

}
