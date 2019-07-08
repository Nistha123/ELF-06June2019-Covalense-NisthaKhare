package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		/*
		 * String hql = "update from EmployeeInfoBean set name='Rohit' where id=:eid";
		 */
		 
		 String hql = "update from EmployeeInfoBean set name=:ename where id=:eid"; 
		
		Query query = session.createQuery(hql);
		
		  query.setParameter("eid", Integer.parseInt(args[0]));
		  query.setParameter("ename", args[1]);
		 
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated----" + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}// end of main

}// end of class
