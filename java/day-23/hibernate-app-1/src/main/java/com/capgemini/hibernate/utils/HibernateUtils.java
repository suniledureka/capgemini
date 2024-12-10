package com.capgemini.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sfactory = null;

	public static SessionFactory getSessionFactory() {
		if (sfactory == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml"); // DOM Parsing happens

			sfactory = config.buildSessionFactory();
		}
		return sfactory;
	}
}
