package com.covalense.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmployeeBean.xml");

		EmployeeInfoBean bean1 = (EmployeeInfoBean) applicationContext.getBean("empbean");
		/*
		 * Scanner sc = new Scanner(System.in); log.info("Input Id");
		 * bean1.setId(sc.nextInt()); sc.nextLine(); log.info("Input Name");
		 * bean1.setName(sc.nextLine());
		 * 
		 * 
		 * EmployeeInfoBean bean2 = (EmployeeInfoBean)
		 * applicationContext.getBean("empbean"); log.info("Input Id");
		 * bean2.setId(sc.nextInt()); sc.nextLine(); log.info("Input Name");
		 * bean2.setName(sc.nextLine());
		 * 
		 * 
		 * log.info("Id is " + bean1.getId()); log.info("Name is " + bean1.getName());
		 * 
		 * log.info("Id is " + bean2.getId()); log.info("Name is " + bean2.getName());
		 * 
		 * ((AbstractApplicationContext)applicationContext).close();
		 * 
		 */

		log.info("**************************************************");

		log.info("Employee Id is :" + bean1.getId());
		log.info("Employee Name is :" + bean1.getName());

		log.info("**************************************************");

		log.info("Department Id is :" + bean1.getDepartmentInfoBean().getDeptId());
		log.info("Department Name is :" + bean1.getDepartmentInfoBean().getDeptName());

	}

}
