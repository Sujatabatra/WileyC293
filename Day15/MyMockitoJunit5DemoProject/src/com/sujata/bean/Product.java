package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int pId;
	private String productName;
	private int quantity;
	
	
}
