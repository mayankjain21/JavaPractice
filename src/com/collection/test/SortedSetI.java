package com.collection.test;


import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SortedSet<String> ts = new TreeSet<String>(); 
			
		    ts.add("India"); 
	        ts.add("Australia"); 
	        ts.add("South Africa");  
	        ts.add("India");
	        // Displaying the TreeSet 
	        System.out.println(ts); 
	        // Removing items from TreeSet 
	        // using remove() 
	        ts.remove("Australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + ts); 
	         // Iterating over Tree set items 
	        System.out.println("Iterating over set:"); 
	        Iterator<String> i = ts.iterator(); 
	        while (i.hasNext()) 
	         System.out.println(i.next()); 
	  
	        SortedSet<Integer>sortedSet=new TreeSet<Integer>();
	        sortedSet.add(1);
	        sortedSet.add(3);
	        sortedSet.add(5);
	        sortedSet.add(12);
	        sortedSet.add(2);
	        sortedSet.add(8);
	        sortedSet.add(7);
	        sortedSet.add(6);
	        	
	        System.out.println(sortedSet);
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
