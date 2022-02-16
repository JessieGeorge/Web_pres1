package com.group6.hello.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloControllerUnitTest {
	
	@Test
	void helloTest() {
		HelloController controller = new HelloController();
		String result = controller.hello("cs5220");
		assertEquals("Hello, cs5220", result);
	}
	
	@Test
	void failExample() {
		HelloController controller = new HelloController();
		String result = controller.hello("FOOBAR");
		assertEquals("Hello, cs5220", result);
	}
}
