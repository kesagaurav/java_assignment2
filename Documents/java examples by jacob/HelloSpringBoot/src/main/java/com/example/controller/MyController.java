package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	public MyController() {
		
	}
	@GetMapping("/test")
	public ResponseEntity<String> getTest(){
		return new ResponseEntity<String>("we have the entity",HttpStatus.I_AM_A_TEAPOT);
	}
}
