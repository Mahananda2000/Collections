package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceRunner {
	public static void main(String args[]) {
		
		PlaceDTO placeDTO1=new PlaceDTO("Bagalkot","Dogs",6);
		PlaceDTO placeDTO2=new PlaceDTO("Belagavi","falls",8);
		PlaceDTO placeDTO3=new PlaceDTO("Darawad","Peda",10);
		PlaceDTO placeDTO4=new PlaceDTO("Bengaluru","IT industries",250);
		PlaceDTO placeDTO5=new PlaceDTO("Bagalkot","Sarees",7);
		
		Collection<PlaceDTO> places=new ArrayList<PlaceDTO>();
		places.add(placeDTO1);
		places.add(placeDTO2);
		places.add(placeDTO3);
		places.add(placeDTO4);
		places.add(placeDTO5);
		
		boolean contains=places.contains(placeDTO5);
		System.out.println(contains);
		
		boolean equals=placeDTO5.equals(placeDTO3);
		System.out.println("check the both dtos are match or not:"+equals);
		
		boolean equals1=placeDTO1.equals(placeDTO5);
		System.out.println("check the both dtos are math or not:"+equals1);
	
	}

}
