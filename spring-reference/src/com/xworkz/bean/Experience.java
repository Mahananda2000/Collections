package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;
	
	public Experience() {
		System.out.println("register Experience with no-args constru...");
	}

}
