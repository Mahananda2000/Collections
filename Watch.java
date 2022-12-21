package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {
	
	public static void main(String args[]) {
		
		String watch1="Mountblanc";
		String watch2="Quartz";
		String watch3="Audemars Piguet";
		String watch4="Cartier";
		String watch5="Piaget";
		
		Collection<String> watches=new ArrayList<String>();
		
		watches.add(watch5);
		watches.add(watch3);
		watches.add(watch1);
		watches.add(watch4);
		watches.add(watch2);
		
		Iterator <String> itr=watches.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
    	System.out.println(watches.size());
		System.out.println(watches);
		
		System.out.println("Accessing all elements from collection....");
		for(String element:watches) {
			System.out.println(element);
			
		}
		System.out.println(watches.size());
		System.out.println(watches);
		
		
		
	}

}
