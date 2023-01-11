package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;

public class Puff {
	
	private String name;
	private String type;
	
	
	public Puff(@Value("veg")String name, @Value("AluPuff")String type) {
		this.name = name;
		this.type = type;
	}
	
	

}
