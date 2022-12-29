package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String args[]) {
		
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	list.add(60);
	System.out.println("*****Adding******");
	for(Integer integer:list) {
		System.out.println(integer);
		
	}
	
	list.add(1,60);
	System.out.println("************Adding********");
	for(Integer integer:list) {
		System.out.println(integer);
		
	}
	//give index value only
	list.remove(5);
	System.out.println("*************Remove*********");
	for(Integer integer:list) {
		System.out.println(integer);
		
	}
	
	
	list.set(0,100);
	System.out.println("*********set**************");
	for(Integer integer:list) {
		System.out.println(integer);
		
	}
	
	//give both index and element value
	list.set(3,300);
	System.out.println("*********set**************");
	for(Integer integer:list) {
		System.out.println(integer);
		
	}




	
	
	}
}
