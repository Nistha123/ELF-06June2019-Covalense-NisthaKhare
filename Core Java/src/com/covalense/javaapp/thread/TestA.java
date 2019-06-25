package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		
		log.info("main Started");

		Pen p1 = new Pen();
		p1.setPriority(4);
		p1.start();
		
		Pen p2 = new Pen();
		p2.setPriority(1);
		p2.start();
		
		log.info("main ended");

	}// end of main
}// end of class
