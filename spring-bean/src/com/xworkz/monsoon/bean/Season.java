package com.xworkz.monsoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//apply getter setter
@Component
public class Season {
	
	private String name;
	private int duration;
	private String startingMonth;
	
	public String getName() {
		return name;
	}
	
	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
	
	@Value("july")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	
	
}
