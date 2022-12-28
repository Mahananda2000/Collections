package com.xworkz.collectionsapp;

public class AirportDTO {
	
	private String name;
	private String place;
	private  int ticketPrice;
	
	
	public AirportDTO() {
		
	}
	
	public AirportDTO(String name,String place,int ticketPrice) {
		this.name=name;
		this.place=place;
		this.ticketPrice=ticketPrice;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", place=" + place + ", ticketPrice=" + ticketPrice + "]";
	}
	
	@Override
	public boolean equals(Object reference) {
		//System.out.println("running equals from airportDTO" );
		if(reference !=null) {
			if(reference instanceof AirportDTO) {
			AirportDTO dto = (AirportDTO) reference; 
			if(dto.name.equals(this.name)) {
				System.out.println("name is matching "+dto.name);
				return true;
			}
			}
		}
		return false;


}
}

