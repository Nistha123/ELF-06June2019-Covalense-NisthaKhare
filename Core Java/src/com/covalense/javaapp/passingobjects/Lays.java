package com.covalense.javaapp.passingobjects;

import lombok.extern.java.Log;

/* USE CASE :
 * Lays is a child class extending Chips class
 * and overriding methods open and eat
 * 
 */

//SOLUTION :

@Log
public class Lays extends Chips {

		void open()
		{
			log.info("open Lays");
		}
		
		void eat()
		{
			log.info("eat Lays");
		}
	

}//end of class
