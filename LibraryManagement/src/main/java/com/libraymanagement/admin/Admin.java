package com.libraymanagement.admin;

import java.util.Scanner;

public class Admin {
	private int adminId;
	private String adminPassword;
	
	

	public Admin() {
	
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	public boolean authentication()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		System.out.println("Enter Password :");
		String psw=sc.next();
		
		if(id==1234 && psw.equals("admin"))
			return true;
		else
		{
			System.out.println("try Again");
			this.authentication();
		}
		
		
		return true;
	}

}
