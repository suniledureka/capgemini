package com.capgemini.boot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.boot.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
