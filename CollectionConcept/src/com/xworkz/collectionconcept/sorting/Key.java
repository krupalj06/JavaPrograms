package com.xworkz.collectionconcept.sorting;

public class Key implements Comparable<Key>{
	
	private String material; 
	private int length; 
	private String shape;
	
	public Key(String material, int length, String shape) {
		super();
		this.material = material;
		this.length = length;
		this.shape = shape;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		return "Key [material=" + material + ", length=" + length + ", shape=" + shape + "]";
	}

	@Override
	public int compareTo(Key o) {
//		int result = this.shape.compareTo(o.shape);
		int result = this.length - o.length ;
		return result;
	}
	
}
