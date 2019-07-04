package com.covalense.javaapp.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	private long salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private long acnt_no;
	private Date joining_date;
	private int dept_ID;
	private int manager_ID;
	

}//end of class
