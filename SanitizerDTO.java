package com.xworkz.collectionsapp;

public class SanitizerDTO {
	
	private int id;
	private String brand;
	private String color;
	private Double price;
	
	public SanitizerDTO() {
		
	}
	
	public SanitizerDTO(int id,String brand,String color,Double price){
		super();
		this.id=id;
		this.brand=brand;
		this.color=color;
		this.price=price;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}
