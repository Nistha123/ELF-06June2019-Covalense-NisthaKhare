package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestC is a main class to filter numbers multiplied by 2 using STREAM
 * 
 */

//SOLUTION :
@Log
public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
				
				al.add(12);
				al.add(11);
				al.add(30);
				al.add(16);
				al.add(18);		
				
				List<Integer> l = al.stream().map(i->i*2).collect(Collectors.toList());
				
				log.info("numbers divided by 3 are :" + l);
			}//end of main

}//end of class
