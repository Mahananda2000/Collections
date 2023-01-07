package com.xworkz.mapapp;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Chacolate {
	public static void main(String args[]) {
		Map<String,Double> map=new TreeMap<String,Double>();
		map.put("Bubbly", 80.00);
		map.put("DairyMilk", 25.00);
		map.put("Munch", 10.00);
		map.put("KitKat", 40.00);
		map.put("MilkyBar", 99.00);
		map.put("Straberry", 5.00);
		map.put("Coffe", 15.00);
		map.put("Chocobar", 16.00);
		map.put("Imali", 5.00);
		map.put("Coconut", 1.00);
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("map nalli enu illa");
			
		}else {
			System.out.println("map nalli en eno ide");
		}
		
		System.out.println("only keys are printed");
		Set<String> keys = map.keySet();
		System.out.println(keys);
		//keys.forEach(e->System.out.println(e));
		
		System.out.println("only values are printed");
        Collection<Double> values = map.values();
        System.out.println(values);
      //values.forEach(e->System.out.println(e));
        
        System.out.println("both keys, values are printed");
        Set<Entry<String,Double>> entries=map.entrySet();
        System.out.println();
        
      //for each
    	for(Entry<String,Double> entry:entries) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
    	}
    	
	}

}
