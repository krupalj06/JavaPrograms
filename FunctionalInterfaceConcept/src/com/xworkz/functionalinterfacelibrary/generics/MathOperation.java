package com.xworkz.functionalinterfacelibrary.generics;

@FunctionalInterface
public interface MathOperation<T,R,S> {  //Wrapper
	
	S addition(T a, R b);

}
