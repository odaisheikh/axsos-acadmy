package com.codindojo.Gold;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@RequestMapping(value="/show/all" , method=RequestMethod.POST)
	public String process(HttpSession session,@RequestParam(value="gold") String gold,Model model) {
		System.out.println(gold.getClass());
		String x = new String("farm");
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
    
	else if(gold.equals(x)) {
		Integer counts = (Integer)session.getAttribute("counter");
		System.out.println(counts);	
		int randomInt = (int)(Math.random() * 11)+10;
		counts = counts+Math.abs(randomInt);
		System.out.println(counts);	
		System.out.println(Math.random()+"mmmmmmmmmmmm");
		session.setAttribute("counter", counts);
		}
	else if(gold.equals("guest"))  {
		Integer counts = (Integer)session.getAttribute("counter");
		System.out.println(counts);	
		int randomInt = ((int)(100.0 * Math.random())-50);
		counts = counts+randomInt;
		session.setAttribute("counter", counts);
	}
	
	
		return "redirect:/show";
	}
}
