package com.covalense.javaapp.passingobjects;

import lombok.extern.java.Log;

/* USE CASE :
 * Lays is a class 
 * have two methods open and write
 * 
 */

//SOLUTION :

@Log
public class Pen {

	void open()
	{
		log.info("Open the Pen");
	}
	
	void write()
	{
		log.info("Write Something");
	}
}//end of class
