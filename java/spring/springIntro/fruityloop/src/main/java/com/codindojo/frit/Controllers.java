package com.codindojo.frit;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Controllers {
@RequestMapping("/")
public String showPriceName(Model model) {
	ArrayList<Item>fryit = new ArrayList<Item>();
	fryit.add(new Item("bannan",13));
	fryit.add(new Item("khewi",6));
	fryit.add(new Item("appel",45));
	fryit.add(new Item("togtag",122));
	model.addAttribute("fruity",fryit);
	return "index.jsp";
}
}
