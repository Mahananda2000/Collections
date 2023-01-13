package com.xworkz.autowired2.boot;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired2.bean.Hardware;
import com.xworkz.autowired2.bean.Pencil;
import com.xworkz.autowired2.bean.PersonalData;
import com.xworkz.autowired2.bean.Rubber;
import com.xworkz.autowired2.bean.Software;
import com.xworkz.autowired2.bean.SoftwareEngineer;
import com.xworkz.autowired2.configuration.SpringConfiguration;



public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		
		Hardware ref3 = spring.getBean(Hardware.class);
		System.out.println(ref3);
		
		Software ref4 = spring.getBean(Software.class);
		System.out.println(ref4);
		
		Pencil ref5 = spring.getBean(Pencil.class);
		System.out.println(ref5);
		
		Rubber ref6 = spring.getBean(Rubber.class);
		System.out.println(ref6);
		
		SoftwareEngineer ref7 = spring.getBean(SoftwareEngineer.class);
		System.out.println(ref7);
		
		PersonalData ref8 = spring.getBean(PersonalData.class);
		System.out.println(ref8);
	}

}
