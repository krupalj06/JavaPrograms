package com.xworkz.exceptionhandling.throwconcept;

public class FindGreatestNumber {
	public static void main(String[] args) {
		
		int a = 0 , b =10, c =30;
		
		FindGreatestNumber fgn = new FindGreatestNumber();
		
		try {
			fgn.findGreatestNum(a, b, c);
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
		
	}
	
	void findGreatestNum(int a, int b, int c) throws Exception{
		
		if(a==0 || b == 0 || c==0) {
//			Exception e = new Exception();
			throw new Exception();
		}else { 
			// logic of findGreatestNum
		}
	}

}
