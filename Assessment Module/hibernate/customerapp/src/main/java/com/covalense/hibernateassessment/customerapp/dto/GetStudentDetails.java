package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.ProductBean;
import com.covalense.hibernateassessment.customerapp.bean.StudentBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetStudentDetails {
public static void main(String[] args) {
		
		Session session = HibernateUtil.openSession();
		String hql = "from StudentBean";
		Query query = session.createQuery(hql);
		List<StudentBean> lstStudent = query.list();
		
		for (StudentBean bean : lstStudent) {
			log.info("FirstName is :" + bean.getFirstName());
			log.info("Total marks is :" + bean.getTotalMarks());
			
		}
	}//End of main
}//End of class

