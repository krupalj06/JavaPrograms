package com.xworkz.functionalinterfaceconcept;

public class MushroomTester {
	
	public static void main(String[] args) {
		
		Mushroom buttonMushroom = new Mushroom() {
			@Override
			public void growing() {
				System.out.println("Button Mushroom is growing");
			}
		};
		
		buttonMushroom.growing();
		
		System.out.println("=======================");
		
		// Lambda  -FI     ->
		Mushroom spongeMushroom = ()->{
			System.out.println("sponge Mushroom is growing");
		};
		
		spongeMushroom.growing();
		
		System.out.println("=======================");
		
		Mushroom WhiteMushroom = ()->System.out.println("White Mushroom is growing");
		WhiteMushroom.growing();
		
	}
}
