package com.xworkz.accessmodifiers.classex;

public class Chair {
	
	private String material;
	public int weight;
	String color;
	protected double price;
	
	public Chair() {
		System.out.println("Constructor with no arg");
	}
	
	private Chair(int inweight){
		weight  = inweight;
	}
	
	Chair(String inMatererial , int inweight,  String incolor, double inprice){
		material = inMatererial;
		weight = inweight; 
		color = incolor;
		price = inprice;
	}
	
	private void rolling() {
		System.out.println("Rolling the chair");
	}
	
	void moving() {
		System.out.println("Moving chair");
	}
	
	public void displayDetails() {
		rolling();
		System.out.println("Material: "+ material + "Weight: "+weight + " Color:  "+ color + " price: "+ price);
	}
	

}
