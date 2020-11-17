package com.xworkz.collectionconcept.set;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		
		names.add("Krupa");
		names.add("Chaitra");
		names.add("Sunidhi");
		names.add("Aarfeen");
		names.add("Krupa"); //doesnt allow duplicate
		names.add(null);
		names.add(null);
		
		System.out.println(names);
		
	}

}
