package com.covalense.javaapp.passingobjects;

/* USE CASE :
 * TestWater is a main class of Bottle class
 * 
 */

//SOLUTION :
public class TestWater {

	public static void main(String[] args) {

		Bottle b = new Bottle();
		
		Drinker d = new Drinker();
		
		d.recieve(b);
	}//end of main

}//end of class
