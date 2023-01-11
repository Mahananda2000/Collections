package com.xworkz.stringapp;

import lombok.ToString;

@ToString
public class Fruit {

	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//above apply @ToString thats wy not write tostring method
//	@Override
//	public String toString() {
//		//return "Fruit-[FruitName="+this.getName()+",FruitPrice="+this.getPrice()+"]";
		
	
	
}
