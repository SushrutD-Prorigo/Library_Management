package com.librarymanagement.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookCollection {
	
	private ArrayList<Book> bookList=new ArrayList<Book>();

	public BookCollection()
	{
		bookList.add(new Book("C", "Mr.A"));
		bookList.add(new Book("C++", "Mr.B"));
		bookList.add(new Book("JAVA", "Mr.C"));
		bookList.add(new Book("SQL", "Mr.D"));
	}
	
	
	public void displayBooks()
	{
		Iterator<Book> itr=this.bookList.iterator();
		System.out.println("BookName |  Author");
		while(itr.hasNext())
		{
			Book book=itr.next();
			System.out.println(book.getBookName()+" | "+book.getAuthorName());
		}
	}
	
	public void addBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book name :");
		String bName=sc.next();
		System.out.println("Enter Author name :");
		String aName=sc.next();
		Book book=new Book(bName, aName);
		this.bookList.add(book);
		
	}

}
