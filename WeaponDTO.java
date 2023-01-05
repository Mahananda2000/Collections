package com.xworkz.collectionsapp;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO> {
	
	private String name;
	private String madeBy;
	private LocalDate date;
	private int price;
	private  Type type;
	
	public WeaponDTO() {
		
	}
	
	public WeaponDTO(String name, String madeBy, LocalDate date, int price,Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.date = date;
		this.price = price;
		this.type=type;
	}


	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", date=" + date + ", price=" + price + ",type="+type+"]";
	}
	
	@Override
	public int hashCode() {
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO ) {
				WeaponDTO dto=(WeaponDTO) obj;
				if(dto.name.equals(this.name)) {
					return true;
					
				}
				
			}
			
		}
			return false;
			
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMadeBy() {
		return madeBy;
	}


	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int compareTo(WeaponDTO o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
}
