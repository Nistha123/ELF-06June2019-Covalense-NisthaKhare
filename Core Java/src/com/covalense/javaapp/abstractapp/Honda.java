package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

/* USE CASE :
 * Hero is a abstract parent class  have a engine method
 * and have an abstract method Design
 * 
 */

//SOLUTION :

@Log
public abstract class Honda {

	void engine() {
		log.info("I am an engine method");
	}

	abstract void design();

}//End of class
