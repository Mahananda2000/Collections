package com.xworkz.collectionsapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerDTORunner {
	
	public static void main(String args[]) {
		
		SanitizerDTO SanitizerDTO1=new SanitizerDTO(1,"Sterillium","Colourless",5D);
		SanitizerDTO SanitizerDTO2=new SanitizerDTO(2,"Savlon","WaterColor",100D);
		SanitizerDTO SanitizerDTO3=new SanitizerDTO(3,"Dettol","Blue",150D);
		SanitizerDTO SanitizerDTO4=new SanitizerDTO(4,"LifeBuoy","Pink",200D);
		SanitizerDTO SanitizerDTO5=new SanitizerDTO(5,"Godrej","Red",250D);
		SanitizerDTO SanitizerDTO6=new SanitizerDTO(6,"Dabur","Green",300D);
		SanitizerDTO SanitizerDTO7=new SanitizerDTO(7,"Multani","Saffron",350D);
		SanitizerDTO SanitizerDTO8=new SanitizerDTO(8,"Corvil","NavyBlue",400D);
		SanitizerDTO SanitizerDTO9=new SanitizerDTO(9,"Trust","Pink",450D);
		SanitizerDTO SanitizerDTO10=new SanitizerDTO(10,"DCM Shriram","SkyBlue",500D);
		
		
		Collection<SanitizerDTO> collections=new LinkedList<SanitizerDTO>();
		collections.add(SanitizerDTO1);
		collections.add(SanitizerDTO2);
		collections.add(SanitizerDTO3);
		collections.add(SanitizerDTO4);
		collections.add(SanitizerDTO5);
		collections.add(SanitizerDTO6);
		collections.add(SanitizerDTO7);
		collections.add(SanitizerDTO8);
		collections.add(SanitizerDTO9);
		collections.add(SanitizerDTO10);
		

		
		
		Iterator<SanitizerDTO> ref= collections.iterator();
		while(ref.hasNext()) {
			SanitizerDTO element = ref.next();
			if(element.getPrice()>5) {
				System.out.println(" getting elements are: "+element);	
			}
		}
		
		
		
		Iterator<SanitizerDTO> ref1 = collections.iterator();
		while(ref1.hasNext()) {
			SanitizerDTO element = ref1.next();
			if("green".equals(element.getColor())) {
				System.out.println(element);
				ref1.remove();
			}
			
		}

		
		
		
		
		
	
		
		
	}

}
