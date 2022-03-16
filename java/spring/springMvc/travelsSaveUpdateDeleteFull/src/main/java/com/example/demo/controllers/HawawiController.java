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

import com.example.demo.models.BookB;
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
    //render table
    @GetMapping("/table")
    public String table(Model model,@ModelAttribute("table")BookB table) {
    	List<BookB> vendores = bookservice.allBooks();
    	model.addAttribute("vendores",vendores);
    	return "index.jsp";
    }
    @PostMapping("/all")
    public String creatVendore(@Valid @ModelAttribute("table")BookB table , BindingResult result) {
    	if(result.hasErrors()) {
    		return "index.jsp";
    	}
    	bookservice.createBook(table);
    	return "redirect:/table";
    }
//get one vendore
    @GetMapping("/vendore/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        BookB vendore = bookservice.findBook(id);
        model.addAttribute("table", vendore);
        return "edit.jsp";
    }
  //get one vendore
    @GetMapping("/vendore/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        bookservice.deleteBook(id);
        return "redirect:/table";
    }
//updat one vendore
    @PutMapping("/vendore/{id}")
    public String update(@Valid@ModelAttribute("table")BookB table, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            bookservice.updateBook(table);
            return "redirect:/table";
        }
    }

}
