package com.xworkz.collectionconcept.queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class QueueImplentation {
	
	public static void main(String[] args) {
		//FIFO
		//Sorted
		//only first element is sorted
		ArrayList<Integer> intAL = new ArrayList<Integer>();
//		intAL.add(e)
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(50);
		queue.add(60);
		queue.add(20);
		queue.add(40);
		queue.add(30);
		queue.add(10);
		queue.add(15);
		queue.addAll(intAL);
//		queue.add(null);  //null.compareTo(50); //Queue does not allow null
		
		queue.add(60); //Duplicates are allowed
		
		//20 30 40 50 60
		System.out.println(queue);
		
		System.out.println("Peek of First element:" + queue.peek());
		System.out.println("Poll of First element :" +queue.poll());
		System.out.println(queue);
		
		queue.offer(70);  //Similar to Add()
		System.out.println(queue);
		
		System.out.println("element of queue:" + queue.element());
		queue.remove(); // index , object  //Removed the first element
		
		System.out.println(queue);
		
		queue.remove(40);
		queue.removeAll(intAL);
		
		System.out.println(queue);
		
		//Create a Queue of string 
		//Priority Queue is also called Binary Queue, Why?
		//Create a Queue<CustomObject>
	}

}
