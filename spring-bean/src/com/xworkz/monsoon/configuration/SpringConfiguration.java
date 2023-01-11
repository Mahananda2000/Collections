package com.xworkz.monsoon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.monsoon.bean.Actor;
import com.xworkz.monsoon.bean.Bun;
import com.xworkz.monsoon.bean.Flower;
import com.xworkz.monsoon.bean.Puff;
import com.xworkz.monsoon.bean.Rocket;
import com.xworkz.monsoon.bean.Season;

@Configuration
@ComponentScan("com.xworkz.monsoon")

public class SpringConfiguration {
	
	@Bean
	public Flower rose() {
		System.out.println("registered rose with spring");
		Flower flower=new Flower();
		return flower;
	}
	
	@Bean
	public Puff eggPuff() {
		System.out.println("registered eggPuff with spring");
		Puff puff=new Puff("non veg","egg");
		return puff;
	}
	
	@Bean
    public Bun sweetBun() {
		System.out.println("registered sweetBun with spring");
		Bun bn=new Bun();
		bn.setBakeryName("manu");
		bn.setPrice(30);
		return bn;
	}
     //literals
	 @Bean
	 public Rocket rocky1() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
	 
	 public Rocket rocky2() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
	 public Rocket rocky3() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
	 public Rocket rocky4() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
	 public Rocket rocky5() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
	 public Rocket rocky6() {
		 System.out.println("registering rocket with spring");
		 Rocket rock=new Rocket();
		 return rock;
		 
	 }
		 
	 
	 //constructor
	 @Bean
	 public Actor actor1() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("Punita","kannada");
		 return act;
	 }
	 
	 @Bean
	 public Actor actor2() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("Alluarjuna","telgu");
		 return act;
	 }
	 
	 
	 @Bean
	 public Actor actor3() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("salman khan","tamil");
		 return act;
	 }
	 
	 @Bean
	 public Actor actor4() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("Muski","maliyalam");
		 return act;
	 }

	 @Bean
	 public Actor actor5() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("annu","marati");
		 return act;
	 }
	 
	 @Bean
	 public Actor actor6() {
		 System.out.println("registering Actor with spring");
		 Actor act=new Actor("yash","kannada");
		 return act;
	 }


	 
	 //getter and setter
	 @Bean
	 public Season season1() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("rainy");
		 sn.setDuration(6);
		 sn.setStartingMonth("jan");
		 return sn;
	 }
	 
	 @Bean
	 public Season season2() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("winter");
		 sn.setDuration(8);
		 sn.setStartingMonth("feb");
		 return sn;
	 }
	 
	 @Bean
	 public Season season3() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("summer");
		 sn.setDuration(9);
		 sn.setStartingMonth("march");
		 return sn;
	 }
	 
	 @Bean
	 public Season season4() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("heavyRain");
		 sn.setDuration(10);
		 sn.setStartingMonth("april");
		 return sn;
	 }
	 
	 @Bean
	 public Season season5() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("heavySummer");
		 sn.setDuration(6);
		 sn.setStartingMonth("june");
		 return sn;
	 }

	 @Bean
	 public Season season6() {
		 System.out.println("registering season with spring");
		 Season sn=new Season();
		 sn.setName("heavyWinter");
		 sn.setDuration(11);
		 sn.setStartingMonth("dec");
		 return sn;
	 }





}
