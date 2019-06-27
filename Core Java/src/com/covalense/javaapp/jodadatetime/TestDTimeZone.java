package com.covalense.javaapp.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

/* USE CASE :
 * TestDTimeZone is a main class using ZoneId
 * 
 */

//SOLUTION :
@Log
public class TestDTimeZone {
	
	public static void main(String[] args) {
		
		ZoneId z = ZoneId.systemDefault();
		ZoneId z1 = ZoneId.of("Australia/Sydney");
		ZonedDateTime ze = ZonedDateTime.now(z1);
		log.info(""+ ze.toLocalDateTime());
		
	}//end of main

}//end of class
