package com.xworkz.abstraction;

public abstract class Car {

	 //cannot create an instance of Abstract class
	abstract void accelarator();  //Abstract /incomplete method
	abstract void carbreak(); // method declaring 
	abstract void steering();
	
	void moving() {  //Complete method / concrete method
		System.out.println("Moving the car");
	}
	

}
