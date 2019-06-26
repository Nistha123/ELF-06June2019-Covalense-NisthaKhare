package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import lombok.extern.java.Log;

/* USE CASE :
 * TestD is a main class Of generic LinkedHashSet
 * storing Integer data
 */

//SOLUTION :
@Log
public class TestD {
	
	
public static void main(String[] args) {
		
	LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		
		h.add(2);
		h.add(5);
		h.add(7);
		h.add(9);
		
		for (Object o : h) {
			log.info(""+o);
		}
		

		Iterator i = h.iterator();
		
		while(i.hasNext()) {
			
			Object o = i.next();
			log.info(""+o);
		}
		
	}//end of main

}//end of class

