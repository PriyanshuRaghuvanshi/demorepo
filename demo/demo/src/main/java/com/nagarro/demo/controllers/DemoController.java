package com.nagarro.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/message")
	public String displayMessage(){
		return "Congratulation you successfully deployed your application  !!";
	}
	
}
