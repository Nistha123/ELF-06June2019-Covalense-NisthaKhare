package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallStoredProcedure {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureQuery("SelectAllEmpDetails",EmployeeInfoBean.class);
		
		List<EmployeeInfoBean> empList =  query.getResultList();
		
		for (EmployeeInfoBean empBean : empList) {
			log.info("Id is :" + empBean.getId()); 
			log.info("Name is :" + empBean.getName());
		}
		/*
		 * List<Object[]> empList = query.getResultList();
		 * 
		 * for (Object[] empDet : empList) {
		 * 
		 * log.info("Id is :" + empDet[0]); log.info("Name is :" + empDet[1]);
		 * log.info("Age is :" +empDet[2]);
		 * 
		 * }
		 */
		
	}//end of main

}//end of class
