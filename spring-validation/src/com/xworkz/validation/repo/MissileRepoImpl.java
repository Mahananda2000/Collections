package com.xworkz.validation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileRepoImpl implements MissileRepo {@Override
	public boolean save(MissileDTO dto) {
	System.out.println("Running save in repo");
	System.out.println("dto"+dto);
	return true;
	}

}
