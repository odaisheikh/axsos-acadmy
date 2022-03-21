package com.example.loginregister.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.loginregister.models.Book;

public interface BookRepositorys extends CrudRepository<Book , Long> {
	List<Book> findAll();
}
