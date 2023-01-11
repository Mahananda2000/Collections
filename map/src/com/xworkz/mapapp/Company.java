package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company {
	public static void main(String args[]) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("WIPRO", "SystemEngineer");
		map.put("INFOSYS", "ApplicationEngineer");
		map.put("TCS", "QAEngineer");
		map.put("IBM", "TraineeEngineer");
		map.put("ATOS", "Intern");
		map.put("DELLITE", "Software Deloper");
		map.put("CVENT", "AssociateEngineer");
		map.put("EPSLON", "SoftwareEngineer");
		map.put("EMPYSYS", "TestEngineer");
		map.put("BITTRON", "It infrastructureEngineer");
		
		System.out.println(map.size());
		
		System.out.println("only values are printed");
		Collection<String> values=map.values();
		System.out.println(values);
		
		System.out.println("only keys are printed");
		Collection<String> keys=map.keySet();
		System.out.println(keys);
		
		System.out.println("both values,keys are printed");
		Set<Entry<String,String>> entries=map.entrySet();
		System.out.println(entries);
		
		//for Each
		for(Entry<String,String> Entry:entries) {
			System.out.println(Entry.getValue()+" "+Entry.getKey());
			
		}
		

		
	}

}
