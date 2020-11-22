package com.xworkz.threadconcept.delay;

public class PrintNumBetween1to10  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread details : " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ending Thread  : " + Thread.currentThread().getName());
	}

}
