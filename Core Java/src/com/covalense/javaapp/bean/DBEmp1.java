package com.covalense.javaapp.bean;

public class DBEmp1 {

	void show(Employee e) {

		System.out.println("*********** Employee DB1 Data ********");
		System.out.println("Name is " + e.getName());
		System.out.println("Employee ID is " + e.getEmpId());
		System.out.println("Gender is " + e.getGender());
	}
}//End of class
