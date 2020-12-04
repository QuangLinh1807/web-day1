package com.example.webday1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public class TextController {

	@GetMapping
	public String hello() {
		return "Hello Spring web";
	}

	@GetMapping("/hi")
	public String hi() {
		return "Hi Spring web";
	}

	@GetMapping("/halo")
	public String halo() {
		return "Halo Spring web";
	}
}