package com.capgemini.boot.cms.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "CONTACT_MASTER")
public class Contact {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	@Column(name = "CONTACT_NO")
	private String contactNumber;

	@Override
	public String toString() {
		return String.format("Contact [%-5d  %-13s %-10s]", contactId , contactName, contactNumber);
	} 
	
	
}