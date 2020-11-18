package com.xworkz.functionalinterfacelibrary;

import java.util.function.Function;

public class FunctionTester {
	
	public static void main(String[] args) {
		
		// R apply(T t);
		Function<String, Integer> func = (str)->{
			Integer i = Integer.parseInt(str);
			return i;
		};
		Function<String, Integer> func2 = (str)->Integer.parseInt(str);
		
		
		System.out.println("The integer is: " + func.apply("123"));
		try {
			System.out.println("The second integer is: " + func.apply("Krupa")); //Numberformat exception
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
	}
	

	// Supply
	//  T get();

}
