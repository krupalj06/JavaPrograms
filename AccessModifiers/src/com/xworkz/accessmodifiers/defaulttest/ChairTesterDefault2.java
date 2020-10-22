package com.xworkz.accessmodifiers.defaulttest;

import com.xworkz.accessmodifiers.classex.Chair;

public class ChairTesterDefault2 {
	
	public static void main(String[] args) {
		
		Chair schair = new Chair();
		
		schair.color = "Green";
		System.out.println("Color: "+ schair.color);
		
		schair.moving();
		
		
		schair.weight = 3;
		schair.displayDetails();
		
	}

}
