package com.covalense.javaapp.lambdaexpression;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class TestCMethod {

	public static void main(String[] args) {  
		
		Student s1 = new Student("nistha", 60, 70, 80);
		
		Consumer<Student> c = s -> {
			
			double a = (s.m1+s.m2+s.m3)/3.0;
			
			log.info("name " + s.m1 + " " + "avg " + a);
		};
		
		c.accept(s1);
		
	}
}
