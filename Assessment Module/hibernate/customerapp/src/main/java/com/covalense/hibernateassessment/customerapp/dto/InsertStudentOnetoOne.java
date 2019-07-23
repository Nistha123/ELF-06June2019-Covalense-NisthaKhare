package com.covalense.hibernateassessment.customerapp.dto;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernateassessment.customerapp.bean.Student_OtherinfoBean;
import com.covalense.hibernateassessment.customerapp.bean.Student_infoBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

public class InsertStudentOnetoOne {
	public static void main(String[] args) {
		Student_infoBean infoBean = new Student_infoBean();
		
		infoBean.setRollNo(104);
		infoBean.setAge(22);
		infoBean.setEmailId("nis@gmail.com");
		infoBean.setName("Nisha");
		
		Student_OtherinfoBean otherinfoBean = new Student_OtherinfoBean();
		
		otherinfoBean.setFatherName("abc");
		otherinfoBean.setMotherName("sjwha");
		otherinfoBean.setRollNo(104);
	infoBean.setOtherInfo(otherinfoBean);
	
	Transaction transaction = null;
	Session session = HibernateUtil.openSession();
	 transaction = session.beginTransaction();
	 session.saveOrUpdate(infoBean);
	 transaction.commit();
	 session.close();
	}//End of main
}//End of class
