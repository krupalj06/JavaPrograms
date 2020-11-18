package com.xworkz.exceptionhandling.customexception;

import java.util.Scanner;

public class SumOfDigitsScanner {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number: ");
		Scanner in = new Scanner(System.in); //10
		String str = in.next();
		int num = Integer.parseInt(str);
		System.out.println("Recived: "+str);
		
	}

}
