package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.hibernate.entities.Product;
import com.capgemini.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product prod = new Product(100101, "Mobile", 65000f);
		session.persist(prod);
		 
		tx.commit();
		session.close();
		sfactory.close();
	}
}
