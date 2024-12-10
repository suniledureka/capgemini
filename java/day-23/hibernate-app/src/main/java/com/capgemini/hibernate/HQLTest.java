package com.capgemini.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;

import com.capgemini.hibernate.entities.Product;
import com.capgemini.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		//String hql = "from com.capgemini.hibernate.entities.Product";
		//String hql = "from com.capgemini.hibernate.entities.Product where productName='Speaker'";
		//String hql = "from com.capgemini.hibernate.entities.Product where productName like 'M%'";
		String hql = "from com.capgemini.hibernate.entities.Product where productId IN(101, 105, 205, 608,103)";

		Query<Product> q = session.createQuery(hql, Product.class);
		List<Product> products = q.getResultList();
		*/
		
		/*
		String hql = "from com.capgemini.hibernate.entities.Product where productId between ?1 and ?2"; //positional parameters
		Query<Product> q = session.createQuery(hql, Product.class);
		q.setParameter(1, 101);
		q.setParameter(2, 106);
		List<Product> products = q.getResultList();
		*/
		
		/*
		String hql = "from com.capgemini.hibernate.entities.Product where productId between :minpid and :maxpid"; //named parameters
		Query<Product> q = session.createQuery(hql, Product.class);
		q.setParameter("minpid", 105);
		q.setParameter("maxpid", 300);
		List<Product> products = q.getResultList();		
		displayProducts(products);
		*/
		
		//-- performing DML operations with HQL
		session.beginTransaction();
		
		String hql = "update com.capgemini.hibernate.entities.Product set productName='COMPUTER', productPrice=5000 where productId=101";
		//Query<Product> q = session.createQuery(hql, Product.class);
		MutationQuery q = session.createMutationQuery(hql);
		int n = q.executeUpdate();
		System.out.println("no of products affected = " + n);
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}

	private static void displayProducts(List<Product> products) {
		products.stream().forEach(prod ->{
			System.out.println(prod);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		});		
	}

}
