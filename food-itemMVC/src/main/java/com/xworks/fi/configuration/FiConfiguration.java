package com.xworks.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworks.fi")
public class FiConfiguration {
	
	public FiConfiguration() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}

}
