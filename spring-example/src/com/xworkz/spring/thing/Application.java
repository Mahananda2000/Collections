package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Application extends Object {
	public Application() {
		System.out.println("created Application by spring");
	}

}
