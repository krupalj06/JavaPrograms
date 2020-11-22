package com.xworkz.threadconcept.creation;

public class TablesTester {
	public static void main(String[] args) {
		
		System.out.println("Thread details : "+ Thread.currentThread().getId() 
				+ " Name: "+ Thread.currentThread().getName() );
		
		MultipleOf12 multipleOf12 = new MultipleOf12();
		Thread t1 = new Thread(multipleOf12);
		t1.start();
		
		MultipleOf16 multipleOf16 = new MultipleOf16();
		Thread t2 = new Thread(multipleOf16);
		t2.start();
		
		Runnable multipleOf28 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
						+ Thread.currentThread().getName());

				int num = 28;
				for (int i = 1; i <= 10; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
				}

				System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
						+ Thread.currentThread().getName());

			}
		};
		
		Thread t3 = new Thread(multipleOf28);
		t3.start();	
		
		
		Runnable multipleOf7 = ()->{
			System.out.println("Thread details are: " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());

			int num = 7;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}

			System.out.println(" End of Thread : " + Thread.currentThread().getId() + " Name: "
					+ Thread.currentThread().getName());
		};
		
		Thread t4 = new Thread(multipleOf7);
		t4.start();		
		
		System.out.println(" Ending Thread : "+ Thread.currentThread().getId() 
				+ " Name: "+ Thread.currentThread().getName() );
	}

}
