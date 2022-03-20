package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.services.BookService;

@Controller
public class HawawiController {
private final BookService bookservice;

	public HawawiController(BookService bookservice) {
		this.bookservice = bookservice;
	} 
	
	//render book
//    @RequestMapping("/books/{id}")
//    public String show(Model model,@PathVariable("id") Long id) {
//        BookA book = bookservice.findBook(id);
//        model.addAttribute("book",book);
//        return "show.jsp";
//    }
   // render table
    @GetMapping("/dojo")
    public String table(@ModelAttribute("dojo")Dojo dojo) {
//    	List<Dojo> vendores = bookservice.alldojos();
//    	model.addAttribute("vendores",vendores);
    	return "show.jsp";
    }
    @PostMapping("/addDojo")
    public String creatVendore(@Valid @ModelAttribute("dojo")Dojo table , BindingResult result) {
    	if(result.hasErrors()) {
    		return "show.jsp";
    	}
    	bookservice.createDojo(table);
    	return "redirect:/dojo";
    }
    //render ninja
    @GetMapping("/ninja")
    public String ninja(@ModelAttribute("ninja")Ninja ninja,Model model) {
    	List<Dojo> dojos = bookservice.alldojos();
    	
		model.addAttribute("dojos",dojos);
    	return "index.jsp";
    }
    //create ninja
    @PostMapping("/addNinja")
    public String creatNinja(@Valid @ModelAttribute("ninja")Ninja table , BindingResult result) {
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}
    	bookservice.createNinja(table);
    	return "redirect:/ninja";
    }
    //render information about specific dojo
    @GetMapping("/dojo/{id}")
    public String tablew(Model model,@PathVariable("id") Long id) {
   	Dojo dojo = bookservice.findDojo(id);
   	System.out.println("$$");
    	model.addAttribute("dojo",dojo);
    	return "edit.jsp";
    }


}
