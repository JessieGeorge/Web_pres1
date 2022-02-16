package com.group6.hello.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
public class HelloControllerIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void helloDefaultTest() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/hello");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello, World", 
				result.getResponse().getContentAsString());
	}
	
	@Test
	public void helloNameTest() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
				.get("/hello/cs5220");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello, cs5220", 
				result.getResponse().getContentAsString());
	}
	
	@Test
	public void failExample() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
				.get("/hello/FOOBAR");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello, cs5220", 
				result.getResponse().getContentAsString());
	}
	
}
