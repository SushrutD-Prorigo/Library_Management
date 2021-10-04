package com.librarymanagement.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentOperation extends Student{
	
		private ArrayList<Student> studentList=new ArrayList<Student>();
	
		Scanner sc=new Scanner(System.in);

	
		public void addStudent() 
		{
		
		Student student=new Student();
		
		System.out.println("Enter Id");
		student.setStudentId(sc.nextInt());
		
		System.out.println("Enter First name");
		student.setStudentFname(sc.next());
		
		System.out.println("Enter Last name");
		student.setStudentLname(sc.next());
		
		System.out.println("Enter Address");
		student.setStudentAddress(sc.next());
			
		student.setIssueDate(LocalDate.now());
		studentList.add(student);
	
		}
	
		public void displayStudent()
		{
			Iterator<Student> itr=this.studentList.iterator();
			while(itr.hasNext())
			{
				Student stud=itr.next();
			System.out.println("ID :"+stud.getStudentId());
			System.out.println("Name : "+stud.getStudentFname()+" "+stud.getStudentLname());
			System.out.println("Address : "+stud.getStudentAddress());
			System.out.println("Date : "+stud.getIssueDate());
			}
		}

	
		

}
