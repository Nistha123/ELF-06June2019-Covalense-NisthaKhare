package com.covalense.javaapp.thread;

/* USE CASE :
 * Browser is a Thread class 
 * and have a run
 * 
 */

//SOLUTION :
public class Browser extends Thread {

	PVR ref;

	public Browser(PVR ref) {
		
		this.ref = ref;
	}
	
	@Override
	public void run() {
		
		ref.book();
	}
	
}//end of class
