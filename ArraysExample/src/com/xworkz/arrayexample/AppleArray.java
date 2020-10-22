package com.xworkz.arrayexample;

public class AppleArray {
	
	public static void main(String[] args) {
		
		Apple[] applesArray = new Apple[5];
		
		Apple shimla = new Apple();
		shimla.price = 180;
		shimla.type = "Shimla";
		shimla.weight = 0.50f;
		
		applesArray[0] = shimla;
		
		Apple kashmir = new Apple();
		kashmir.price = 200;
		kashmir.type = "kashmir";
		kashmir.weight = 1.00f;
		
		applesArray[2] = kashmir;
		
		System.out.println("Accessing first element in the ApplesArray");
		Apple a1 = applesArray[0];
		a1.displayDetails();
		
		
		System.out.println("displaying all elements in the ApplesArray");
		
		int[] app = null;
		
		for(int i = 0 ; i< applesArray.length ; i++ ) {
			if(applesArray[i] != null) {
				Apple a = applesArray[i];
				a.displayDetails();
			}
		}
		System.out.println("Print using for Each");
		
		for(Apple a : applesArray) {
			if(a != null) {
				a.displayDetails();
			}
		}
		
		System.out.println(app.length);
		
		
		app = new int[10];
	}
	

}
