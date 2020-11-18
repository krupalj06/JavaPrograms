package com.xworkz.functionalinterfacelibrary;

import java.util.function.Predicate;

public interface PredicateTester {
	
	public static void main(String[] args) {
		
		//Check if input is even or not
		Predicate<Integer> predicate = (a)->{
			if(a%2==0)
				return true;
			else 
				return false;
			
		};
		boolean result = predicate.test(25);
		
		System.out.println("25 is Even or not : "+ result);
		
		
		Predicate<Double> predicate2 = (a)-> a%2==0;
		// boolean test(Double a);
		
		System.out.println("40 is Even or not: " + predicate2.test(40.00));
		
		
	}

}
