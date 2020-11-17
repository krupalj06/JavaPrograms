package com.xworkz.collectionconcept.set;

public class Battery {

	private String type;
	private String brand;
	
	public Battery(String type, String brand) {
		super();
		this.type = type;
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Battery [type=" + type + ", brand=" + brand + "]";
	}
	
}
