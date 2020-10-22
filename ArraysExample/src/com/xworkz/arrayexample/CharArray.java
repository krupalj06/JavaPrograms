package com.xworkz.arrayexample;

public class CharArray {
	
	public static void main(String[] args) {
		
		char[] alpa = {'A', 'B', 'C', 'D', 'E'};  //array literals
		
		alpa[4] = 'G';
		
		
		for(int i=0 ; i<= alpa.length-1 ; i++ ) {
			System.out.println("char at index "+ i +" is : " +alpa[i]); // alpa[0] //alpa[1] //alpa[2]
		}
		
		//for each / enhanced for loop
		//for(dataType ref : arrayvar)
		for(char c : alpa) {
			System.out.println("The char is : "+ c);
		}
		
		
		//boolean[] , double[]
		
		
	}

}
