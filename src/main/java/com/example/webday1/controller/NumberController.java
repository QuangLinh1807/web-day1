package com.example.webday1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/number")
public class NumberController {

	@GetMapping("/n1/n2-n3")
	public int n1() {
		return 121212;
	}
}
