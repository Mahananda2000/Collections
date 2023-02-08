package com.xworkz.bakery.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BakeryDto {
	
	public  BakeryDto() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	private String name;
	private String ownerName;
	private String ownerWifeName;
	private boolean married;
	private String famousFor;
	private String since;
	
}
