package com.example.languagea.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.languagea.models.Language;
import com.example.languagea.services.LangugeService;
@Controller
public class LangController {
private final LangugeService lang;

public LangController(LangugeService lange) {
	this.lang = lange;
}
	@GetMapping("/all/books")
	public String index(Model model,@ModelAttribute("languge")Language languge) {
		System.out.println("**");
    	List<Language> Books = lang.allBooks();
    	model.addAttribute("books",Books);
    	return "index.jsp";
    }
	@GetMapping("/all/sd")
	public String ndex() {
    	return "NewFile.jsp";
    }
    @PostMapping("/all/books")
    public String creatVendore(@Valid @ModelAttribute("languge")Language languge , BindingResult result) {
    	System.out.println("*****");
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}
    	System.out.println("&&&&&&&&&");
    	lang.createBook(languge);
    	System.out.println("%%%%%%%%%%");
    	return "redirect:/all/books";
    }
}
