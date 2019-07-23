package com.covalense.hibernateassessment.customerapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.bean.ProductBean;
import com.covalense.hibernateassessment.customerapp.bean.StudentBean;
import com.covalense.hibernateassessment.customerapp.bean.Student_OtherinfoBean;
import com.covalense.hibernateassessment.customerapp.bean.Student_infoBean;
import com.covalense.hibernateassessment.customerapp.bean.TestBean;

public class HibernateUtil {
	private static SessionFactory factory=null;
	
	private static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure()
				.addAnnotatedClass(CustomerBean.class)
				.addAnnotatedClass(TestBean.class)
				.addAnnotatedClass(ProductBean.class)
				.addAnnotatedClass(StudentBean.class)
				.addAnnotatedClass(Student_infoBean.class)
				.addAnnotatedClass(Student_OtherinfoBean.class)
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

}//End of Util Class
