package com.xworkz.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


import com.xworkz.bean.PolyMath;

@Configuration
@ComponentScan(basePackages="com.xworkz.bean",excludeFilters=
{@ComponentScan.Filter(type=
		FilterType.ASSIGNABLE_TYPE,value=Collection.class)})
public class OptimisticConfiguration {
	
	public OptimisticConfiguration() {
		System.out.println("Created optimistic configuration using no-args const...");
	}
	

}
