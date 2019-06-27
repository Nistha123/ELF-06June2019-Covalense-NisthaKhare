package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
/* USE CASE :
 * TestI is a main class to filter to find maximum number using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestI {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(8);
		
		Comparator<Integer> c = (i,j)->i.compareTo(j);
		
		Integer max = al.stream().max(c).get();
		log.info("sorted arraylist :" + max);
	}//end of main


}//end of class
