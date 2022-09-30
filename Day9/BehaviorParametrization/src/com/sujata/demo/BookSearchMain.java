package com.sujata.demo;

import java.util.ArrayList;

public class BookSearchMain {

	public static void main(String[] args) {
		BookSearch bookSearch = new BookSearch();

		System.out.println(bookSearch.getBookList());
		System.out.println("===============");
		System.out.println("Books Written By Author X");
		System.out.println("===============");
		ArrayList<Book> searchedBooks = bookSearch.searchBookWrittenByAuthorX();
		for (Book book : searchedBooks) {
			System.out.println(book);
		}

		System.out.println("===============");
		System.out.println("Expensive Books");
		System.out.println("===============");
		searchedBooks = bookSearch.genericSearchForBooks(new ExpensiveBookPredicate());
		for (Book book : searchedBooks) {
			System.out.println(book);
		}

		System.out.println("===============");
		System.out.println("Thick Books");
		System.out.println("===============");
//		searchedBooks=bookSearch.genericSearchForBooks(new BookPredicate() {
//			
//			@Override
//			public boolean check(Book book) {
//				
//				return book.getNoOfPages()>1500;
//			}
//		});

		searchedBooks = bookSearch.genericSearchForBooksNew(book-> book.getNoOfPages() > 1500);
		for (Book book : searchedBooks) {
			System.out.println(book);
		}
	}

}
