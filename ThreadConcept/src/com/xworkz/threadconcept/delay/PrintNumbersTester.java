package com.xworkz.threadconcept.delay;

public class PrintNumbersTester {
	
	public static void main(String[] args) {
		
		System.out.println("Thread details : " + Thread.currentThread().getName());
		
		PrintNumBetween1to10 between1to10 = new PrintNumBetween1to10();
		Thread t1 = new Thread(between1to10); //new thread
		t1.start();
		
		PrintNumBetween11To20 between11To20 = new PrintNumBetween11To20();
		Thread t2 = new Thread(between11To20);
		t2.start();
		
		System.out.println("Ending Thread  : " + Thread.currentThread().getName());
	}
	
	
	

}
