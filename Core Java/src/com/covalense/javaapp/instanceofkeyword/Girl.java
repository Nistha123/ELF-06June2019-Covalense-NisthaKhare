package com.covalense.javaapp.instanceofkeyword;

public class Girl {

	void recieve(Phone p) {
		if (p instanceof MIPhnone) {
			System.out.println("Thank you Brother");
		} else if (p instanceof IPhone) {
			System.out.println("I Love You");
		}

	}
}
