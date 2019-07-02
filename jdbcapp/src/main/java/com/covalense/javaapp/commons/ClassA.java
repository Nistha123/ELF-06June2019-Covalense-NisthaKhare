package com.covalense.javaapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection{

	@Override
	public void printMessage() {
		log.info("Printing AAAAAAAAAAA");
	}

}//end of class
