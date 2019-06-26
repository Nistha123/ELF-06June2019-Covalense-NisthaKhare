package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.java.Log;

/* USE CASE :
 * TestE is a main class to sort the numbers in ascending order in an arraylist using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(8);
		al.add(3);
		al.add(6);
		al.add(5);		
		
//		Stream<Integer> s = al.stream().sorted();
//		List<Integer> l = s.collect(Collectors.toList());
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		
		log.info("sorted numbers are :" + l);
		
	}//end of main


}//end of class
