package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailsUsingRestrictions {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class).add( Restrictions.gt("salary", 10000));		
		List<EmployeeInfoBean> empl = criteria.list();
		
		for (EmployeeInfoBean emp : empl) {
			log.info("Employeee id " + emp.getId());
			log.info("Employeee name " + emp.getName());
		}
		
		
	
		/*
		 * log.info("Employeee age " + emp.getAge()); log.info("Employeee gender " +
		 * emp.getGender());
		 */
	}

}
