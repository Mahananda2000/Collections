package com.xworkz.collectionsapp;

public class CalendarDTO {
	private  String name;
	private String langauage;
	private int id;
	
	public CalendarDTO() {
		
	}
	
	public CalendarDTO(String name,String langauage,int id ) {
		this.name=name;
		this.langauage=langauage;
		this.id=id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLangauage() {
		return langauage;
	}

	public void setLangauage(String langauage) {
		this.langauage = langauage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CalendarDTO [name=" + name + ", langauage=" + langauage + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object reference) {
		//System.out.println("running equals from airportDTO" );
		if(reference !=null) {
			if(reference instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO) reference; 
			if(dto.langauage.equals(this.langauage)) {
				System.out.println("langauage is matching "+dto.langauage);
				return true;
			}
			}
		}
		return false;



}
}
