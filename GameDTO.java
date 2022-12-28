package com.xworkz.collectionsapp;

public class GameDTO {

	private String name;
	private String type;
	private int noOfPlayers;
	
	public GameDTO() {
		
	}
	
	public GameDTO(String name,String type,int noOfPlayers) {
		
		this.name=name;
		this.type=type;
		this.noOfPlayers=noOfPlayers;
		
	}
	
	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from gameDTO" );
		if(reference !=null) {
			if(reference instanceof GameDTO) {
			GameDTO dto = (GameDTO) reference; 
			if(dto.name.equals (this.name)) {
				System.out.println("name is matching "+dto.name);
				return true;
			}
				
				if(dto.type.equals (this.type)) {
					System.out.println("type is matching "+dto.type);
					return true;
					
				}
				
			
			
		}
	}
			return false;
		
	
	
}
}
