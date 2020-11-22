package com.xworkz.threadconcept.delay;

public class PrintNumBetween11To20 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread details : " + Thread.currentThread().getName());
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Ending Thread  : " + Thread.currentThread().getName());
		
	}

}
