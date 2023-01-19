package com.xworkz.validation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		System.out.println("Running save in repo");
		System.out.println("aidDTO"+aidDTO);
		return true;
	}

}
