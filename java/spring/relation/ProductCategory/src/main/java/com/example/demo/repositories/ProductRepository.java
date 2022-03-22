package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Category;
import com.example.demo.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    // this method retrieves all the books from the database
    List<Product> findAll();
List<Product> findAllByCategories(Category category);
    
    // Retrieves a list of any categories a particular product
    // does not belong to.
    List<Product> findByCategoriesNotContains(Category category);

}
