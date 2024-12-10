package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernate.entities.Customer;
import com.capgemini.hibernate.utils.HibernateUtils;

public class TestApp {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Customer customer1 = new Customer("Sanjay", "9848586878");
		Customer customer2 = new Customer("Sooraj", "7418529635");
		Customer customer3 = new Customer("Mahesh", "1234567890");
		
		session.persist(customer1);
		session.persist(customer2);
		session.persist(customer3);
		
		session.getTransaction().commit();
		session.close();
		
		sf.close();
	}
}
