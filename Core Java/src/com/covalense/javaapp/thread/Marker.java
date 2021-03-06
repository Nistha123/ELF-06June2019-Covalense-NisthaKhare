package com.covalense.javaapp.thread;

import lombok.extern.java.Log;


/* USE CASE :
 * Marker is a class implementing Runnable 
 * and have a run
 * 
 */

//SOLUTION :
@Log
public class Marker implements Runnable{

	@Override
	public void run() {

		log.info("running marker");
		for(int i=0; i<5 ; i++) {
			log.info(""+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}//end of class
