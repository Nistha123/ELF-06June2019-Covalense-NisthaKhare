package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

/* USE CASE :
 * Sony is a class implementing Printer interface
 * and overriding method Printer
 * 
 */

//SOLUTION :
@Log
public class Sony implements Printer{

	@Override
	public void print() {

		log.info("I am a printer method");
	}

	
}//End of class
