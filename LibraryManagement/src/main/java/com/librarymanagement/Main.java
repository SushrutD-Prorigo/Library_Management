package com.librarymanagement;

import java.util.Scanner;

import com.librarymanagement.book.BookCollection;
import com.librarymanagement.student.StudentOperation;
import com.libraymanagement.admin.Admin;

public class Main {
	
	public static void main(String[] args) {
		
		if(new Admin().authentication())
		{
			System.out.println("___WELCOME___");
			StudentOperation student=new StudentOperation();
			BookCollection books=new BookCollection();
		while(true)
		{
			System.out.println("Enter the Choice.");
			System.out.println("1. Add Student");
			System.out.println("2.Display Students List");
			System.out.println("3.Display Books");
			System.out.println("4.Add book");
			System.out.println("5.Exit");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				student.addStudent();
				break;
			case 2:
				student.displayStudent();
				break;
			case 3:
				books.displayBooks();
				break;
			case 4:
				books.addBook();
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
		
		}
		}
	}

}
