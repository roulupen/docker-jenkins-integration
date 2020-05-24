package com.opensystem.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/")
	public String showHelloWorld() {
		return "Hello World!";
	}

	@RequestMapping(method=RequestMethod.GET, path="/{name}")
	public String showName(@PathVariable("name") final String name) {
		return "Hello, " + name;
	}
	
}
