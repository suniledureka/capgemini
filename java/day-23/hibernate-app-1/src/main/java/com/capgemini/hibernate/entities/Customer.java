package com.capgemini.hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Getter
@Setter
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
*/
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	@Id
	//@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
	@SequenceGenerator(name = "customer_id_seq", initialValue = 1000, allocationSize = 1)
	private Integer customerId;
	private String customerName;
	private String customerNo;

	public Customer(String customerName, String customerNo) {
		super();
		this.customerName = customerName;
		this.customerNo = customerNo;
	}

}
