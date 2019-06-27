package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.util.converter.LocalDateStringConverter;
import lombok.extern.java.Log;

/* USE CASE :
 * TestA is a main class using Date class
 * 
 */

//SOLUTION :

@Log
public class TestA {
	
	public static void main(String[] args) {
		
		LocalDate l =  LocalDate.now();
		LocalDateTime ld = LocalDateTime.now();
		log.info("" + l.getDayOfMonth());
		log.info("" + l.getDayOfYear());
		log.info("" + l.lengthOfMonth());
		log.info("" + l);
		log.info("" + ld);
	}

}
