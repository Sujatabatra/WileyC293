package com.sujata.demo;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean check(Book book) {
		
		return book.getPrice()>1000;
	}

}
