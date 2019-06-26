package com.covalense.javaapp.passingobjects;

/* USE CASE :
 * TestPen is a main class of Pen class
 * 
 */

//SOLUTION :
public class TestPen {

	public static void main(String[] args) {

		Pen p = new Pen();
		
		Writer w = new Writer();
		
		w.recieve(p);
				
	}//end of main

}//end of main
