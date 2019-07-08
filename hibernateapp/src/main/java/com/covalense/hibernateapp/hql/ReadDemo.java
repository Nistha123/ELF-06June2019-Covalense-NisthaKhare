package com.covalense.hibernateapp.hql;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "Select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		 List<String> namelst = query.list();
		 
		 for (String nameBean : namelst) {
			 log.info("name is " + nameBean);		
		}
		
		/*
		 * String hql = "from EmployeeInfoBean"; Query query = session.createQuery(hql);
		 * List<EmployeeInfoBean> lst = query.list();
		 * 
		 * for (EmployeeInfoBean bean : lst) { log.info("Id is " + bean.getId());
		 * log.info("name is " + bean.getName()); log.info("phone is " +
		 * bean.getPhone()); log.info("Age is " + bean.getAge()); log.info("Salary is "+
		 * bean.getSalary()); log.info("Account no is " + bean.getAcnt_no());
		 * log.info("DOB is " + bean.getDob()); log.info("Designation is " +
		 * bean.getDesignation()); log.info("Dept ID is " + bean.getDept_ID());
		 * log.info("Manager ID is " + bean.getManager_ID());
		 * 
		 * }
		 */
		 
		session.close();
		
	}//end of main

}//end of class
