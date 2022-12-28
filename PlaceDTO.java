package com.xworkz.collectionsapp;

public class PlaceDTO {
	
	private String name;
	private String speciality;
	private int noOfTaluks;
	
	public PlaceDTO() {
		
	}
	
	public PlaceDTO(String name,String speciality,int noOfTaluks) {
		this.name=name;
		this.speciality=speciality;
		this.noOfTaluks=noOfTaluks;
		
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", speciality=" + speciality + ", noOfTaluks=" + noOfTaluks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getNoOfTaluks() {
		return noOfTaluks;
	}

	public void setNoOfTaluks(int noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}
	
	@Override
	public boolean equals(Object reference) {
		//System.out.println("running equals from airportDTO" );
		if(reference !=null) {
			if(reference instanceof PlaceDTO) {
			PlaceDTO dto = (PlaceDTO) reference; 
			if(dto.name.equals(this.name)) {
				System.out.println("name is matching "+dto.name);
				return true;
			}
			}
		}
		return false;



	}
}
