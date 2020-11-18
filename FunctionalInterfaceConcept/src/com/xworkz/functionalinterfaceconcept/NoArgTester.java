package com.xworkz.functionalinterfaceconcept;

public class NoArgTester {
	
	public static void main(String[] args) {
		
		NoArgumentFI ref = ()->"Hello World";
		System.out.println(ref.printHello());
		
		
		
//		OneArgumentFI oneArgumentFI = (a)->{
//			return a+5;
//		};
		OneArgumentFI oneArgumentFI = (a)-> a+5;
		int result = oneArgumentFI.incrementByFive(23);
		System.out.println("Increment 23 by 5: "+ result);
		
			
		MultiArgument multiArgument = (str1,str2)->str1+str2;
		
		String strResult = multiArgument.ConcatTwoString("Krupa", "L J");
		System.out.println("My name is: "+ strResult );
		
		System.out.println(multiArgument.ConcatTwoString("Hello ", "Folks"));
	}
}
