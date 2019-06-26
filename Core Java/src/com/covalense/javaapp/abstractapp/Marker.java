package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

/* USE CASE :
 * marker is a child class extending Pencil class
 * and have two methods wrute and color
 * 
 */

//SOLUTION :
@Log
public class Marker extends Pencil {

	@Override
	void write() {
		log.info("Marker write method");
	}

	@Override
	void color() {

		log.info("Marker color method");
	}

}//End of class
