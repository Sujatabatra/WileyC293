package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookSearch {

	private static ArrayList<Book> bookList=new ArrayList<Book>();
	static {
		bookList.add(new Book(101, "Book A", "Author X", 750, 100));
		bookList.add(new Book(102, "Book B", "Author Y", 1750, 900));
		bookList.add(new Book(103, "Book C", "Author X", 950, 1500));
		bookList.add(new Book(104, "Book D", "Author X", 1200, 1000));
		bookList.add(new Book(105, "Book E", "Author Z", 1800, 1200));
		bookList.add(new Book(106, "Book F", "Author A", 7150, 200));
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	
	public ArrayList<Book> searchBookWrittenByAuthorX(){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getAuthorName().equalsIgnoreCase("Author X"))
				newBookList.add(book);
		}
		return newBookList;
	}
	
	public ArrayList<Book> searchBookExpensiveBooks(){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(book.getPrice()>1000)
				newBookList.add(book);
		}
		return newBookList;
	}
	
	public ArrayList<Book> genericSearchForBooks(BookPredicate bookPredicate){
		ArrayList<Book> newBookList=new ArrayList<Book>();
		for(Book book:bookList) {
			if(bookPredicate.check(book))
				newBookList.add(book);
		}
		return newBookList;
	}
	
	
	public ArrayList<Book> genericSearchForBooksNew(Predicate<Book> bookPredicate){
//		ArrayList<Book> newBookList=new ArrayList<Book>();
//		for(Book book:bookList) {
//			if(bookPredicate.test(book))
//				newBookList.add(book);
//		}
//		return newBookList;
//		
//		return (ArrayList)bookList.stream()
//				.filter(book->bookPredicate.test(book))
//				.collect(Collectors.toList());

		return (ArrayList)bookList.stream()
				.filter(bookPredicate::test)
				.collect(Collectors.toList());
	
	}
	
	
	
}
