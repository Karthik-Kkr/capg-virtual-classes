package com.capg.lab3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.lab3.exceptions.ProductNotFoundException;
import com.capg.lab3.model.Product;
import com.capg.lab3.repository.ProductJpaRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductJpaRepo repo;
	
	@Transactional
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	@Transactional
	public Product getProductById(int id) {
		Product product=repo.getOne(id);
		if(product==null) {
			throw new ProductNotFoundException("Product doesnot exist with ID : "+id);
		}
		return product;
	}
	
	@Transactional
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	@Transactional
	public boolean deleteProduct(int id) {
		Product product=repo.getOne(id);
		if(product==null) {
			throw new ProductNotFoundException("Product doesnot exist with ID : "+id);
		}
		repo.delete(product);
		return true;
		
	}
	

}
