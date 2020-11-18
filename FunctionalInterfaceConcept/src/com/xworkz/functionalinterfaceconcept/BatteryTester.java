package com.xworkz.functionalinterfaceconcept;

public class BatteryTester {
	
	public static void main(String[] args) {
		
		Battery phoneBattery = (voltage,brand)->System.out.println("Phone Battery of brand: "+ brand
				+ "is charging with voltage: "+ voltage);
		
		phoneBattery.charging(15,"Samsung"); //arg
		
		phoneBattery.charging(10, "MI");
		
		
	}

}
