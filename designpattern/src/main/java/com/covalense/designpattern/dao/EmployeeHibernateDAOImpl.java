package com.covalense.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeHibernateDAOImpl implements EmployeeDAO{

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
		//to do
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1. Load the config file
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2. build session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//3. Open session
		Session session = factory.openSession();
		
		//4. Interact with DB via session
		EmployeeInfoBean readInfo = session.get(EmployeeInfoBean.class, id);
		
		//5. Close the session
		session.close();
		return readInfo;		
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
