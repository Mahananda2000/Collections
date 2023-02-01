package com.xworkz.springWebMVC.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class GeneralComponent {
	
	@GetMapping("/run")
	public String onRun() {
		System.out.println("on run");
		return "index.jsp";
	}
	
	@GetMapping("/start")
	public String OnStart() {
		System.out.println("on run");
		return "index.jsp";
	}

}
