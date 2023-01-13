package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	
	@Autowired
	public Area area;
	
	public Location() {
		System.out.println("created location with no-args const..");
	}

}
