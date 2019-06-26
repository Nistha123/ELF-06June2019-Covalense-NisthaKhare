package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

/* USE CASE :
 * Chips is a parent class having eat method
 * 
 */

//SOLUTION :

@Log
public class Chips {

	int rate;

	void eat() {
		log.info("Eating Chips");
	}
}//End of class
