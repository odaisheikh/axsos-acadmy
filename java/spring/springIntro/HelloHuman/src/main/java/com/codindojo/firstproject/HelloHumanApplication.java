package com.codindojo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false ,defaultValue = "human") String First_name, @RequestParam(value = "last_name",required = false ,defaultValue = "" )
	String last_name, @RequestParam(value="times",required = false,defaultValue = "") String times) {
		return "hello " + (First_name +" "+ last_name).repeat(Integer.valueOf(times));
	}
	

}
