package com.covalense.javaapp.setcollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<Integer> h = new TreeSet<Integer>();

		h.add(2);
		h.add(5);
		h.add(18);
		h.add(9);

		for (Object o : h) {
			System.out.println(o);
		}

		System.out.println(".............Using Iterator.........");
		Iterator i = h.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}

	}

}
