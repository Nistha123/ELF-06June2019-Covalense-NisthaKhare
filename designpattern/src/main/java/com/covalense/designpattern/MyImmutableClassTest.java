package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;
		
		immutableClass = new MyImmutableClass("nistha", 25, 970709909);
		log.info("Name is :" + immutableClass.getName());
		log.info("Age is :" + immutableClass.getAge());
		log.info("Phone is :" + immutableClass.getPhone());
		
		 immutableClass = new MyImmutableClass("nish", 26, 970709909);
		log.info("Name is :" + immutableClass.getName());
		log.info("Age is :" + immutableClass.getAge());
		log.info("Phone is :" + immutableClass.getPhone());
	}//end of main
}//end of class
