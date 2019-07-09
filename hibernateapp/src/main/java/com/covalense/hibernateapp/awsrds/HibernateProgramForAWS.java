package com.covalense.hibernateapp.awsrds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAWS {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date dt = format.parse("1992-06-06");
		Date dtJoin = format.parse("2018-06-06");
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(20);
		bean.setName("Sameer");
		bean.setAge(29);
		bean.setAcnt_no(898098009);
		bean.setPhone(789797090);
		bean.setDob(dt);
		bean.setDesignation("Analyst");
		bean.setEmail("sam@gmail.com");
		bean.setJoining_date(dtJoin);
		bean.setDept_ID(40);
		bean.setManager_ID(25);
		
		//1. Load the Config File
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.aws.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2. Build the sessionfactory
				SessionFactory factory = configuration.buildSessionFactory();
				
				//3. Open Session
				Session session = factory.openSession();
				
				//4. Interact with DB via session
				EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 1);
				log.info("Employee Details ===>"+infoBean.toString());
				
				//5. Close the session
				session.close();
		
	}//end of main

}//end of class
