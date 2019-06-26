package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestA is a main class to filter odd numbers using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(1);
		al.add(3);
		al.add(6);
		al.add(8);
		
		List<Integer> l = al.stream().filter(
				i -> i%2!=0).collect(Collectors.toList());
		
		log.info("Odd numbers are :" + l);
	}
}
