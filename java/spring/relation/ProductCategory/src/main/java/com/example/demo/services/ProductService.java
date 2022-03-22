package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	 private final ProductRepository productRepository;
	    private final CategoryRepository categoryRepository;
	    


		public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
			this.productRepository = productRepository;
			this.categoryRepository = categoryRepository;
		}
		// returns all the dojos
	    public List<Product> allProduct() {
	        return productRepository.findAll();
	    }
		// returns all the dojos
	    public List<Category> allCategory() {
	        return  categoryRepository.findAll();
	    }
	    // creates a dojo
	    public Product createProduct(Product b) {
	        return productRepository.save(b);
	    }
	    // creates a dojo
	    public Category createCategory(Category b) {
	        return categoryRepository.save(b);
	    }
	// // creates a book
//	    public BookB updateBook(BookB b) {
//	        return bookRepository.save(b);
//	    }
	    // retrieves a dojo
	    public Product findProduct(Long id) {
	        Optional<Product> optionalBook = productRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    public Category findCategory(Long id) {
	        Optional<Category> optionalBook = categoryRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	        }
	    public List<Category> allCategoryForBartecilarProduct(Long id){
	    	 Optional<Product> optionaProduct = productRepository.findById(id);
	    	
	        if(optionaProduct.isPresent()) {
	        	return categoryRepository.findAllByProducts(optionaProduct.get());
	        } else {
	            return null;
	    }}
	    public List<Category> allCategoryForNonBartecilarProduct(Long id){
	    	 Optional<Product> optionaProduct = productRepository.findById(id);
		        if(optionaProduct.isPresent()) {
		        	return categoryRepository.findByProductsNotContains(optionaProduct.get());
		        } else {
		            return null;
		        
	    	
	    }}
	    public void addCategoryToProduct(Long categoryId, Long productId ){
	    	 Category thisCategory = findCategory(categoryId);
	    	    
	    	    // retrieve an instance of a product using another method in the service.
	    	    Product thisProduct = findProduct(productId);
	    	    
	    	    // add the product to this category's list of products
	    	    thisCategory.getProducts().add(thisProduct);
	    	    
	    	    // Save thisCategory, since you made changes to its product list.
	    	    categoryRepository.save(thisCategory);
	    }
	    
//	    //delet book
//	    public void deleteBook(Long id) {
	//   // 	BookA book =findBook(id);
	//   // 	bookRepository.delete(book);
//	        bookRepository.deleteById(id);
//	    }
}
