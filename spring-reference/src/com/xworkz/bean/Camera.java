package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Lens lens;
	
	public Camera() {
		System.out.println("register camera with no-args const..");
	}

}
