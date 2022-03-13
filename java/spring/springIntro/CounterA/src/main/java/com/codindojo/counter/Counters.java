package com.codindojo.counter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counters {

	@RequestMapping("/")
	public String counter(HttpSession session,Model model) {
		if (session.getAttribute("counter") == null) {
		// Use setAttribute to initialize the count in session
			session.setAttribute("counter", 0);
			model.addAttribute("countToShow", 0);
		}
		else {
		Integer x = (Integer)session.getAttribute("counter");
		model.addAttribute("countToShow", x);
		}
		return "counter.jsp";
	}
	@RequestMapping("/welcome")
	public String welcom(HttpSession session) {
		if (session.getAttribute("counter") == null) {
		// Use setAttribute to initialize the count in session
			session.setAttribute("counter", 1);
		}
		else {
		Integer x = (Integer)session.getAttribute("counter");
		x = x+1;
		session.setAttribute("counter", x);
		}
		
		return "welcom.jsp";
	}
	@RequestMapping("/clear")
	public String clear(HttpSession session,Model model,HttpServletRequest request) {
		  session.invalidate();
		  HttpSession _session = request.getSession(true);
		model.addAttribute("countToShow", 0);
		return "counter.jsp";
	}
	
}
