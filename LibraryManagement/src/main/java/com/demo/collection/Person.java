package com.demo.collection;

public class Person {
	
	public String personName;
	public int personAge;
	
	public Person(int age,String name)
	{
	this.personAge=age;
	this.personName=name;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}

	
}
