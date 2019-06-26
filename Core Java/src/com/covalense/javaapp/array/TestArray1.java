package com.covalense.javaapp.array;

import lombok.extern.java.Log;

/* USE CASE :
 * TestArray1 is a main class to store the
 * array of type char
 * 
 */

//SOLUTION :

@Log
public class TestArray1 {

	public static void main(String[] args) {

		char[] c = new char[5];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		c[4]='e';
		
		log.info(""+c.length);
		for(int i=0 ; i<c.length ; i++)
		{
			log.info(""+c[i]);
		}
	}//End of main

}//End of class
