package com.covalense.designpattern.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTestTwo {
	public static void main(String[] args) {
		log.info("1st time"+getEmployeeData(2).toString());
		log.info("2nd time"+getEmployeeData(2).toString());
		log.info("3rd time"+getEmployeeData(2).toString());
	}//end of main
	private static NewEmployeeInfoBean getEmployeeData(int id) {

		//1. Load the Config File
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/designpattern/cache/hibernate.cache.cfg.xml");
		cfg.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2. Build the sessionfactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3. Open Session
		Session session = factory.openSession();
		
		//4. Interact with DB via session
		NewEmployeeInfoBean infoBean = session.get(NewEmployeeInfoBean.class, 1);
		log.info(infoBean.toString());
		
		//5. Close the session
		session.close();
		
		return infoBean;
		
	}
}//end class
