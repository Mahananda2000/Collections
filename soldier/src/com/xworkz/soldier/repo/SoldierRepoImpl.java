package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("created soldierRepoImpl using no-args constru...");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		System.out.println("Dto"+dto);
		return false;
	}
	
	
}
