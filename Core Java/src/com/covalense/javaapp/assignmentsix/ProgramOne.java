package com.covalense.javaapp.assignmentsix;

/* USE CASE :
 * ProgramOne is a main test class 
 * to calculate sum using lambda expression
 */

//SOLUTION :
public class ProgramOne {
	
	public static void main(String[] args) {
		
		InterfaceOne i = (a,b) -> {
			return a+b;
		};
		
		int add = i.sum(10, 20);
		
		System.out.println("sum of two numbers is :" + add);
	}//End Of main

}//End Of class
