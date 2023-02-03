package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class CasinoDto {
	private String name;
	private String cruise;
	private String entryFee;
	private boolean freeFood;
	
	public CasinoDto() {
		System.out.println("created casinoDto using no-args const...");
	}

	@Override
	public String toString() {
		return "CasinoDto [name=" + name + ", cruise=" + cruise + ", entryFee=" + entryFee + ", freeFood=" + freeFood
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCruise() {
		return cruise;
	}

	public void setCruise(String cruise) {
		this.cruise = cruise;
	}

	public String getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(String entryFee) {
		this.entryFee = entryFee;
	}

	public boolean isFreeFood() {
		return freeFood;
	}

	public void setFreeFood(boolean freeFood) {
		this.freeFood = freeFood;
	}
	
	

}
