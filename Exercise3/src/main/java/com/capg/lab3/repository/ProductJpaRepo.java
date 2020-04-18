package com.capg.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.lab3.model.Product;

public interface ProductJpaRepo extends JpaRepository<Product, Integer> {

}
