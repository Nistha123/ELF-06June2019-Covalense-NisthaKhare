package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class TestC {
	
public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		
		h.add(2);
		h.add(5.4);
		h.add('a');
		h.add("Nistha");
		
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
