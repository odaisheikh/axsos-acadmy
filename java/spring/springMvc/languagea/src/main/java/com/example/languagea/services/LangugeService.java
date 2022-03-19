package com.example.languagea.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.languagea.models.Language;
import com.example.languagea.repositores.Repositore;
@Service
public class LangugeService {
private final Repositore repository;
    
    public LangugeService(Repositore langrepository) {
        this.repository =  langrepository;
    }
    // returns all the books
    public List<Language> allBooks() {
        return repository.findAll();
    }
    // creates a book
    public Language createBook(Language b) {
        return repository.save(b);
    }
    public Language findBookByName(String b) {
        return repository.findByName(b);
    }
 // creates a book
    public Language updateBook(Long id) {
    	Language book =findBook(id);
        return repository.save(book);
    }
    // retrieves a book
    public Language findBook(Long id) {
        Optional<Language> optionalBook = repository.findById(id);
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
    	repository.deleteById(id);
    }

}
