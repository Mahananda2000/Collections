package com.xworkz.validation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("running save");
		System.out.println("dto"+dto);
		return true;
	}

}
