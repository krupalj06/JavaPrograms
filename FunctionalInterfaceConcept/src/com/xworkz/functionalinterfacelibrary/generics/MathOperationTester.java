package com.xworkz.functionalinterfacelibrary.generics;

public class MathOperationTester {
	
	public static void main(String[] args) {
		
		
		MathOperationImpl mathOperationImpl = new MathOperationImpl();
		mathOperationImpl.addition(12 , 13);
		
		MathOperation<Double> addition = (a,b)->a+b;
		
	}
	
}
