package com.product.mongo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.product.mongo.model.Cart;
import com.product.mongo.model.Category;
import com.product.mongo.model.User;

public interface CartRepository extends MongoRepository<Cart, BigInteger> {

	@Query("{}")
	List<Cart> getAllItemsInCart();

}