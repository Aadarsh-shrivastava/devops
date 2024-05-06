package com.nagarro.DevOps.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
	@RequestMapping("/Hello")
public class Controller {

	@GetMapping("/")
	public String getHello(){
		return "Hello Spring";
	}

}
