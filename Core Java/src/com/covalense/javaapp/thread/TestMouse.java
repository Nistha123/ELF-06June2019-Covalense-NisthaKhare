package com.covalense.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* USE CASE :
 * TestMouse is a main class Of Mouse thread class
 * having five threads
 */

//SOLUTION :
public class TestMouse {
	
	public static void main(String[] args) {
		
		Mouse m1 = new Mouse("first");
		Mouse m2 = new Mouse("Second");
		Mouse m3 = new Mouse("third");
		Mouse m4 = new Mouse("fourth");
		Mouse m5 = new Mouse("fifth");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		Thread t4 = new Thread(m4);
		Thread t5 = new Thread(m5);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		
		service.shutdown();
	}//end of main
		

}//end of class
