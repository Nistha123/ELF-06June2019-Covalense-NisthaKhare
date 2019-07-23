package com.covalense.hibernateassessment.customerapp.dto;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.covalense.hibernateassessment.customerapp.bean.ProductBean;
import com.covalense.hibernateassessment.customerapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetProductUsingRestriction {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.openSession();
		String hql = "from ProductBean";
		Criteria criteria = session.createCriteria(ProductBean.class).add(Restrictions.gt("price", 100.0));
		List<ProductBean> lstProduct = criteria.list();
		
		for (ProductBean bean : lstProduct) {
			log.info("Id is :" + bean.getProductId());
			log.info("Name is :" + bean.getProductName());
			log.info("Price is :" + bean.getPrice());
			log.info("Color is :" + bean.getColour());
		}
	}//End of main
}//End of class
