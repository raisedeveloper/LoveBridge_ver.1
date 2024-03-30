package com.example.LoveBridge.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test")
public class Test {
	
	@GetMapping("/body")
	public String test() {
		return "test/test";
	}
	
}
