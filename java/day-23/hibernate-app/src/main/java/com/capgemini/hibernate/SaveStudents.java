package com.capgemini.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.hibernate.entities.Student;
import com.capgemini.hibernate.utils.HibernateUtils;

public class SaveStudents {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		String req = "Y";
		
		do {
			System.out.print("enter student name: ");
			String sname = sc.next();
			
			System.out.print("enter student email: ");
			String email = sc.next();
			
			Student st = new Student(sname, email);
			session.save(st); //session.persist(st);
			
			System.out.print("do you want to save more students? [Y/N]: ");
			req  = sc.next();
		}while(req.equalsIgnoreCase("Y"));
		
		tx.commit();
		session.close();
		sf.close();
	}

}
