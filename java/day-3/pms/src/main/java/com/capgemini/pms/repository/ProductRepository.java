package com.capgemini.pms.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.pms.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
