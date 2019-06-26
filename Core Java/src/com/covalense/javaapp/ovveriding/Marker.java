package com.covalense.javaapp.ovveriding;

import lombok.extern.java.Log;

/* USE CASE :
 * Marker is a child class 
 * and have a speed method
 * 
 */

//SOLUTION :
@Log
public class Marker extends Pen {

	void write()
	{
		log.info("Writing with a marker");
	}
}//end of class
