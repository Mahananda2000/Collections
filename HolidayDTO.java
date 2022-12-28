package com.xworkz.collectionsapp;

public class HolidayDTO {
	private String holidayName;
	private String anouncedBy;
	private int noOfDays ;
	
	public HolidayDTO() {
		
	}
	
	public HolidayDTO(String holidayName,String anouncedBy,int noOfDays) {
		this.holidayName=holidayName;
		this.anouncedBy=anouncedBy;
		this.noOfDays=noOfDays;	
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public String getAnouncedBy() {
		return anouncedBy;
	}

	public void setAnouncedBy(String anouncedBy) {
		this.anouncedBy = anouncedBy;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "HolidayDTO [holidayName=" + holidayName + ", anouncedBy=" + anouncedBy + ", noOfDays=" + noOfDays + "]";
	}
	
	@Override
	public boolean equals(Object reference) {
		//System.out.println("running equals from airportDTO" );
		if(reference !=null) {
			if(reference instanceof HolidayDTO) {
			HolidayDTO dto = (HolidayDTO) reference; 
			if(dto.holidayName.equals(this.holidayName)) {
				System.out.println("name is matching "+dto.holidayName);
				return true;
			}
			}
		}
		return false;


	
	
	}
}
