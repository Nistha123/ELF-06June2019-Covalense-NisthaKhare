package com.covalense.designpattern.dao;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmployeeInfoBean;
import com.covalense.designpattern.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeHibernateDAOImplTwo implements EmployeeDAO{

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
		//to do
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		Session session = HibernateUtil.openSession();		
		EmployeeInfoBean readInfo = session.get(EmployeeInfoBean.class, id);
		session.close();
		return readInfo;		
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		}catch(Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}			
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {		
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		infoBean.setId(id);
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(infoBean);
			txn.commit();
			return true;
		}catch(Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return false;
	}

}
