package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String[] args) {
		//Collection accept only Objects
		ArrayList<Integer> wholenumbers = new ArrayList<Integer>(); //instance AL
		
//		Integer i = 10; // new Integer(10); //AutoBoxing
		wholenumbers.add(10); 
		wholenumbers.add(20);
		wholenumbers.add(30);
		wholenumbers.add(40);
		
		wholenumbers.add(4,50);
		
		System.out.println("The Whole Numbers ArrayList: "+ wholenumbers);
		
		wholenumbers.remove(new Integer(10)); //int
		
		System.out.println("The Whole Numbers ArrayList: "+ wholenumbers);
		
		//Traverse 1
		for(int i = 0; i<= wholenumbers.size()-1 ;i++) {
			System.out.println(wholenumbers.get(i));  //arr[i]
			
		}
		System.out.println("===============================");
		
		//Traverse 2
		for(Integer i : wholenumbers) {
			System.out.println(i);
		}
		
	}
	
	// One AL for Double
	//One AL for Charater
}
