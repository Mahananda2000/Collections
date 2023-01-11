package com.xworkz.springexample1.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springexample1.things.Bank;
import com.xworkz.springexample1.things.Biscuits;
import com.xworkz.springexample1.things.Chacolates;
import com.xworkz.springexample1.things.River;
import com.xworkz.springexample1.things.SuperMarket;

public class Runner {
	public static void main(String args[]) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Bank ref1=spring.getBean(Bank.class);
		System.out.println(ref1);
		
		Biscuits ref2=spring.getBean(Biscuits.class);
		System.out.println(ref2);
		
		River ref3=spring.getBean(River.class);
		System.out.println(ref3);
		
		SuperMarket ref4=spring.getBean(SuperMarket.class);
		System.out.println(ref4);
		
		Chacolates ref5=spring.getBean(Chacolates.class);
		System.out.println(ref5);
			
	}

}
