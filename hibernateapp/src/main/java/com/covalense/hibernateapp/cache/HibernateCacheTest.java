package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		
		//1. Load the Config File
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/designpattern/cache/hibernate.cache.cfg.xml");
		cfg.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2. Build the sessionfactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3. Open Session
		Session session = factory.openSession();
		
		//4. Interact with DB via session
		NewEmployeeInfoBean infoBean1 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("First===>"+infoBean1.toString());
		NewEmployeeInfoBean infoBean2 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("Second===>"+infoBean2.toString());
		NewEmployeeInfoBean infoBean3 = session.get(NewEmployeeInfoBean.class, 1);
		log.info("Third===>"+infoBean3.toString());
		
		//5. Close the session
		session.close();
		
		
	}//end of main
}//end class
