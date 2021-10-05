package com.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(11, "A"));
		list.add(new Person(12, "B"));
		list.add(new Person(11, "A"));
		list.add(new Person(14, "D"));
		list.add(new Person(15, "E"));
		
		list.forEach(p->map.put(p.personAge	,p.personName));
		
		System.out.println(map);
		
		}
	}

