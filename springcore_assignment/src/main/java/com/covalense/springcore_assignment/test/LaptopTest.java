package com.covalense.springcore_assignment.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore_assignment.beans.Dell;
import com.covalense.springcore_assignment.config.LaptopConfig;
import com.covalense.springcore_assignment.interfaces.Laptop;

import lombok.extern.java.Log;
@Log
public class LaptopTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Laptop.xml");
		Laptop laptop = (Laptop) context.getBean("dell");
		
		laptop.display();
		laptop.process();
		laptop.showSpecification();
		laptop.getStorage();
		
		
	}//End of main

}//End of class
