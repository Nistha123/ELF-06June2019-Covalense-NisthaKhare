package com.covalense.javaapp.lambdaexpression;

interface Square {
	int squareNum(int a);
}

public class TestSquare {

	public static void main(String[] args) {

		Square s = a -> a*a;
		
		int res = s.squareNum(2);
		
		System.out.println("Square of the number is :" + res);
	}

}
