package com.xworkz.collectionconcept.queue;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		// impl List & Queue
		
		//Insertion order
		LinkedList<String> monthsList = new LinkedList<String>();
		monthsList.add("Jan");
		monthsList.add("Feb");
		monthsList.add("Mar");
		monthsList.add("Apr");
		monthsList.add("Apr"); //duplicates allowed
		monthsList.add(null); //allows null
		
		System.out.println(monthsList);
		
		 //methods from Queue
		System.out.println("Peek: "+ monthsList.peek());
		System.out.println("poll: "+monthsList.poll());
		System.out.println("offer: "+monthsList.offer("May"));
		System.out.println("element: "+monthsList.element());
		System.out.println(monthsList);
		
		monthsList.remove();
		System.out.println(monthsList);
		
		
		//methods List
		System.out.println("Element in index 2: "+ monthsList.get(2)); // getfirst/last
		System.out.println("Replacing: "+ monthsList.set(4, "Jun"));
		System.out.println(monthsList);
		monthsList.add(5, "Jul");
		System.out.println(monthsList);
		
		
		//Special to Linked list 
		monthsList.push("Aug"); // add to 1st position
		System.out.println(monthsList);
		
		monthsList.pop();  // 1st position element will be deleted 
		System.out.println(monthsList);
		
	}

}
