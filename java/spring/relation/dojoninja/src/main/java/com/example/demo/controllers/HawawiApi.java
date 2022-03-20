package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.BookService;
@RestController
public class HawawiApi {
    private final BookService bookService;
    public HawawiApi(BookService bookService){
        this.bookService = bookService;
    }
//    @RequestMapping("/api/books")
//    public List<BookA> index() {
//        return bookService.allBooks();
//    }
//    
//    @RequestMapping(value="/api/books", method=RequestMethod.POST)
//    public BookA create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        BookA book = new BookA(title, desc, lang, numOfPages);
//        book = bookService.createBook(book);
//        return book;
//    }
//    
//    @RequestMapping("/api/books/{id}")
//    public BookA show(@PathVariable("id") Long id) {
//        BookA book = bookService.findBook(id);
//        return book;
//    }
//    @RequestMapping(value="/api/books/update/{id}", method=RequestMethod.PUT)
//    public BookA update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//    	BookA book = new BookA(id,title, desc, lang, numOfPages);
//    	book = bookService.updateBook(book);
//        return book;
//    }
//    
//    @RequestMapping(value="/api/books/delete/{id}", method=RequestMethod.DELETE)
//    public void destroy(@PathVariable("id") Long id) {
//        bookService.deleteBook(id);
//    }

}
