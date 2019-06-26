package com.covalense.javaapp.enumexercise;

import lombok.extern.java.Log;

/* USE CASE :
 * Test is a main class 
 * to display the enum
 * 
 */

//SOLUTION :
@Log
public class TestA {

	public static void main(String[] args) {
	
		Gender g = Gender.FEMALE;
		
		switch (g) {
		case MALE:
			log.info("Yes it's a Male gender");
			break;
			
		case FEMALE:
			log.info("Yes it's a Female gender");
			break;

		case OTHER:
			log.info("Yes it's a cross gender");
			break;
		}
	}//end of main
}//end of class
