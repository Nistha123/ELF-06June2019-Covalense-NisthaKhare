package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

/* USE CASE :
 * Mouse is a class implementing Runnable 
 * and have a run
 * 
 */

//SOLUTION :
@Log
public class Mouse implements Runnable{
	String name;

	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		log.info("started-----> " + name);
		
		for(int i=0 ; i<5 ; i++) {
					
			log.info(" " + i);
						
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info("ended-----> " + name);
		
	}
	

}//end of class
