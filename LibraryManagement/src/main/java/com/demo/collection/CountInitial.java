package com.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountInitial {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Sushrut");
		list.add("Sarvesh");
		list.add("Aman");
		list.add("Baman");
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(String s:list)
		{
			int count;
			if(map.containsKey(s.charAt(0)))
				count=map.get(s.charAt(0))+1;
			else
				count=1;
			
			
			map.put(s.charAt(0), count);
		}
		
		System.out.println(map);
	
	}

}
