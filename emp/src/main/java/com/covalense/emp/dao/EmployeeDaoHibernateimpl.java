package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.omg.CORBA.Request;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDaoHibernateimpl implements EmployeeDao {
	
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(String id) {
		Session session = HibernateUtil.openSession();
		/*
		 * CriteriaBuilder cb = session.getCriteriaBuilder();
		 * CriteriaQuery<EmployeeInfoBean> cr = cb.createQuery(EmployeeInfoBean.class);
		 * 
		 * Root<EmployeeInfoBean> root = cr.from(EmployeeInfoBean.class);
		 * cr.select(root);
		 * 
		 * Query<EmployeeInfoBean> query = session.createQuery(cr);
		 * cr.select(root).where(cb.like(root.get("id"), "%"+id+"%"));
		 * List<EmployeeInfoBean> results = query.getResultList(); session.close();
		 * return new ArrayList<EmployeeInfoBean>(results);
		 */
		String hql = "from EmployeeInfoBean where str(id) like '"+ id + "%'";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> lstBean = query.list();
		return lstBean;

		}


	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean;
		
		  String query = "from EmployeeInfoBean"; 
		  Query<EmployeeInfoBean> empList = session.createQuery(query);
   		   List<EmployeeInfoBean> list = empList.list();
		
		for (EmployeeInfoBean empbean : list) {
			log.info("Id is " + empbean.getId());
			  log.info("name is " + empbean.getName());
			  log.info("phone is " + empbean.getPhone());
			  log.info("Age is " + empbean.getAge()); 
			  log.info("Salary is "+ empbean.getSalary());
			  log.info("Account no is " + empbean.getAcnt_no());
			  log.info("DOB is " + empbean.getDob());
			  log.info("Designation is " + empbean.getDesignation()); 
			  log.info("Dept ID is " + empbean.getDept_ID());
			  log.info("Manager ID is " + empbean.getManager_ID());
			
		}
		return list;
	}

	@Override
	public boolean createEmployee(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		}catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
		}

		return false;
	}

	@Override
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

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
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
