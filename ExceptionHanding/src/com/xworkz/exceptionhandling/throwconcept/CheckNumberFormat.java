package com.xworkz.exceptionhandling.throwconcept;

public class CheckNumberFormat {
	
	public static void main(String[] args) {
		System.out.println(" ");
		
		int a = 10, b= 0;
		
		CheckNumberFormat cnf = new CheckNumberFormat();
		cnf.divisionOpertation(a, b);
		
	}
	
	void divisionOpertation(int a, int b) {
		
		if(b != 0) {
			int result = a/b;
			System.out.println("Result: "+ result);
		} else {
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}
		
	}

}
