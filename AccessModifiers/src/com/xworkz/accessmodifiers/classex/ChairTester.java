package com.xworkz.accessmodifiers.classex;

public class ChairTester {
	
	public static void main(String[] args) {
		
		Chair woodenchair = new Chair();

// 		Private members cant be accessed outside class
		woodenchair.material ="Wood";   
		System.out.println("Material : " + woodenchair.material );
		
		int weight = 3;
		Chair steelChair = new Chair(weight);
		
		
		woodenchair.rolling()
		
	}

}
