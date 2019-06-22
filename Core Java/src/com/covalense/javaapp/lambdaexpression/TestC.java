package com.covalense.javaapp.lambdaexpression;

interface StringDemo {
	
	int getcharCount(String st);
}

public class TestC {

	public static void main(String[] args) {
		
		StringDemo s = a -> a.length();
		
		int i = s.getcharCount("Nistha");
		
		System.out.println(i);

		
	}//End Of main

}//End Of class
