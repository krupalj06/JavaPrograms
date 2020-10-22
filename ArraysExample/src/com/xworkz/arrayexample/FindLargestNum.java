package com.xworkz.arrayexample;

public class FindLargestNum {
	
	public static void main(String[] args) {
		// 14 15 31 72 12
		System.out.println("Start prog");
		
		int[] numbers = new int[10];
		numbers[0]=14;
		numbers[1]=15;
		numbers[2]=31;
		numbers[3]=72;
		numbers[4]=12;
//		numbers[5]=32; //not allowed
		
		int length = numbers.length;
		System.out.println("Length: "+length);
		
		for(int i=0 ; i<= numbers.length-1 ; i++ ) {
			int temp = numbers[i];
			System.out.println("Number at index "+ i +" is : " +temp); // numbers[0] //numbers[1] //numbers[2]
		}
		
		for(int i : numbers) {
			System.out.println("num is : "+i);
		}
		
		
		FindLargestNum fln = new FindLargestNum();
		
		int res = fln.findLargestNumber(numbers);// array arg
		
		System.out.println("The largest number in the array is :" + res);
	}
	
	
	int findLargestNumber(int[] num) { // array param
		int result= 0;
		
		for (int i : num) {
			//..
		}
		return result;
	}

}
