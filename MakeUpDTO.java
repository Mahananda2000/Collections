package com.xworkz.collectionsapp;

import java.io.Serializable;

public class MakeUpDTO implements Serializable {
	
	private String name;
	private String brand;
	private Double price;
	
	public MakeUpDTO() {
		
	}
	public MakeUpDTO(String name, String brand,Double price) {
		super();
		this.name=name;
		this.brand=brand;
		this.price=price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MakeUpDTO [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
