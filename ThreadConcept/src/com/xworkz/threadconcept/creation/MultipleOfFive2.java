package com.xworkz.threadconcept.creation;

public class MultipleOfFive2 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "+ Thread.currentThread().getName());
		int num = 5; 
		for(int i=6; i<=10 ; i++ ) {
			System.out.println( num + " * "+ i + " = " + (num *i) );
		}
		System.out.println("Exiting thread 2");
	}
}
