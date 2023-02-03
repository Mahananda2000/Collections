package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDto;

@Component
@RequestMapping("/gambling")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDto casinoDto,Model model) {
		System.out.println("running onCasino"+casinoDto);
		model.addAttribute("Name",casinoDto.getName());	
		model.addAttribute("Price",casinoDto.getEntryFee());
		return "CasinoSuccess.jsp";
	}

}
