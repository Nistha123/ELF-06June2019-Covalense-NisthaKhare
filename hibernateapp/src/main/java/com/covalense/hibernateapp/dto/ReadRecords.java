package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

/* USE CASE :
 * ReadRecords is a main class 
 * to read the employee details in the database using session factory
 */

//SOLUTION :
@Log
public class ReadRecords {
	
	public static void main(String[] args) {
	
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean readInfo = session.get(EmployeeInfoBean.class, 5);
		
		 log.info("Id is :" + readInfo.getId());
		 log.info("name is :" + readInfo.getName());
		 log.info("Age is :" + readInfo.getAge());
		 log.info("Gender is :" + readInfo.getGender());
		 log.info("Salary is :" + readInfo.getSalary());
		 
		 session.close();
		
		
	}//end of main

}//end of class
