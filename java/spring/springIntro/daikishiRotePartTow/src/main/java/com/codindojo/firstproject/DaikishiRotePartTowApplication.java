package com.codindojo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/Daikichi")
public class DaikishiRotePartTowApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikishiRotePartTowApplication.class, args);
	}
	@RequestMapping("/{travel}/{city}")
    public String showLesson(@PathVariable("travel") String track, @PathVariable("city") String module){
    	return  "'Congratulations! You will soon "+track+ "to "+module+"!'.";
    }
	@RequestMapping("loto/{num}")
    public String index(@PathVariable("num") int num){
		if(num%2==0)
    	return  " If the number is even, display text that says 'You will take a grand journey in the near future, but be weary of tempting offers'";
		else {
			return "\"You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.\"";
		}
    }
	

}
