package com.covalense.javaapp.daythreeassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * ArrayProduct is a array class 
 * to print the array of product
 */

//SOLUTION :
@Log
public class ArrayProduct {

	void store(Product p[])
	{
		System.out.println("************ Product detail***********");

		for(int i=0 ; i<p.length ; i++) {
			log.info("Product Id is " + p[i].getProductId());
			log.info("Product name is " + p[i].getProductName());
			log.info("Quantity is " + p[i].getProductquantity());
			
		}
	}

}
