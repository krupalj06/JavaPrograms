package com.xworkz.abstraction;

public class NewGenCarTester {
	
	public static void main(String[] args) {
		
		NewGenCar ngcar = new NewGenCar();
		ngcar.accelarator();
		ngcar.carbreak();
		ngcar.steering();
		ngcar.moving();
		
		System.out.println("========================");
		Car car = new NewGenCar();  // upcasting
		
		car.accelarator();  // 
		car.carbreak();
		car.steering();
		car.moving();
		
	}

}
