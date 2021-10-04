package com.librarymanagement.student;

import java.time.LocalDate;

public class Student {
	private int studentId;
	private String studentFname;
	private String studentLname;
	private String studentAddress;
	private LocalDate issueDate;
	
	
	
	
	public Student() {
		
		this.studentId =0;
		this.studentFname = null;
		this.studentLname = null;
		this.studentAddress = null;
		this.issueDate=null;
		
	}
	
	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	
	

}
