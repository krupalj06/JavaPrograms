package com.xworkz.blocks;

public class Clock {
	
	String brand;
	boolean isAnalog;
	String shape;
	
	{
		//initialization block //instance block
		System.out.println("We are in initialization block");
		brand = "Timex";
	}
	
	{
		System.out.println("We are in 2nd initialization block");
		isAnalog = true;
	}
	
	
	Clock() {
		System.out.println("Default constructor");
	}
	
	Clock(String inBrand, boolean inAnalog, String inShape ) {
		brand = inBrand;
		isAnalog = inAnalog;
		shape = inShape;
	}
	
	
	void showingTime() {
		System.out.println("Showing time");
	}
	
	void displayClockDetails() {
		System.out.println("Brand: "+ brand + " IsAnalog: "+isAnalog + " shape: "+shape);
	}
	
	{
		System.out.println("We are in 3rd initialization block");
		shape = "round";
	}
	
	{
		System.out.println("We are in 4th initialization block");
		displayClockDetails();
	}

}
