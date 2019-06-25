package com.covalense.javaapp.lambdaexpression;

public class TestStudentColon {

	public static void main(String[] args) {
		
		MyStudent m = new MyStudent();
		
		Average x = m :: calculateAvg;
		
		x.avg(10, 20, 30);
	}//end of main

}//end of class
