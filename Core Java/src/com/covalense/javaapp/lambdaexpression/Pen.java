package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class Pen {

	Pen(){
		log.info("zero parametrized constructor");
	}
	
	void write() {
		log.info("Write() method");
	}
}
