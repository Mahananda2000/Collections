package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flower {
	
	@Value("Rose")
	private String name;
	@Value("Pink")
	private String color;
	@Value("15")
	private double price;
	
	public Flower() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
     public double getPrice() {
	     return price;
     }
     
     

}
