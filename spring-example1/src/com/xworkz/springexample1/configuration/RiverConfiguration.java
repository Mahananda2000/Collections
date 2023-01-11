package com.xworkz.springexample1.configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RiverConfiguration {	
	@Bean
	public String  riverName1() {
		System.out.println("registered riverName2 by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String riverName2() {
		System.out.println("registered biscuitsManagerName by spring");
		String string=new String();
		return string;
	}
	
	
	@Bean
	public String riverName3() {
		System.out.println("registered riverName2 by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String riverName4() {
		System.out.println("registered riverName by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String riverName5() {
		System.out.println("registered riverName2 by spring");
		String string=new String();
		return string;
	}
	
     
	@Bean
	public Boolean isAlive1() {
		System.out.println("*******************************************");
		System.out.println("registered isalive by spring");
		Boolean bool=new Boolean(true);
		return bool;
	}
	
	
	@Bean
	public Boolean isAlive2() {
		System.out.println("registered isalive by spring");
		Boolean bool=new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean isAlive3() {
		System.out.println("registered isalive by spring");
		Boolean bool=new Boolean(true);
		return bool;
	}

	@Bean
	public Boolean isAlive4() {
		System.out.println("registered isalive by spring");
		Boolean bool=new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean isAlive5() {
		System.out.println("registered isalive by spring");
		Boolean bool=new Boolean(true);
		return bool;
	}

	@Bean 
	public Double length1() {
		System.out.println("*******************************************");
		System.out.println("registered length1 by spring ");
		Double  dl=new Double(30.5);
		return dl;
	}

	@Bean 
	public Double length2() {
		System.out.println("registered length1 by spring ");
		Double  dl=new Double(3000.00);
		return dl;
	}

	@Bean 
	public Double length3() {
		System.out.println("registered length by spring ");
		Double  dl=new Double(20.5);
		return dl;
	}

	@Bean 
	public Double length4() {
		System.out.println("registered length by spring ");
		Double  dl=new Double(30.00);
		return dl;
	}

	@Bean 
	public Double length5() {
		System.out.println("registered length by spring ");
		Double  dl=new Double(300.5);
		return dl;
	}
	
	@Bean
	
	public StringBuffer transaction1() {
		System.out.println("*******************************************");
		System.out.println("registered transaction by spring ");
		StringBuffer  buff=new StringBuffer();
		return buff;
			
	}
	
	public StringBuffer transaction2() {
		System.out.println("registered transaction by spring ");
		StringBuffer  buff=new StringBuffer();
		return buff;
			
	}
	
	public StringBuffer transaction3() {
		System.out.println("registered transaction by spring ");
		StringBuffer  buff=new StringBuffer();
		return buff;
			
	}

	public StringBuffer transaction4() {
		System.out.println("registered transaction by spring ");
		StringBuffer  buff=new StringBuffer();
		return buff;
			
	}

	public StringBuffer transaction5() {
		System.out.println("registered transaction by spring ");
		StringBuffer  buff=new StringBuffer();
		return buff;
			
	}
	
	
	public StringBuilder  riverType1() {
		System.out.println("*****************************************");
		System.out.println("registered riverType1 by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}

	public StringBuilder  riverType2() {
		System.out.println("registered  riverType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	
	public StringBuilder  riverType3() {
		System.out.println("registered riverType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}

	public StringBuilder  riverType4() {
		System.out.println("registered riverType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	public StringBuilder  riverType5() {
		System.out.println("registered riverType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}


	
	public StringBuilder  riverType6() {
		System.out.println("registered riverType1 by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	
	@Bean
	public void riverNames() {
	Collection<String> col=new ArrayList<String>();
	
		col.add("ganga");
		col.add("yamuna");
		col.add("krishna");
		col.add("kaveri");
		col.add("mahanadi");
	
	for(String ref:col) {
		System.out.println(ref);
		
	}
	}
	
	@Bean
	public void bankNames() {
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("ganga", 2000.00);
		map.put("kaveri", 5000.00);
		map.put("yamuna", 2000.00);
		map.put("tunga", 2000.00);
		map.put("kali", 2000.00);
		
		Set<Entry<String,Double>> entries=map.entrySet();
		for(Entry<String,Double> entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}
	




}
