package com.xworkz.collectionsapp;

import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		
		String Coupon1="Percent Off";
		String Coupon2="Free shipping ";
		String Coupon3="Free  gift with purchase";
		String Coupon4="Promo codes based on loyalty";
		String Coupon5="Bogo";
		String Coupon6="Automatic";
		String Coupon7="Gift card";
		String Coupon8="Friends and family discount";
		String Coupon9="Store";
		String Coupon10="Manufacture";
		String Coupon11="Myntra";
		String Coupon12="Food";
		
		TreeSet<String> collections=new TreeSet<String>();
		
		collections.add(Coupon1);
		collections.add(Coupon2);
		collections.add(Coupon3);
		collections.add(Coupon4);
		collections.add(Coupon5);
		collections.add(Coupon6);
		collections.add(Coupon7);
		collections.add(Coupon8);
		collections.add(Coupon9);
		collections.add(Coupon10);
		collections.add(Coupon11);
		collections.add(Coupon12);
		
        System.out.println(collections.size());
		
        collections.clear();
		System.out.println("After clear..");
		
		System.out.println(collections.size());


		

	}

}
