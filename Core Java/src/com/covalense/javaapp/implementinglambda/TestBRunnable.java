package com.covalense.javaapp.implementinglambda;

import lombok.extern.java.Log;

/* USE CASE :
 * TestBRunnable is a class implementing Runnable 
 * and have a run using lambda expression
 * 
 */

//SOLUTION :
@Log
public class TestBRunnable {
	
	public static void main(String[] args) {
		Runnable r = ()->{
			
			for(int i=0 ; i<5 ; i++) {
				log.info("" + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t1.start();

	}//end of main
	
}//end of class
