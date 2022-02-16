package com.group6.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping(value={"/hello/{name}", "/hello"})
	@ResponseBody
	public String hello(@PathVariable(required = false) String name) {
		if (name != null) {
			return String.format("Hello, %s", name);
		} else {
			return String.format("Hello, World");
		}
	}
	
}
