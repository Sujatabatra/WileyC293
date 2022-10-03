package com.sujata.demo;

@FunctionalInterface
public interface BookPredicate {

	boolean check(Book book);
}
