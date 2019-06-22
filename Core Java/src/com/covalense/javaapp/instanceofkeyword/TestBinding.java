package com.covalense.javaapp.instanceofkeyword;
class Animal {
	
	void eat()
	{
		System.out.println("Animal eat");
	}

}

class Cow extends Animal{

	void eat()
	{
		System.out.println("Cow eat");
	}
}
class Lion extends Animal{

	void eat()
	{
		System.out.println("Lion eat");
	}
}

public class TestBinding {
	
	 

	public static void main(String[] args) {		
		Animal a = new Cow();
		a.eat();
	}

}
