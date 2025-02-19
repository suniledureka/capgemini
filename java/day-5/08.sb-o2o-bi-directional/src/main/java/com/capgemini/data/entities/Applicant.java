package com.capgemini.data.entities;

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
	
	@OneToOne(mappedBy = "applicant")
	private Resume resume;
}
