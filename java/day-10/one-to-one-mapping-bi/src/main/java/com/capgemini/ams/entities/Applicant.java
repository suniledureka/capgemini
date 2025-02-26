package com.capgemini.ams.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Applicant {
	@Id
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String status;
	
	@OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
	@JsonBackReference
	private Resume resume;
}

