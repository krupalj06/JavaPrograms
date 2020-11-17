package com.xworkz.collectionconcept.iterator;

public class Editor {
	
	private String name; 
	private double sizeInMb;
	private String features;
	
	public Editor(String name, double sizeInMb, String features) {
		super();
		this.name = name;
		this.sizeInMb = sizeInMb;
		this.features = features;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSizeInMb() {
		return sizeInMb;
	}
	public void setSizeInMb(double sizeInMb) {
		this.sizeInMb = sizeInMb;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Editor [name=" + name + ", sizeInMb=" + sizeInMb + ", features=" + features + "]";
	}
	

}
