package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {
	public static void main(String args[]) {
		
		String metroCityName1="Kuvempu metro station";
		String metroCityName2="Baiyappanhalli metro station";
		String metroCityName3="Rajarajeshwarinagar metro station";
		String metroCityName4="Nagasandra metro station";
		String metroCityName5="Majestic metro station";
		
		Collection<String> metroCityNames=new ArrayList<String>();
		
		metroCityNames.add(metroCityName1);
		metroCityNames.add(metroCityName2);
		metroCityNames.add(metroCityName3);
		metroCityNames.add(metroCityName4);
		metroCityNames.add(metroCityName5);
		
		Iterator <String> itr=metroCityNames.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
    	System.out.println(metroCityNames.size());
		System.out.println(metroCityNames);
		
		System.out.println("Accessing all elements from collection....");
		for(String element:metroCityNames) {
			System.out.println(element);
			
		}
		System.out.println(metroCityNames.size());
		System.out.println(metroCityNames);
		
		
		
	}

}
