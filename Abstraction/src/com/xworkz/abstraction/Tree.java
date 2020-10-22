package com.xworkz.abstraction;

public abstract class Tree {
	
	 abstract void growth();  //abstract / incomplete
	 abstract void flowering();
	 abstract void fruiting();
	 
	 void riping() {  //complete
		 System.out.println(" Ripening ");
	 }

}
