package com.toby.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	@RequestMapping("/")
	public String test() {
		return "Hello World";
	}
}
