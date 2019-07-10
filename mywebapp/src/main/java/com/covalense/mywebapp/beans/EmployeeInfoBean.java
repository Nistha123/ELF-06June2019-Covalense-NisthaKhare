package com.covalense.mywebapp.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="phone")
	private long phone;
	@Column(name="email")
	private String email;
	@Column(name="Designation")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	@Column(name="Accnt_no")
	private int AccountNo;
	@Column(name="Joining_Date")
	private Date joining_date;
	@Column(name="Dept_ID")
	private int DepartmentId;
	@Column(name="Manager_Id")
	private int ManagerId;
	

}//end of class
