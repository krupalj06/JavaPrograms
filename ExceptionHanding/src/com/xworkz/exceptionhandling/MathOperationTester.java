package com.xworkz.exceptionhandling;

public class MathOperationTester {
	
	public static void main(String[] args) {
		
		int a = 10, b = 0;
		
		MathOperation mo = new MathOperation();
		try { 
			
			mo.divisionOps(a, b); //critical
			
		} catch (NullPointerException e) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.out.println("Math Operation was failed due to wrong input");
		}
		
		System.out.println("Prog end");
	}
	
	

}
