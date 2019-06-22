package com.covalense.javaapp.hasarelationship;

public class TestHasARelationship {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.m.call();		
		System.out.println("model no is "+ p.m.model);
		System.out.println("i is "+ p.i);
		p.walk();
	}

}
