package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class IntegerSorting {
	public static void main(String[] args) {
		
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(17);
		primeNumbers.add(23);
		primeNumbers.add(13);
		primeNumbers.add(19);
		primeNumbers.add(11);
		primeNumbers.add(3);
		
		System.out.println(primeNumbers);
		
		Collections.sort(primeNumbers);
		
		System.out.println(primeNumbers);
		
		//String , double
		
		// Consumer : void accept(T t);
		System.out.println("=====Printing using foreach ====== ");
//		Consumer<Integer> consumer = (a)->System.out.println(a);
		primeNumbers.forEach((a)->System.out.println(a));
		
	}

}
