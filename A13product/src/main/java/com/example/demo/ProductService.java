package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
 
  private ProductRepository repository;
  @Autowired
  public ProductService(ProductRepository repository) {
      this.repository = repository;
  }
public List<Product> listAll() {
	
	return repository.findAll();
}

public Product get(Integer id) {
	return repository.findById(id).orElse(null);
	
}

public void save(Product product) {
	repository.save(product);
	
}

public void delete(Integer id) {
	repository.deleteById(id);
	
}
  
  
}
