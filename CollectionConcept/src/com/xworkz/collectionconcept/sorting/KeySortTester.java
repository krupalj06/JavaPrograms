package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KeySortTester {
	
	public static void main(String[] args) {

		Key k1 = new Key("Steel", 5, "Rectangle");
		Key k2 = new Key("Iron", 6, "Triangle");
		Key k3 = new Key("Steel", 4, "Octa");
		
		ArrayList<Key> keysAL = new ArrayList<Key>();
		keysAL.add(k1);
		keysAL.add(k2);
		keysAL.add(k3);
		
		System.out.println(keysAL);
		
		Collections.sort(keysAL, new SortKeyByMaterial());
		
		System.out.println(keysAL);
		
		Collections.sort(keysAL, new SortKeyByLength());
		System.out.println(keysAL);
		
		Comparator<Key> sortKeyByShape = (o1,o2) -> o1.getShape().compareTo(o2.getShape());
		Collections.sort(keysAL, sortKeyByShape.reversed());
		
		Collections.reverse(keysAL);
		System.out.println(keysAL);
		
		Collections.reverseOrder();
	}

}
