package com.xworkz.monsoon.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.monsoon.bean.Actor;
import com.xworkz.monsoon.bean.Bun;
import com.xworkz.monsoon.bean.Flower;
import com.xworkz.monsoon.bean.Puff;
import com.xworkz.monsoon.bean.Rocket;
import com.xworkz.monsoon.bean.Season;
import com.xworkz.monsoon.configuration.SpringConfiguration;
public class Runner {
	
	public static void main(String args[]) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Flower ref=spring.getBean(Flower.class);
		System.out.println(ref);
		
		Puff ref1=spring.getBean(Puff.class);
		System.out.println(ref1);
		
		Bun ref2=spring.getBean(Bun.class);
		System.out.println(ref2);
		
		System.out.println("******************************************************");
		
		Rocket ref3=spring.getBean(Rocket.class);
		System.out.println(ref3);
		
		Rocket ref31=spring.getBean("rocky1",Rocket.class);
		System.out.println(ref31);

		Rocket ref32=spring.getBean("rocky2",Rocket.class);
		System.out.println(ref32);
		
		Rocket ref33=spring.getBean("rocky3",Rocket.class);
		System.out.println(ref33);
		
		Rocket ref34=spring.getBean("rocky4",Rocket.class);
		System.out.println(ref34);
		
		Rocket ref35=spring.getBean("rocky5",Rocket.class);
		System.out.println(ref35);

		Rocket ref36=spring.getBean("rocky6",Rocket.class);
		System.out.println(ref36);

        System.out.println("*****************************************************");

		Actor ref4=spring.getBean(Actor.class);
		System.out.println(ref4);
		
		Actor ref41=spring.getBean("actor1",Actor.class);
		System.out.println(ref41);
		
		Actor ref42=spring.getBean("actor2",Actor.class);
		System.out.println(ref42);
		
		Actor ref43=spring.getBean("actor3",Actor.class);
		System.out.println(ref43);
		
		Actor ref44=spring.getBean("actor4",Actor.class);
		System.out.println(ref44);
		
		Actor ref45=spring.getBean("actor5",Actor.class);
		System.out.println(ref45);

		Actor ref46=spring.getBean("actor6",Actor.class);
		System.out.println(ref46);


		
		System.out.println("***************************************************************");

		Season ref5=spring.getBean(Season.class);
		System.out.println(ref5);
		
		Season ref51=spring.getBean("season1",Season.class);
		System.out.println(ref51);

		Season ref52=spring.getBean("season2",Season.class);
		System.out.println(ref52);

		Season ref53=spring.getBean("season3",Season.class);
		System.out.println(ref53);

		Season ref54=spring.getBean("season4",Season.class);
		System.out.println(ref54);

		Season ref55=spring.getBean("season5",Season.class);
		System.out.println(ref55);

		Season ref56=spring.getBean("season6",Season.class);
		System.out.println(ref56);

		
	}

}
