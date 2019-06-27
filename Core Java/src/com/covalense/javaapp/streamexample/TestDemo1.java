package com.covalense.javaapp.streamexample;

import lombok.extern.java.Log;

/* USE CASE :
 * TestDemo1 is a main class having Demo method
 * 
 */

//SOLUTION :
@Log
public class TestDemo1 {

	void write(int x) {
		log.info(""+x);
	}
	
	public static void main(String[] args) {
		
		TestDemo1 p = new TestDemo1();
		
		Demo d = p :: write;
		d.print(5);
		
	}//end of main	
	
}//end of class
