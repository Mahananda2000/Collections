package com.xworkz.collectionsapp;

import java.util.TreeSet;

public class Currencies {
	public static void main(String args[]) {
		
		String currency1="Afgan Afgani";
		String currency2="Ruppay";
		String currency3="Armenian dran";
		String currency4="Dinar";
		String currency5="Taka";
		String currency6="Manat";
		String currency7="Pondi";
		String currency8="Doller";
		String currency9="Rial";
		String currency10="Tenge";
		String currency11="Yen";
		String currency12="Won";
		String currency13="Som";
		String currency14="Kip";
		String currency15="Donge";
		String currency16="Dirham";
		String currency17="Bast";
		String currency18="Somoni";
		String currency19="Pound";
		String currency20="Rubel";
		String currency21="reyal";
		String currency22="Shekel";
		String currency23="Togrog";
		String currency24="Rufiyaa";
		String currency25="Ringgit";
		String currency26="Kyat";
		
		TreeSet<String> collections=new TreeSet<String>();
		
		
		collections.add(currency1);
		collections.add(currency2);  
		collections.add(currency3);
		collections.add(currency4);
		collections.add(currency5);
		collections.add(currency6);
		collections.add(currency7);
		collections.add(currency8);
		collections.add(currency9);
		collections.add(currency10);
		collections.add(currency11);
		collections.add(currency12);
		collections.add(currency13);
		collections.add(currency14);
		collections.add(currency15);
		collections.add(currency16);
		collections.add(currency17);
		collections.add(currency18);
		collections.add(currency19);
		collections.add(currency20);
		collections.add(currency21);
		collections.add(currency22);
		collections.add(currency23);
		collections.add(currency24);
		collections.add(currency25);
		collections.add(currency26);
		
		System.out.println(collections.size());
		
        collections.clear();
		System.out.println("After clear..");
		
		System.out.println(collections.size());
        		
	}

}
