package com.xworkz.collectionconcept.iterator;

import java.util.ArrayList;

public class IterateArrayList {
	public static void main(String[] args) {
		
		ArrayList<Long> longList = new ArrayList<Long>();
		longList.add(10L);
		longList.add(20L);
		longList.add(30L);
		longList.add(40L);
		longList.add(30L);
		longList.add(40L);
		
		System.out.println("Size of Long Array List: "+ longList.size());
		System.out.println("Content of LongAL: "+ longList);
		
		for(int i = 0 ; i < longList.size() ; i++) {
			Long l = longList.get(i);
			if(l == 40L) {
//				longList.set(i, l+5);
				longList.remove(i);
			}
		}
		System.out.println(longList);
	}

}
