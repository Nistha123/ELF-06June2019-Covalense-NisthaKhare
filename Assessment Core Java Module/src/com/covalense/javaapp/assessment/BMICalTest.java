package com.covalense.javaapp.assessment;

import java.util.logging.Logger;

/* BMICalTest is a main class calculating BMI of a person and 
 * displaying BMI result according to the calculation
 * 
 */
public class BMICalTest {
	
	public static void main(String[] args) {
		double bmicalc;
		
		Logger log = Logger.getLogger("assessmentlog.txt");
		
		BMI b = new BMI(45.0, 5.1);
		
		bmicalc = b.weight/(b.height*b.height);		
		
		if(bmicalc<=3.5) {
			
			log.info("Person is UnderWeight");
		}else if (bmicalc<=7.5) {
			log.info("Person is Normal");
		}else if (bmicalc<=10.5) {
			log.info("Person is Overweight");
		}else {
			log.info("Person is Obesity");
		}
	}// end of main

}// end of class
