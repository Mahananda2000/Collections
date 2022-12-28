package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayRunner {
	public static void main(String args[]) {
		
		HolidayDTO holidayDTO1=new HolidayDTO("Summer Holidays","VTU",60);
		HolidayDTO holidayDTO2=new HolidayDTO("Summer Holidays","HR",10);
		HolidayDTO holidayDTO3=new HolidayDTO("National Holidays","Principle",5);
		HolidayDTO holidayDTO4=new HolidayDTO("Dasara Holidays","ClassTeacher",7);
		HolidayDTO holidayDTO5=new HolidayDTO("Festival Holidays","Manager",30);
		
		Collection<HolidayDTO> holidays=new ArrayList<HolidayDTO>();
		holidays.add(holidayDTO1);
		holidays.add(holidayDTO2);
		holidays.add(holidayDTO3);
		holidays.add(holidayDTO4);
		holidays.add(holidayDTO5);
		
		boolean contains=holidays.contains(holidayDTO1);
		System.out.println(contains);
		
		boolean equal=holidayDTO1.equals(holidayDTO4);
		System.out.println("check both dtos are match or not:"+equal);
		
		boolean equal1=holidayDTO1.equals(holidayDTO2);
		System.out.println("check both dtos are match or not:"+equal1);
	
	}

}
