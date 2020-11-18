package com.xworkz.exceptionhandling.customexception;

public class SumOfDigits {
	
	public static void main(String[] args) throws Exception{ //String[] args = {10, 20, 30};
		System.out.println("Prog begin ");
		
		int leng =  args.length;
		System.out.println("Length: " +leng);
		
		sumOfDigit(args, leng);
		System.out.println("Prog ends");
	}

	private static void sumOfDigit(String[] args, int leng) {
		if(leng==0) {
			InputCannotBeEmptyException ex = new InputCannotBeEmptyException();
			throw ex;
		} else {
		
			try {
				String str = args[0];
				int numRecived = Integer.parseInt(str);
				System.out.println("Number recived :" +numRecived);
				
			} catch (NumberFormatException e) {
				System.out.println("You entered String, Please enter number");
			}
			
			//.. perform logic to find sum of digits
		}
	}
	
	

}
