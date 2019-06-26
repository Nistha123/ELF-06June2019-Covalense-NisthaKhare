package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestE is a main class to show the numbers using foreach and using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestG {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(8);
		al.add(3);
		al.add(6);
		al.add(5);		
		
		Comparator<Integer> c = (i,j)->i.compareTo(j)*-1;
		
		al.stream().forEach(i -> log.info("Numbers are :"+i));
		
	}//end of main


}//end of class
