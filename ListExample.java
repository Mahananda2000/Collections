package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.List;

public class ListExample{
	
	public static void main(String args[]) {
		
		//String,int
		List<String> list=new ArrayList<String>();
		list.add("R");
		list.add("Y");
		list.add("U");
		list.add("S");
		
		list.add(2,"E");
		//RYEUS
		System.out.println("**************Adding**************");
		for(String string:list) {
			System.out.println(string);
			}
		
		list.remove("E");
		System.out.println("**************Remove**************");
		for(String string:list) {
			System.out.println(string);
			}

		list.set(3,"P");
		System.out.println("**************Seting,replace**************");
		for(String string:list) {
			System.out.println(string);
			}

		list.add("Y");
		System.out.println("after adding dublicate");
		for(String string:list) {
			System.out.println(string);
			}

		


		
		
	}

}
