package com.xworkz.accessmodifiers.classex;

public class ChairTesterDefault {
	
	public static void main(String[] args) {
		
		Chair schair = new Chair();
		schair.color = "Brown";
		
		System.out.println("Color is :" + schair.color);
		
		schair.moving();
		
	}

}
