package com.covalense.javaapp.constructor;
class A
{
	int i = 90;
}

class B extends A
{
	int i = 60;
	
	void m()
	
	{
		int i = 30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
public class TestC {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.m(); 

	}

}
