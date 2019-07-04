package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory =null;

	public static SessionFactory buildSessionFactory() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    factory = cfg.buildSessionFactory();
	    return factory ;

	}
	
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			return buildSessionFactory();
		}
		else {
			return factory;
		}
	}


}
