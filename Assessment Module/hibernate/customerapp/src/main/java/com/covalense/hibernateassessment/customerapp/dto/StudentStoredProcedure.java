package com.covalense.hibernateassessment.customerapp.dto;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.StudentBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentStoredProcedure {
public static void main(String[] args) {
	Transaction transaction = null;
		Session session = HibernateUtil.openSession();
		transaction = session.beginTransaction();
		
	//	Query query = session.createQuery(hql);
		StoredProcedureQuery query = session.createStoredProcedureQuery("SelectAllStudentDetails",StudentBean.class);
		List<StudentBean> lstStudent) =  query.getResultList();
		
			for (StudentBean bean : lstStudent) {
			log.info("FirstName is :" + bean.getFirstName());
			log.info("Total marks is :" + bean.getTotalMarks());
			
		}
			transaction.commit();
	}//End of main
}//End of class