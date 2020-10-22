package com.xworkz.abstraction;

public abstract class MangoTree extends Tree { //instance 

	@Override
	void growth() {
       System.out.println("From plant to tree");
	}

	@Override
	void flowering() {
		System.out.println("Flowers before fruiting");
	}

	void StartYeild() {
		System.out.println("Starts yielding at 5 years");
	}

}
