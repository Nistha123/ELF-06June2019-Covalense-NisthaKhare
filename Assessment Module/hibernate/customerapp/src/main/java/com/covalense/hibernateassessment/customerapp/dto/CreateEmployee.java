package com.covalense.hibernateassessment.customerapp.dto;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.hibernateassessment.customerapp.bean.CustomerBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;

public class CreateEmployee {
	
	public static void main(String[] args) {
		
		CustomerBean bean=new CustomerBean();
		bean.setId(1);
		bean.setFirstName("nistha");
		bean.setLastName("Khare");
		bean.setContactNumber(78989);
		bean.setAddress("abc");
		bean.setCity("Bangalore");
		bean.setState("karnataka");
		bean.setCountry("India");
		
		Transaction transaction=null;
		try(Session session = HibernateUtil.openSession();){
			transaction = session.beginTransaction();
			session.save(bean);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null) {
				transaction.rollback();
			}
		}//end of try-catch
	}//End of main

}//End of class
