package com.xworkz.exceptionhandling;


public class MathOperation {

	int divisionOps(int x, int y) throws ArithmeticException{
		int div = 0;

		div = x / y;
		System.out.println("The result is :" + div);

		return div;
	}

}
