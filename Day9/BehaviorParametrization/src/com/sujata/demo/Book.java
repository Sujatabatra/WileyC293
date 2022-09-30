package com.sujata.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private int noOfPages;
	private int price;
	
}
