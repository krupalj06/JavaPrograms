package com.xworkz.exceptionhandling;

public class DivideByZero {
	
	public static void main(String[] args) {
		
		System.out.println("Start prog");
		
		
		int a = 10, b = 0;
		int result = 0;
		
		if(b!=0) {
			result = a / b ;   //critical  //Arithmetic Exception
			System.out.println("Result: "+ result);
		}else {
			System.out.println("You have entered Zero divisior");
		}
		result = a / b ; 
		
		try {
			result = a / b ;   //critical  //Arithmetic Exception
			System.out.println("Result: "+ result);
		} catch(ArithmeticException e) {
			System.out.println("You have entered Zero divisior");
		}
		
		System.out.println("End Prog");
		
		
	}

}
