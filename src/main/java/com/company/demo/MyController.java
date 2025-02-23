package com.company.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/display/{name}")
	public String display(@PathVariable("name") String name) {
		
		return "HEllo "+name;
	}
	
	@GetMapping("/hello")
    public String hello(){
        return ("<h1>Welcome</h1>");
    }
}
