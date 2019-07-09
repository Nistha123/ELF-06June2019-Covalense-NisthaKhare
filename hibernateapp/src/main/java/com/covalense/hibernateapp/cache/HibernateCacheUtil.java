package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	public static SessionFactory factory = null;

	private HibernateCacheUtil() {

	}

	public static SessionFactory getFactory() {
		if (factory == null) {
			/*
			 * Configuration config = new Configuration();
			 * config.configure("hibernate.cache.cfg.xml");
			 * config.addAnnotatedClass(NewEmployeeInfoBean.class); return
			 * config.buildSessionFactory();
			 */
			factory = new Configuration()
					.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml")
					.addAnnotatedClass(NewEmployeeInfoBean.class)
					.buildSessionFactory();
		}
		return factory;
	}//end of buildfactory()
	
	public static Session openSession() {
		
		return getFactory().openSession();
		
	}

}
