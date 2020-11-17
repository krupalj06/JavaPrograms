package com.xworkz.collectionconcept.iterator;

public class Mask {
	
	private String type;
	private boolean isN95;
	private double price;
	
	public Mask(String type, boolean isN95, double price) {
		super();
		this.type = type;
		this.isN95 = isN95;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isN95() {
		return isN95;
	}
	public void setN95(boolean isN95) {
		this.isN95 = isN95;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mask [type=" + type + ", isN95=" + isN95 + ", price=" + price + "]";
	}
	
}
