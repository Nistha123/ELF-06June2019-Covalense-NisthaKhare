package com.covalense.designpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.designpattern.beans.EmployeeInfoBean;
import com.covalense.designpattern.dao.EmployeeDAO;
import com.covalense.designpattern.dao.EmployeeDAOFactory;
import com.covalense.designpattern.dao.EmployeeHibernateDAOImpl;
import com.covalense.designpattern.dao.EmployeeJDBCDAOImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternTest {
	public static void main(String[] args) throws ParseException {
	//	EmployeeDAO emp = new EmployeeJDBCDAOImpl();
		/*
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd"); Date
		 * dateDOB = dateFormat.parse("1990-05-01"); Date dateJoin =
		 * dateFormat.parse("2019-05-01");
		 * 
		 * EmployeeDAO empHiber = EmployeeDAOFactory.getInstance();
		 * printInfo(empHiber.getEmployeeInfo(1));
		 * 
		 * EmployeeInfoBean empinfo = new EmployeeInfoBean(); empinfo.setId(21);
		 * empinfo.setName("dvfd"); empinfo.setAge(28); empinfo.setGender("male");
		 * empinfo.setSalary(35000); empinfo.setPhone(565689798);
		 * empinfo.setEmail("vikas@gmail.com"); empinfo.setDesignation("Manager");
		 * empinfo.setDob(dateDOB); empinfo.setAccountNo(45798089);
		 * empinfo.setJoining_date(dateJoin); empinfo.setDepartmentId(30);
		 * empinfo.setManagerId(12); //
		 * log.info("inserted Employee Info "+empHiber.createEmployeeInfo(empinfo));
		 * 
		 * log.info("Deleted Employee Info "+empHiber.deleteEmployeeInfo(21));
		 */
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();		
		log.info(""+dao.getAllEmployeeInfo());
		
		
		
	}//end of main
	
	private static void printInfo(EmployeeInfoBean bean) {

		log.info("Id is :" + bean.getId());
		log.info("Name is :" + bean.getName());
		log.info("Age is :" + bean.getAge());
		log.info("Phone is :" + bean.getPhone());
		log.info("Gender is :" + bean.getGender());
		log.info("Email is :" + bean.getEmail());
		log.info("Account no is :" + bean.getAccountNo());
		log.info("DOB is :" + bean.getDob());
		log.info("Joining Date is :" + bean.getJoining_date());
		log.info("Department_Id is :" + bean.getDepartmentId());
		log.info("Manager_Id is :" + bean.getManagerId());
	}
}//end of class
