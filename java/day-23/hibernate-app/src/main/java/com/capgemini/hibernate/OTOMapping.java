package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernate.entities.Address;
import com.capgemini.hibernate.entities.Employee;
import com.capgemini.hibernate.utils.HibernateUtils;

public class OTOMapping {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Employee emp = new Employee(101, "Sunil Joseph");
		
		Address address = new Address(1, "Hyderabad", "Telangana", "Mothinagar");
		emp.setEmployeeAddress(address);
		
		session.persist(emp);
		//session.persist(address);
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}

}
