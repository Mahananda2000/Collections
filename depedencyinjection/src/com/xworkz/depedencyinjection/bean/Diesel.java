package com.xworkz.depedencyinjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
	
	public Diesel() {
		System.out.println("created diesel");
	}
	
	@Override
	public void consume() {
		System.out.println("running consume from disel...");
		
	}

}
