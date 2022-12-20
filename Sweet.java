package com.xworkz.collectionsapp;

import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		
		String sweet1="Jalebi";
		String sweet2="Jamuna";
        String sweet3="Peda";
        String sweet4="Rasgulla";
        String sweet5="Madura Milana";
        String sweet6="Holagi";
        String sweet7="Huggi";
        String sweet8="Seera";
        String sweet9="Shankarpalya";
        String sweet10="Kadabu";
        String sweet11="Maisura Pak";
        String sweet12="Basundi";
        String sweet13="Jangira";



		 TreeSet<String> collections=new TreeSet<String>();
		 
		 collections.add(sweet1); 
		 collections.add(sweet2); 
		 collections.add(sweet3); 
		 collections.add(sweet4); 
		 collections.add(sweet5); 
		 collections.add(sweet6); 
		 collections.add(sweet7); 
		 collections.add(sweet8); 
		 collections.add(sweet9); 
		 collections.add(sweet10); 
		 collections.add(sweet11); 
		 collections.add(sweet12);
		 collections.add(sweet13); 
		 

	        System.out.println(collections.size());
			
	        collections.clear();
			System.out.println("After clear..");
			
			System.out.println(collections.size());
	        
		
	}

}
