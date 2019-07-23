package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class ReadCustomer {
	public static void main(String[] args) {

		CustomerBean bean = new CustomerBean();
		String hql = "from CustomerBean";

		try (Session session = HibernateUtil.openSession();) {
			Query query = session.createQuery(hql);
			List<CustomerBean> lstCustomer = query.list();
			
			for (CustomerBean customerBean : lstCustomer) {
				log.info("Id is :" + customerBean.getId());
				log.info("First name is :" + customerBean.getFirstName());
				log.info("Last Name is :" + customerBean.getLastName());
				log.info("address is :" + customerBean.getAddress());
				log.info("Contact no is :" + customerBean.getContactNumber());
				log.info("country is :" + customerBean.getCountry());
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} // end of try-catch
	}// End of main
}// End of class