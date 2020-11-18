package com.xworkz.functionalinterfacelibrary.generics;

public class MathOperationImpl implements MathOperation<Integer, Double , Float>{

	@Override
	public Float addition(Integer a, Double b) {
		return a+b;
	}
}
