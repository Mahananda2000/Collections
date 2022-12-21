package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
		String shoeSize1="16";
		String shoeSiz2="15";
		String shoeSiz3="1";
		String shoeSize4="2";
		String shoeSize5="3";
		String shoeSize6="13";
		String shoeSize7="12";
		String shoeSize8="4";
		String shoeSize9="5";
		String shoeSize10="6";
		String shoeSize11="9";
		String shoeSize12="23";
		String shoeSize13="21";
		String shoeSize14="10";
		String shoeSize15="11";
		
		Collection<String> shoeSizes=new ArrayList<String>();
		
		shoeSizes.add(shoeSize4);
		shoeSizes.add(shoeSize4);
		shoeSizes.add(shoeSize4);
		shoeSizes.add(shoeSize4);
		shoeSizes.add(shoeSize5);
		shoeSizes.add(shoeSize6);
		shoeSizes.add(shoeSize7);
		shoeSizes.add(shoeSize8);
		shoeSizes.add(shoeSize9);
		shoeSizes.add(shoeSize10);
		shoeSizes.add(shoeSize11);
		shoeSizes.add(shoeSize12);
		shoeSizes.add(shoeSize13);
		shoeSizes.add(shoeSize14);
		shoeSizes.add(shoeSize15);
		
		Iterator<String> itr=shoeSizes.iterator();
		while(itr.hasNext()){
			String element=itr.next();
			System.out.println(element);
		}
    	System.out.println(shoeSizes.size());
		System.out.println(shoeSizes);
		
		System.out.println("Accessing all elements from collection....");
		for(String element:shoeSizes) {
			System.out.println(element);
			
		}
		System.out.println(shoeSizes.size());
		System.out.println(shoeSizes);	

	}

}
