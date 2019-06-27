package com.covalense.javaapp.streamexample;

import java.util.stream.Stream;

/* USE CASE :
 * TestDemo2 is a main class 
 * 
 */

//SOLUTION :
public class TestDemo2 {

public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(4,7,5,1,8);
		s.forEach(System.out::println);
		
	}//end of main
}//end of class
