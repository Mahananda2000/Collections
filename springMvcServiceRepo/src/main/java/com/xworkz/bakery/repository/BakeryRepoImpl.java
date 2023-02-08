package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDto;
@Repository
public class BakeryRepoImpl implements BakeryRepo {
	
	public BakeryRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakeryDto bakeryDto) {
	System.out.println("running save method in bakeryRepoImpl..");	
	return true;
	}

}
