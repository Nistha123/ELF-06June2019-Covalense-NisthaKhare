package com.covalense.javaapp.setcollection;

import java.util.HashSet;

import lombok.extern.java.Log;

/* USE CASE :
 * TestA is a main class Of HashSet
 */

//SOLUTION :
@Log
public class TestA {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(2);
		h.add(5.4);
		h.add('a');
		h.add("Nistha");
		
		for (Object o : h) {
			log.info(""+o);
		}
	}//end of main

}//end of class
