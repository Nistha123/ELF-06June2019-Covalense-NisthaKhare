package com.covalense.javaapp.assessment;
/*WAP to return the result of the BMI based on the BMI value, using lambda expression*/

/* BMICalcTest is a main class displaying data of BMI Of using lambda expression
 * 
 */
import java.util.function.Function;
import java.util.logging.Logger;

public class BMICalcTest {
	
	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("assessmentlog.txt");
		
		BMI b = new BMI(45.0, 5.1);
		
		BMIInterface bm = (h,w) -> {
			Double a;
			a = w/(h*h);	
			
			if(a<=3.5) {
				
				return "Person is UnderWeight";
			}else if (a<=7.5) {
				return "Person is Normal";
				
			}else if (a<=10.5) {
				return "Person is Overweight";
				
			}else {
				return "Person is Obesity";			
			}
			
		 };
	}//end of main	

}//end of class
