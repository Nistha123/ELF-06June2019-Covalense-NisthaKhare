package com.covalense.javaapp.thread;

/* USE CASE :
 * TestMarker is a main class Of Pen
 * having three threads
 */

//SOLUTION :
public class TestMarker {

	public static void main(String[] args) {
		
		Marker m = new Marker();
		Thread t1 = new Thread(m);		
		t1.start();
		Thread t2 = new Thread(m);		
		t2.start();
		Thread t3 = new Thread(m);		
		t3.start();
	}//end of main
}//end of class
