package com.xworkz.exceptionhandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		String str = "123";
		
		try {
			System.out.println("First try started");
			int res = Integer.parseInt(str);
			
			try {
				System.out.println("Second try started");
				int arr[] = {1,2,3};
				System.out.println(arr[4]);
				System.out.println("Second try Ended");
			} catch (NullPointerException e) {
				System.out.println("Accessing null");
			}
			
			System.out.println("First try Ended");
		} catch (NumberFormatException e) {
			System.out.println("Trying to convert a wrong String to number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access wrong index");
		}
		
		
		System.out.println("End of the program ");
	}

}
