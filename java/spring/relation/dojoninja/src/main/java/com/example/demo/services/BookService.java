package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.repositories.DojoRepository;
import com.example.demo.repositories.NinjaRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final DojoRepository dojoRepository;
    private final NinjaRepository ninjaRepository;
    

    public BookService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	// returns all the dojos
    public List<Dojo> alldojos() {
        return dojoRepository.findAll();
    }
	// returns all the dojos
    public List<Ninja> allNinjas() {
        return  ninjaRepository.findAll();
    }
    // creates a dojo
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }
    // creates a dojo
    public Ninja createNinja(Ninja b) {
        return ninjaRepository.save(b);
    }
// // creates a book
//    public BookB updateBook(BookB b) {
//        return bookRepository.save(b);
//    }
    // retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalBook = dojoRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalBook = ninjaRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
//    //delet book
//    public void deleteBook(Long id) {
//   // 	BookA book =findBook(id);
//   // 	bookRepository.delete(book);
//        bookRepository.deleteById(id);
//    }
}
