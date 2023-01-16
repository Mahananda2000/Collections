package com.xworkz.depedencyinjection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.depedencyinjection.configuration.SpringConfiguration;

public class Runner {
	
	public static void main(String args[]) {
	
	ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);

	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	
    System.out.println(container.getBeanDefinitionCount());

}
}
