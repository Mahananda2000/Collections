package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDto;
import com.xworkz.goa.dto.CasinoDto;

@Component
@RequestMapping("/enjoy")
public class BeachController {
	public BeachController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBeach(BeachDto beachDto,Model model) {
		System.out.println("running onBeach"+beachDto);
		model.addAttribute("Name",beachDto.getName());	
		model.addAttribute("Price",beachDto.getLocation());
		return "BeachSuccess.jsp";
	}


}
