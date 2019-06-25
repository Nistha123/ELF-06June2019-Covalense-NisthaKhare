package com.covalense.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(2);
		al.add(4.3);
		al.add('D');
		al.add("Nistha");
		al.add(10);
		al.add('r');

		for (int i = 0; i < al.size(); i++) {

			Object o = al.get(i);

			log.info(""+o);
		}
	}

}
