package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

/* USE CASE :
 * bingo is a child class extending Chips
 * class and have method eatBingo
 * 
 */

//SOLUTION :
@Log
public class Bingo extends Chips {

	int quantity;

	void eatBingo() {
		log.info("Eating Bingo");
	}
}//End of class 
