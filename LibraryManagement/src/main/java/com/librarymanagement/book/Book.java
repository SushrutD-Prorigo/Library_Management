package com.librarymanagement.book;

public class Book {

	private String bookName;
	private String authorName;
	
	
	
	
	public Book(String bookName, String authorName) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
}
