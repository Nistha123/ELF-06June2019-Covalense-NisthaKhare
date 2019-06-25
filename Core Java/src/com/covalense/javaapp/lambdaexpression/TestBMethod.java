package com.covalense.javaapp.lambdaexpression;

import java.util.function.Supplier;

public class TestBMethod {

	public static void main(String[] args) {
		
		Supplier<Car> s = () -> new Car(10.5);
		
		Car c = s.get();
		
		System.out.println(c.fuelQuant);
	}
}
