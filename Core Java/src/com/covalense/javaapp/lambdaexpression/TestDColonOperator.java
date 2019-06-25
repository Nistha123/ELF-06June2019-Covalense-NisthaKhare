package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class TestDColonOperator {

	static void open() {
		
		log.info("****************open method**************");
		log.info("------> Logic to open the door");
		
	}
	
	public static void main(String[] args) {
		
		Room r = TestDColonOperator :: open;
		
		r.remove();
		
	}//end of main
}//end of class
