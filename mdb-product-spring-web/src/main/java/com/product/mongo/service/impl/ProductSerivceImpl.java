package com.product.mongo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.Product;
import com.product.mongo.model.User;
import com.product.mongo.model.Wishlist;
import com.product.mongo.repository.CartRepository;
import com.product.mongo.repository.CategoryRepository;
import com.product.mongo.repository.ProductRepository;
import com.product.mongo.repository.UserRepository;
import com.product.mongo.repository.WishlistRepository;
import com.product.mongo.service.ProductService;

@Service
public class ProductSerivceImpl implements ProductService {

	@Autowired
	WishlistRepository wishlistRepository;
	
	@Autowired
	CartRepository cartRepository;
	
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
		return categoryRepository.getAllCategories();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

	@Override
	public List<Product> getProductsByTitleAndName(String searchCriterion) {
		return productRepository.findProductsByTitleAndName(searchCriterion);
	}

//	@Override
//	public List<Cart> getAllItemsInCart() {
//		return cartRepository.getAllItemsInCart();
//	}
//
//	@Override
//	public List<Wishlist> getAllItemsInWishlist() {
//		return wishlistRepository.getAllItemsInWishlist();
//	}

}
