package com.teste.testeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TesteRest {

	@GetMapping("/teste01")
	public String DevolverRest() {
		
		return "Ola Mundo";
	}
	
	
	
}
