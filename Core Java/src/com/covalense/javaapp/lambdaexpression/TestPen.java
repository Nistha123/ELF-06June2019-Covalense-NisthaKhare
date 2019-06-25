package com.covalense.javaapp.lambdaexpression;

public class TestPen {

	public static void main(String[] args) {
		
		PenFactory p = Pen :: new;
		
		Pen x = p.getPen();
		
		x.write();
		}
}
