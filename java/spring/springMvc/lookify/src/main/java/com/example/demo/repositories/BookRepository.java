package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.BookB;

@Repository
public interface BookRepository extends CrudRepository<BookB, Long>{
    // this method retrieves all the books from the database
    List<BookB> findAll();
    List<BookB> findByName(String name);
    List<BookB> findTop5BookBByOrderByRatingDesc();
}
