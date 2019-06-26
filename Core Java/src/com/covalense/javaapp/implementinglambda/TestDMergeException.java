package com.covalense.javaapp.implementinglambda;

import lombok.extern.java.Log;

/* USE CASE :
 * TestDMergeException is a main class to merge exceptions
 * into one catch block
 * 
 */

//SOLUTION :
@Log
public class TestDMergeException {
	public static void main(String[] args) {

		int a = 10, b = 0, div;

		try {

			div = a / b;
			log.info("division is :" + div);

		} catch (ArithmeticException | NullPointerException e) {
			log.info(e.getMessage());
		}  catch (Exception e) {
			log.info(e.getMessage());
		}

	}//end of main

}//end of class
