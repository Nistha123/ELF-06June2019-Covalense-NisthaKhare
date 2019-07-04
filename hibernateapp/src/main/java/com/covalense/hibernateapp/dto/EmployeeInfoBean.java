package com.covalense.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
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
	private long salary;
	@Column(name="phone")
	private long phone;
	@Column(name="email")
	private String email;
	@Column(name="Designation")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	@Column(name="Accnt_no")
	private long acnt_no;
	@Column(name="Joining_Date")
	private Date joining_date;
	@Column(name="Dept_ID")
	private int dept_ID;
	@Column(name="Manager_Id")
	private int manager_ID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAcnt_no() {
		return acnt_no;
	}
	public void setAcnt_no(long acnt_no) {
		this.acnt_no = acnt_no;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	public int getDept_ID() {
		return dept_ID;
	}
	public void setDept_ID(int dept_ID) {
		this.dept_ID = dept_ID;
	}
	public int getManager_ID() {
		return manager_ID;
	}
	public void setManager_ID(int manager_ID) {
		this.manager_ID = manager_ID;
	}
	
	
	

}
