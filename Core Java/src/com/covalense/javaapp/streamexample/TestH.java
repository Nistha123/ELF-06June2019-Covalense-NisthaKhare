package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestH is a main class to filter to find minimum number using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestH {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(8);
		
		Comparator<Integer> c = (i,j)->i.compareTo(j);
		
		Integer min = al.stream().min(c).get();
		log.info("sorted arraylist :" + min);
	}//end of main

}//end of class
