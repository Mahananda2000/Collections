package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Animal {

	public static void main(String[] args) {
		String animal1="Dog";
		String animal2="Cat";
		String animal3="Donkey";
		String animal4="Monkey";
		String animal5="Rabbit";
		String animal6="Peocock";
		String animal7="Lion";
		String animal8="Tiger";
		String animal9="Rat";
		String animal10="Elephant";
		
		Collection<String> animals=new ArrayList<String>();
		animals.add(animal10);
		animals.add(animal9);
		animals.add(animal8);
		animals.add(animal7);
		animals.add(animal6);
		animals.add(animal5);
		animals.add(animal4);
		animals.add(animal3);
		animals.add(animal2);
		animals.add(animal1);
		Iterator <String> itr=animals.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
    	System.out.println(animals.size());
		System.out.println(animals);
		
		System.out.println("Accessing all elements from collection....");
		for(String element:animals) {
			System.out.println(element);
			
		}
		System.out.println(animals.size());
		System.out.println(animals);
		
	}

}
