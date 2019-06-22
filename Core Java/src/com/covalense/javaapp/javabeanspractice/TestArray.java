package com.covalense.javaapp.javabeanspractice;

import java.io.File;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class TestArray {
	
	//public static final Logger loger = Logger.getLogger("ArrayTest");
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();	
		 MyArrayClass m = new MyArrayClass();
		 
		 int size=18;
		for(int i=0 ; i<size ; i++) {
			
			m.add("value " + i);
		}
		

		log.info("removing the element"); 
		
		m.remove(15);	
		
		for(int i=0 ; i<size ; i++) {
			
			log.info("output :" + m.get(i));
		}
		 
		 
		
		long endTime = System.currentTimeMillis();	
		
		log.info("execution time " + (startTime-endTime) + "ms");
		
		
	
	}//End Of main
}//End Of class




 

