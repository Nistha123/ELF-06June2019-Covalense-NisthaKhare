package com.covalense.javaapp.passingobjects;

/* USE CASE :
 * Writer is a class
 * have method recieve passing Pen object in this 
 * 
 */

//SOLUTION :
public class Writer {

	void recieve(Pen p)
	{
		p.open();
		p.write();
		
	}
}//end of class
