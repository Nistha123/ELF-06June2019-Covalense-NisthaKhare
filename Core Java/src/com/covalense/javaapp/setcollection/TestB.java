package com.covalense.javaapp.setcollection;

import java.util.HashSet;
import java.util.zip.Inflater;

public class TestB {
	
public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(2);
		h.add(5);
		h.add(7);
		h.add(9);
		
		for (Object o : h) {
			System.out.println(o);
		}
	}

}
