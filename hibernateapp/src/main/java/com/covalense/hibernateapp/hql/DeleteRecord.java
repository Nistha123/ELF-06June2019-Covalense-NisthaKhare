package com.covalense.hibernateapp.hql;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();		
		String hql= "delete from EmployeeInfoBean where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 18);
		Transaction transaction=null;
		
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Updated----" + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	
	}

}
