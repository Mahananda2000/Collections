package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.repo.MissileRepo;
import com.xworkz.validation.repo.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
		System.out.println("created service by passing repo...from spring..");
		
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("running validate and save");
		System.out.println("resortDTO"+dto);
		
		Set<ConstraintViolation<ResortDTO>> violations=this.validator.validate(dto);
       if(!violations.isEmpty()) {
    	   System.out.println("there are validation errors..");
    	   violations.forEach(cv->System.err.println(cv.getMessage()));
    	   return false;
    	   
       }else {
    	   System.out.println("data is valid....+can save");
    	   boolean saved =this.resortRepo.save(dto);
    	   System.out.println("saved first aid"+saved);
    	   return saved;
       }
	}
}
