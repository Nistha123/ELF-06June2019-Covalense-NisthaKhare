package com.covalense.javaapp.daythreeassignment;

public class ArrayStore {

	void store(Student[] s) {
		System.out.println("************ Student detail***********");

		for(int i=0 ; i<s.length ; i++) {
			System.out.println("Name is " + s[i].getName());
			System.out.println("Age is " + s[i].getAge());
		}
		

	}

}
