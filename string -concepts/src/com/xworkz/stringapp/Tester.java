package com.xworkz.stringapp;

public class Tester {

	public static void main(String args[]) {
		System.out.println("main method is started");
//		method1();
//	}
//	public static void method1() {
//		System.out.println("method1 is started");
//		method2();
//	}
//	
//	public static void method2() {
//		System.out.println("");
//		method3();
		
		//creating string object using string literals
		String var="Radhika";
		//immutable nature of string
		//var=" Danush";
		
		String var2="Radhika";
		String var1= new String("Danush");
		
		var2=var1;
		
		//compare memory address
		System.out.println(var == var2);
		
		//compare values of an object
		System.out.println(var1.equals(var2));
		System.out.println(var);
		//creating string object using new keyword
		//String var1= new String("");
	}
	
	
	String str=new String("Baba");
	
	System.out.println("===================");
	String  str1=new String("Baba");
	 System.out.println(Str==Str1);
}
