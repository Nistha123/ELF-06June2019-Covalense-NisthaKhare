package com.covalense.hibernateapp.onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperienceInfoBean;

public class HibernateImpl {
	private Configuration config = new Configuration();
	
	private SessionFactory factory = config
								.configure()
								.buildSessionFactory();
	
	public void createEmployee(EmployeeInfoBeanone infoBean ,
					EmployeeOtherInfoBean otherInfoBean, 
					List<EmployeeAddressInfoBean> lstaddressInfoBean,
					List<EmployeeEducationalInfoBean> lsteducationalInfoBeans,
					List<EmployeeExperienceInfoBean> lstExperienceInfo) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		
		for (EmployeeAddressInfoBean addressInfoBean : lstaddressInfoBean) {
			session.save(addressInfoBean);
		}
		
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : lsteducationalInfoBeans) {
			session.save(employeeEducationalInfoBean);
		}
		
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : lstExperienceInfo) {
			session.save(employeeExperienceInfoBean);
		}
		transaction.commit();
		session.close();
	}//end of createEmployee()
	
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
	}//end of createTraining()
	
}//end of class
