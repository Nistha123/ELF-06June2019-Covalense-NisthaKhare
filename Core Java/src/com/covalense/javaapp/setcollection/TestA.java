package com.covalense.javaapp.setcollection;

import java.util.HashSet;

public class TestA {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(2);
		h.add(5.4);
		h.add('a');
		h.add("Nistha");
		
		for (Object o : h) {
			System.out.println(o);
		}
	}

}
