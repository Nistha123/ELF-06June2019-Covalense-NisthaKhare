package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class TestBoy {

	public static void main(String[] args) {
		
		MyBoy m = Boy :: new;
		
		Boy b = m.getBoy("Rohit", 5.3, 24);
		
		log.info("Name :" + " " + b.name + " " +  "height " + b.height + " " + "Age " + b.age);
	}
	
}
