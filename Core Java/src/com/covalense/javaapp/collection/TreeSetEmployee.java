package com.covalense.javaapp.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TreeSetEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name="Nistha";
		e1.id=1;
		e1.salary=30000;
		
		Employee e2 = new Employee();
		e2.name="Reetu";
		e2.id=4;
		e2.salary=20000;
	
		Employee e3 = new Employee();
		e3.name="Rahul";
		e3.id=2;
		e3.salary=25000;
		
		Employee e4 = new Employee();
		e4.name="Shubh";
		e4.id=3;
		e4.salary=35000;
		
		EmployeeById eb = new EmployeeById();
		EmployeeBySalary es = new EmployeeBySalary();
		EmployeeByName en = new EmployeeByName();
		
		TreeSet<Employee> t = new TreeSet<Employee>(en);
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		for (Employee e : t) {
			log.info("******************Employee details*************");
			log.info("name is " + e.name);
			log.info("id is " + e.id);
			log.info("salary is " + e.salary);
		}
				
	}
}
