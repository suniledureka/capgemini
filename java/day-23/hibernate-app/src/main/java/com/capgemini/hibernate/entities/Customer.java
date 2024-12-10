package com.capgemini.hibernate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
//@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Integer customerId;
	private String customerName;
	private String customerNo;

}
