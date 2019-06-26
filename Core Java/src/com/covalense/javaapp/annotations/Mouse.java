package com.covalense.javaapp.annotations;

import lombok.extern.java.Log;

/* USE CASE :
 * Mouse is a class for annotations use 
 * having three methods click,scroll and write
 * 
 */

//SOLUTION :
@Log
public class Mouse {

	void click() {
		log.info("This is click() method");
	}
	
	void doubleClick() {
		log.info("This is doubleClick() method");
	}
	
	@Deprecated
	void scroll() {
		log.info("This is scroll() method");
	}
}//End Of class
