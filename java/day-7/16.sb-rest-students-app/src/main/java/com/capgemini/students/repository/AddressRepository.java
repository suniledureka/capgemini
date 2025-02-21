package com.capgemini.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.students.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
