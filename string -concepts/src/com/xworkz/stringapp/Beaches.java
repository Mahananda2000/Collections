package com.xworkz.stringapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString



public class Beaches {
	private  String name;
	private int id;
	@Override
	public String  toString() {
		return "Beaches-[BeachId ="+this.getId()+",BeachName ="+this.getName()+"]";
	}

}
