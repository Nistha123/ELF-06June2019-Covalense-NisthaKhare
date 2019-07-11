package com.covalense.mywebapp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.mywebapp.beans.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeHibernateDAOImpl implements EmployeeDAO{

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();	
		String query = "from EmployeeInfoBean";
		Query<EmployeeInfoBean> queryBean = session.createQuery(query);	
		List<EmployeeInfoBean> beanList = queryBean.list();
		
		for (EmployeeInfoBean bean : beanList) {
			log.info("Id is " + bean.getId());
			  log.info("name is " + bean.getName());
			  log.info("phone is " + bean.getPhone());
			  log.info("Age is " + bean.getAge()); 
			  log.info("Salary is "+ bean.getSalary());
			  log.info("Account no is " + bean.getAccountNo());
			  log.info("DOB is " + bean.getDob());
			  log.info("Designation is " + bean.getDesignation()); 
			  log.info("Dept ID is " + bean.getDepartmentId());
			  log.info("Manager ID is " + bean.getManagerId());
		}
		return beanList;
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		EmployeeInfoBean readInfo;
		try(Session session = HibernateUtil.openSession();) {			
			readInfo = session.get(EmployeeInfoBean.class, id);
		}
		return readInfo;		
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try(Session session = HibernateUtil.openSession();) {			
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		}catch(Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
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
		try(Session session = HibernateUtil.openSession();) {			
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
	
	private boolean saveOrUpdateDept(EmployeeDepartmentInfoBean beanDept) {
		Transaction txn = null;
		try(Session session = HibernateUtil.openSession();) {			
			txn = session.beginTransaction();
			session.saveOrUpdate(beanDept);
			txn.commit();
			return true;
		}catch(Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
			return false;
		}			
	}

	@Override
	public boolean createDeptInfo(EmployeeDepartmentInfoBean bean) {
		return saveOrUpdateDept(bean);
	}

}
