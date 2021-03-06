package com.covalense.mywebapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.beans.EmployeeInfoBean;


public class HibernateUtil {
	static SessionFactory factory =null;
	
	private HibernateUtil() {
	}

	private static SessionFactory buildSessionFactory() {
//		 new Configuration().configure();
//	    factory =  new Configuration().buildSessionFactory();
	    return  new Configuration()
	    		.configure()
	    		.addAnnotatedClass(EmployeeInfoBean.class)
	    		.addAnnotatedClass(EmployeeDepartmentInfoBean.class)
	    		.buildSessionFactory() ;

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
