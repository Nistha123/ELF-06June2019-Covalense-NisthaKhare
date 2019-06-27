package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;

/* USE CASE :
 * TestB is a main class using LocalDate class and calculate birthdate
 * 
 */

//SOLUTION :

@Log
public class TestB {
	
	public static void main(String[] args) {
		
		LocalDate bir = LocalDate.of(1992, 05, 11);
		LocalDate cur = LocalDate.now();
		
		Period p = Period.between(bir, cur);
		
		log.info("Birthdate is :" + bir);
		log.info("Age is :" + p.getYears());
		
		
	}

}
