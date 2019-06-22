package com.covalense.javaapp.javabeanspractice;

import java.util.logging.Logger;

import jdk.internal.dynalink.beans.StaticClass;

public class EmployeeMain {
	
	private static final Logger log = Logger.getLogger("TestEmployee");

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		//e1.setName("Nistha");
		log.info("Without Lombok" + e1.toString());
		
		Employee2 e2 = new Employee2();
		e2.setAge(25);
		log.info("With Lombok" +e2.toString());
		
		
		
	}
}
