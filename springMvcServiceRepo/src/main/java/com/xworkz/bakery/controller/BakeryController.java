package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/sweet")
public class BakeryController {
	
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDto bakeryDto,Model model) {
		System.out.println("running onBakery "+bakeryDto);
		model.addAttribute("name"+bakeryDto.getName());
		model.addAttribute("ownerName"+bakeryDto.getOwnerName());
		
		boolean saved=this.bakeryService.validateAndSave(bakeryDto);
		System.out.println("saved "+saved);
		return "index.jsp";
		
	}
	
	

}
