package com.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

	@GetMapping("/test")
	public String test() {
		throw new MyCustomException("This is a custom exception");
	}

	@GetMapping("/null")
	public String nullPointer() {
		String str = null;
		return str.toString(); // This will throw a NullPointerException
	}

	@GetMapping("/generic")
	public String generic() {
		throw new RuntimeException("This is a generic exception");
	}
}
