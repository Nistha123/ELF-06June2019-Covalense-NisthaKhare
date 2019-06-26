package com.covalense.javaapp.implementinglambda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

/* USE CASE :
 * TestA is a main class storing Emploee data 
 * to compare the employee ID using Comparator lambda expression
 * 
 */

//SOLUTION :
@Log
public class TestA {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(5,"nistha","aaa",34000.4);
		Employee e2 = new Employee(3,"Rahul","bbb",64000.8);
		Employee e3 = new Employee(4,"Shreya","ccc",84000.3);
		Employee e4 = new Employee(2,"vineeta","ccc",54000.2);
		Employee e5 = new Employee(1,"niharika","ccc",94000.4);
		

Comparator<Employee> c = (e,f)->{
	
	if (e.getId() > f.getId()) {
		return 1;
	} else if (e.getId() < f.getId()) {
		return -1;
	} else {
		return 0;
	}
	
};

Comparator<Employee> c2 = (n1,n2)->n1.getName().compareTo(n2.getName());

		
		TreeSet<Employee> ts = new TreeSet<Employee>(c2);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for (Employee e : ts) {
			
		log.info("Id is :" + e.getId());
		log.info("Name is :" + e.getName());
		log.info("Salary is :" + e.getSalary());
		log.info("Department is :" + e.getDepartment());
		log.info("*******************************************");
			
		}
	}//end of main
}//end of class
