package com.covalense.javaapp.mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestD {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("one", 1);
		hm.put("four", 4);
		
		Set<String> ts = hm.keySet();
		System.out.println("******************Only Keys*************");
		for(String s : ts) {
			System.out.println(s);
		}
		
		Collection<Integer> ti = hm.values();
		
		Iterator<Integer> i = ti.iterator();
		System.out.println("******************Only values*************");
		while(i.hasNext()) {
			Integer i1 = i.next();
			
			System.out.println(i1);
		}
		
	}

}
