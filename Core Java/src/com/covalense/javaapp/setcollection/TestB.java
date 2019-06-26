package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.zip.Inflater;

import lombok.extern.java.Log;

/* USE CASE :
 * TestB is a main class Of generic HashSet
 * storing Integer data
 */

//SOLUTION :
@Log
public class TestB {
	
public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(2);
		h.add(5);
		h.add(7);
		h.add(9);
		
		for (Object o : h) {
			log.info(""+o);
		}
	} //end of main

}//end of class
