package com.xworkz.exceptionhandling;

public class MultipleExceptions {
	
	public static void main(String[] args) {
		
		
		int a = 10, b = 2 ; 
		int[] arr = {1,2,3,4,5};
		
		try {
			
			int res = a/b; //Exception
			System.out.println("Result is: "+res);
			
			System.out.println("The array element is: " + arr[4]);  //Exception
			
			String str = null; 
			str.length(); 
			
		} catch (ArithmeticException e) {
			System.out.println("Divisor is zero please give a non zero divisor");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access wrong index");
		} catch (RuntimeException e) {
			System.out.println("Run Time Exception");
		} catch (Exception e) {
			System.out.println("Some exception occured, Please contact Administrator");
		}
		
		System.out.println("ddndk");
		System.out.println("End prog");
		
		
	}

}
