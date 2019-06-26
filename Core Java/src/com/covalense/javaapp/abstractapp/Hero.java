package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;
/* USE CASE :
 * Hero is a child class extending Honda class
 * and have a method Design
 * 
 */

//SOLUTION :

@Log
public class Hero extends Honda{

	@Override
	void design() {

		log.info("I am a design method");
	}//end of method

	
}//end of class
