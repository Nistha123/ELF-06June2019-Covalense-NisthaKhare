package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class TestProduct {

	public static void main(String[] args) {
		
		Product p = MyProduct :: new;
		
		MyProduct m = p.getProduct("AC", 25000.99);
		
		log.info("Name :" + " " + m.name + " " +  "Cost " + m.cost);
	}//end of main
}//end of class
