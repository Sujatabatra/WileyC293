package com.sujata.service;

import java.util.List;

import com.sujata.bean.Product;
import com.sujata.persistence.ProductDao;

import lombok.Getter;
import lombok.Setter;

public class BuyProductService {

	@Setter
	@Getter
	private List<Product> stock;
	@Setter
	@Getter
	private ProductDao productDao;
	
	public double getTotalPrice() {
		double totalPrice=0.0;
		for(Product product:stock) {
			totalPrice=totalPrice+product.getQuantity()*productDao.getPrice(product);
		}
		return totalPrice;
	}
	
}
