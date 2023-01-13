package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Assistant;
import com.xworkz.bean.CameraMan;
import com.xworkz.bean.Movie;
import com.xworkz.bean.PolyMath;

import com.xworkz.configuration.OptimisticConfiguration;
import com.xworkz.configuration.ProducerConfiguration;

public class Runner {
	public static void main(String args[]) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(OptimisticConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		
		PolyMath ref = spring.getBean(PolyMath.class);
		ref.checkPropertyRef();
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(ProducerConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		
		Assistant ref1 = spring.getBean(Assistant.class);
        System.out.println(ref1);
        
       CameraMan ref2= spring.getBean(CameraMan.class);
       System.out.println(ref2);
       
      Movie ref3= spring.getBean(Movie.class);
      System.out.println(ref3);
	
	}

}
