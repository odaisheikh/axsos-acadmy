package com.example.loginregister.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.loginregister.models.Book;
import com.example.loginregister.models.LoginUser;
import com.example.loginregister.models.User;
import com.example.loginregister.repositories.BookRepositorys;
import com.example.loginregister.repositories.UserRepository;


    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private BookRepositorys bookRepo;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {

    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if( potentialUser.isPresent()) {
    		result.rejectValue("email", "jjjh", "the email alredy exsit");
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepo.save(newUser);
         
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
    	if(result.hasErrors()) {
    		return null;
    	}
    	Optional<User> potentialUser;
			potentialUser = userRepo.findByEmail(newLoginObject.getEmail());

    	if( !potentialUser.isPresent()) {
    		result.rejectValue("email", "exist", "The email exsist exsist!");
    	}
    	if(!BCrypt.checkpw(newLoginObject.getPassword(), potentialUser.get().getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
        return potentialUser.get();
    }
    public User findUser(Long id) {
        Optional<User> optionalBook = userRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }}
    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }}
    
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    public Book addBookToUser(Long id,Book b) {
    	 Optional<User> optionalBook = userRepo.findById(id);
    	b.setUser(optionalBook.get() );
        return bookRepo.save(b);
    }
    
    
}
