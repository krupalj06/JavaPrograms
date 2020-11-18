package com.xworkz.functionalinterfacelibrary;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		// void accept(T t);
		Consumer<String> printName =  (str)->System.out.println("The entered Name is: "+ str);
		
		printName.accept("Krupa");
		printName.accept("Vedha");
		printName.accept("Mrinal");
		
	}

}
