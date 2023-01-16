package com.xworkz.depedencyinjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {

	@Override
	public void connect() {
    System.out.println("creating ");		
	}
	
	public Airtel() {
		System.out.println("creating airtel with no-args constru..");
	}
	

}
