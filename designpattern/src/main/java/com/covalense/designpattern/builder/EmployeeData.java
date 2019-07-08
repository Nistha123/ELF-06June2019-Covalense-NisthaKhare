package com.covalense.designpattern.builder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class EmployeeData {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private int AccountNo;
	private Date joining_date;
	private int DepartmentId;
	private int ManagerId;
	

}//end of class
