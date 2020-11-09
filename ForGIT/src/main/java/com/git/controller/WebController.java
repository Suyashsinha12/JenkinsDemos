package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.model.User;

@RestController
public class WebController {

	@GetMapping("/hi")
	public String sayHello() {
		
		return "Hello world";
	}
	
	//written by another developer
	@GetMapping("/hello")
	public String sayHi() {
		
		return "Hi world";
	}
}
