package com.xworkz.depedencyinjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	public Provider provider;

	@Override
	public void browse() {
    System.out.println("creating browse using chrome");
    provider.connect();
	}
	
	public Chrome() {
		System.out.println("creating chrome using no-args constru..");
		
	}
	
	

}
