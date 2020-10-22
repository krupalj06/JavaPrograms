package com.xworkz.abstraction;

public class NewGenCar extends Car{

	@Override
	void accelarator() {
		System.out.println("Max speed 200");
	}

	@Override
	void carbreak() {
		System.out.println("Advanced Break system");
	}
	
	void steering() {
		System.out.println("Provide power steering ");
		
	}
	

}
