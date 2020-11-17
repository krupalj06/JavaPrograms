package com.xworkz.collectionconcept.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		//compare(o1,o2)
		Comparator<Battery> comp = (o1,o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		};
		Comparator<Battery> typeComp = (o1,o2)->{
			return o1.getType().compareTo(o2.getType());
		};
		
		TreeSet<Battery> tset = new TreeSet<Battery>(typeComp);
		tset.add(new Battery("AA", "Duracell"));
		tset.add(new Battery("AAA", "Everready"));
		tset.add(new Battery("A", "Duracell"));
		
		System.out.println(tset);
	}

}
