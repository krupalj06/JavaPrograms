package com.xworkz.arrayexample;

public class NumberArray {
	public static void main(String[] args) {
		
		System.out.println("Begin prog");
		// 10 15 61 14 23 78 
		
		int[] numbers = new int[10];
		
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 61;
		//..
		numbers[5] = 78;
		//..9
		
		System.out.println("in index 0: " + numbers[0]);
		System.out.println("in index 1: " + numbers[1]);
		System.out.println("in index 5: " + numbers[5]);
		
		System.out.println("in index 3: "+ numbers[3]); //0 numbers , false for boolean, 0.00 for float / double , null for non-primitive
		
//		numbers[10] = 13; // run time exception
		
		int leng = numbers.length; //10 
		
		for(int i = 0 ; i<= leng-1 ; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("Printing using enhanced for loop");
		
		for(int i : numbers) {
			
			System.out.println(i + 5);
		}
		
		
		System.out.println("end prog");
		
		// String array 
		// float array
		
	}

}
