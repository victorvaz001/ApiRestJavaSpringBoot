package com.victorvaz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorvaz.demo.entities.Department;

@RestController //Configurarada para responder na Api
@RequestMapping(value = "/products")
public class ProductController {
	
	
	@GetMapping //Configura o metodo para que ele responda na API Rest
	public Department getObjects() {
		Department d1 = new Department(1L, "Tech");		
		return d1;
	}

}
