package com.capgemini.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "resume_id")
	private Resume resume;
}
