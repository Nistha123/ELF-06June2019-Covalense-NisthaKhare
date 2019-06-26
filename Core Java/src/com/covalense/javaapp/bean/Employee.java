package com.covalense.javaapp.bean;


/* USE CASE :
 * Employee is a class to store the
 * data of employees
 * 
 */

//SOLUTION :
public class Employee {

	private String name;
	private int empId;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}//End of class
