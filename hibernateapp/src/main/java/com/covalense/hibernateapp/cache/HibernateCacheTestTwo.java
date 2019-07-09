package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTestTwo {
	public static void main(String[] args) {
		log.info("1st time"+getEmployeeData(2).toString());
		log.info("2nd time"+getEmployeeData(2).toString());
		log.info("3rd time"+getEmployeeData(1).toString());
	}//end of main
	private static NewEmployeeInfoBean getEmployeeData(int id) {

		NewEmployeeInfoBean infoBean;
		
		try(Session session=HibernateCacheUtil.openSession();){
			infoBean=session.get(NewEmployeeInfoBean.class, id);
		}
		
		return infoBean;
		
	}
}//end class
