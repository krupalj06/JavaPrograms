package com.xworkz.exceptionhandling.customexception;

public class InputCannotBeEmptyException extends RuntimeException{
	
	public InputCannotBeEmptyException() {
		super("You dint enter anything , Please enter Number");  //Parent class constructor
		// RunTimeException("You dint enter anything , Please enter Number");
	}

}

//2 Example
// Scanner in 
// if input is 0 throw Customexception
//else{logic}
