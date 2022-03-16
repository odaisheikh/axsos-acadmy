package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.BookA;

@Repository
public interface BookRepository extends CrudRepository<BookA, Long>{
    // this method retrieves all the books from the database
    List<BookA> findAll();

}
