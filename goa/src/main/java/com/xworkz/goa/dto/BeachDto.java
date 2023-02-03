package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class BeachDto {
	
	private String name;
	private String location;
	private  boolean clean;
	private String games;
	@Override
	public String toString() {
		return "BeachDto [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	public String getGames() {
		return games;
	}
	public void setGames(String games) {
		this.games = games;
	}
	
	

}
