package com.covalense.javaapp.bean;


public class TestBean {

	public static void main(String[] args) {

		DB1 i = new DB1();
		Person p = new Person();
		
		p.setName("Nistha");
		p.setAge(25);
		
		i.store(p);
		
		DB2 j = new DB2();
		
		j.store(p);
	}//End of main

}//End of class
