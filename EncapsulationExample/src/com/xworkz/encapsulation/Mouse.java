package com.xworkz.encapsulation;

public class Mouse {
	
	private String brand;
	private int noOfButtons;
	private boolean isWired;
	private String pinType;
	
	public Mouse( int noOfButtons, boolean isWired, String pinType) {
		brand = "Dell";
		this.noOfButtons = noOfButtons;
		this.isWired = isWired;
		this.pinType = pinType;
	}
	
	
	private void setBrand(String inBrand) {
		brand = inBrand;
	}
	
	public String getBrand() {
		System.out.println("The brand is :"+ brand);
		return brand;
	}


	protected int getNoOfButtons() {
		return noOfButtons;
	}


	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}


	public boolean isWired() {
		return isWired;
	}


	public void setWired(boolean isWired) {
		this.isWired = isWired;
	}


	public String getPinType() {
		return pinType;
	}


	public void setPinType(String pinType) {
		this.pinType = pinType;
	}
	

}
