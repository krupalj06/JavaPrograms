package com.xworkz.arrayexample;

public class CharNewArray {
	
	public static void main(String[] args) {
		
		System.out.println("Char array Example");
		
		char[] vowels = {'A', 'E', 'I' , 'O', 'U'}; // array Literals
		
		System.out.println("Length: "+ vowels.length);
		
		
		System.out.println("Printing values of char array: ");
		
		for(char v : vowels) {
			
			System.out.println(v);
			
		}
		
		System.out.println("End of Char array Example");
		
	}

}
