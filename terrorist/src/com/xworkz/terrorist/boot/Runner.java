package com.xworkz.terrorist.boot;

import java.time.LocalDateTime;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.services.TerroristServiceImpl;
import com.xworkz.terrorist.services.TerroristServices;

public class Runner {
	
	public static void main(String[] args) {


		
		
		TerroristDTO dto= new TerroristDTO("maha",23,"India",true,false,"Firering","Xworkz");
		System.out.println(dto);
		
		TerroristServices service = new TerroristServiceImpl();
		service.validatingAndSaving(dto);
	}

}


