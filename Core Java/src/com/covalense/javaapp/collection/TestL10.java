package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestL10 {

	public static void main(String[] args) {

		Vector<Double> v = new Vector<Double>();
		v.add(9.2);
		v.add(1.5);
		v.add(6.9);
		v.add(2.4);
		v.add(3.6);
		
		Iterator<Double> i = v.iterator();
		
		while (i.hasNext()) {
			Double c = i.next();
			
			System.out.println("Using Iterator " + c);
			
		}
		
		
		Enumeration<Double> e = v.elements();
		while(e.hasMoreElements()) {
			Double d = e.nextElement();
			
			System.out.println(d);
		}
	}
}
