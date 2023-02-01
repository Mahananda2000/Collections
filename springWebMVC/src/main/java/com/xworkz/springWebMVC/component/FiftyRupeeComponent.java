package com.xworkz.springWebMVC.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/ghost")
public class FiftyRupeeComponent {
	
	public FiftyRupeeComponent() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onTest() {
		System.out.println("running onTest....");
		return "index.jsp";
	}

}
