package com.covalense.javaapp.passingobjects;

import lombok.extern.java.Log;

/* USE CASE :
 * Kurkure is a class extending Chips class
 * and overriding methods open and eat
 * 
 */

//SOLUTION :

@Log
public class Kurkure extends Chips {

	void open()
	{
		log.info("open Kurkure");
	}
	
	void eat()
	{
		log.info("eat Kurkure");
	}

}//end of class
