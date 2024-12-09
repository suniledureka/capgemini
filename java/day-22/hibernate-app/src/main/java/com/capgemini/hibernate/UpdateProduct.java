package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernate.entities.Product;
import com.capgemini.hibernate.utils.HibernateUtils;

public class UpdateProduct {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		
		/*
		//-- updating Product - approach-1 ----
		Product prod = new Product(101, "Computer System",46500.5f);
		session.merge(prod); //session.update(prod)
		*/
		
		
		//-- updating Product - approach-2 ----
		Product prod = session.get(Product.class, 101);		
		if(prod != null) {
			System.out.println(prod);
			prod.setProductName("Computer"); //dirty objects
		}
		else
			System.out.println("no matching product found!!");
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();			

	}

}
