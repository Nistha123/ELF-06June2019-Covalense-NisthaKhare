package com.covalense.javaapp.sortarray;

import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args) {

		EmployeeArray[] emp = new EmployeeArray[4];
		
		EmployeeArray e1 = new EmployeeArray();
		e1.setName("Nistha");
		e1.setAge(28);
		e1.setSalary(7000);
		
		EmployeeArray e2 = new EmployeeArray();
		e2.setName("Reetu");
		e2.setAge(24);
		e2.setSalary(10000);
				
		EmployeeArray e3 = new EmployeeArray();
		e3.setName("rahul");
		e3.setAge(20);
		e3.setSalary(8000);
		
		EmployeeArray e4 = new EmployeeArray();
		e4.setName("rohit");
		e4.setAge(25);
		e4.setSalary(9000);
		
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		
		//Arrays.sort(emp);
		
		for (EmployeeArray e : emp) {
			
			System.out.println("Name is :" + e.getName());
			System.out.println("Age is : " + e.getAge());
			System.out.println("Salary is : " + e.getSalary());
			
			System.out.println("********************************************");
		}
		
		
		
	
	}

}
