package com.xworkz.encapsulation;

public class MouseTester {

	public static void main(String[] args) {
		
		Mouse wlMouse = new Mouse(3, false, "USB");
		
//		wlMouse.brand = "Dell";
		
//		wlMouse.setBrand("Dell");
		
		wlMouse.getBrand();
		
	}
}
