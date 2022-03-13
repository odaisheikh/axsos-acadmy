package com.codindojo.date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

@Controller
public class Controllers {
	@RequestMapping("/date")
	public String date(Model model) {
		Date x = new Date();
		model.addAttribute("date", x);
		return "date.jsp";
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
	    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
	    Date date = new Date(); 
		model.addAttribute("time",formatter.format(date));
		return "time.jsp";
	}

}
