package com.covalense.emp.onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.emp.manytomany.TrainingInfoBean;
import com.covalense.emp.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.manytoone.EmployeeExperienceInfoBean;

public class HibernateImpl {
	private Configuration config = new Configuration();
	
	private SessionFactory factory = config
								.configure()
								.buildSessionFactory();
	
	public void createEmployee(EmployeeInfoBean infoBean ,
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
	
	public void createEmployee(EmployeeInfoBean beanone) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(beanone);
		transaction.commit();
		session.close();
		
	}//end of createEmployee()
	
	public EmployeeInfoBean getEmployee(int id) {
		Session session = factory.openSession();
		EmployeeInfoBean infoBeanone = new EmployeeInfoBean();
		infoBeanone = session.get(EmployeeInfoBean.class, id);
		return infoBeanone;
		
	}//end of getEmployee()
	
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
	}//end of createTraining()
	
}//end of class
