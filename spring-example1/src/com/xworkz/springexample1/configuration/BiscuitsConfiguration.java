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
public class BiscuitsConfiguration {
	
	@Bean
	public String  biscuitsName() {
		System.out.println("registered biscuitsName by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String biscuitsManagerName() {
		System.out.println("registered biscuitsManagerName by spring");
		String string=new String();
		return string;
	}
	
	
	@Bean
	public String Location() {
		System.out.println("registered Location by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String branch() {
		System.out.println("registered branch by spring");
		String string=new String();
		return string;
	}
	
	@Bean
	public String address() {
		System.out.println("registered address by spring");
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
	public Double money() {
		System.out.println("*******************************************");
		System.out.println("registered money by spring ");
		Double  dl=new Double(30.5);
		return dl;
	}

	@Bean 
	public Double debitMoney() {
		System.out.println("registered debitmoney by spring ");
		Double  dl=new Double(3000.00);
		return dl;
	}

	@Bean 
	public Double creditMoney() {
		System.out.println("registered creditmoney by spring ");
		Double  dl=new Double(20.5);
		return dl;
	}

	@Bean 
	public Double creditMoney1() {
		System.out.println("registered money by spring ");
		Double  dl=new Double(30.00);
		return dl;
	}

	@Bean 
	public Double debitMoney1() {
		System.out.println("registered money by spring ");
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
	
	
	public StringBuilder  biscuitsType1() {
		System.out.println("*****************************************");
		System.out.println("registered biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}

	public StringBuilder  biscuitsType2() {
		System.out.println("registered  biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	
	public StringBuilder  biscuitsType3() {
		System.out.println("registered biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}

	public StringBuilder  biscuitsType4() {
		System.out.println("registered biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	public StringBuilder  biscuitsType5() {
		System.out.println("registered biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}


	
	public StringBuilder  biscuitsType() {
		System.out.println("registered biscuitsType by spring ");
		StringBuilder  buld=new StringBuilder();
		return buld;
			
	}
	
	@Bean
	public void biscuitsNamess() {
	Collection<String> col=new ArrayList<String>();
	
		col.add("parle");
		col.add("50-50");
		col.add("bounce");
		col.add("hide and sick");
		col.add("monacco");
	
	for(String ref:col) {
		System.out.println(ref);
		
	}
	}
	
	@Bean
	public void biscuitsNames() {
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("parle", 2000.00);
		map.put("50-50", 5000.00);
		map.put("monacco", 2000.00);
		map.put("crackchack", 2000.00);
		map.put("bounce", 2000.00);
		
		Set<Entry<String,Double>> entries=map.entrySet();
		for(Entry<String,Double> entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}
	

}
