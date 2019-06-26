package com.covalense.javaapp.passingobjects;

/* USE CASE :
 * Drinker is a class 
 *have a method recieve passed Bottle class object in this
 * 
 */

//SOLUTION :
public class Drinker {

	void recieve(Bottle b)
	{
		b.open();
		b.drink();
	}
}//end of class
