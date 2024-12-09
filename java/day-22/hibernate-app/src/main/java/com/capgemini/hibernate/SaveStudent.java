package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.capgemini.hibernate.entities.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); //DOM Parsing happens
		
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();  //transient state
		st.setStudentId(102);
		st.setStudentName("Sagar");
		st.setStudentEmail("sagar@capgemini.com");
		
		session.persist(st);//session.save(st);  //persistence state
		
		System.out.println("-".repeat(100));
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}
