package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapRelatedPgrm {
	
public static void main(String args[]) {
	Map<String,Double> map=new HashMap<String,Double>();
	map.put("Bengaluru", 25.06);
	map.put("Bagalkot", 28.00);
	map.put("Hassan", 21.20);
	map.put("Davanagere", 30.46);
	map.put("Rajastan", 40.23);
	map.put("Bilagi", 10.56);
	
	System.out.println(map.size());
	
	if(map.isEmpty()) {
		System.out.println("map nalli enu illa");
		
	}else {
		System.out.println("map nalli en eno ide");
	}
	
	System.out.println("only key are printed");
	Set<String > keys=map.keySet();
	//System.out.println(keys);Or
	keys.forEach(e->System.err.println(e));
	
	System.out.println("only  values are printed");
	Collection<Double> values=map.values();
	//System.out.println(values);OR
	values.forEach(e->System.out.println(e));
	
	System.out.println("both keys,values are printed/loop as a pair");
	//System.out.println(map);OR using lamda expression
	Set<Entry<String,Double>> entries=map.entrySet();
	
	//for each
	for(Entry<String,Double> entry:entries) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	

	

	
	
	
	
}
}
