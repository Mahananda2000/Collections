package com.xworkz.depedencyinjection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.depedencyinjection.bean.Browser;
import com.xworkz.depedencyinjection.bean.Chrome;
import com.xworkz.depedencyinjection.bean.Firefox;
import com.xworkz.depedencyinjection.configuration.SpringConfiguration1;

public class Runner1 {
	public static void main(String args[]) {
		
		ApplicationContext container1=new AnnotationConfigApplicationContext(SpringConfiguration1.class);

		System.out.println(Arrays.toString(container1.getBeanDefinitionNames()));
		
	    System.out.println(container1.getBeanDefinitionCount());
	    
	    
	    Browser ref=container1.getBean(Chrome.class);
	    ref.browse();
	    
	    Browser ref2=container1.getBean(Firefox.class);
	    ref.browse();
	    

	}

}
