package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.BakeryDto;

public interface BakeryRepo {
	
	boolean save(BakeryDto bakeryDto);
}
