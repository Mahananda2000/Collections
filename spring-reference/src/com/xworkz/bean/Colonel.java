package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Colonel {
	
	public Colonel() {
		System.out.println("created colonel using no-args const....");
	}
	
@Override
public int hashCode() {
		return 10;
}

}
