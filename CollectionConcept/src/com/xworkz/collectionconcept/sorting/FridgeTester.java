package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FridgeTester {
	
	public static void main(String[] args) {
		
		Fridge f1 = new Fridge("Samsung", 2, 180);
		Fridge f2 = new Fridge("LG", 2, 150);
		Fridge f3 = new Fridge("Bosh", 1, 160);
		Fridge f4 = new Fridge("Godrej", 1, 140);
		
		ArrayList<Fridge> fridgeAL = new ArrayList<Fridge>();
		fridgeAL.add(f1);
		fridgeAL.add(f2);
		fridgeAL.add(f3);
		fridgeAL.add(f4);
		
		System.out.println(fridgeAL);
		
		// compare(Fridge o1 , Fridge o2){ ... }
		
		Comparator<Fridge> comp = (o1, o2)-> o1.getCapacityInLtr() - o2.getCapacityInLtr();
//			int result = o1.getCapacityInLtr() - o2.getCapacityInLtr(); // int
//			return o1.getCapacityInLtr() - o2.getCapacityInLtr();
		
		
		Collections.sort(fridgeAL, comp);
		
	}

}
