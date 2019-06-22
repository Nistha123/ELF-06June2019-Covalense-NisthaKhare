package com.covalense.javaapp.immutable;

public class Employee {
	
	private final String name ;
	private final int empId ;
	private final double height;
	private final char gender;
	private final Boolean status;
	
	public Employee(String name, int empId, double height, char gender,boolean status) {
		super();
		this.name = name;
		this.empId = empId;
		this.height = height;
		this.gender = gender;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public Boolean getStatus() {
		return status;
	}
	
	
	
	
	
	
	
	

}
