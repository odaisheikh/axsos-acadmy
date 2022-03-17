package com.codindojo.Gold;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {

	@RequestMapping("/show")
	public String show() {
		return "gold.jsp";
	}
	@PostMapping("/gold")
	public String process(HttpSession session,@RequestParam(value="gold") String gold,Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("counter", 0);
		}
		else {
		Integer counts = (Integer)session.getAttribute("count");
		
		
	System.out.println(gold);	
	if(gold=="farm") {
		int randomInt = ((int)(20.0 * Math.random())-10);
		counts = counts+randomInt;
		}
	else if(gold=="cave") {
		int randomInt = ((int)(20.0 * Math.random())-10);
		counts = counts+randomInt;
		}
	else if(gold=="house") {
		int randomInt = ((int)(20.0 * Math.random())-10);
		counts = counts+randomInt;
		}

	else {
		int randomInt = ((int)(100.0 * Math.random())-50);
		counts = counts+randomInt;
	}
	System.out.println(counts);
	
		}
		return "redirect:/";
	}
}
