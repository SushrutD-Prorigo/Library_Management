package com.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class ListDemo {
	
	
	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(11, "A"));
		list.add(new Person(12, "B"));
		list.add(new Person(11, "A"));
		list.add(new Person(14, "D"));
		list.add(new Person(15, "E"));
		
		//System.out.println(list);
		
/*		Iterator<Person> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
*/
		
/*		for(Person p: list)
		{
			System.out.println(p);
		}
	*/	
		
		list.forEach(p -> System.out.println(p));
		
		
		Set<Person> set=new HashSet<Person>();
		set.addAll(list);
		
		//System.out.println(set);
		
		set.forEach(s-> System.out.println(s));
		}
	
		
	
	

}
