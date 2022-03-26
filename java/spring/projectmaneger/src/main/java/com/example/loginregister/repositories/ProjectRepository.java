package com.example.loginregister.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.loginregister.models.Project;
import com.example.loginregister.models.User;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	List<Project> findAll();
	List<Project> findAllByUsers(User user);
	List<Project> findByUsersNotContains(User user);
	

}
