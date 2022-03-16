package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.BookA;
import com.example.demo.services.BookService;

@Controller
public class BookController {
private final BookService bookservice;

	public BookController(BookService bookservice) {
		this.bookservice = bookservice;
	} 
	//render book
    @RequestMapping("/books/{id}")
    public String show(Model model,@PathVariable("id") Long id) {
        BookA book = bookservice.findBook(id);
        model.addAttribute("book",book);
        return "show.jsp";
    }
    //render all books
    @RequestMapping("/books")
    public String allBooks(Model model) {
    	List<BookA> book = bookservice.allBooks();
    	model.addAttribute("books",book);
    	return "index.jsp";
    }

}
