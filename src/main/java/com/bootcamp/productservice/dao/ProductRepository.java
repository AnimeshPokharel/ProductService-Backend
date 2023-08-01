package com.bootcamp.productservice.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bootcamp.productservice.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	public Optional<Product>findByPname(String pname);

}
