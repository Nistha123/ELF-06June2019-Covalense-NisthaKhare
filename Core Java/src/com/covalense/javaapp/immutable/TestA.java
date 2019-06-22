package com.covalense.javaapp.immutable;

import com.covalense.javaapp.lambdaexpression.Person;

public class TestA {

	public static void main(String[] args) {

		Person p = new Person("Nistha", 27);
		
		System.out.println("Name is " + p.getName());
		System.out.println("Age is " + p.getAge());
		
		Person q = new Person("Rahul", 27);
		
		System.out.println("Name is " + q.getName());
		System.out.println("Age is " + q.getAge());
	}

}
