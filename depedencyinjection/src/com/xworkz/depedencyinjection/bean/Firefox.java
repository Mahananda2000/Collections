package com.xworkz.depedencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Firefox implements Browser {
	
	@Autowired
	@Qualifier("jio")
	public Provider provider;

	@Override
	public void browse() {
    System.out.println("creating browse using firefox");
    provider.connect();

	}
	
	public Firefox() {
		System.out.println("creating firefox with no-args constru...");
	}

}
