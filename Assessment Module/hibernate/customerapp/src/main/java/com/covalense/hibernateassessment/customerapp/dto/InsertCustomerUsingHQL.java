package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertCustomerUsingHQL {
	public static void main(String[] args) {
		CustomerBean bean = new CustomerBean();
		String hql = "insert into TestBean(id,firstName,lastName,city) select id,firstName,lastName,city from CustomerBean";
		
		Transaction transaction = null;
		try (Session session = HibernateUtil.openSession();) {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			
			log.info("Inserted----->" + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
			
		} // end of try-catch
	}// End of main
}//End of class
