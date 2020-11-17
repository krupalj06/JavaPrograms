package com.xworkz.collectionconcept.sorting;

public class Fridge {
	
	private String brand;
	private int numOfDoors;
	private int capacityInLtr;
	
	public Fridge(String brand, int numOfDoors, int capacityInLtr) {
		super();
		this.brand = brand;
		this.numOfDoors = numOfDoors;
		this.capacityInLtr = capacityInLtr;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public int getCapacityInLtr() {
		return capacityInLtr;
	}
	public void setCapacityInLtr(int capacityInLtr) {
		this.capacityInLtr = capacityInLtr;
	}
	
	@Override
	public String toString() {
		return "Fridge [brand=" + brand + ", numOfDoors=" + numOfDoors + ", capacityInLtr=" + capacityInLtr + "]";
	}

}
