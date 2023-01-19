package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.repo.FirstAidRepo;
import com.xworkz.validation.repo.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	
	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo=missileRepo;
		System.out.println("created service by passing repo...from spring..");
		
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validate and save");
		System.out.println("missileDTO"+dto);
		
		Set<ConstraintViolation<MissileDTO>> violations=this.validator.validate(dto);
       if(!violations.isEmpty()) {
    	   System.out.println("there are validation errors..");
    	   violations.forEach(cv->System.err.println(cv.getMessage()));
    	   return false;
    	   
       }else {
    	   System.out.println("data is valid....+can save");
    	   boolean saved =this.missileRepo.save(dto);
    	   System.out.println("saved first aid"+saved);
    	   return saved;
       }
	}

	
}
