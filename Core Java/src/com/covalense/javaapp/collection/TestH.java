package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestH {

public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(7.1);
		al.add(3.2);
		al.add(5.4);
		
		ListIterator<Double> i = al.listIterator();
		
		System.out.println("---------->forward");
		while(i.hasNext()) {
			Double d = i.next();
			
			System.out.println(d);
		}
		
		System.out.println("<----------Backward");
		while(i.hasPrevious()) {
			Double a = i.previous();
			System.out.println(a);
		}
		
		

			
	}
}
