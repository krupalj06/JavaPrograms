package com.xworkz.collectionconcept.set;

import java.util.TreeSet;

public class IntegerTreeset {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(15);
		treeset.add(70);
		treeset.add(25);
		treeset.add(10);
		treeset.add(38);
		treeset.add(5);
		treeset.add(40);
		
		System.out.println(treeset);
		
		
		System.out.println("Ceiling: "+ treeset.ceiling(39));
		System.out.println("Flooring: "+ treeset.floor(39));
		
		System.out.println("Flooring: "+ treeset.floor(25)); 
		
		treeset.first();
		treeset.last();
		treeset.pollFirst();
		treeset.pollLast();
	}

}
