package com.xworkz.validation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.service.FirstAidService;
import com.xworkz.validation.service.MissileService;
import com.xworkz.validation.service.ResortService;

public class Runner {
	public static void main(String args[]) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		
		System.out.println("FirstAid Runner");
		FirstAidService service=container.getBean(FirstAidService.class);
		boolean saved=service.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+saved);
		
		
		
		System.out.println("Missile Runner");
		MissileService service1=container.getBean(MissileService.class);
		boolean saved1=service1.validateAndSave(new MissileDTO());
		System.out.println("saved1"+saved1);
		
		
		
		System.out.println("Resort Runner");
		ResortService service2=container.getBean(ResortService.class);
		boolean saved2=service2.validateAndSave(new ResortDTO());
		System.out.println("saved2"+saved2);
	}

}
