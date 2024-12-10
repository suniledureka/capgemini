package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernate.entities.Address;
import com.capgemini.hibernate.entities.Employee;
import com.capgemini.hibernate.utils.HibernateUtils;

public class OTOMappingRetrieve {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Employee emp = session.get(Employee.class, 101);
		
		System.out.println(emp.getEmployeeId() + "  " + emp.getEmployeeName());
		
		System.out.println("-".repeat(100));
		Address empAdr = emp.getEmployeeAddress();
		System.out.println(empAdr);
		session.close();
		sf.close();
	}

}
