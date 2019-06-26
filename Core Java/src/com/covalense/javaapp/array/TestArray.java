package com.covalense.javaapp.array;

import lombok.extern.java.Log;

/* USE CASE :
 * TestArray is a main class to store the
 * array of type double
 * 
 */

//SOLUTION :
@Log
public class TestArray {

	public static void main(String[] args) {

		double a[] = new double[4];
		a[0]=11.1;
		a[1]=22.2;
		a[2]=33.3;
		a[3]=44.4;
		
		log.info(""+a.length);
		for(int i=0 ; i<=a.length ; i++)
		{
			log.info(""+a[i]);
		}
	}//End of main

}//End of class
