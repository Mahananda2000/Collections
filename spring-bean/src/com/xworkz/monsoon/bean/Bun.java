package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;

public class Bun {
	
	private double price;
	private String bakeryName;
	
	
	public  Bun() {
		
	}
	
	@Value("vishala")
	public void setBakeryName(String bakeryName) {
		this.bakeryName=bakeryName;
	}
	
	@Value("10")
	public void setPrice(double price) {
		this.price=price;
	}

	

}
