package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestI {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(7.1);
		al.add(3.2);
		al.add(5.4);

		Iterator<Double> i = al.iterator();

		System.out.println("---------->forward");
		while (i.hasNext()) {
			Double d = i.next();

			System.out.println(d);
		}

	}

}
