package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.StudentBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentPrgmSeven {
public static void main(String[] args) {
		Transaction transaction = null;
		Session session = HibernateUtil.openSession();
		transaction = session.beginTransaction();
		StudentBean bean = null;
		String hql = " min(totalMarks),max(totalMarks),avg(totalMarks) from StudentBean";
		Query query = session.createQuery(hql);
		int result = query.executeUpdate();
		log.info("Result is :" + result);
		transaction.commit();
	}//End of main
}//End of class