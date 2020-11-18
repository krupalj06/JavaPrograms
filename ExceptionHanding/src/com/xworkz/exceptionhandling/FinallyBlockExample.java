package com.xworkz.exceptionhandling;

public class FinallyBlockExample {
	
	public static void main(String[] args) {
		
		String str = "Krupa"; 
		
		try {
		
			// open 
			//...read / write 
			
			int length = str.length();
			
			System.out.println("Try block executed sucessfully");
		
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		} finally {
			System.out.println("This is final");  // close resources
			//close
		}
		
		// Explore final 
		// can we use finally block without catch
		
	}

}
