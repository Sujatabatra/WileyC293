package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.bean.Product;
import com.sujata.persistence.ProductDao;
import com.sujata.service.BuyProductService;


class TestBuyProductService {

	private BuyProductService buyProductService;
	
	private ProductDao productDao;
	
	@BeforeEach
	void setUp() throws Exception {
		buyProductService=new BuyProductService();
		/*Mimicing the behaviour of Dao,
		as dao is under development
		*/
		productDao=Mockito.mock(ProductDao.class);
		
		List<Product> stock=new ArrayList<Product>();
		stock.add(new Product(101, "Pencil", 10));
		stock.add(new Product(102, "Pen", 5));
		stock.add(new Product(103, "Eraser", 2));
		
		buyProductService.setStock(stock);
		buyProductService.setProductDao(productDao);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetTotalPrice() {
		/*
		 * adding the behaviour to mocked/mimiced ProductDao
		 */
		when(productDao.getPrice(new Product(101, "Pencil", 10))).thenReturn(10.0); //10*10=100
		when(productDao.getPrice(new Product(102, "Pen", 5))).thenReturn(100.0);  //5*100=500
		when(productDao.getPrice(new Product(103, "Eraser", 2))).thenReturn(5.0);  //2*5=10  (total :610)
		
		assertEquals(610, buyProductService.getTotalPrice());
		
		
	}

}
