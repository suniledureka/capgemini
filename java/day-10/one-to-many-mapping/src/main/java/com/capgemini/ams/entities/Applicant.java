package com.capgemini.ams.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = {"resume", "applications"})
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
	
	@OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Application> applications = new ArrayList<>();

}

