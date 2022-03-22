package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.services.ProductService;

@Controller
public class HawawiController {
private final ProductService productservice;

	public HawawiController(ProductService productservice) {
		this.productservice = productservice;
	} 
@GetMapping("category")
public String category(@ModelAttribute("category")Category category) {
	return "category.jsp";
}
@PostMapping("/addCategory")
public String creatVendore(@Valid @ModelAttribute("category")Category category , BindingResult result) {
	if(result.hasErrors()) {
		return "category.jsp";
	}
	productservice.createCategory(category);
	return "redirect:/category";
}
@GetMapping("product")
public String product(@ModelAttribute("product")Product product) {
	return "show.jsp";
}
@PostMapping("/addProduct")
public String creatVendore(@Valid @ModelAttribute("product")Product product , BindingResult result) {
	if(result.hasErrors()) {
		return "show.jsp";
	}
	productservice.createProduct(product);
	return "redirect:/product";
}
@GetMapping("product/{id}")
public String showproduct(Model model,@PathVariable("id") Long id,HttpSession session) {
	model.addAttribute("cwithpp",productservice.allCategoryForBartecilarProduct(id));
	model.addAttribute("cwithnpp",productservice.allCategoryForNonBartecilarProduct(id));
	model.addAttribute("id",id);
	session.setAttribute("productId",id);
	return "showProducts.jsp";
}

@RequestMapping(value="/addcp",method=RequestMethod.POST)
public String addCateToPro(
		@RequestParam("productID") Long id,
		@RequestParam("categoryID") Long idx,
		HttpSession session
		
		) {
	productservice.addCategoryToProduct(idx, id);
	Long idt = (Long)session.getAttribute("productId");
	return String.format("redirect:/product/%s", idt);
}

}
