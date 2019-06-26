package com.covalense.javaapp.array;

import lombok.extern.java.Log;

/* USE CASE :
 * TestIntArray is a main class to store the
 * array of type Int
 * 
 */

//SOLUTION :

@Log
public class TestIntArray {

	public static void main(String[] args) {

		int i[] = new int[3];

		i[0] = 1;
		i[1] = 2;
		i[2] = 3;

		for (int j = i.length-1; j >= 0; j--) {
			log.info(i[j] + " ");
		}
	}//End of main

}//End of class
