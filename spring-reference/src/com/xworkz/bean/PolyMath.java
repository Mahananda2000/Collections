package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PolyMath {
	
	@Autowired
	private Colonel colonel;
	
	public PolyMath() {
		System.out.println("Created polymath using no-args cons...");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.colonel.hashCode() +"hash code of ref");
	}

}
