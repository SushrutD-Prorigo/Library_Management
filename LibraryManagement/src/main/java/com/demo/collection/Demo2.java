package com.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    
	    System.out.println(numbers.stream().count());
	    List<Integer> sqaure=numbers.stream().map(no->no*no).collect(Collectors.toList());
	    
	    System.out.println(sqaure);
	    
	    
//	    System.out.println(numbers.stream().collect(Collectors.toList()));
	
	    
	    Set<Integer> set=new HashSet<Integer>();
	    
	    set.add(12);
	    set.add(12);
	    set.add(13);
	    System.out.println(set);
	    
	}

}
