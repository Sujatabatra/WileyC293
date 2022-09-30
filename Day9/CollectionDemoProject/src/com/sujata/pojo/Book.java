package com.sujata.pojo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Comparable<Book>{

	@Getter
	@Setter
	private int bookId;
	@Getter
	@Setter
	private String bookName;
	@Getter
	@Setter
	private String authorName;
	@Getter
	@Setter
	private int noOfPages;
	@Getter
	@Setter
	private int price;
	
	
	@Override
	public int compareTo(Book book2) {
		if(this.equals(book2))
			return 0;
		else if(this.noOfPages>book2.noOfPages)
			return 1;
		return -1;
		
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(authorName, bookId, bookName, noOfPages, price);
//	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName) && noOfPages == other.noOfPages && price == other.price;
	}
	
}
