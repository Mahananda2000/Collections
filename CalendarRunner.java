package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CalendarRunner {

	public static void main(String[] args) {
		
		CalendarDTO calenderDTO1 = new CalendarDTO("Asali","Kannada",1);
		CalendarDTO calenderDTO2 = new CalendarDTO("Basaveshwara","English",2);
		CalendarDTO calenderDTO3 = new CalendarDTO("Vishala","Telagu",3);
		CalendarDTO calenderDTO4 = new CalendarDTO("Snehi","Marati",4);
		CalendarDTO calenderDTO5 = new CalendarDTO("Laxmi","Kannada",5);
		
		Collection<CalendarDTO> calender=new ArrayList<CalendarDTO>();
		calender.add(calenderDTO1);
		calender.add(calenderDTO2);
		calender.add(calenderDTO3);
		calender.add(calenderDTO4);
		calender.add(calenderDTO5);
		
		boolean contains=calender.contains(calenderDTO5);
		System.out.println(contains);
		
		boolean contains1=calender.contains(calenderDTO1);
		System.out.println(contains1);
		
		boolean equal=calenderDTO1.equals(calenderDTO4);
		System.out.println("check the both dtos are match or not:"+equal);
		
		boolean equal1=calenderDTO1.equals(calenderDTO4);
		System.out.println("check the both dtos are match or not:"+equal1);
		

		boolean equal2=calenderDTO1.equals(calenderDTO5);
		System.out.println("check the both dtos are match or not:"+equal2);
	
	}

}
