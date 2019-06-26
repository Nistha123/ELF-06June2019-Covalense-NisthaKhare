package com.covalense.javaapp.array;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStringArray is a main class to store the
 * array of type string
 * 
 */

//SOLUTION :

@Log
public abstract class TestStringArray {

	public static void main(String[] args) {

		String[] s = new String[4];
		
		s[0]="Nistha";
		s[1]="Niharika";
		s[2]="Abha";
		s[3]="Aadvika";
		
		log.info(""+s.length);
		
		for(int i=0 ; i<s.length ; i++)
		{
			log.info(""+s[i]);
		}
	}//End of main

}//End of class
