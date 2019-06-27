package com.covalense.javaapp.streamexample;

import java.util.stream.Stream;

import lombok.extern.java.Log;

/* USE CASE :
 * TestArray is a main class to iterate an array using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestArray {
	
	static Integer[] a = {5,7,3,4,9};

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(a);
		
		s.forEach(i->log.info(""+i));
		
	}//end of main
}//end of class
