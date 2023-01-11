package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.thing.Milk;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Milk ref = spring.getBean(Milk.class);
		System.out.println(ref);
		
		String ref1 = spring.getBean(String.class);
		System.out.println(ref1);
		
		Float ref2 = spring.getBean(Float.class);
		System.out.println(ref2);

		

	}

}
