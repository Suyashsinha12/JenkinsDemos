package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.model.User;

@RestController
public class WebController {

	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello world";
	}
}
