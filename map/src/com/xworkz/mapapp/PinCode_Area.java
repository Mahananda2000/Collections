package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PinCode_Area {
	public static void main(String args[]) {
		
		Map<Long,String> map=new HashMap<Long,String>();
		map.put(456789L, "Bagalkot");
		map.put(98765L, "Badami");
		map.put(87654389L, "Hassan");
		map.put(4567899L, "Belagavi");
		map.put(9876543456L, "Ballary");
		map.put(234568765L, "Bilagi");
		map.put(123456L, "Davanageri");
		map.put(9876549L, "Mandya");
		map.put(456345789L, "Tiptura");
		map.put(4523456L, "Hunagunda");
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("map nalli enu illa");
			
		}else {
			System.out.println("map nalli eno eno ide");
		}
		
		System.out.println("print only values");
		Collection<String> values = map.values();
		System.out.println(values);
		//values.forEach(e->System.out.println(e));

		System.out.println("print only values");
		Set<Long> keys = map.keySet();
		System.out.println(keys);
		
		 System.out.println("both keys, values are printed");
	        Set<Entry<Long,String>> entries=map.entrySet();
	        System.out.println(map);
	        
	      //for each
	    	for(Entry<Long,String> entry:entries) {
	    		System.out.println(entry.getKey()+" "+entry.getValue());
	    	}
	    	

	}

}
