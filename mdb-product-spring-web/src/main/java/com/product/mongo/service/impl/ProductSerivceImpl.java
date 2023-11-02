package com.product.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;
import com.product.mongo.repository.CategoryRepository;
import com.product.mongo.repository.ProductRepository;
import com.product.mongo.repository.UserRepository;
import com.product.mongo.service.ProductService;

@Service
public class ProductSerivceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Product getProductByName(String pname) {
		
		return productRepository.findProductByName(pname);
	}

	@Override
	public List<Product> getAllProductByCategory(String pcategory) {
		
		return productRepository.findByProductCategory(pcategory);
	}

	@Override
	public User getUserByEmail(String uemail) {
		return userRepository.checkUserInfo(uemail);
	}

	@Override
	public List<Category> getallCategory() {
		return categoryRepository.getallCategory();
	}
	
	@Override
	public List<Product> getProductsByTItleAndName(String searchCriterion) {
		return productRepository.findProductsByTItleAndName(searchCriterion);
	}
	
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

}
