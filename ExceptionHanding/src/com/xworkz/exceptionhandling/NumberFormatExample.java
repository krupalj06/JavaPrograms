package com.xworkz.exceptionhandling;

public class NumberFormatExample {

	public static void main(String[] args) {
		System.out.println("Begin prog");

		String str = "123";

		int num = Integer.parseInt(str); //

		System.out.println("The num is : " + num);

		String name = "krupa";
		try {
			
			int res = Integer.parseInt(name);
			System.out.println("The result is :" + res);
			
		} catch (NumberFormatException e) {

			System.out.println("Formating wrong String to number");
		}

		System.out.println("Begin prog");
	}

}
