package com.capgemini.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ADDRESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@Column(name = "aid")
	private Integer addressId;
	private String street;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "employeeAddress")
	private Employee emp;

	public Address(Integer addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	
}
