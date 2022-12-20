package com.xworkz.collectionsapp;

import java.util.TreeSet;

public class Bike {

	public static void main(String[] args) {
		

		String bike1 = ("Royal Enfield Bullet");
		String bike2 = ("Royal Enfield classic");
		String bike3 = (" TVS ");
		String bike4 = ("TVS Apache");
		String bike5 = ("Honda Shine");
		String bike6 = ("Bajaj Platina");
		String bike7 = ("Pulsar ");
		String bike8 = ("Hero splender plus");
		String bike9 = ("Yamaha");
		String bike10 = ("ronin");
		String bike11 = ("Dio");
		String bike12 = ("Delux");
		String bike13 = ("Royal enfield Meteor");
		String bike14 = ("Royal enfield Himalayan");
		String bike15 = ("JVS Jupiter");
		String bike16 = ("Yamaha MT");
		String bike17 = ("KTM Duke");
		String bike18 = ("Honda Activa");
		
        TreeSet<String> collections=new TreeSet<String>();
		
        collections.add(bike1); //passing ref  
        collections.add(bike2); 
        collections.add(bike3);
        collections.add(bike4); 
        collections.add(bike5);
        collections.add(bike6); 
        collections.add(bike7);
        collections.add(bike8); 
        collections.add(bike9);
        collections.add(bike10); 
        collections.add(bike11);
        collections.add(bike12); 
        collections.add(bike13);
        collections.add(bike14); 
        collections.add(bike15);
        collections.add(bike16); 
        collections.add(bike17);
        collections.add(bike18); 
       
        System.out.println(collections.size());
		
        collections.clear();
		System.out.println("After clear..");
		
		System.out.println(collections.size());
        
		

	}

}
