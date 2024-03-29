package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {
	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> empList = criteria.list();
		
		for (EmployeeInfoBean bean : empList) {
			log.info("Id is :" + bean.getId());
			log.info("Name is :" + bean.getName());
			log.info("Phone is :" + bean.getPhone());
			log.info("Age is :" + bean.getAge());
			log.info("Account no is :" + bean.getAcnt_no());
			log.info("Gender is :" + bean.getGender());
			log.info("Salary is :" + bean.getSalary());
		}
		session.close();
		
		
	}//end of main

}//end of class
