package com.xworkz.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(basePackages="com.xworkz",excludeFilters=
{@ComponentScan.Filter(type=
		FilterType.ASSIGNABLE_TYPE,value=Collection.class)})
public class ProducerConfiguration {
	
	public ProducerConfiguration() {
		System.out.println("created producer configuration with no-args const..");
	}
	


}
