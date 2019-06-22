package com.covalense.javaapp.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestC {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("one", 1);
		tm.put("four", 4);
		
		for (Map.Entry<String, Integer> me : tm.entrySet()) {
			
			System.out.println("***************Details*****************");
			System.out.println("Key is :" + me.getKey());
			System.out.println("value is :" + me.getValue());
			
		}
		
	}

}
