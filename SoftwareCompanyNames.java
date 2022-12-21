package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SoftwareCompanyNames {
	
	public static void main(String args[]) {
		
		String companyName1="IBM";
		String companyName2="ATOS";
		String companyName3="OLX";
		String companyName4="COGNIZANT";
		String companyName5="INFOSYS";
		String companyName6="WIPRO";
		String companyName7="TCS";
		String companyName8="CAPEGEMINI";
		String companyName9="ORACLE";
		String companyName10="MICROSOFT";
		String companyName11="L&T";
		String companyName12="BOSCH";
		String companyName13="DELL";
		String companyName14="JIO";
		String companyName15="TIME INFOCOM";
		String companyName16="ACCENTURE";
		String companyName17="CISCO";
		String companyName18="HCL";
		String companyName19="AMAZON";		
		String companyName20="TECH MAHINDRA";
		
		Collection<String> companyNames=new ArrayList<String>();
		
		companyNames.add(companyName1);
		companyNames.add(companyName2);
		companyNames.add(companyName3);
		companyNames.add(companyName4);
		companyNames.add(companyName5);
		companyNames.add(companyName6);
		companyNames.add(companyName7);
		companyNames.add(companyName8);
		companyNames.add(companyName9);
		companyNames.add(companyName10);
		companyNames.add(companyName11);
		companyNames.add(companyName12);
		companyNames.add(companyName13);
		companyNames.add(companyName14);
		companyNames.add(companyName15);
		companyNames.add(companyName16);
		companyNames.add(companyName17);
		companyNames.add(companyName18);
		companyNames.add(companyName19);
		companyNames.add(companyName20);
		
		Iterator<String> itr=companyNames.iterator();
		
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
    	System.out.println(companyNames.size());
		System.out.println(companyNames);
		
		System.out.println("Accessing all elements from collection....");
		for(String element:companyNames) {
			System.out.println(element);
			
		}
		System.out.println(companyNames.size());
		System.out.println(companyNames);
		
		
		
	}

}
