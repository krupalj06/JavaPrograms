package com.xworkz.collectionconcept.arraylist;

import java.util.ArrayList;

public class StringArrayList {
	public static void main(String[] args) {
		
	ArrayList<String> weekDays = new ArrayList<String>();
	weekDays.add("Monday");	
	weekDays.add("Tuesday");
	weekDays.add("Wednesday");
	weekDays.add(3, "Thrusday");
	
	weekDays.add(null); //can have null value
	weekDays.add("Monday"); //Duplicate elements
	
	//Insertion order
	System.out.println("Week: "+weekDays);
	
	System.out.println("Size of the arrayList: "+ weekDays.size());
	
	weekDays.add("Friday");
	weekDays.add("Saturday");
	System.out.println("Size of the arrayList: "+ weekDays.size());
	
	System.out.println("Does arrayList contain Friday: "+ weekDays.contains("Friday"));  //used for searching 
	System.out.println("Does arrayList Contain Sunday: "+ weekDays.contains("Sunday"));
		
	//syso(arr[0])
	System.out.println("Element in index 0: "+ weekDays.get(0));
//	System.out.println("Element in index 8: "+ weekDays.get(8)); // ArrayIndexOutBoundException
	
	weekDays.set(1, "Tue"); //updating //Return Tuesday
	
	System.out.println("ArrayList: "+ weekDays);
	
	System.out.println("Index of Friday: "+ weekDays.indexOf("Friday"));
	System.out.println("Last index of Monday:" + weekDays.lastIndexOf("Monday"));
	
	weekDays.remove(2); //index based
	weekDays.remove("Thrusday");
	System.out.println("ArrayList: "+ weekDays);
	
	}

}
