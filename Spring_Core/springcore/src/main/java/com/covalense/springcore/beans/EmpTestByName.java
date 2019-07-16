package com.covalense.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmpTestByName {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmpByName.xml");
		
		EmployeeInfoBean infoBean = (EmployeeInfoBean) applicationContext.getBean("empbeanByName");
		
		log.info("**************************************************");

		log.info("Employee Id is :" + infoBean.getId());
		log.info("Employee Name is :" + infoBean.getName());

		log.info("**************************************************");

		log.info("Department Id is :" + infoBean.getDepartmentInfoBean().getDeptId());
		log.info("Department Name is :" + infoBean.getDepartmentInfoBean().getDeptName());

	}

}
