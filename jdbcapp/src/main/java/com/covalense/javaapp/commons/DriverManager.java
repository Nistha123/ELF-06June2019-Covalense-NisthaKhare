package com.covalense.javaapp.commons;

public class DriverManager {

	private DriverManager() {
	}

	public static Connection getInstance(String str) {
		Connection my=null;
		if (str.equals("one")) {
			my = new ClassA();
		} else {
			my = new ClassB();
		}
		return my;
	}

}//end of class
