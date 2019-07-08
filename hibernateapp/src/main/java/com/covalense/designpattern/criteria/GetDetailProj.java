package com.covalense.designpattern.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailProj {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection proName = Projections.property("name");
		Projection proId = Projections.property("id");
		ProjectionList proList = Projections.projectionList();
		proList.add(proId);
		proList.add(proName);
		criteria.setProjection(proList);
		List<Object[]> obj = criteria.list();
		
		for (Object[] o : obj) {
			log.info("Id is " + o[0]);
			log.info("name is " + o[1]);
		}
		
	}

}
