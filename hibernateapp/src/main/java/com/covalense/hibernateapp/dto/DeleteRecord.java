package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {
	public static void main(String[] args) {
		Configuration cfg =  new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean deleteInfo = session.get(EmployeeInfoBean.class, 10);		
		log.info("record deleted");
		
		Transaction transaction = session.beginTransaction();
		session.delete(deleteInfo);
		transaction.commit();
		session.close();
		
	}

}
