package com.covalense.javaapp.collection;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(7.1);
		al.add(3.2);
		al.add(5.4);
		
		for (Double d : al) {
			System.out.println(d);
		}
	}

}
