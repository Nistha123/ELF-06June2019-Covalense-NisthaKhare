package com.covalense.javaapp.implementinglambda;

import lombok.extern.java.Log;

/* USE CASE :
 * TestB is a main class displaying enum constants
 * 
 */

//SOLUTION :
@Log
public class TestB {

	public static void main(String[] args) {
		
		Loan l = Loan.HOME;
		
		int constValue = l.getValue();
		
		log.info("value of home loan is :"+ constValue);
	}
}
