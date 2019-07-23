package com.covalense.hibernateassessment.customerapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.bean.ProductBean;
import com.covalense.hibernateassessment.customerapp.bean.TestBean;

public class SessionFactorySingelton {
	
private static SessionFactory factory=null;
	
	private static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure()
				.addAnnotatedClass(CustomerBean.class)
				.addAnnotatedClass(TestBean.class)
				.addAnnotatedClass(ProductBean.class)
				.buildSessionFactory();
		
	}//End of buildSessionFactory() 
	
	private static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory = buildSessionFactory();
		}
		return factory;
	}//End of getSessionFactory() 
	
	public static Session openSession() {
		return getSessionFactory().openSession();
		
	}//End of openSession() 
	
}//End of class



