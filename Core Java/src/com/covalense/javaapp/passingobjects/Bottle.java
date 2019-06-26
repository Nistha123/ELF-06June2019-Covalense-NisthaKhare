package com.covalense.javaapp.passingobjects;

import lombok.extern.java.Log;

/* USE CASE :
 * Bottle is a class 
 *have two method open and drink
 * 
 */

//SOLUTION :
@Log
public class Bottle {

	void open()
	{
		log.info("Open the Bottle");
	}
	
	void drink()
	{
		log.info("Drink the water");
	}
}//end of class
