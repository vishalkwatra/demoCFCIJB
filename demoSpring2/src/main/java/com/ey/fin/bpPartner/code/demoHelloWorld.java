package com.ey.fin.bpPartner.code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoHelloWorld {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello SCP from Spring Boot";
	}
}
