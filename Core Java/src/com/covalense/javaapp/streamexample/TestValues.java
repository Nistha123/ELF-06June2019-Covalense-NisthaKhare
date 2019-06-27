package com.covalense.javaapp.streamexample;

import java.util.stream.Stream;

import lombok.extern.java.Log;

/* USE CASE :
 * TestValues is a main class to iterate numbers using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestValues {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(4,7,5,1,8);
		
		s.forEach(i->log.info(""+i));
		
	}//end of main
}//end of class
