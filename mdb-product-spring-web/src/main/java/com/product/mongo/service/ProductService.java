package com.product.mongo.service;

import java.util.List;

import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;


public interface ProductService {
	
	
	public Product getProductByName(String pname);
	
	public List<Product> getAllProductByCategory(String pcategory);
	
	public User getUserByEmail(String uemail);
	
	public List<Category> getallCategory();
	
	public List<Product> getProductsByTItleAndName(String searchCriterion);
	
	public List<Product> getAllProducts();
	


}
