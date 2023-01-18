package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepo soldierRepo;
	
	public SoldierServiceImpl() {
		System.out.println("created soldierserviceImpl using no-args constru..");
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
		
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Starting validateAndSave");
		System.out.println("dto passed:"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
				if(!violations.isEmpty()) {
					System.err.println("there are validation errors...");
					violations.forEach(v->{
						System.err.println("violating message"+v.getMessage());
					});
					return false;
				}
				else {
					System.out.println("Data is valid...");
					boolean saved=soldierRepo.save(dto);
					System.out.println("Dto saved using repo"+saved);
					return saved;
				}
		
		
		//return true;
	}

}
