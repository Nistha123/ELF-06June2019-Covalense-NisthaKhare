package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

/* USE CASE :
 * Pencil is an abstract class extending Pen class
 * and have a method write 
 * 
 */

//SOLUTION :

@Log
public abstract class Pencil extends Pen {

	void write() {
		log.info("i am pencil write method");
	}

}//End of class
