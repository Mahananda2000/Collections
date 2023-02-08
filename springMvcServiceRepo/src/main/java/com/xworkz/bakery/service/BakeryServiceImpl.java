package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.repository.BakeryRepo;
@Service
public class BakeryServiceImpl  implements BakeryService{
	
	@Autowired
	private BakeryRepo bakeryRepo;
	
	
	public BakeryServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(BakeryDto dto) {
		System.out.println("running validate and save in bakeryService "+dto);
		boolean saved=this.bakeryRepo.save(dto);
		System.out.println("saved in repo"+saved);
		return true;	
	}
	
	

}
