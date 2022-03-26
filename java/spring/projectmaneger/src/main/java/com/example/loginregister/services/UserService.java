package com.example.loginregister.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;


import com.example.loginregister.models.LoginUser;
import com.example.loginregister.models.Project;
import com.example.loginregister.models.User;
import com.example.loginregister.repositories.ProjectRepository;
import com.example.loginregister.repositories.UserRepository;


    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProjectRepository projectRepo;
    
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
    ////////project
    public Project findProject(Long id) {
        Optional<Project> optionalBook = projectRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    
}
    public List<Project> allProjectForBartecilarUser(Long id){
   	 Optional<User> optionaProduct = userRepo.findById(id);
   	
       if(optionaProduct.isPresent()) {
       	return projectRepo.findAllByUsers(optionaProduct.get());
       } else {
           return null;
   }}
   public List<Project> allCategoryForNonBartecilarUser(Long id){
   	 Optional<User> optionaProduct = userRepo.findById(id);
	        if(optionaProduct.isPresent()) {
	        	return projectRepo.findByUsersNotContains(optionaProduct.get());
	        } else {
	            return null;
	        
   	
   }}
   public void addProjectToUser(Long categoryId, Long productId ){
   	 Project thisProject = findProject(categoryId);
   	   System.out.println(thisProject); 
   	    // retrieve an instance of a product using another method in the service.
   	    User thisUser = findUser(productId);
   	    System.out.println(thisUser);
   	    
   	    // add the product to this category's list of products
   	 thisUser.getProjects().add(thisProject);
   	    
   	    // Save thisCategory, since you made changes to its product list.
   	 
   	projectRepo.save(thisProject);
   	thisProject.setUserm(thisUser);
   	projectRepo.save(thisProject);
   }
public Project createProject( Project project) {
	return projectRepo.save(project);
	
}
public void addJoinProject(Long id, long attribute) {
	Project thisProject = findProject(id);
	    User thisUser = findUser(attribute);
	    thisProject.getUsers().add(thisUser);
	    projectRepo.save(thisProject);
	
}
public void leaveJoinProject(Long id, long attribute) {
	Project thisProject = findProject(id);
    User thisUser = findUser(attribute);
    thisProject.getUsers().remove(thisUser);
    projectRepo.save(thisProject);
	
}

public void updateProject(@Valid Project project, long attribute) {
	User thisUser = findUser(attribute);
	thisUser.getProjects().add(project);
	project.setUserm(thisUser);
	projectRepo.save(project);
	
}

}
