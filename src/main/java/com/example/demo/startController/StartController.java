package com.example.demo.startController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

	@RequestMapping(value="ping")
	public String helloWorld() {
		return "pong";
	}
	
}
