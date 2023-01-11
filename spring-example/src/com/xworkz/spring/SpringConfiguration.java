package com.xworkz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring.thing")
public class SpringConfiguration {
	
	@Bean 
	public String chair() {
		String string=new String();
		System.out.println("register chair with string:");
		return string;
	}

	@Bean 
	public Float rat() {
	 Float flt=new Float(5);
	 System.out.println("register rat with float");
	 return flt;
	}
}
