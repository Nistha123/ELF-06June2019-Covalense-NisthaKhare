package com.covalense.javaapp.bean;

/* USE CASE :
 * TestEmployee is a main class to store the
 * data in database and call the Employee class object
 * 
 */

//SOLUTION :
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		DBEmp1 e1 = new DBEmp1();
		
		e.setName("Rahul");
		e.setEmpId(2);
		e.setGender("male");
		
		e1.show(e);
		
		DBEmp2 e2 = new DBEmp2();
		e2.show(e);
	}//End of main

}//End of class
