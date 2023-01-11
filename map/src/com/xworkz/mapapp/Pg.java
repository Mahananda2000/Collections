package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Pg {
	public static void main(String args[]) {
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("ShreeSai pg", 5000.00);
		map.put("Kushi pg", 5000.00);
		map.put("Ashwini pg", 5000.00);
		map.put("Preethi pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		map.put("ShreeSai pg", 5000.00);
		
		System.out.println(map.size());
		
		System.out.println("only values are printed");
		Collection<Double> values=map.values();
		System.out.println(values);
		
		System.out.println("only keys are printed");
		Collection<String> keys=map.keySet();
		System.out.println(keys);
		
		System.out.println("both values,keys are printed");
		Set<Entry<String,Double>> entries=map.entrySet();
		System.out.println(entries);
		
		//for Each
		for(Entry<String,Double> Entry:entries) {
			System.out.println(Entry.getValue()+" "+Entry.getKey());
			
		}
		

		
	}

}
