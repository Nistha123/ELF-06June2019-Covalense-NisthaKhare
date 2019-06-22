package com.covalense.javaapp.inheritance;

public class TestA {

	public static void main(String[] args) {

		ScientificCal sc = new ScientificCal();
		System.out.println("SC methods");
		sc.add();
		sc.sub();
		sc.sin();
		sc.cos();
		
		Calculator c = new Calculator();
		System.out.println("C methods");
		c.add();
		c.sub();
		
		Animal a = new Animal();
		System.out.println("A methods");
		a.add();
		a.sub();
		//a.cos();
		a.eat();
		//a.sin();
	}

}
