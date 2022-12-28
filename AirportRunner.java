package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class AirportRunner {
	public static void main(String args[]) {
		
		AirportDTO airportDTO1=new AirportDTO("Kempegowda International airport","Bengaluru",1000);
		AirportDTO airportDTO2=new AirportDTO("Hubli airport","Hubli",500);
		AirportDTO airportDTO3=new AirportDTO("Mangalore  International airport","Mangalore",1500);
		AirportDTO airportDTO4=new AirportDTO("Rajiv Ghandhi airport","Mysore",800);
		AirportDTO airportDTO5=new AirportDTO("Hubli airport","Ballary",200);
		
		Collection<AirportDTO> airport=new ArrayList<AirportDTO>();
		airport.add(airportDTO1);
		airport.add(airportDTO2);
		airport.add(airportDTO3);
		airport.add(airportDTO4);
		airport.add(airportDTO5);
		
		boolean contains=airport.contains(airportDTO4);
		System.out.println("contains:" +contains);
		
		boolean equal=airportDTO1.equals(airportDTO2);
		System.out.println("check the both dtos are match or not:"+equal);
		
		boolean equal1=airportDTO2.equals(airportDTO5);
		System.out.println("check the both dtos are match or not:"+equal1);
		
		
		
		


		
		
		
	}

}
