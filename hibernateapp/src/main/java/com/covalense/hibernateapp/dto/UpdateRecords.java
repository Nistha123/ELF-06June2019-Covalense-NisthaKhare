package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.util.HibernateUtil;

/* USE CASE :
 * UpdateRecords is a main class 
 * to update the employee details in the database using session factory
 */

//SOLUTION :
public class UpdateRecords {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean updateInfo = session.get(EmployeeInfoBean.class, 1);
		
		updateInfo.setSalary(65000);
		updateInfo.setDesignation("Jr. Software Developer");
		
		EmployeeOtherInfoBean updateOtherInfo = session.get(EmployeeOtherInfoBean.class, 3);
		
		updateOtherInfo.setBlood_grp("A-");
		
		Transaction transaction = session.beginTransaction();
		session.update(updateInfo);
		session.update(updateOtherInfo);
		transaction.commit();
		session.close();
		
	}//end of main

}//end of class
