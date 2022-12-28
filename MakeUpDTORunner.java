package com.xworkz.collectionsapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MakeUpDTORunner {

	public static void main(String[] args) {
		MakeUpDTO makeUpDTO1=new MakeUpDTO("Lipswstick","Loreal",4567D);
		MakeUpDTO makeUpDTO2=new MakeUpDTO("Powder","Ponds",45D);
		MakeUpDTO makeUpDTO3=new MakeUpDTO("Lakme","Lakme",450D);
		MakeUpDTO makeUpDTO4=new MakeUpDTO("Foundation","Lakme",1000D);
		
		Collection<MakeUpDTO> collections=new LinkedList<MakeUpDTO>();
		collections.add(makeUpDTO1);
		collections.add(makeUpDTO2);
		collections.add(makeUpDTO3);
		collections.add(makeUpDTO4);
		
		//for each or iterator
		//new element or remove
		
		Iterator<MakeUpDTO> ref= collections.iterator();
		while(ref.hasNext()) {
			MakeUpDTO element = ref.next();
			System.out.println(element.getBrand());	
			if(element.getPrice()>200) {
				element.setPrice(999D);
				
								
				
			}
		}
		
		for(MakeUpDTO makeUpDTO: collections) {
			System.out.println(makeUpDTO.getPrice());
		}
		
		
		//for each or iterator
		//new element or remove
		Iterator<MakeUpDTO> ref1 = collections.iterator();
		while(ref1.hasNext()) {
			MakeUpDTO element = ref1.next();
			if("Ponds".equals(element.getBrand())) {
				System.out.println(element);
				
			}
			
		}
		
		Iterator<MakeUpDTO> ref2=collections.iterator();
		while(ref2.hasNext()) {
			MakeUpDTO element = ref2.next();
			if(element.getPrice()>200) {
				System.out.println("Element getting removed"+element);
				ref2.remove();
				
			}
			
		}
		
		
     	MakeUpDTO removedDTo = new MakeUpDTO("Lipswstick","Loreal",4567D);
		collections.remove(removedDTo);
		System.out.println(collections.size());
		
		
		
		
	}

}
