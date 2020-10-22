package com.xworkz.arrayexample;

public class StringArray {
	public static void main(String[] args) {
		
		System.out.println("String array example: ");
		
		
		String[] colors = new String[10]; 
		
		colors[0] = "Red";
		colors[1] = "Yellow";
		colors[2] = "Blue";
		colors[3] = "Green";
		
		int leng = colors.length;
		
		for(int i = 0; i < leng ; i++) {
			System.out.println("Color: "+ colors[i]);  // colors[0] , colors[1], colors[2]
		}
		
		
		//Enhanced for loop / for each loop
		System.out.println("Printing values using For each loop: ");
		//for(DataType ref : arrayRef)
		
		for(String c : colors) {
			System.out.println(c);
		}
		
		
		System.out.println("End of String array example ");
	}

}
