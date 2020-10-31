package com.xworkz.exceptionhandling;

public class ArrayException {
	public static void main(String[] args) {

		System.out.println("Prog starts");
		String[] names = new String[10];

		names[0] = "Sindhu";
		names[1] = "Suma";
		names[2] = "Ranjitha";
		names[6] = "Sathya";
		try {
			System.out.println("inside try block");
			
//			System.out.println(names[10]);
			for(int i=0;i <= 10 ; i++) { 
				System.out.println(names[i]);//Exception
				
			}

			System.out.println("ending try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access Invalid index element");
		}

		for (String nam : names) {
			System.out.println(nam);
		}
		
		System.out.println("Out of the try/catch block");
		System.out.println("Prog ends");
	}

}
