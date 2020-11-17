package com.xworkz.collectionconcept.iterator;

import java.util.ArrayList;

public class MaskTester {
	public static void main(String[] args) {
		
		Mask mask1 = new Mask("N95", true, 300.00);  // fullQualifiedName@HexDecimal
		Mask mask2 = new Mask("cotton", false, 50.00);
		Mask mask3 = new Mask("Nylon", false, 30.00);
		Mask mask4 = new Mask("use&through", false, 30.00);
		
		ArrayList<Mask> maskArrayList = new ArrayList<Mask>();
		maskArrayList.add(mask1);
		maskArrayList.add(mask2);
		maskArrayList.add(mask3);
		maskArrayList.add(mask4);
		
		System.out.println(maskArrayList);
		
		for(Mask m : maskArrayList) {
			System.out.println("-- "+m);
		}
		Mask searchKey = new Mask("N95", true, 300.00);
		boolean result = maskArrayList.contains(searchKey); // mask1.equals(searchKey) //false
		System.out.println("Result : "+ result);
		
		for(int i = 0 ; i<maskArrayList.size() ; i++) {
			Mask m = maskArrayList.get(i);
			System.out.print(m);
			double price = m.getPrice();
			m.setPrice(price+((price*5)/100));
			System.out.println(m);
		}
	}
	
	// 2 Object  create AL for each

}
