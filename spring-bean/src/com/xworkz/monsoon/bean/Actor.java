package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//constructor
@Component
public class Actor {
	private String name;
	private String langauge;
	public Actor(@Value("Muskan")String name,@Value("Hindi")String langauge) {
		super();
		this.name = name;
		this.langauge = langauge;
	}
	

	
	

}
