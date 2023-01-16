package com.xworkz.depedencyinjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
	
	public Petrol() {
		System.out.println("created petrol using no-args constr..");
	}
	
	@Override
	public void consume() {
		System.out.println("running consume in petrol...");
	}

}
