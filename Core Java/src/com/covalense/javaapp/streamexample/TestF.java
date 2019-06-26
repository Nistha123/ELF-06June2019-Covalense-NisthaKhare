package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestE is a main class to sort the numbers in descending order in an arraylist using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestF {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(8);
		al.add(3);
		al.add(6);
		al.add(5);		
		
		Comparator<Integer> c = (i,j)->i.compareTo(j)*-1;
		
		List<Integer> l = al.stream().sorted(c).collect(Collectors.toList());
		
		log.info("sorted numbers are :" + l);
		
	}//end of main


}//end of class
