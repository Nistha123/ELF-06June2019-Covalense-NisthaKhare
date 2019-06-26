package com.covalense.javaapp.thread;

import java.util.concurrent.Callable;

/* USE CASE :
 * Marker is a class implementing Callable 
 * and have a call method
 * 
 */

//SOLUTION :
public class Pencil implements Callable<Integer>{
	
	int fact = 1;
	int n=5;

	@Override
	public Integer call() throws Exception {
		for(int i=1 ; i<=n ; i++) {
			
			fact = fact*i;
		}
		
		return fact;
	}
	
	
//end of class
}
