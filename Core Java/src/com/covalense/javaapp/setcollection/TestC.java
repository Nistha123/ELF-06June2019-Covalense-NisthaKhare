package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import lombok.extern.java.Log;

/* USE CASE :
 * Testc is a main class Of non-generic LinkedHashSet
 * storing data
 */

//SOLUTION :
@Log
public class TestC {
	
public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		
		h.add(2);
		h.add(5.4);
		h.add('a');
		h.add("Nistha");
		
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
