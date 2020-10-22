package com.xworkz.arrayexample.multidimentional;

public class MultiDArray {
	public static void main(String[] args) {
		
		int[][] numArray = new int[2][2];
		
		numArray[0][0] = 1;
		numArray[0][1] = 2;
		numArray[1][0] = 3;
		numArray[1][1] = 4;
		
		System.out.println("[0][0] : "+ numArray[0][0]);
		System.out.println("[0][1] : "+ numArray[0][1]);
		
		for(int i = 0 ; i< 2 ; i++ ) { //0  //1
			for(int j= 0 ; j<2 ; j++) { //00 , 01  //10, 11
				System.out.print(numArray[i][j] +"    ");
			}
			System.out.println("");
		}
		
		
	}

}
