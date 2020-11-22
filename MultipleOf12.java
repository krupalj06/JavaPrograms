package com.xworkz.threadconcept.creation;

public class MultipleOf12 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread details are: "+ Thread.currentThread().getId()
						+ " Name: " + Thread.currentThread().getName());
		
		int num = 12; 
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num + " * " + i +" = " + (num*i));
		}
		
		System.out.println(" End of Thread : "+ Thread.currentThread().getId()
				+ " Name: " + Thread.currentThread().getName());
	}

}
