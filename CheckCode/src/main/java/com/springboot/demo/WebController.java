package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to spring boot";
	}
}
