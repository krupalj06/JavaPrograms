package com.xworkz.functionalinterfaceconcept;

@FunctionalInterface
public interface Mushroom {
	
	void growing(); // one abstract method
	
	default void budding() {
		System.out.println("Mushroom is budding");
	}
	// ...
	
}
