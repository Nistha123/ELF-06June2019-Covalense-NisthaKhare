package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

/* USE CASE :
 * Pen is an abstract class extending Honda class
 * and have two abstract methods write and color
 * 
 */

//SOLUTION :

@Log
public abstract class Pen {

	void draw() {
		log.info("I am a draw method");
	}

	abstract void write();

	abstract void color();
}//End of abstract class
