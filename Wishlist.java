package com.product.mongo.model;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("Wishlist")
public class Wishlist {
 
	private BigInteger itemId;

}

