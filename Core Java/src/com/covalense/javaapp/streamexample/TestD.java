package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestD is a main class to filter the count of arraylist using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestD {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(8);
		al.add(3);
		al.add(6);
		al.add(5);		
		
		List<Integer> l = al.stream().filter(
				i -> i%2!=0).collect(Collectors.toList());
		
		long c = al.stream().filter(i -> i%2!=0).count();
		
		log.info("numbers divided by 3 are :" + l);
		log.info("count is :" + c);
	}//end of main

}//end of class
