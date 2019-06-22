package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {
	
public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nistha");
		al.add("ritu");
		al.add("nihu");
		
		Iterator<String> i = al.iterator();
		
		while (i.hasNext()) {
			String s = i.next();
			
			System.out.println(s);
			
		}
		
	}

}
