package com.capgemini.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.hibernate.entities.Product;
import com.capgemini.hibernate.utils.HibernateUtils;

public class SearchProduct2 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
				
		Product prod = session.get(Product.class, 101);
		//Product prod = session.get(Product.class, 1015);
		if(prod != null)
			System.out.println(prod);
		else
			System.out.println("no matching product found!!");
		session.close();
		sfactory.close();	
	}
}
