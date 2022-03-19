package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.BookA;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<BookA> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public BookA createBook(BookA b) {
        return bookRepository.save(b);
    }
 // creates a book
    public BookA updateBook(BookA b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public BookA findBook(Long id) {
        Optional<BookA> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    //delet book
    public void deleteBook(Long id) {
//    	BookA book =findBook(id);
//    	bookRepository.delete(book);
        bookRepository.deleteById(id);
    }
}