package com.covalense.javaapp.ovveriding;

import lombok.extern.java.Log;

/* USE CASE :
 * GearThree is a class 
 * and have a speed method
 * 
 */

//SOLUTION :
@Log
public class GearThree extends GearTwo {

	void speed() {
		log.info("Speed at Gear three is between 200-300");
	}
}
