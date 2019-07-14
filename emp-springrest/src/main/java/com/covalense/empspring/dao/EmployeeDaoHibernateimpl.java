package com.covalense.empspring.dao;

import java.util.List;


import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.empspring.beans.EmployeeInfoBean;
import com.covalense.empspring.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import lombok.extern.java.Log;

@Log
public class EmployeeDaoHibernateimpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(String id) {
		Session session = sessionfactory.openSession();
		String hql = "from EmployeeInfoBean where str(id) like '" + id + "%'";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> lstBean = query.list();
		return lstBean;
	}// End of getAllEmployeeInfo()

	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		Session session = sessionfactory.openSession();

		String query = "from EmployeeInfoBean";
		Query<EmployeeInfoBean> empList = session.createQuery(query);
		List<EmployeeInfoBean> list = empList.list();

		return list;
	}// End of getAllEmployee()

	public List<EmployeeInfoBean> searchLikeEmployee(String id) {
		Session session = sessionfactory.openSession();
		EmployeeInfoBean bean;

		String query = "from EmployeeInfoBean where str(id) like :id";

		Query empList = session.createQuery(query);
		empList.setParameter("id", id+"%");
		List<EmployeeInfoBean> list = empList.list();

		return list;
	}// End of searchLikeEmployee()

	@Override
	public boolean createEmployee(EmployeeInfoBean bean) {
		Session session = null;
		Transaction txn = null;
		try {
			session = sessionfactory.openSession();
			txn=session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception 	e) {
			e.getStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		}
		session.close();

		return false;
	}// End of createEmployee()

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		try {
			EmployeeInfoBean readInfo;
			Session session = sessionfactory.openSession();
			readInfo = session.get(EmployeeInfoBean.class, id);
			//session.close();
			return readInfo;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}// End of getEmployeeInfo()

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}// End of getEmployeeInfo()
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session =sessionfactory.openSession();
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
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}// End of updateEmployeeInfo()

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		
	//	EmployeeInfoBean infoBean = new EmployeeInfoBean();
	//	infoBean.setId(id);
		try {			
			
			Session session = sessionfactory.openSession();
			EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, id);
			txn = session.beginTransaction();
			session.delete(infoBean);
			txn.commit();
			return true;
		}catch(Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}// End of deleteEmployeeInfo()

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(id);
	}// End of deleteEmployeeInfo()

}// End of class
