package com.covalense.hibernateapp.hql;

import org.hibernate.query.Query;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DeleteRecordpractice {
	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		String hql = "delete from EmployeeNewInfo where id=:eid";
		
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter("eid", 28);
			int result = query.executeUpdate();
			log.info("Updated----" + result);
			transaction.commit();
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	
	}

}
