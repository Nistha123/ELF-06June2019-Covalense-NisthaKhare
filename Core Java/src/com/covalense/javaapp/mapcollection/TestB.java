package com.covalense.javaapp.mapcollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestB {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		
		lhm.put("two", 2);
		lhm.put("one", 1);
		lhm.put("three", 3);
		lhm.put("four", 4);
		
		
		for (Map.Entry<String, Integer> me : lhm.entrySet()) {
			
			System.out.println("***************Details*****************");
			System.out.println("Key is :" + me.getKey());
			System.out.println("value is :" + me.getValue());
			
		}
		
	}

}
