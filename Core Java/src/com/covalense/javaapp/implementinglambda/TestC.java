package com.covalense.javaapp.implementinglambda;

import lombok.extern.java.Log;

/* USE CASE :
 * TestC is a main class using switch to display 
 * 
 */

//SOLUTION :
@Log
public class TestC {

	public static void main(String[] args) {
		
		String s = "Apple";
		
		switch (s) {
		case "Apple":
			
			log.info("Hellooo Apple");
			
			break;
			
		case "Mango":
			
			log.info("Hellooo Mango");
			
			break;

		default:
			log.info("wrong input");
			break;
		}
	}//end of main
}//end of class
