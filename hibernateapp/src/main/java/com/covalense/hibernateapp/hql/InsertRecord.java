package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {
	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		String hql = "insert into EmployeeNewInfo(eid,ename,email) select id,name,email from EmployeeInfoBean ";
		
		Transaction transaction = null;
		try {
			
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			log.info("---->" + result);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}//end of main

}//end of class
