package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.StudentBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetStudentNamedQuery {
public static void main(String[] args) {
		
		Session session = HibernateUtil.openSession();
		StudentBean bean = null;
		String hql = "from StudentBean where rollNo=102 and subject='science'";
		Query query = session.createQuery(hql);
		bean = session.get(StudentBean.class, 102);
		
			log.info("Roll no is :" + bean.getRollNo());
			log.info("First name is :" + bean.getFirstName());
			log.info("First name is :" + bean.getLastName());
			log.info("total marks is :" + bean.getTotalMarks());
			
	}//End of main
}//End of class