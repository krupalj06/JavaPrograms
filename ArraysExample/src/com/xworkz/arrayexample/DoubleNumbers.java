package com.xworkz.arrayexample;

public class DoubleNumbers {
	
	public static void main(String[] args) {
		
		double[] dnum = new double[5];
		dnum[0] = 10.00;
		dnum[1] = 6.00;
		
		System.out.println("Num in index 0 : "+ dnum[0]);
		
		int leng = dnum.length;
		
		for(int i = 0; i<= leng-1 ; i++ ) {  //i < leng
			System.out.println(dnum[i]);
		}
		
	}

}
