package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class GameRunner {
	
	public static void main(String args[]) {
		
		GameDTO gameDTO1=new GameDTO("Kabaddi","Outdoor",7);
		GameDTO gameDTO2=new GameDTO("SnakeLadder","Indoor",4);
		GameDTO gameDTO3=new GameDTO("Ludo","Indoor",2);
		GameDTO gameDTO4=new GameDTO("Ludo","Indoor",8);
		GameDTO gameDTO5=new GameDTO("KhoKho","Outdoor",12);
		
		boolean equals=gameDTO1.equals(gameDTO5);
		System.out.println(equals);
		
		Collection<GameDTO> games=new ArrayList<GameDTO>();
		games.add(gameDTO1);
		games.add(gameDTO2);
		games.add(gameDTO3);
		games.add(gameDTO4);
		games.add(gameDTO5);
		
		
		boolean contains=games.contains(gameDTO5);
		System.out.println("contains:" +contains);
		
		boolean contains1=games.contains(gameDTO4);
		System.out.println("contains:" +contains1);
		
		
		boolean equal=gameDTO1.equals(gameDTO2);
		System.out.println("chech both dtos are equal or not:"+equal);
		
		boolean equal1=gameDTO3.equals(gameDTO4);
		System.out.println("chech both dtos are equal or not:"+equal1);
	
	}

}
