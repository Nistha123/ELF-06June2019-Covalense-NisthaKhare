package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;

import lombok.extern.java.Log;

@Log
public class TestC {
	
	public static void main(String[] args) {
		
		LocalDate bir = LocalDate.of(1992, 05, 11);
		LocalDate death = bir.plusYears(60);
		
		Period p = Period.between(bir, death);
		
		log.info(""+bir);
		log.info("" + p.getYears());
	}

}
