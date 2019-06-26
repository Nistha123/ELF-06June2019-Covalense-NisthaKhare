package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

/* USE CASE :
 * Marker is a Thread class
 * and have a run method
 * 
 */

//SOLUTION :
@Log
public class Pen extends Thread {	
	@Override
	public void run() {
	
		for(int i=0 ; i<5 ; i++) {
			String s = getName();
			log.info(s);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
	
	
}// end of class
