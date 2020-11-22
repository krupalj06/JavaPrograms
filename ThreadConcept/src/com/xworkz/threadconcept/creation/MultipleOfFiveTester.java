package com.xworkz.threadconcept.creation;

public class MultipleOfFiveTester {
	
	public static void main(String[] args) {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() 
				+ " Name: "+ Thread.currentThread().getName());
		
		MultipleOfFive1 t1 = new MultipleOfFive1();  //new thread
		t1.start();
		
		MultipleOfFive2 t2 = new MultipleOfFive2();
		t2.start();
		
		System.out.println("Thread program ended ");
		
		
	}

}
