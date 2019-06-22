package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class TestD {
	
	
public static void main(String[] args) {
		
	LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		
		h.add(2);
		h.add(5);
		h.add(7);
		h.add(9);
		
		for (Object o : h) {
			System.out.println(o);
		}
		

		Iterator i = h.iterator();
		
		while(i.hasNext()) {
			
			Object o = i.next();
			System.out.println(o);
		}
		
	}

}

