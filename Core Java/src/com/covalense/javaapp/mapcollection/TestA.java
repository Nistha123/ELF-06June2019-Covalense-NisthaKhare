package com.covalense.javaapp.mapcollection;

import java.util.HashMap;
/* USE CASE :
 * TestA is a main method class to store the data
 *  into a map and display them.
 */

//SOLUTION :
import java.util.Map;

public class TestA {
	/*	It's a main method to store data  
	 *  and display using map
	 */

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("one", 1);
		hm.put("four", 4);
		
		
		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			
			System.out.println("***************Details*****************");
			System.out.println("Key is :" + me.getKey());
			System.out.println("value is :" + me.getValue());
			
		}
		
	}//end of main
}//end of class
