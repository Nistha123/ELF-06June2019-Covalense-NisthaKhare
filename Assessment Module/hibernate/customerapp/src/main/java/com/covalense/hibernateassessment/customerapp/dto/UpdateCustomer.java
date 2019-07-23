package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class UpdateCustomer {
	public static void main(String[] args) {

		CustomerBean bean = new CustomerBean();

		Transaction transaction = null;
		try (Session session = HibernateUtil.openSession();) {
		transaction = session.beginTransaction();
		
		bean = session.get(CustomerBean.class, 2);
		bean.setAddress("Pune");
		bean.setLastName("kumar");
		session.update(bean);
		transaction.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} // end of try-catch
	}// End of main
}// End of class
