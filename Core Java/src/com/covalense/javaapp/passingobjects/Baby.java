package com.covalense.javaapp.passingobjects;


/* USE CASE :
 * Baby is a class 
 *have a method recieve passed Chips object in this
 * 
 */

//SOLUTION :
public class Baby {
	
	void recieve(Chips c)
	{
		c.open();
		c.eat();
	}

}//end of class
