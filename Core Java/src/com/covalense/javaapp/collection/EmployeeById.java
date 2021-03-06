package com.covalense.javaapp.collection;

import java.util.Comparator;

/* USE CASE :
 * EmployeeById is a class implementing Comparator 
 * to compare the employee ID
 * 
 */

//SOLUTION :
public class EmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}

	}

}//end of class
