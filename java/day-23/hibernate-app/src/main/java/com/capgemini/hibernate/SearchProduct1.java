package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernate.entities.Product;
import com.capgemini.hibernate.utils.HibernateUtils;

public class SearchProduct1 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
				
		Product prod = new Product();
		System.out.println(prod);
		
		try {
			session.load(prod, 101);
			//session.load(prod, 1015);
		}catch(Exception ex) {
			System.err.println(ex);
		}
		
		System.out.println(prod);
		session.close();
		sfactory.close();	
	}
}
