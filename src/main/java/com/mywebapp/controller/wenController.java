package com.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wenController {
	
	@GetMapping(value="/getName")
	public String getName() {
		return "this is lokesh";
	}

}
