package com.covalense.javaapp.objectclass;

public class TestA {

	public static void main(String[] args) {

		Student s = new Student("Nistha", 25, 5.1);
		Student t = new Student("Ritu", 25, 5.1);
		
		System.out.println(s.equals(t));
		
		System.out.println(s);
		System.out.println(t);
	}

}
