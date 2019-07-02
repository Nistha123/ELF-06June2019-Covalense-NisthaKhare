package com.covalense.javaapp.commons;

public class MainMethodClass {

	public static void main(String[] args) {
	//	MyInterface ref1 = new ClassA();
		
		//String str = "one";
		Connection ref1 = DriverManager.getInstance(args[0]);    
		ref1.toString();    //eg. of inheritance as to Sting is the method of Object class inheriting here
		ref1.printMessage();
	}//end of main
}//end of class
