package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

import lombok.Builder;

public class HibernateUtil {
	static SessionFactory factory =null;

	private static SessionFactory buildSessionFactory() {

		return new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(EmployeeInfoBean.class).
				addAnnotatedClass(EmployeeOtherInfoBean.class).
				buildSessionFactory();

	}
	private static SessionFactory getSessionFactory() {
		if(factory==null) {		
			factory = buildSessionFactory();		
		}
		return factory;
	}
	
	public static Session openSession() {
		
		return getSessionFactory().openSession();
		
	}



}
