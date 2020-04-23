package com.capg.lab3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.lab3.model.Product;
import com.capg.lab3.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/product/id/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@DeleteMapping("/delete/product/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}

}
